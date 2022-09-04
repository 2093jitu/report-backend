package com.springbootexp.thymele;

import java.io.IOException;



import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


import com.itextpdf.text.DocumentException;
//import com.mysoft.auth.user.MyUserDetails;
//import com.mysoft.core.appReport.AppReportEntity;
//import com.mysoft.core.appReport.AppReportService;
//import com.mysoft.core.doctor.image.DoctorSignatureService;
//import com.mysoft.core.employee.CoreEmployeeService;
//import com.mysoft.core.employee.ViewEmployeeEntity;
//import com.mysoft.core.employee.image.EmployeeSignatureService;
//import com.mysoft.core.util.AppReportName;
//import com.mysoft.core.util.Def;
//import com.mysoft.core.util.Response;
//import com.mysoft.radiologyApp.base.RadiologyService;
//import com.mysoft.radiologyApp.base.payload.ConsultantResponse;
//import com.mysoft.radiologyApp.base.payload.PreparedByResponse;
//import com.mysoft.radiologyApp.base.payload.ReportFooterResponse;
//import com.mysoft.radiologyApp.lab.LabReportDto;
//import com.mysoft.radiologyApp.lab.LabReportService;
//import com.mysoft.radiologyApp.nonLab.InvoiceDetailDto;
//import com.mysoft.radiologyApp.nonLab.NonLabReportDto;
//import com.mysoft.radiologyApp.nonLab.NonLabReportService;
//import com.mysoft.shared.investigationReportView.PatientInvestigationReportService;
//import com.mysoft.shared.investigationReportView.PatientInvestigationReportViewEntity;

