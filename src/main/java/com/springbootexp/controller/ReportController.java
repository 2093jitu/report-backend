package com.springbootexp.controller;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootexp.service.ReportService;
import com.springbootexp.util.CusJasperReportDef;
import com.springbootexp.util.Response;


@CrossOrigin
@RestController
@RequestMapping("/api/report")
public class ReportController {
	@Autowired
	ReportService reportService;
	
	@PostMapping(value = "/bookingItem")
	public ResponseEntity<byte[]> bookingItem(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
//		CusJasperReportDef report = reportService.printRegistrationForm(reqObj);
		CusJasperReportDef report = reportService.printRegistrationForm(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
//	public ResponseEntity<byte[]> bookingItem(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
////		CusJasperReportDef report = reportService.printRegistrationForm(reqObj);
//		CusJasperReportDef report = reportService.printRegistrationForm(reqObj);
//		return respondReportOutputWithoutHeader(report, false);
//	}

	@PostMapping(value = "/billColl")
	public ResponseEntity<byte[]> billColl(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
//		CusJasperReportDef report = reportService.printRegistrationForm(reqObj);
		CusJasperReportDef report = reportService.billColl(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}

	@PostMapping(value = "/billDetail")
	public ResponseEntity<byte[]> billDetail(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
//		CusJasperReportDef report = reportService.printRegistrationForm(reqObj);
		CusJasperReportDef report = reportService.billDetail(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/dischargeSummary")
	public ResponseEntity<byte[]> dischargeSummaryTest(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.dischargeSummaryTest(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/dischargeSummarybirt")
	public ResponseEntity<byte[]> dischargeSummarybirt(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.dischargeSummarybirt(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/print-anesth-consentFrom")
	public ResponseEntity<byte[]> printAnesthConsentForm(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.printAnesthConsentForm(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/print-anesth-consentFrom2")
	public ResponseEntity<byte[]> printAnesthConsentForm2(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.printAnesthConsentForm2(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	
	@PostMapping(value = "/quesaForm")
	public ResponseEntity<byte[]> quesaForm(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.printAnesthConsentForm3(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/appointmentAcknoledgeMent")
	public ResponseEntity<byte[]> AppointmentAcknoledgeMent(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.AppointmentAcknoledgeMent(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	
	@PostMapping(value = "/nsInvoice")
	public ResponseEntity<byte[]> nsInvoice(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.nsInvoice(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	
	@PostMapping(value = "/posInvoice")
	public ResponseEntity<byte[]> posInvoice(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.posInvoice(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/prescription")
	public ResponseEntity<byte[]> prescriptionNewTest(@RequestBody String reqObj) throws IOException {
		System.out.println("alim");
		CusJasperReportDef report = reportService.prescriptionNewTest(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/appointmenReport")
	public ResponseEntity<byte[]> appointmenReport(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.appointmenReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/cabinShareReport")
	public ResponseEntity<byte[]> cabinShareReport(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.cabinShareReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/otConsultaionFeesReport")
	public ResponseEntity<byte[]> otConsultaionFeesReport(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.otConsultaionFeesReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/splOtSummaryReport")
	public ResponseEntity<byte[]> cabinShareReport1(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.splOtSummaryReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/hospitalStoppageAndDetailReport")
	public ResponseEntity<byte[]> cabinShareReport2(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.hospitalStoppageAndDetailReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/billReferralReport")
	public ResponseEntity<byte[]> billReferralReport(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.billReferralReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/onInitialportocol")
	public ResponseEntity<byte[]> onInitialportocol(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.onInitialportocol(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/patientchemoappointmentschedule")
	public ResponseEntity<byte[]> patientchemoappointmentschedule(@RequestBody String reqObj) throws IOException {
		CusJasperReportDef report = reportService.ppatientChemoAppointmentSchedule(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	
	@PostMapping(value = "/salesReport")
	public ResponseEntity<byte[]> salesReport(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
		CusJasperReportDef report = reportService.salesReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	
	@PostMapping(value = "/regCardReport")
	public ResponseEntity<byte[]> regCardReport(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
		CusJasperReportDef report = reportService.regCardReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/empCardReport")
	public ResponseEntity<byte[]> empCardReport(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
		CusJasperReportDef report = reportService.empCardReport(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	
	@PostMapping(value = "/labelBarcode")
	public ResponseEntity<byte[]> labelBarcode(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
		CusJasperReportDef report = reportService.labelBarcode(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@PostMapping(value = "/medSticker")
	public ResponseEntity<byte[]> medSticker(@RequestBody String reqObj) throws IOException, ParseException, org.json.simple.parser.ParseException {
		CusJasperReportDef report = reportService.medSticker(reqObj);
		return respondReportOutputWithoutHeader(report, false);
	}
	@CrossOrigin
	@GetMapping("/gridList")
	public Response gridList(HttpServletRequest request) {
		return reportService.getReportTypeDtoDataGridList(request);
	}
	public   ResponseEntity<byte[]> respondReportOutputWithoutHeader(CusJasperReportDef jasperReport, boolean forceDownload) throws IOException {
		if (jasperReport == null || jasperReport.getContent() == null) {
			throw new FileNotFoundException("jasper Report Not found");
		} else {
			String outputFileName = (jasperReport.getOutputFilename()) + "." + jasperReport.getReportFormat().getExtension();
			String contentDisposition = forceDownload == true ? "attachment;filename=\""+outputFileName+"\"": "filename=\""+outputFileName+"\"";
		    return ResponseEntity
		  	      .ok()
		  	      .header("Content-Type",  jasperReport.getReportFormat().getMimeType()+";charset=UTF-8")
		  	      .header("Content-Disposition", contentDisposition)
		  	      .body(jasperReport.getContent());
			
		}
	}
 
}
