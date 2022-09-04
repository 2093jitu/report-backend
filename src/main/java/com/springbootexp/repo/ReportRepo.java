package com.springbootexp.repo;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;

import com.springbootexp.billrpt.BillDeatailsRpt;
import com.springbootexp.cabinrpt.dto.CabinShareReportPrintDto;
import com.springbootexp.dto.AppAcknoledgementRptDto;
import com.springbootexp.dto.BookingItemDto;
import com.springbootexp.dto.BookingItemRptDto;
import com.springbootexp.dto.CommonDto;
import com.springbootexp.dto.DataTableRequest;
import com.springbootexp.dto.DataTableResults;
import com.springbootexp.dto.DisMedicineEntity;
import com.springbootexp.dto.DisUserPreferencesEntity;
import com.springbootexp.dto.DischargeDetailEntity;
import com.springbootexp.dto.DischargeSummaryDto;
import com.springbootexp.dto.LabelBarcode;
import com.springbootexp.dto.NsInvoice;
import com.springbootexp.dto.OTRequisitionQue;
import com.springbootexp.dto.OpdReportDto;

import com.springbootexp.dto.PrescriptionRptDto;
import com.springbootexp.dto.RegCardDto;
import com.springbootexp.dto.ReportTypeDto;
import com.springbootexp.dto.UserPreferencesEntity;
import com.springbootexp.dto.UserWiseDisData;
import com.springbootexp.dto.UserWisePresDataDto;
import com.springbootexp.dto.billReferral.BillReferralReportDto;
import com.springbootexp.dto.consFee.OtConsultaionFeeReportPrintDto;
import com.springbootexp.dto.hospStop.HospitalStoppageAndIpdDetailsReportPrintDto;
import com.springbootexp.dto.oncology.OncoAppScheduleReportDto;
import com.springbootexp.dto.oncology.OncoInitialReportDto;
import com.springbootexp.dto.oncology.OncoStickerDto;
import com.springbootexp.dto.splOtSummary.SplOtSummaryReportPrintDto;
import com.springbootexp.util.CommonFunctoon;
import com.springbootexp.util.CoreJasperService;
import com.springbootexp.util.CusJasperReportDef;
import com.springbootexp.util.Def;
import com.springbootexp.util.JasperExportFormat;
import com.springbootexp.util.Response;

import org.springframework.stereotype.Repository;

@Repository
public class ReportRepo extends CommonFunctoon {

	@Autowired
	private CoreJasperService coreJasperService;