@Repository
public class ThymeleafReportRepository extends ThymeleafBaseRepository {

//	@Autowired
//	private Environment env;
//	@Autowired
//	private RadiologyService radilogyService;
//	@Autowired
//	private CoreEmployeeService coreEmployeeService;
//	@Autowired
//	private DoctorSignatureService doctorSignatureService;
//	@Autowired
//	private EmployeeSignatureService empSignatureService;
//	@Autowired
//	private AppReportService appReportService;
//	@Autowired
//	private LabReportService labReportService;
//	@Autowired
//	private NonLabReportService nonLabReportService;
//	@Autowired
//	private PatientInvestigationReportService investigationReportService;
//
//	@Autowired
//	private EntityManager entityManager;
//
//	// --IBU--
//	public ResponseEntity<byte[]> nonLabReportByInvoiceNoAndItemNo(String reqObj)
//			throws DocumentException, IOException {
//
//		String rptPrintTypes[] = { "REGULAR", "IMAGE" };
//		RadiologyReportResponse reportResponse = new RadiologyReportResponse();
//
//		JSONObject json = new JSONObject(reqObj);
//		Long itemNo = Def.getLong(json, "itemNo");
//		Long invoiceNo = Def.getLong(json, "invoiceNo");
//		String accessPoint = Def.getString(json, "accessPoint");
//		String rptPrintType = Def.getString(json, "rptPrintType");
//
//		reportResponse.setAccessPoint(accessPoint); // RESULT_ENTRY, PATIENT_PORTAL, REPORT_PORTAL
//
//		Response res = investigationReportService.findReportDetailsByInvoiceAndItemNo(invoiceNo, itemNo);
//		PatientInvestigationReportViewEntity report = getValueFromObject(res.getObj(),
//				PatientInvestigationReportViewEntity.class);
//
//		MyUserDetails user = userDetails();
//		Integer reportType = getReportType(user.getUserId());
//		if (reportType > 0) {
//			AppReportEntity appReport = appReportService.findByReportId(AppReportName.NON_LAB_REPORT.getId());
//			if (appReport != null && (reportType.equals(1) || reportType.equals(3))) {
//				reportResponse.setHeaderImage(super.findReportHeaderImg());
//			}
//			if (appReport != null && (reportType.equals(2) || reportType.equals(3))) {
//				reportResponse.setFooterImage(super.findReportFooterImg());
//			}
//		}
//		reportResponse.setPrintHeader((reportType.equals(1) || reportType.equals(3)) ? true : false);
//		reportResponse.setPrintSignature((reportType.equals(2) || reportType.equals(3)) ? true : false);
//
//		Response reportData = nonLabReportService.loadReport(itemNo, invoiceNo);
//		Response invoiceDtl = nonLabReportService.getInvoiceDetail(itemNo, invoiceNo);
//
//		// InvoiceDetailDto invoiceDetailDto = (InvoiceDetailDto) ;
//		InvoiceDetailDto invoiceDetailDto = getValueFromObject(invoiceDtl.getObj(), InvoiceDetailDto.class);
//		String ageCostomize = null;
//		if (!StringUtils.isBlank(invoiceDetailDto.getAge())) {
//
//			String[] splitA = (invoiceDetailDto.getAge()).split(" ");
//			ageCostomize = splitA[0];
//		}
//		invoiceDetailDto.setAge(ageCostomize);
//		NonLabReportDto nonLabReportDto = null;
//		if (reportData.isSuccess()) {
//			nonLabReportDto = (NonLabReportDto) reportData.getObj();
//			reportResponse.setReportData(nonLabReportDto);
//
//			String reportStatus = checkReportStageStatus(nonLabReportDto.getFinalizedBy(),
//					nonLabReportDto.getVerifiedBy(), nonLabReportDto.getPreparedBy());
//			reportResponse.setReportStatus(reportStatus);
//		}
//
//		// InvoiceDetailDto invoiceDetail = null;
//		if (invoiceDtl.isSuccess()) {
//			// invoiceDetail = (InvoiceDetailDto) invoiceDtl.getObj();
//			if (invoiceDetailDto.getItemName() == null && report != null) {
//				invoiceDetailDto.setItemName(report.getItemName());
//			}
//			reportResponse.setInvoiceDetail(invoiceDetailDto);
//		}
//
//		if (report != null && report.getBuNo() != null && null != itemNo) {
//			Response reportHeaderResponse = radilogyService.getReportHeaderPrompt(report.getBuNo(), itemNo);
//			if (reportHeaderResponse.isSuccess() && null != reportHeaderResponse.getObj()) {
//				String reportHeaderText = reportHeaderResponse.getObj().toString();
//				reportResponse.setReportHeaderText(reportHeaderText);
//			}
//		}
//		
//		// Condition for Not show Author Info until Result has been Finalized. 
//		if(invoiceDetailDto.getFinalizeKeyFlag() != null && invoiceDetailDto.getFinalizeKeyFlag()==1L) {
//		
//			Response resFooterPerson = new Response();
//			if (nonLabReportDto != null) {
//				if (nonLabReportDto.getPreparedBy() == null)
//					nonLabReportDto.setPreparedBy(0L);
//				if (nonLabReportDto.getVerifiedBy() == null)
//					nonLabReportDto.setVerifiedBy(0L);
//				System.out.println("nonLabReportDtoGetFP:"+nonLabReportDto);
//				
//				resFooterPerson = radilogyService.reportFooterPersons(nonLabReportDto.getFinalizedBy(),
//						nonLabReportDto.getVerifiedBy(), nonLabReportDto.getPreparedBy());
//			}
//
//			ReportFooterResponse reportFooterResponse = new ReportFooterResponse();
//			if (resFooterPerson.getObj() != null) {
//				reportFooterResponse = getValueFromObject(resFooterPerson.getObj(), ReportFooterResponse.class);
//			}
//
//			PreparedByResponse preparedByInfo = reportFooterResponse.getDefaultPreparedBy();
//			reportResponse.setPreparedByInfo(preparedByInfo);
//			if (null != preparedByInfo && null != preparedByInfo.getEmployeeNo()) {
//				reportResponse
//						.setPreparedBySignature(empSignatureService.findSignatureByEmpNo(preparedByInfo.getEmployeeNo()));
//			}
//			PreparedByResponse verifiedByInfo = reportFooterResponse.getDefaultScientificOfficer();
//			reportResponse.setVerifiedByInfo(verifiedByInfo);
//			if (null != verifiedByInfo && null != verifiedByInfo.getEmployeeNo()) {
//				reportResponse
//						.setVerifiedBySignature(empSignatureService.findSignatureByEmpNo(verifiedByInfo.getEmployeeNo()));
//			}
//			ConsultantResponse finalizedByInfo = reportFooterResponse.getDefaultConsultant();
//			reportResponse.setFinalizedByInfo(finalizedByInfo);
//			if (null != finalizedByInfo && null != finalizedByInfo.getDoctorNo()) {
//				reportResponse
//						.setDoctorSignature(doctorSignatureService.findDgtlSignByDoctorNo(finalizedByInfo.getDoctorNo()));
//			}	
//			
//		}
//
//		
//
//		// Report printed by
//		if (null != user.getEmpNo() && user.getEmpNo() > 0) {
//			Response response = coreEmployeeService.findByEmpNo(user.getEmpNo());
//			if (response.isSuccess() && null != response.getObj()) {
//				ViewEmployeeEntity ViewEmployeeEntity = getValueFromObject(response.getObj(), ViewEmployeeEntity.class);
//				if (null != ViewEmployeeEntity) {
//					if (!StringUtils.isBlank(ViewEmployeeEntity.getEmpName())) {
//						reportResponse.setReportPrintedBy(ViewEmployeeEntity.getUsrUserName());
//					} else {
//						reportResponse.setReportPrintedBy("");
//					}
//				} else {
//					reportResponse.setReportPrintedBy("");
//				}
//			}
//		}
//		String nonLabRptFolder = "";
//		System.out.println(env.getProperty("service.servicename").trim());
//		if (env.getProperty("service.servicename").equals("IHL")) {
//			nonLabRptFolder = rptPrintType.equals(rptPrintTypes[1]) ? "nonLabReportIHL_IMG" : "nonLabReportIhl";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("SWMCH")) {
//			nonLabRptFolder = "nonLabReportSWMCH";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("INGENIOUS-PULMO-FIT")) {
//			nonLabRptFolder = "nonLabReportSWMCH";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("CMCHL")) {
//			nonLabRptFolder = "nonLabReportCMCHL";
//		}else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("GLOBAL")) {
//			nonLabRptFolder = "nonLabReportGlobal";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("DMFR")) {
//			nonLabRptFolder = "nonLabReportDMFR";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("SEBAPC")) {
//			nonLabRptFolder = "nonLabReportSEBAPC";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("KGH")) {
//			nonLabRptFolder = "nonLabReportKGH";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("EPIC")) {
//			nonLabRptFolder = "nonLabReportEPIC";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("JEWMCH")) {
//			nonLabRptFolder = "nonLabReportJEWMCH";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("BSHL")) {
//			nonLabRptFolder = rptPrintType.equals(rptPrintTypes[1]) ? "nonLabReportBSHL_IMG" : "nonLabReportBSHL";
////			nonLabRptFolder = "nonLabReportBSHL";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("NILMRC")) {
//			nonLabRptFolder = "nonLabReportNILMRC";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("DHCCL")) {
//			nonLabRptFolder = "nonLabReportDHCCL";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("DNMIH")) {
//			nonLabRptFolder = "nonLabReportDNMIH";
//		} else {
//			nonLabRptFolder = "nonLabReport";
//		}
//
//		return getResponseEntityByDataAndFile(reportResponse, nonLabRptFolder, "nonLabTemplate");
//	}
//
//	// --- IBU---Lab Report---
//	public ResponseEntity<byte[]> labReportByInvoiceItemNo(String reqObj) throws DocumentException, IOException {
//
//		String rptPrintTypes[] = { "REGULAR", "IMAGE" };
//		RadiologyReportResponse reportResponse = new RadiologyReportResponse();
//
//		JSONObject json = new JSONObject(reqObj);
//		Long itemNo = Def.getLong(json, "itemNo");
//		Long invoiceNo = Def.getLong(json, "invoiceNo");
//		String accessPoint = Def.getString(json, "accessPoint");
//		String rptPrintType = Def.getString(json, "rptPrintType");
//
//		reportResponse.setAccessPoint(accessPoint); // RESULT_ENTRY, PATIENT_PORTAL, REPORT_PORTAL
//
//		if (itemNo == null || invoiceNo == null) {
//			return ResponseEntity.ok().body(null);
//		}
//
//		Response reportData = labReportService.loadReport(itemNo, invoiceNo);
//		Response invoiceDtl = labReportService.getInvoiceDetail(itemNo, invoiceNo);
//
//		// InvoiceDetailDto invoiceDetailDto = (InvoiceDetailDto) ;
//		InvoiceDetailDto invoiceDetailDto = getValueFromObject(invoiceDtl.getObj(), InvoiceDetailDto.class);
//		String ageCostomize = null;
//		if (!StringUtils.isBlank(invoiceDetailDto.getAge())) {
//
//			String[] splitA = (invoiceDetailDto.getAge()).split(" ");
//			ageCostomize = splitA[0];
//		}
//		invoiceDetailDto.setAge(ageCostomize);
//
//		Response res = investigationReportService.findReportDetailsByInvoiceAndItemNo(invoiceNo, itemNo);
//
//		if (!res.isSuccess() && res.getObj() == null) {
//			return ResponseEntity.ok().body(null);
//		}
//
//		PatientInvestigationReportViewEntity report = getValueFromObject(res.getObj(),
//				PatientInvestigationReportViewEntity.class);
//
//		MyUserDetails user = userDetails();
//		Integer reportType = getReportType(user.getUserId());
//		if (reportType > 0) {
//			AppReportEntity appReport = appReportService.findByReportId(AppReportName.NON_LAB_REPORT.getId());
//			if (appReport != null && (reportType.equals(1) || reportType.equals(3))) {
//				reportResponse.setHeaderImage(super.findReportHeaderImg());
//			}
//			if (appReport != null && (reportType.equals(2) || reportType.equals(3))) {
//				reportResponse.setFooterImage(super.findReportFooterImg());
//			}
//		}
//		reportResponse.setPrintHeader((reportType.equals(1) || reportType.equals(3)) ? true : false);
//		reportResponse.setPrintSignature((reportType.equals(2) || reportType.equals(3)) ? true : false);
//		LabReportDto labReportDto = null;
//
//		if (reportData.isSuccess()) {
//			labReportDto = (LabReportDto) reportData.getObj();
//			reportResponse.setReportData(labReportDto);
//
//			String reportStatus = checkReportStageStatus(labReportDto.getFinalizedBy(), labReportDto.getVerifiedBy(),
//					labReportDto.getPreparedBy());
//			reportResponse.setReportStatus(reportStatus);
//		}
//
//		// InvoiceDetailDto invoiceDetail = null;
//		if (invoiceDtl.isSuccess()) {
//			// invoiceDetail = (InvoiceDetailDto) invoiceDtl.getObj();
//			if (invoiceDetailDto.getItemName() == null && report != null) {
//				invoiceDetailDto.setItemName(report.getItemName());
//			}
//			if (invoiceDetailDto.getRepItemName() == null && report != null) {
//				invoiceDetailDto.setRepItemName(report.getRepItemName());
//			}
//			reportResponse.setInvoiceDetail(invoiceDetailDto);
//		}
//
//		if (report != null && report.getBuNo() != null && null != invoiceDetailDto.getItemNo()) {
//			Response reportHeaderResponse = radilogyService.getReportHeaderPrompt(report.getBuNo(),
//					invoiceDetailDto.getItemNo());
//			if (reportHeaderResponse.isSuccess() && null != reportHeaderResponse.getObj()) {
//				String reportHeaderText = reportHeaderResponse.getObj().toString();
//				reportResponse.setReportHeaderText(reportHeaderText);
//			}
//		}
//		// Condition for Not show Author Info until Result has been Finalized. 
//		if(invoiceDetailDto.getFinalizeKeyFlag() != null && invoiceDetailDto.getFinalizeKeyFlag()==1) {
//			Response resFooterPerson = new Response();
//			if (labReportDto != null) {
//				if (labReportDto.getPreparedBy() == null)
//					labReportDto.setPreparedBy(0L);
//				if (labReportDto.getVerifiedBy() == null)
//					labReportDto.setVerifiedBy(0L);
//				resFooterPerson = radilogyService.reportFooterPersons(labReportDto.getFinalizedBy(),
//						labReportDto.getVerifiedBy(), labReportDto.getPreparedBy());
//			}
//
//			ReportFooterResponse reportFooterResponse = new ReportFooterResponse();
//			if (resFooterPerson.getObj() != null) {
//				reportFooterResponse = getValueFromObject(resFooterPerson.getObj(), ReportFooterResponse.class);
//			}
//
//			PreparedByResponse preparedByInfo = reportFooterResponse.getDefaultPreparedBy();
//			reportResponse.setPreparedByInfo(preparedByInfo);
//			if (null != preparedByInfo && null != preparedByInfo.getEmployeeNo()) {
//				reportResponse
//						.setPreparedBySignature(empSignatureService.findSignatureByEmpNo(preparedByInfo.getEmployeeNo()));
//			}
//			PreparedByResponse verifiedByInfo = reportFooterResponse.getDefaultScientificOfficer();
//			reportResponse.setVerifiedByInfo(verifiedByInfo);
//			if (null != verifiedByInfo && null != verifiedByInfo.getEmployeeNo()) {
//				reportResponse
//						.setVerifiedBySignature(empSignatureService.findSignatureByEmpNo(verifiedByInfo.getEmployeeNo()));
//			}
//			ConsultantResponse finalizedByInfo = reportFooterResponse.getDefaultConsultant();
//			reportResponse.setFinalizedByInfo(finalizedByInfo);
//			if (null != finalizedByInfo && null != finalizedByInfo.getDoctorNo()) {
//				reportResponse
//						.setDoctorSignature(doctorSignatureService.findDgtlSignByDoctorNo(finalizedByInfo.getDoctorNo()));
//			}
//		}
//
//		// Report printed by
//		if (null != user.getEmpNo() && user.getEmpNo() > 0) {
//			Response response = coreEmployeeService.findByEmpNo(user.getEmpNo());
//			if (response.isSuccess() && null != response.getObj()) {
//				ViewEmployeeEntity ViewEmployeeEntity = getValueFromObject(response.getObj(), ViewEmployeeEntity.class);
//				if (null != ViewEmployeeEntity) {
//					if (!StringUtils.isBlank(ViewEmployeeEntity.getEmpName())) {
//						reportResponse.setReportPrintedBy(ViewEmployeeEntity.getUsrUserName());
//					} else {
//						reportResponse.setReportPrintedBy("");
//					}
//				} else {
//					reportResponse.setReportPrintedBy("");
//				}
//			}
//		}
//		
//		rptPrintType = "IMAGE";
//		String labRptFolder = "";
//		System.out.println(env.getProperty("service.servicename").trim());
//		if (env.getProperty("service.servicename").trim().equalsIgnoreCase("IHL")) {
//			labRptFolder = rptPrintType.equals(rptPrintTypes[1]) ? "labReportIHL_IMG" : "labReportIhl";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("SWMCH")) {
//			labRptFolder = "labReportSWMCH";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("INGENIOUS-PULMO-FIT")) {
//			labRptFolder = "labReportINGENIOUS-PULMO-FIT";
//		}  else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("CMCHL")) {
//			labRptFolder = "labReportCMCHL";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("GLOBAL")) {
//			labRptFolder = "labReportGlobal";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("JEWMCH")) {
//			labRptFolder = "labReportJEWMCH";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("DMFR")) {
//			String osNo = getOutsourceNuber(invoiceNo);
//			if (StringUtils.isBlank(osNo)) {
//				reportResponse.setOsNo("");
//			} else {
//				reportResponse.setOsNo(osNo);
//			}
//			labRptFolder = "labReportDMFR";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("SEBAPC")) {
//			String osNo = getOutsourceNuber(invoiceNo);
//			if (StringUtils.isBlank(osNo)) {
//				reportResponse.setOsNo("");
//			} else {
//				reportResponse.setOsNo(osNo);
//			}
//			labRptFolder = "labReportSEBAPC";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("KGH")) {
//			String osNo = getOutsourceNuber(invoiceNo);
//			if (StringUtils.isBlank(osNo)) {
//				reportResponse.setOsNo("");
//			} else {
//				reportResponse.setOsNo(osNo);
//			}
//			labRptFolder = "labReportKGH";
//
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("EPIC")) {
//			String osNo = getOutsourceNuber(invoiceNo);
//			if (StringUtils.isBlank(osNo)) {
//				reportResponse.setOsNo("");
//			} else {
//				reportResponse.setOsNo(osNo);
//			}
//			labRptFolder = "labReportEPIC";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("NILMRC")) {
//			String osNo = getOutsourceNuber(invoiceNo);
//			if (StringUtils.isBlank(osNo)) {
//				reportResponse.setOsNo("");
//			} else {
//				reportResponse.setOsNo(osNo);
//			}
//			labRptFolder = "labReportNILMRC";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("DHCCL")) {
//			String osNo = getOutsourceNuber(invoiceNo);
//			if (StringUtils.isBlank(osNo)) {
//				reportResponse.setOsNo("");
//			} else {
//				reportResponse.setOsNo(osNo);
//			}
//			labRptFolder = "labReportDHCCL";
//		} else if (env.getProperty("service.servicename").trim().equalsIgnoreCase("DNMIH")) {
//			String osNo = getOutsourceNuber(invoiceNo);
//			if (StringUtils.isBlank(osNo)) {
//				reportResponse.setOsNo("");
//			} else {
//				reportResponse.setOsNo(osNo);
//			}
//			labRptFolder = "labReportDNMIH";
//		} else {
//			labRptFolder = "labReport";
//		}
//
//		return getResponseEntityByDataAndFile(reportResponse, labRptFolder, "labTemplate");
//	}
//
//	public String getOutsourceNuber(Long invoiceNo) {
//
//		String osNo = null;
//		osNo = (String) entityManager.createNativeQuery("SELECT FD_OUTSOURCE_NUMBER(:pInvoiceNo) FROM DUAL")
//				.setParameter("pInvoiceNo", invoiceNo).getSingleResult();
//
//		if (osNo == null) {
//			return null;
//		}
//		return osNo;
//
//	}

}