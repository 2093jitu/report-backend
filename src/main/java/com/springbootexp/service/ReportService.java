package com.springbootexp.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexp.repo.ReportRepo;
import com.springbootexp.util.CusJasperReportDef;
import com.springbootexp.util.Response;

@Service
public class ReportService {
	@Autowired
	ReportRepo reportRepository;

	public CusJasperReportDef printRegistrationForm(String reqObj)
			throws ParseException, FileNotFoundException, IOException, org.json.simple.parser.ParseException {
		System.out.println("billColl");
		return reportRepository.diagnosticBookingReport(reqObj);
//    	return reportRepository.salesReport(reqObj);

	}

	public CusJasperReportDef salesReport(String reqObj) throws ParseException {

		return reportRepository.salesReport(reqObj);

	}

	public CusJasperReportDef billDetail(String reqObj)
			throws FileNotFoundException, ParseException, IOException, org.json.simple.parser.ParseException {

		return reportRepository.billDetail(reqObj);
	}

	public CusJasperReportDef billColl(String reqObj) {

		return reportRepository.billColl(reqObj);
	}

	public CusJasperReportDef dischargeSummaryTest(String reqObj) {

		return reportRepository.dischargeSummaryTest(reqObj);
	}

	public CusJasperReportDef dischargeSummarybirt(String reqObj) {

		return reportRepository.dischargeSummarybirt();
	}

	public CusJasperReportDef printAnesthConsentForm(String reqObj) {

		return reportRepository.printAnesthConsentForm(reqObj);
	}

	public CusJasperReportDef printAnesthConsentForm2(String reqObj) {

		return reportRepository.printAnesthConsentForm2(reqObj);
	}

	public CusJasperReportDef printAnesthConsentForm3(String reqObj) {

		return reportRepository.printAnesthConsentForm3(reqObj);
	}

	public CusJasperReportDef AppointmentAcknoledgeMent(String reqObj) {

		return reportRepository.AppointmentAcknoledgeMent(reqObj);
	}

	public CusJasperReportDef nsInvoice(String reqObj) {

		return reportRepository.nsInvoice(reqObj);
	}
	public CusJasperReportDef posInvoice(String reqObj) {

		return reportRepository.posInvoice(reqObj);
	}

	public CusJasperReportDef prescriptionNewTest(String reqObj) {

		return reportRepository.prescriptionNewTest(reqObj);
	}

	public Response getReportTypeDtoDataGridList(HttpServletRequest request) {

		return reportRepository.getReportTypeDtoDataGridList(request);
	}

	public CusJasperReportDef appointmenReport(String reqObj) {

		return reportRepository.appointmenReport(reqObj);
	}

	public CusJasperReportDef cabinShareReport(String reqObj) {

		return reportRepository.cabinShareReport(reqObj);
	}

	public CusJasperReportDef otConsultaionFeesReport(String reqObj) {

		return reportRepository.otConsultaionFeesReport(reqObj);
	}

	public CusJasperReportDef splOtSummaryReport(String reqObj) {

		return reportRepository.splOtSummaryReport(reqObj);
	}

	public CusJasperReportDef hospitalStoppageAndDetailReport(String reqObj) {

		return reportRepository.hospitalStoppageAndDetailReport(reqObj);
	}

	public CusJasperReportDef billReferralReport(String reqObj) {

		return reportRepository.billReferralReport(reqObj);
	}

	public CusJasperReportDef onInitialportocol(String reqObj) {

		return reportRepository.onInitialportocol();
	}

	public CusJasperReportDef ppatientChemoAppointmentSchedule(String reqObj) {

		return reportRepository.ppatientChemoAppointmentSchedule();
	}

	public CusJasperReportDef regCardReport(String reqObj) {

		return reportRepository.regCardReport(reqObj);
	}
	public CusJasperReportDef empCardReport(String reqObj) {

		return reportRepository.empCardReport(reqObj);
	}
	public CusJasperReportDef labelBarcode(String reqObj) {

		return reportRepository.labelBarcode(reqObj);
	}
	public CusJasperReportDef medSticker(String reqObj) {

		return reportRepository.medSticker();
	}
}