	public CusJasperReportDef diagnosticBookingReport(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		BookingItemRptDto reportDTO = new BookingItemRptDto();
		List<BookingItemRptDto> doctorRevenueDtoList = new ArrayList<BookingItemRptDto>();

		reportDTO.setReportDataList(getItemList());

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/diagnosticBookingReport/"));
		reportDTO.setReportTitle("Item Booking Report");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("diagnostic_booking");
//		getResoucePath("/report/diagnosticBookingReport" + "/");
		report.setReportDir(getResoucePath("/report/diagnosticBookingReport") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef printAnesthConsentForm(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		OTRequisitionQue reportDTO = new OTRequisitionQue();
		List<OTRequisitionQue> doctorRevenueDtoList = new ArrayList<OTRequisitionQue>();

		reportDTO = getOTRequisitionQue();

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/anesthConsentForm/"));
		reportDTO.setReportTitle("CONSENT FOR ANESTHESIA");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("general_consent_form");
//		getResoucePath("/report/diagnosticBookingReport" + "/");
		report.setReportDir(getResoucePath("/report/anesthConsentForm") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef printAnesthConsentForm2(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		OTRequisitionQue reportDTO = new OTRequisitionQue();
		List<OTRequisitionQue> doctorRevenueDtoList = new ArrayList<OTRequisitionQue>();

		reportDTO = getOTRequisitionQue();

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/anesthConsentForm/"));
		reportDTO.setReportTitle("HIGH RISK CONSENT FOR SURGERY/ANEASTHESIA/PROCEDURE");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("highrisk_consent_form");
//		getResoucePath("/report/diagnosticBookingReport" + "/");
		report.setReportDir(getResoucePath("/report/anesthConsentForm") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef printAnesthConsentForm3(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		CommonDto reportDTO = new CommonDto();
		List<CommonDto> doctorRevenueDtoList = new ArrayList<CommonDto>();
		reportDTO.setRptForObj(getOTRequisitionQue());
		reportDTO.setDataList(getQuestionnaireLookupDtlDtoItemList());
//		reportDTO = getOTRequisitionQue();

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

//		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm/"));
		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm") + "/" + "sub_qsa_lookup_label1_ans");
		reportDTO.setReportTitle("ANESTHESIA CHECKUP REPORT");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("qsa_lookup_form");
//		getResoucePath("/report/diagnosticBookingReport" + "/");quesLookupForm
//		report.setReportDir(getResoucePath("/report/quesLookupForm") + "/");
		report.setReportDir(getResoucePath("/report/quesLookupForm") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef AppointmentAcknoledgeMent(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		AppAcknoledgementRptDto reportDTO = new AppAcknoledgementRptDto("12104000681", "HN1234566", "Mr.Abdul Kader",
				null, "dhaka", "fajle", "Medicne", "Dr Yosup Nobi", new Date(), new Date());
		List<AppAcknoledgementRptDto> doctorRevenueDtoList = new ArrayList<AppAcknoledgementRptDto>();

//		reportDTO = getOTRequisitionQue();

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

//		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm/"));
//		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm")+"/"+"sub_qsa_lookup_label1_ans");
		reportDTO.setReportTitle("ANESTHESIA CHECKUP REPORT");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("patientAppAknowlegdmentFrom");
//		getResoucePath("/report/diagnosticBookingReport" + "/");quesLookupForm
//		report.setReportDir(getResoucePath("/report/quesLookupForm") + "/");
		report.setReportDir(getResoucePath("/report/appointmetAcknoledgementReport") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef nsInvoice(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		NsInvoice reportDTO = new NsInvoice("121003951", new Date(), "A2104000285", new Date(), "Remarks",
				"H11809004499", "Mr. Md Abu Sayed", "32Y 6M 24D", "Male", "01715164742",
				"(D435435354364) DR. Mahamadul Masum", "F-BED- 01", 555.00, 555.00, 0.00, 555.00, "DUE",
				getNsInvoiceItemList(true));
		List<NsInvoice> doctorRevenueDtoList = new ArrayList<NsInvoice>();

//		reportDTO = getOTRequisitionQue();

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

//		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm/"));
//		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm")+"/"+"sub_qsa_lookup_label1_ans");
		reportDTO.setReportTitle("ANESTHESIA CHECKUP REPORT");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setSsCreatorName("Fajle");
		reportDTO.setPrintTypeName("Duplicate Copy");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("nsInvoiceReport");
//		getResoucePath("/report/diagnosticBookingReport" + "/");quesLookupForm
//		report.setReportDir(getResoucePath("/report/quesLookupForm") + "/");
		report.setReportDir(getResoucePath("/report/invoiceReport") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}
	
	public CusJasperReportDef posInvoice(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		NsInvoice reportDTO = new NsInvoice("121003951", new Date(), "A2104000285", new Date(), "Remarks",
				"H11809004499", "Mr. Md Abu Sayed", "32Y 6M 24D", "Male", "01715164742",
				"(D435435354364) DR. Mahamadul Masum", "F-BED- 01", 555.00,  251.20, 0.00, 221.20, "DUE",
				getNsInvoiceItemList(false));
		reportDTO.setBranchAddress("Kandipar Branch,Cumilla");
		reportDTO.setSalesNotes("Don't Change Expier Product");
		reportDTO.setSoftwareByStr("Software by :: Fajle");
		reportDTO.setEmail("FKG@gmail.com");
		reportDTO.setWebAddress("www.fkmadicalbd.com");
		
		List<NsInvoice> doctorRevenueDtoList = new ArrayList<NsInvoice>();

//		reportDTO = getOTRequisitionQue();

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

//		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm/"));
//		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/quesLookupForm")+"/"+"sub_qsa_lookup_label1_ans");
		reportDTO.setReportTitle("ANESTHESIA CHECKUP REPORT");
		reportDTO.setCompanyName("FKZ Medical Hall");
		reportDTO.setCompanyAddress1("Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setSsCreatorName("Fajle");
		reportDTO.setPrintTypeName("Duplicate Copy");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("posReceipt");
//		getResoucePath("/report/diagnosticBookingReport" + "/");quesLookupForm
//		report.setReportDir(getResoucePath("/report/quesLookupForm") + "/");
		report.setReportDir(getResoucePath("/report/posInvoice") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public void finallyOutputStream(ByteArrayOutputStream baos) {

		if (baos != null) {
			try {
				baos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public List<BookingItemDto> getItemList() {
		List<BookingItemDto> list = new ArrayList<BookingItemDto>();
//		list.add(getbookingItemDto(421L,100119,"20210410-4", "TSH","IMMUNOLOGY",700,0,null,419," Arif Khan joy","25Y 4D"
//                ,"Male",null,null,"01824565156",null,"dhaka",null,"2696406699610","123456789", new Date(),
//                new Date(),1,"YES",new Date(),"dhaka","12345",new Date());
//		BookingItemDto bookingItemDto = new BookingItemDto();
//		bookingItemDto.setActiveStatus(1);
//		bookingItemDto.setItemBookingId("419");
//		bookingItemDto.setItemBookingNo(419l);
//		bookingItemDto.setAddress("dhaka");
//		bookingItemDto.setAge("25Y 4D");
//		bookingItemDto.setBloodGroup("B+");
//		bookingItemDto.setBuName("IMMUNOLOGY");
//		bookingItemDto.setBuNo(null);
//		bookingItemDto.setCountryOfArrival("dhaka");
//		bookingItemDto.setDeliveryDate(new Date());
//		bookingItemDto.setDeliveryStatus(0);
//		bookingItemDto.setDob(null);
//		bookingItemDto.setEmail("fajl@gmail.com");
//		bookingItemDto.setExpectedRepDeliDate(new Date());
//		bookingItemDto.setFatherName(null);
//		bookingItemDto.setFirstName(null);
//		bookingItemDto.setForeignTraveler(1);
//		bookingItemDto.setForeignTravelerFlag("YES");
//		bookingItemDto.setGender("Male");
//		bookingItemDto.setId(421L);
//		bookingItemDto.setItemBookingId("20210410-4");
//		bookingItemDto.setItemBookingNo(null);
//		bookingItemDto.setItemName("TSH");
//		bookingItemDto.setItemNo(null);
//		bookingItemDto.setItemtypeName(null);
//		bookingItemDto.setItemtypeNo(null);
//		bookingItemDto.setLastName(null);
//		bookingItemDto.setMaritalStatus(null);
//		bookingItemDto.setMessage(null);
//		bookingItemDto.setMessage(null);
//		bookingItemDto.setMobileNo(null);
//		bookingItemDto.setMotherName(null);
//		bookingItemDto.setNationalId("2696406699610");
//		bookingItemDto.setPreferredSamCollDate(new Date());
//		bookingItemDto.setSalesPrice(7000.00);
//		bookingItemDto.setSubject(null);
//		bookingItemDto.setTentativeVisitDate(null);
//		bookingItemDto.setTicketDate(new Date());
//		bookingItemDto.setTicketDate(new Date());
//		bookingItemDto.setTicketNumber("123456789");
//		bookingItemDto.setPatientName("Arif Khan joy");
//		list.add(bookingItemDto);
		BookingItemDto bookingItemDto1 = new BookingItemDto();
		bookingItemDto1.setItemBookingId("417");
		bookingItemDto1.setItemBookingNo(417l);
		bookingItemDto1.setActiveStatus(1);
		bookingItemDto1.setAddress("dhaka");
		bookingItemDto1.setAge("25Y 4D");
		bookingItemDto1.setBloodGroup("B+");
		bookingItemDto1.setBuName("IMMUNOLOGY");
		bookingItemDto1.setBuNo(null);
		bookingItemDto1.setCountryOfArrival("dhaka");
		bookingItemDto1.setDeliveryDate(new Date());
		bookingItemDto1.setDeliveryStatus(0);
		bookingItemDto1.setDob(null);
		bookingItemDto1.setEmail("fajl@gmail.com");
		bookingItemDto1.setExpectedRepDeliDate(new Date());
		bookingItemDto1.setFatherName(null);
		bookingItemDto1.setFirstName(null);
		bookingItemDto1.setForeignTraveler(1);
		bookingItemDto1.setForeignTravelerFlag("YES");
		bookingItemDto1.setGender("Male");
		bookingItemDto1.setId(421L);
		bookingItemDto1.setItemBookingId("20210410-4");
		bookingItemDto1.setItemBookingNo(null);
		bookingItemDto1.setItemName("TSH");
		bookingItemDto1.setItemNo(null);
		bookingItemDto1.setItemtypeName(null);
		bookingItemDto1.setItemtypeNo(null);
		bookingItemDto1.setLastName(null);
		bookingItemDto1.setMaritalStatus(null);
		bookingItemDto1.setMessage(null);
		bookingItemDto1.setMessage(null);
		bookingItemDto1.setMobileNo("01824565156");
		bookingItemDto1.setMotherName(null);
		bookingItemDto1.setNationalId("2696406699610");
		bookingItemDto1.setPreferredSamCollDate(new Date());
		bookingItemDto1.setSalesPrice(7000.00);
		bookingItemDto1.setSubject(null);
		bookingItemDto1.setPassportNo("123456789");
		bookingItemDto1.setPatientName("Arif Khan joy1");
		bookingItemDto1.setTentativeVisitDate(null);
		bookingItemDto1.setTicketDate(new Date());
		bookingItemDto1.setTicketDate(new Date());
		bookingItemDto1.setTicketNumber("123456789");
		list.add(bookingItemDto1);
		return list;
	}

	public BookingItemDto getbookingItemDto(Long id, Long itemNo, String itemBookingId, String itemName, String buName,
			Double salesPrice, Integer deliveryStatus, Date deliveryDate, Long itemBookingNo, String patientName,
			String age, String gender, String maritalStatus, String bloodGroup, String mobileNo, String email,
			String address, String nationalId, String passportNo, Date preferredSamCollDate, Date expectedRepDeliDate,
			Integer foreignTraveler, String foreignTravelerFlag, Date tentativeVisitDate, String countryOfArrival,
			String ticketNumber, Date ticketDate) {

		BookingItemDto bookingItemDto = new BookingItemDto();
		bookingItemDto.setActiveStatus(1);
		bookingItemDto.setAddress(null);
		bookingItemDto.setAge(age);
		bookingItemDto.setBloodGroup(bloodGroup);
		bookingItemDto.setBuName(buName);
//		bookingItemDto.setBuNo(buNo);
		bookingItemDto.setCountryOfArrival(null);
		bookingItemDto.setDeliveryDate(deliveryDate);
		bookingItemDto.setDeliveryStatus(deliveryStatus);
		bookingItemDto.setDob(null);
		bookingItemDto.setEmail(null);
		bookingItemDto.setPatientName(patientName);
		bookingItemDto.setExpectedRepDeliDate(expectedRepDeliDate);

		bookingItemDto.setForeignTraveler(foreignTraveler);
		bookingItemDto.setForeignTravelerFlag(foreignTravelerFlag);
		bookingItemDto.setGender(gender);
		bookingItemDto.setId(id);
		bookingItemDto.setItemBookingId(itemBookingId);
		bookingItemDto.setItemBookingNo(itemBookingNo);
		bookingItemDto.setItemName(itemName);
		bookingItemDto.setItemNo(itemNo);
//		bookingItemDto.setItemtypeName(itemtypeName);
//		bookingItemDto.setItemtypeNo(itemtypeNo);

		bookingItemDto.setMaritalStatus(maritalStatus);
//		bookingItemDto.setMessage(message);

		bookingItemDto.setMobileNo(mobileNo);

		bookingItemDto.setNationalId(nationalId);
		bookingItemDto.setPreferredSamCollDate(preferredSamCollDate);
//		bookingItemDto.setSalesPrice(salesPrice);
//		bookingItemDto.setSubject(subject);
		bookingItemDto.setTentativeVisitDate(tentativeVisitDate);
		bookingItemDto.setTicketDate(ticketDate);

		bookingItemDto.setTicketNumber(null);
		return bookingItemDto;
	}

	public CusJasperReportDef dischargeSummaryTest(String reqObj) {

		CusJasperReportDef report = new CusJasperReportDef();

		DischargeSummaryDto dischargeSummaryDto = new DischargeSummaryDto();
		List<DischargeSummaryDto> dischargeSummaryDtoList = null;
		
		dischargeSummaryDto = objectMapperReadValue(getJason("disuserW.json"),
				DischargeSummaryDto.class);
		if (dischargeSummaryDto != null) {
			dischargeSummaryDtoList = new ArrayList<DischargeSummaryDto>();
			dischargeSummaryDtoList.add(dischargeSummaryDto);
		}
		Map<String, Object> parameterMap = new HashMap<String, Object>();

		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/dischargeSummary/"));

		report.setOutputFilename("dischargeSummary");
		report.setReportName("discharge_summary");
		report.setReportDir(getResoucePath("/report/dischargeSummary") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(dischargeSummaryDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);

		}

		report.setContent(baos.toByteArray());
		return report;
	}



	

//	===========================================
	@SuppressWarnings("null")
	public CusJasperReportDef prescriptionNewTest(String reqObj) {

		// List<PrescriptionVitalEntityCmh> prescriptionVitalEntityList = null;
		// List<OpdVitalsSharedEntity> opdVitalsSharedEList = null;
		String pLayout = "0";
		
		UserPreferencesEntity userPreferencesEntity = null;
		CusJasperReportDef report = new CusJasperReportDef();
//		IpdUserLayoutEntity ipdUserLayoutEntity = null;

		List<UserWisePresDataDto> userWisePresDataDtoList = null;

		PrescriptionRptDto prescriptionReport = new PrescriptionRptDto();

		List<PrescriptionRptDto> prescriptionReportList = new ArrayList<PrescriptionRptDto>();
		PrescriptionRptDto prescriptionRptDto = objectMapperReadValue(getJason("pres.json"), PrescriptionRptDto.class);
		prescriptionReportList.add(prescriptionRptDto);
		Map<String, Object> parameterMap = new HashMap<String, Object>();

		report.setReportName("bsh_general_2_new");
//		getResoucePath("/report/diagnosticBookingReport" + "/");quesLookupForm
//		report.setReportDir(getResoucePath("/report/quesLookupForm") + "/");
		report.setReportDir(getResoucePath("/report/prescription") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setOutputFilename("prescription");
		report.setParameters(parameterMap);
		report.setReportData(prescriptionReportList);

		// System.out.print("Report Data : " + prescriptionReportList.toString());

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			finallyOutputStream(baos);
			prescriptionReport = null;

		}

		if (baos != null) {
			report.setContent(baos.toByteArray());
		}

		return report;
	}

	public CusJasperReportDef appointmenReport(String reqObj) {
		JSONObject json = new JSONObject(reqObj);

		String rptCode = Def.getString(json, "rptCode");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		OpdReportDto reportDTO = new OpdReportDto();
		List<OpdReportDto> doctorRevenueDtoList = new ArrayList<OpdReportDto>();

//		reportDTO = getOTRequisitionQue();

		Map<String, Object> parameterMap = new HashMap<String, Object>();

		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/appointmentReport"));
		if (rptCode.equals("OPD_4012_117_N")) {
//			newResponse=opdAppointmentReportRepository.getAppSummaryTypeWiseReportData(reqObj);
			reportDTO.setDataList(getOpdreportDto(1));

			reportDTO.setReportTitle("OPD Appointment Report");
			parameterMap.put("SUBREPORT_NAME", "appointment_details_sub");
		} else if (rptCode.equals("OPD_4013")) {
			reportDTO.setDataList(getOpdreportDto(2));
			reportDTO.setReportTitle("OPD Appointment Summary Report");
			parameterMap.put("SUBREPORT_NAME", "appointment_summary_sub");
		}
//		else if (rptCode.equals("OPD_4014")) {
//			newResponse=opdAppointmentReportRepository.getReportData(reqObj);
//			reportDTO.setReportTitle("OPD Appointment Summary parter Report");
//			parameterMap.put("SUBREPORT_NAME", "appointment_summary_sub");
//		}
		else if (rptCode.equals("OPD_4015_117")) {
			reportDTO.setDataList(getOpdreportDto(0));
			reportDTO.setReportTitle("OPD Appointment Cancle Report");
			parameterMap.put("SUBREPORT_NAME", "appointment_cancel_sub");
		} else {
			parameterMap.put("SUBREPORT_NAME", "appointment_details_sub");
		}
//		reportDTO.setCompanyName(userCompany.getCompanyName());
//		reportDTO.setCompanyAddress(userCompany.getCompanyAddress1());
//		reportDTO.setCompanyAddress2(userCompany.getCompanyAddress2());
//		
//		
//		reportDTO.setFromDate(deateParse(fromDate, "dd/MM/yyyy"));
//		reportDTO.setToDate(deateParse(toDate, "dd/MM/yyyy"));
//		reportDTO.setDepartmentName(departmentName);

//		reportDTO.setReportTitle("ANESTHESIA CHECKUP REPORT");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("appointment_details");
//		getResoucePath("/report/diagnosticBookingReport" + "/");quesLookupForm
//		report.setReportDir(getResoucePath("/report/quesLookupForm") + "/");
		report.setReportDir(getResoucePath("/report/appointmentReport") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef billColl(String reqObj) {
//		JSONObject json = new JSONObject(reqObj);
//
//		String reportFormate = Def.getString(json, "reportFormate");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		CommonDto reportDTO = new CommonDto();
		List<CommonDto> doctorRevenueDtoList = new ArrayList<CommonDto>();

		reportDTO.setDataList(getBillCollectionDtl());
		;

		Map<String, Object> parameterMap = new HashMap<String, Object>();
//		parameterMap.put("SUBREPORT_DIR", CommonFunction.getResoucePath("/report/" +
		// pClient));

		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/billCollection") + "/bill_collection_sub_rpt_final");
		reportDTO.setReportTitle("CONSENT FOR ANESTHESIA");
		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
		reportDTO.setFromDate(new Date());
		reportDTO.setToDate(new Date());
		doctorRevenueDtoList.add(reportDTO);

		CusJasperReportDef report = new CusJasperReportDef();

//		report.setOutputFilename("bill_collection_portrait_template");
		report.setReportName("bill_collection_portrait_template");
//		getResoucePath("/report/diagnosticBookingReport" + "/");
		report.setReportDir(getResoucePath("/report/billCollection") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef salesReport(String reqObj) throws ParseException {
		JSONObject json = new JSONObject(reqObj);
//
		String rptType = Def.getString(json, "rptType");
		String pringFormat = Def.getString(json, "pringFormat");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		CommonDto reportDTO = new CommonDto();
		
	
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		List<CommonDto> list = new ArrayList<CommonDto>();
		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/opdBillingSalesReport"));
		if (Integer.valueOf(rptType) == 2) {
			reportDTO = objectMapperReadValue(getJason("sealitem.json"), CommonDto.class);
			reportDTO.setReportTitle("Item wise Sales Detailes Report");
			parameterMap.put("SUBREPORT_NAME", "item_wise_salse_sub_report");
			reportDTO.setRptType(Integer.valueOf(rptType));
			System.out.println(reportDTO.getReportDataList().size());
			list.add(reportDTO);
		} else if (Integer.valueOf(rptType) == 3) {
			reportDTO = objectMapperReadValue(getJason("sealitem.json"), CommonDto.class);
			reportDTO.setReportTitle("CrossTab Report");
			parameterMap.put("SUBREPORT_NAME", "item_wise_salse_sub_crosstab_report");
			reportDTO.setRptType(Integer.valueOf(rptType));
			System.out.println(reportDTO.getReportDataList().size());
			list.add(reportDTO);
		}else {
			reportDTO = objectMapperReadValue(getJason("seald.json"), CommonDto.class);
			reportDTO.setRptType(Integer.valueOf(rptType));
			reportDTO.setReportTitle("Sales Detailes Report");
			parameterMap.put("SUBREPORT_NAME", "salse_details_sub_report");
			System.out.println(Integer.valueOf(rptType));
			list.add(reportDTO);
		}

		reportDTO.setCompanyName("FKZ Diagnostic Lab & Hospital");
		reportDTO.setCompanyAddress1("R#67,H#90,Kandirpar,Cumilla");
		reportDTO.setCompanyAddress2("Contact-01765-432908");
//		reportDTO.setFromDate(new Date());
//		reportDTO.setToDate(new Date());
//		reportDTO.setComLogo("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");
	

		CusJasperReportDef report = new CusJasperReportDef();

//		report.setOutputFilename("bill_collection_portrait_template");
		report.setReportName("salse_details_report");
//		getResoucePath("/report/diagnosticBookingReport" + "/");
		report.setReportDir(getResoucePath("/report/opdBillingSalesReport") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		if (pringFormat.equalsIgnoreCase("XLSX")) {
			report.setReportFormat(JasperExportFormat.XLSX_FORMAT);
		}else {
			report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		}
		
		report.setParameters(parameterMap);
		report.setReportData(list);
System.out.println(list.size());
		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef billDetail(String reqObj)
			throws ParseException, FileNotFoundException, IOException, org.json.simple.parser.ParseException {

//		Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

		JSONObject json = new JSONObject(reqObj);

		BillDeatailsRpt billDeatailsRpt = objectMapperReadValue(getJason("billDtl.json"), BillDeatailsRpt.class);

		System.out.println("print" + billDeatailsRpt.getCompanyLogo());
//
		String rptType = Def.getString(json, "rptType");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");
		CommonDto reportDTO = new CommonDto();
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		List<BillDeatailsRpt> doctorRevenueDtoList = new ArrayList<BillDeatailsRpt>();
		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/billCollectionDetails"));

//		reportDTO.setComLogo("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");
		doctorRevenueDtoList.add(billDeatailsRpt);

		CusJasperReportDef report = new CusJasperReportDef();

//		report.setOutputFilename("bill_collection_portrait_template");
		report.setReportName("portrait_template");
//		getResoucePath("/report/diagnosticBookingReport" + "/");
		report.setReportDir(getResoucePath("/report/billCollectionDetails") + "/");
//		report.setReportDir("report/diagnosticBookingReport/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(doctorRevenueDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef cabinShareReport(String reqObj) {

//		Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

		JSONObject json = new JSONObject(reqObj);
		List<CabinShareReportPrintDto> cabinShareReportPrintList = new ArrayList<CabinShareReportPrintDto>();

		CabinShareReportPrintDto cabinShareReportPrintDto = objectMapperReadValue(getJason("cabinShar.json"),
				CabinShareReportPrintDto.class);
		;

		String rptType = Def.getString(json, "rptType");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");

		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/cabinShareReport") + "/cabinShareReport_Sub_report2");

		cabinShareReportPrintList.add(cabinShareReportPrintDto);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("cabinShareReport");
		report.setReportDir(getResoucePath("/report/cabinShareReport") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(cabinShareReportPrintList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef otConsultaionFeesReport(String reqObj) {

//	Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

		JSONObject json = new JSONObject(reqObj);
		List<OtConsultaionFeeReportPrintDto> otConsultaionFeeReportPrintDtoList = new ArrayList<OtConsultaionFeeReportPrintDto>();

		OtConsultaionFeeReportPrintDto otConsultaionFeeReportPrintDto = objectMapperReadValue(getJason("conFee.json"),
				OtConsultaionFeeReportPrintDto.class);
		;

		String rptType = Def.getString(json, "rptType");
//	String fromDate = Def.getString(json, "fromDate");
//	String toDate = Def.getString(json, "toDate");

		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("SUBREPORT_DIR",
				getResoucePath("/report/otConsultaionFeesReport") + "/otConsultationFee_Sub_report");

		otConsultaionFeeReportPrintDtoList.add(otConsultaionFeeReportPrintDto);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("otConsultaionFeesReport");
		report.setReportDir(getResoucePath("/report/otConsultaionFeesReport") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(otConsultaionFeeReportPrintDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef splOtSummaryReport(String reqObj) {

//	Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

		JSONObject json = new JSONObject(reqObj);
		List<SplOtSummaryReportPrintDto> splOtSummaryReportPrintDtoList = new ArrayList<SplOtSummaryReportPrintDto>();

		SplOtSummaryReportPrintDto splOtSummaryReportPrintDto = objectMapperReadValue(getJason("cabinShar.json"),
				SplOtSummaryReportPrintDto.class);

		String rptType = Def.getString(json, "rptType");
//	String fromDate = Def.getString(json, "fromDate");
//	String toDate = Def.getString(json, "toDate");

		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/splOtSummaryReport") + "/splOtSummary_Sub_report");

		splOtSummaryReportPrintDtoList.add(splOtSummaryReportPrintDto);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("splOtSummaryReport");
		report.setReportDir(getResoucePath("/report/splOtSummaryReport") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(splOtSummaryReportPrintDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}

	public CusJasperReportDef hospitalStoppageAndDetailReport(String reqObj) {

//	Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

		JSONObject json = new JSONObject(reqObj);
		List<HospitalStoppageAndIpdDetailsReportPrintDto> hospitalStoppageAndIpdDetailsReportPrintDtoList = new ArrayList<HospitalStoppageAndIpdDetailsReportPrintDto>();

		HospitalStoppageAndIpdDetailsReportPrintDto hospitalStoppageAndIpdDetailsReportPrintDto = objectMapperReadValue(getJason("hosplt.json"),
				HospitalStoppageAndIpdDetailsReportPrintDto.class);
		

		String rptType = Def.getString(json, "rptType");
//	String fromDate = Def.getString(json, "fromDate");
//	String toDate = Def.getString(json, "toDate");

		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/hospitalStoppageAndDetailReport") + "/hospitalStoppageAndDetail_Sub_report");

		hospitalStoppageAndIpdDetailsReportPrintDtoList.add(hospitalStoppageAndIpdDetailsReportPrintDto);

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("hospitalStoppageAndDetailReport");
		report.setReportDir(getResoucePath("/report/hospitalStoppageAndDetailReport") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(hospitalStoppageAndIpdDetailsReportPrintDtoList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}
	public CusJasperReportDef dischargeSummarybirt() {

		
		List<DischargeSummaryDto> dischargeSummaryDtoList = null;

		DischargeSummaryDto dischargeSummaryDto = objectMapperReadValue(getJason("dis.json"),
				DischargeSummaryDto.class);;

		CusJasperReportDef report = new CusJasperReportDef();

		Map<String, Object> reportDataParam = new HashMap<String, Object>();

		if (dischargeSummaryDto != null) {
			dischargeSummaryDtoList = new ArrayList<DischargeSummaryDto>();
			dischargeSummaryDtoList.add(dischargeSummaryDto);
			reportDataParam.put("APP_CONTEXT_KEY_DATA", dischargeSummaryDtoList);

		}
//System.out.println(objectToJson(dischargeSummaryDtoList));
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("pathDir", getResoucePath("/report/birtIHL"));

		report.setOutputFilename("dischargeSummary");
		report.setReportName("dischargeSummary3.rptdesign");
		report.setReportDir(getResoucePath("/report/birtIHL") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportDataParam(reportDataParam);

		ByteArrayOutputStream baos = null;

		try {

			baos = coreJasperService.generateBirtReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			finallyOutputStream(baos);
		}
		if (baos != null) {
			report.setContent(baos.toByteArray());
		}

		return report;

	}
public CusJasperReportDef ppatientChemoAppointmentSchedule() {

		
	List<OncoAppScheduleReportDto> oncoAppScheduleReportDtoList = new ArrayList<>();
	OncoAppScheduleReportDto oncoAppScheduleReportDto = new OncoAppScheduleReportDto();
	 oncoAppScheduleReportDto = objectMapperReadValue(getJason("oncoSch.json"),
			 OncoAppScheduleReportDto.class);;

		CusJasperReportDef report = new CusJasperReportDef();

		Map<String, Object> reportDataParam = new HashMap<String, Object>();
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		if (oncoAppScheduleReportDto != null) {
			
			oncoAppScheduleReportDtoList.add(oncoAppScheduleReportDto);
			reportDataParam.put("APP_CONTEXT_KEY_DATA", oncoAppScheduleReportDtoList);

		}
		parameterMap.put("companyLogo", "");
		parameterMap.put("companyInfo","<span style=\"font-family:Arial; font-size:12px; font-weight: bold;\">FKZ Diagnostic Lab & Hospital</span><br/><span style=\"font-size:10px;\">House # , Road # , Block # ,</span><br/><span style=\"font-size:10px;\">Kandirpar,Cumilla</span>");
//System.out.println(objectToJson(dischargeSummaryDtoList));
		
		parameterMap.put("pathDir", getResoucePath("/report/oncology"));

		report.setOutputFilename("patientChemoAppointmentSchedule.rptdesign");
		report.setReportName("patientChemoAppointmentSchedule.rptdesign");
		report.setReportDir(getResoucePath("/report/oncology") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportDataParam(reportDataParam);

		ByteArrayOutputStream baos = null;

		try {

			baos = coreJasperService.generateBirtReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			finallyOutputStream(baos);
		}
		if (baos != null) {
			report.setContent(baos.toByteArray());
		}

		return report;

	}

public CusJasperReportDef onInitialportocol() {

	
	List<OncoInitialReportDto> oncoInitialReportDtoList = new ArrayList<OncoInitialReportDto>();

	OncoInitialReportDto dischargeSummaryDto = objectMapperReadValue(getJason("oncoIni.json"),
			OncoInitialReportDto.class);;

		CusJasperReportDef report = new CusJasperReportDef();

		Map<String, Object> reportDataParam = new HashMap<String, Object>();
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		if (dischargeSummaryDto != null) {
			
			oncoInitialReportDtoList.add(dischargeSummaryDto);
			reportDataParam.put("APP_CONTEXT_KEY_DATA", oncoInitialReportDtoList);

		}
		parameterMap.put("companyLogo", "");
		parameterMap.put("companyInfo","<span style=\"font-family:Arial; font-size:12px; font-weight: bold;\">FKZ Diagnostic Lab & Hospital</span><br/><span style=\"font-size:10px;\">House # , Road # , Block # ,</span><br/><span style=\"font-size:10px;\">Kandirpar,Cumilla</span>");
//System.out.println(objectToJson(dischargeSummaryDtoList));
		
		parameterMap.put("pathDir", getResoucePath("/report/oncology"));

		report.setOutputFilename("PatientInitialProtocal");
		report.setReportName("PatientInitialProtocal.rptdesign");
		report.setReportDir(getResoucePath("/report/oncology") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportDataParam(reportDataParam);

		ByteArrayOutputStream baos = null;

		try {

			baos = coreJasperService.generateBirtReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			finallyOutputStream(baos);
		}
		if (baos != null) {
			report.setContent(baos.toByteArray());
		}

		return report;

	}

public CusJasperReportDef medSticker() {

	
	List<OncoStickerDto> oncoInitialReportDtoList = new ArrayList<OncoStickerDto>();

	OncoStickerDto dischargeSummaryDto = objectMapperReadValue(getJason("medSticker.json"),
			OncoStickerDto.class);;

		CusJasperReportDef report = new CusJasperReportDef();

		Map<String, Object> reportDataParam = new HashMap<String, Object>();
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		if (dischargeSummaryDto != null) {
			
			oncoInitialReportDtoList.add(dischargeSummaryDto);
			reportDataParam.put("APP_CONTEXT_KEY_DATA", oncoInitialReportDtoList);

		}
		parameterMap.put("companyLogo", "");
		parameterMap.put("companyInfo","<span style=\"font-family:Arial; font-size:12px; font-weight: bold;\">FKZ Diagnostic Lab & Hospital</span><br/><span style=\"font-size:10px;\">House # , Road # , Block # ,</span><br/><span style=\"font-size:10px;\">Kandirpar,Cumilla</span>");
//System.out.println(objectToJson(dischargeSummaryDtoList));
		
		parameterMap.put("pathDir", getResoucePath("/report/oncology"));

		report.setOutputFilename("drugListStiker");
		report.setReportName("drugListStiker.rptdesign");
		report.setReportDir(getResoucePath("/report/oncology") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportDataParam(reportDataParam);

		ByteArrayOutputStream baos = null;

		try {

			baos = coreJasperService.generateBirtReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			finallyOutputStream(baos);
		}
		if (baos != null) {
			report.setContent(baos.toByteArray());
		}

		return report;

	}
	
	public CusJasperReportDef billReferralReport(String reqObj) {
		
		BillReferralReportDto billReferralReport = new BillReferralReportDto();
		List<BillReferralReportDto> billReferralDataList = new ArrayList<BillReferralReportDto>();
		
		

		 billReferralReport = objectMapperReadValue(getJason("billRef.json"),
				 BillReferralReportDto.class);;
		
				 billReferralDataList.add(billReferralReport);
		
		
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/billReferralReport"));
		parameterMap.put("COMPANY_INFO", "FKZ Diagnostic Lab & Hospital\nHouse # , Road # , Block #\nKandirpar,Cumilla");
		

		CusJasperReportDef report = new CusJasperReportDef();

		report.setReportName("defaultReport");
		report.setReportDir(getResoucePath("/report/billReferralReport") + "/");
		report.setReportFormat(JasperExportFormat.PDF_FORMAT);
		report.setParameters(parameterMap);
		report.setReportData(billReferralDataList);

		ByteArrayOutputStream baos = null;
		try {
			baos = coreJasperService.generateReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			finallyOutputStream(baos);
		}

		report.setContent(baos.toByteArray());
		return report;
	}
	
	public CusJasperReportDef regCardReport(String reqObj) {

//		Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

			JSONObject json = new JSONObject(reqObj);
			List<RegCardDto> regCardDtoList = new ArrayList<RegCardDto>();

			RegCardDto regCardDto = objectMapperReadValue(getJason("regCard.json"),
					RegCardDto.class);
			

			String rptType = Def.getString(json, "rptType");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");

			Map<String, Object> parameterMap = new HashMap<String, Object>();
//			parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/hospitalStoppageAndDetailReport") + "/hospitalStoppageAndDetail_Sub_report");

			regCardDtoList.add(regCardDto);

			CusJasperReportDef report = new CusJasperReportDef();

			report.setReportName("registrationCard");
			report.setReportDir(getResoucePath("/report/registrationCard") + "/");
			report.setReportFormat(JasperExportFormat.PDF_FORMAT);
			report.setParameters(parameterMap);
			report.setReportData(regCardDtoList);

			ByteArrayOutputStream baos = null;
			try {
				baos = coreJasperService.generateReport(report);
			} catch (Exception e) {
				e.printStackTrace();
			}

			finally {
				finallyOutputStream(baos);
			}

			report.setContent(baos.toByteArray());
			return report;
		}
	public CusJasperReportDef empCardReport(String reqObj) {

//		Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

			JSONObject json = new JSONObject(reqObj);
			List<RegCardDto> regCardDtoList = new ArrayList<RegCardDto>();

			RegCardDto regCardDto = objectMapperReadValue(getJason("empCadr.json"),
					RegCardDto.class);
			

			String rptType = Def.getString(json, "rptType");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");

			Map<String, Object> parameterMap = new HashMap<String, Object>();
//			parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/hospitalStoppageAndDetailReport") + "/hospitalStoppageAndDetail_Sub_report");

			regCardDtoList.add(regCardDto);

			CusJasperReportDef report = new CusJasperReportDef();

			report.setReportName("employee_card_ewvm");
			report.setReportDir(getResoucePath("/report/empIdCard") + "/");
			report.setReportFormat(JasperExportFormat.PDF_FORMAT);
			report.setParameters(parameterMap);
			report.setReportData(regCardDtoList);

			ByteArrayOutputStream baos = null;
			try {
				baos = coreJasperService.generateReport(report);
			} catch (Exception e) {
				e.printStackTrace();
			}

			finally {
				finallyOutputStream(baos);
			}

			report.setContent(baos.toByteArray());
			return report;
		}
	public CusJasperReportDef labelBarcode(String reqObj) {

//		Object obj = new JSONParser().parse(new FileReader("billDtl.json"));

			JSONObject json = new JSONObject(reqObj);
			List<LabelBarcode> labelBarcodeList = new ArrayList<LabelBarcode>();

			 LabelBarcode labelBarcode = objectMapperReadValue(getJason("lableBarcode.json"),
					 LabelBarcode.class);
			

			String rptType = Def.getString(json, "rptType");
//		String fromDate = Def.getString(json, "fromDate");
//		String toDate = Def.getString(json, "toDate");

			Map<String, Object> parameterMap = new HashMap<String, Object>();
//			parameterMap.put("SUBREPORT_DIR", getResoucePath("/report/hospitalStoppageAndDetailReport") + "/hospitalStoppageAndDetail_Sub_report");

			labelBarcodeList.add(labelBarcode);

			CusJasperReportDef report = new CusJasperReportDef();

			report.setReportName("labelBarcode");
			report.setReportDir(getResoucePath("/report/labelBarcode") + "/");
			report.setReportFormat(JasperExportFormat.PDF_FORMAT);
			report.setParameters(parameterMap);
			report.setReportData(labelBarcodeList);

			ByteArrayOutputStream baos = null;
			try {
				baos = coreJasperService.generateReport(report);
			} catch (Exception e) {
				e.printStackTrace();
			}

			finally {
				finallyOutputStream(baos);
			}

			report.setContent(baos.toByteArray());
			return report;
		}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Response getReportTypeDtoDataGridList(HttpServletRequest request) {

		DataTableResults<ReportTypeDto> dataTableResults = null;
		Response response = new Response();

		DataTableRequest dataTableInRQ = new DataTableRequest(request);
		@SuppressWarnings("unused")
		List gridList = new ArrayList<>();

		gridList = getReportTypeDtoDataList();

		dataTableResults = dataTableResults(dataTableInRQ, Long.valueOf(getReportTypeDtoDataList().size()), gridList,
				Long.valueOf(getReportTypeDtoDataList().size()));
		response.setItems(null);
		response.setObj(dataTableResults);
		return response;

	}
//	new ByteArrayInputStream(org.apache.commons.codec.binary.Base64.decodeBase64($F{findingsClob}.getBytes()))

//	public void test() throws Exception {
//        // String outFileName = "test.html";
//
//        String xmlFileLocation = "/Users/skozlic/dev/VacationToolProject/wokspace/ReportService/src/test/resources/machineReportTestFile.xml";
//
//        JasperReport reportTemplate = ReportType.MPM.getReportTemplate();
//        JRXmlDataSource jrxmlds = ReportType.MPM.getReportDateSource(xmlFileLocation);
//        JasperPrint jasperPrint = JasperFillManager.fillReport(reportTemplate, null, jrxmlds);
//
//        HtmlExporter exporterHTML = new HtmlExporter();
//        SimpleExporterInput exporterInput = new SimpleExporterInput(jasperPrint);
//        exporterHTML.setExporterInput(exporterInput);
//        SimpleHtmlReportConfiguration reportExportConfiguration = new SimpleHtmlReportConfiguration();
//
//        exporterHTML.setConfiguration(reportExportConfiguration);
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//
//        SimpleHtmlExporterOutput simpleHtmlExporterOutput = new SimpleHtmlExporterOutput(outputStream);
//        simpleHtmlExporterOutput.setImageHandler(new HtmlResourceHandler() {
//
//            @Override
//            public void handleResource(String id, byte[] data) {
//                System.err.println("id" + id);
//                images.put(id, "data:image/jpg;base64," + Base64.encodeBytes(data));
//            }
//
//            @Override
//            public String getResourcePath(String id) {
//                return images.get(id);
//            }
//        });
//        exporterHTML.setExporterOutput(simpleHtmlExporterOutput);
//
//        exporterHTML.exportReport();
//        FileUtils.writeByteArrayToFile(new File("test.html"), outputStream.toByteArray());
//
//    }

}
