package com.springbootexp.util;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.logging.Level;

import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.IPDFRenderOption;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.PDFRenderOption;
import org.springframework.core.io.Resource;





import org.springframework.stereotype.Service;



import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.HtmlExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.ExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleHtmlExporterOutput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;

/**
 * @author Md. Jahurul Islam
 *
 */
@Service
public class CoreJasperService {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ByteArrayOutputStream generateReport(CusJasperReportDef reportDef) throws Exception {

		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();

		Exporter exporter = generateExporter(reportDef);
		// exporter output
		exporter.setExporterOutput(getExporterOutput(reportDef.getReportFormat(), byteArray));
		// exporter input
		JasperPrint jasperPrint = generatePrinter(reportDef);
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		// export
		exporter.exportReport();

		return byteArray;
	}

	/**
	 * Generate a JasperPrint object for a given report.
	 * @param reportDefinition , the report
	 * @param parameters       , additional parameters
	 * @return JasperPrint , jasperreport printer
	 * @throws IOException
	 * @throws JRException
	 */
	public JasperPrint generatePrinter(CusJasperReportDef reportDef) throws JRException, IOException {
		JasperPrint jasperPrint = null;
		Resource resource = reportDef.getReport();
		JRDataSource jrDataSource = reportDef.getDataSource();

		if (jrDataSource == null && reportDef.getReportData() != null && !reportDef.getReportData().isEmpty()) {
			jrDataSource = new JRBeanCollectionDataSource(reportDef.getReportData());
		}

		if (jrDataSource != null) {
			if (resource.getFilename().endsWith(".jasper")) {
				jasperPrint = JasperFillManager.fillReport(resource.getInputStream(), reportDef.getParameters(),
						jrDataSource);
			} else {
				jasperPrint = JasperFillManager.fillReport(
						JasperCompileManager.compileReport(resource.getInputStream()), reportDef.getParameters(),
						jrDataSource);
			}
		}else {
			if (resource.getFilename().endsWith(".jasper")) {
				jasperPrint = JasperFillManager.fillReport(resource.getInputStream(), reportDef.getParameters(),
						jrDataSource);
			} else {
				jasperPrint = JasperFillManager.fillReport(
						JasperCompileManager.compileReport(resource.getInputStream()), reportDef.getParameters(),
						jrDataSource);
			}
			
		}

		return jasperPrint;
	}

	/**
	 * Return the suitable Exporter for a given file format.
	 * @param format
	 * @return exporter
	 * @throws Exception
	 */
	private static ExporterOutput getExporterOutput(JasperExportFormat format,
			ByteArrayOutputStream byteArrayOutputStream) throws Exception {
		switch (format) {
		// common cases
		case PDF_FORMAT:
		case XLS_FORMAT:
		case XLSX_FORMAT:
		case PPTX_FORMAT:
		case DOCX_FORMAT:
		case ODT_FORMAT:
		case ODS_FORMAT:
			return new SimpleOutputStreamExporterOutput(byteArrayOutputStream);

		// specific cases
		case HTML_FORMAT:
			return new SimpleHtmlExporterOutput(byteArrayOutputStream);
		case CSV_FORMAT:
			return new SimpleWriterExporterOutput(byteArrayOutputStream);
		case RTF_FORMAT:
			return new SimpleWriterExporterOutput(byteArrayOutputStream);
		default:
			throw new Exception("Invalid format");
		}
	}

	/**
	 * Generate a exporter with for a CusJasperReportDef. Note that SUBREPORT_DIR an
	 * locale have default values.
	 * 
	 * @param reportDef
	 * @return Exporter
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	private static Exporter generateExporter(CusJasperReportDef reportDef) throws Exception {
		/*
		 * if (reportDef.getParameters().SUBREPORT_DIR == null) {
		 * reportDef.parameters.SUBREPORT_DIR = reportDef.getReportDir(); }
		 * 
		 * if (reportDef.locale) { reportDef.parameters.REPORT_LOCALE = reportDef.locale
		 * } else { reportDef.parameters.REPORT_LOCALE = Locale.getDefault() }
		 */

		Exporter exporter = getExporter(reportDef.getReportFormat());

