package com.springbootexp.thymele;

import static com.itextpdf.text.pdf.BaseFont.EMBEDDED;
import static com.itextpdf.text.pdf.BaseFont.IDENTITY_H;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileSystems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.w3c.tidy.Tidy;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.itextpdf.text.DocumentException;


public class ThymeleafBaseRepository {
	
	@Autowired
	private Environment env;
	
	private static final String UTF_8 = "UTF-8";

	public TemplateEngine getTemplateEngine(String floderName) {
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.setEnableSpringELCompiler(true);
		engine.setTemplateResolver(new ThymeleafConfig().templateResolver(floderName));
		return engine;
	}

	public String convertToXhtml(String html) throws UnsupportedEncodingException {
		
		Tidy tidy = new Tidy();
		tidy.setInputEncoding(UTF_8);
		tidy.setOutputEncoding(UTF_8);
		tidy.setXHTML(true);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(html.getBytes(UTF_8));
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		tidy.parseDOM(inputStream, outputStream);

		return outputStream.toString(UTF_8);
	}
	
	public <T> ResponseEntity<byte[]> getResponseEntityByDataAndFile(T dataObject, String folderName, String fileName) throws DocumentException, IOException {
		
		Context context = new Context();
		context.setVariable("data", dataObject);
		String html = getTemplateEngine(folderName).process(fileName, context);

		String xHtml = convertToXhtml(html);
	
		String baseUrl = FileSystems.getDefault().getPath("src", "main", "resources", "thymeleafReport", folderName).toUri().toURL().toString();
        
		ITextRenderer renderer = new ITextRenderer();
		renderer.getSharedContext().setReplacedElementFactory(new BarcodeReplacedElementFactory(renderer.getOutputDevice()));
		renderer.setDocumentFromString(xHtml, baseUrl);
		
		renderer.getFontResolver().addFont("thymeleafReport/Code39.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/Segoe_UI.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/seguisym.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/times-new-roman.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/Helvetica.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/DejaVuSans.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/ArialBoldMT.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/ArialMT.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/arial.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/arialblack.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/Arial-Black-Bold_4261.ttf", IDENTITY_H, EMBEDDED);
		renderer.getFontResolver().addFont("thymeleafReport/911Fonts.com_WingdingsRegular__-_911fonts.com_fonts_wVrr.ttf", IDENTITY_H, EMBEDDED);
		
		renderer.layout();
				
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
        renderer.createPDF(os);
        
        return ResponseEntity.ok().body(os.toByteArray());
	}

	// --------
	public String checkReportStageStatus(Long finalizedBy, Long verifiedBy, Long preparedBy) {

		if (finalizedBy != null && finalizedBy > 0) {
			return "FINALIZED";
		} else if (verifiedBy != null && verifiedBy > 0) {
			if (env.getProperty("service.servicename").trim().equalsIgnoreCase("IHL")) {
				return "PROVISIONAL";
			} else {
				return "VERIFIED";
			}
		}
		if (env.getProperty("service.servicename").trim().equalsIgnoreCase("IHL")) {
			return "PROVISIONAL";
		}
		return "PREPARED";
	}
}