		/*
		 * if (reportDef.getUseDefaultConfiguration()) {
		 * applyDefaultConfiguration(exporter, reportDef); } if
		 * (!reportDef.getReportConfiguration().isEmpty()) { Field[] fields =
		 * getExporterFields(reportDef.getReportFormat());
		 * applyCustomConfiguration(fields, exporter,
		 * reportDef.getReportConfiguration()); }
		 */
		return exporter;
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void applyCustomConfiguration(Field[] fields, Exporter exporter, Map<String, Object> configuration) {
		// TODO: based on format apply appropriate user defined configuration
		/*
		 * def fieldNames = fields.collect { it.getName() }
		 * 
		 * configuration.each { p -> if (fieldNames.contains(p.getKey())) { def fld =
		 * Class.forName(fields.find { it.name = p.getKey()
		 * }.clazz.name).getField(p.getKey())
		 * exporter.setParameter(fld.get(fld.root.class), p.getValue()) } }
		 */
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void applyDefaultConfiguration(Exporter exporter, CusJasperReportDef format) {
		// TODO: based on format apply common configuration
	}

	/**
	 * Return the suitable Exporter for a given file format.
	 * 
	 * @param format
	 * @return exporter
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	private static Exporter getExporter(JasperExportFormat format) throws Exception {
		switch (format) {
		case PDF_FORMAT:
			return new JRPdfExporter();
		case HTML_FORMAT:
			return new HtmlExporter();
		case CSV_FORMAT:
			return new JRCsvExporter();
		case XLS_FORMAT:
			return new JRXlsExporter();
		case RTF_FORMAT:
			return new JRRtfExporter();
		case ODT_FORMAT:
			return new JROdtExporter();
		case ODS_FORMAT:
			return new JROdsExporter();
		case DOCX_FORMAT:
			return new JRDocxExporter();
		case XLSX_FORMAT:
			return new JRXlsxExporter();
		case PPTX_FORMAT:
			return new JRPptxExporter();
		default:
			throw new Exception("Invalid format");
		}
	}
 
	/**
	 * Return the available Fields for a given
	 * 
	 * @param format
	 * @return Field[] , null if no fields are available for the format
	 */
	/*
	 * @SuppressWarnings("unused") private static Field[]
	 * getExporterFields(JasperExportFormat format) { Field[] field = null; switch
	 * (format) {
	 * 
	 * case PDF_FORMAT: return PdfExporterConfiguration.class.getFields(); case
	 * HTML_FORMAT: return HtmlExporterConfiguration.class.getFields(); case
	 * CSV_FORMAT: return CsvExporterConfiguration.class.getFields(); case
	 * XLS_FORMAT: return XlsExporterConfiguration.class.getFields(); case
	 * XLSX_FORMAT: return XlsxExporterConfiguration.class.getFields(); case
	 * RTF_FORMAT: return RtfExporterConfiguration.class.getFields(); case
	 * DOCX_FORMAT: return DocxExporterConfiguration.class.getFields(); default:
	 * return field;
	 * 
	 * }
	 * 
	 * }
	 */
	
public ByteArrayOutputStream generateBirtReport(CusJasperReportDef report) throws Exception {
		
		String fileName = report.getReportDir()+report.getReportName();

    	InputStream is = new FileInputStream(new File(fileName));
		if (is==null)
			throw new RuntimeException(String.format("Error load %s report", fileName));

		IReportEngine engine = null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		try {

			
			EngineConfig config = new EngineConfig();
			
//			FontFactory.register(report.getReportDir()+"Nikosh.ttf", BaseFont.IDENTITY_H);
////			//FontFactory.register(report.getReportDir()+"SolaimanLipi.ttf",BaseFont.IDENTITY_H);
//			FontFactory.register(report.getReportDir()+"vrinda.ttf",BaseFont.IDENTITY_H);
//			FontFactory.register(report.getReportDir()+"code128.ttf",BaseFont.IDENTITY_H);
	
			config.setEngineHome(System.getProperty("java.io.tmpdir"));
			Platform.startup(config);
			IReportEngineFactory factory = (IReportEngineFactory) Platform
				.createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
			engine = factory.createReportEngine( config );
			engine.changeLogLevel( Level.WARNING );
			

			// load report
			//System.out.println(String.format("Loading report %s...", fileName));
			
			IReportRunnable runnable = engine.openReportDesign(is);

			// execute report
			//System.out.println("Generating report ...");
			//RenderOption renderOption = null;
			//renderOption = new PDFRenderOption();
			IPDFRenderOption renderOption = new PDFRenderOption();
			renderOption.setOutputFormat(report.getReportFormat().getExtension());
			//renderOption.setFontDirectory(report.getReportDir()+"Nikosh.ttf");
			//renderOption.setEmbededFont(true);
			renderOption.setOutputStream(out);
			
			
		
			renderOption.setOutputStream(out);
			
			IRunAndRenderTask task = engine.createRunAndRenderTask(runnable);
			
			task.setParameterValues(report.getParameters());
			task.setAppContext(report.getReportDataParam());
			
			//===============================Connection======================//
//			Map<String, Object> appContext = task.getAppContext();
//			appContext.put("OdaJDBCDriverPassInConnection", conn);
//			appContext.put("OdaJDBCDriverPassInConnectionCloseAfterUse", false);
//			task.setAppContext(appContext);
//			
			//===============================Connection======================//
			
			task.setRenderOption(renderOption);
			task.run();
	        task.close();


	    } catch (Exception ex) {
	        ex.printStackTrace();
	    } finally {
	    	
	    	if (engine!=null) {
	    		
		    	engine.destroy();
				Platform.shutdown();
				engine = null;
				
	    	}

	    }
			return out;
	}

}
