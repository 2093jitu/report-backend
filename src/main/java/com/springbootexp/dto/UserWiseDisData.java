package com.springbootexp.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserWiseDisData {
	private  Long id;
	private Long activeStatus=1l;
	private String description;
	private Long doctorNo;
	private Long preferencesDataType;
	private Long preferencesSerial;
	private Long showInReport;	
	private Long showInTab;
	private String title;
	private String userPreferencesKey;
	private String userPreferencesType;
	private String userPreferencesValue;
	
	private List<DischargeDetailEntity> adviceList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Long activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}
	public Long getPreferencesDataType() {
		return preferencesDataType;
	}
	public void setPreferencesDataType(Long preferencesDataType) {
		this.preferencesDataType = preferencesDataType;
	}
	public Long getPreferencesSerial() {
		return preferencesSerial;
	}
	public void setPreferencesSerial(Long preferencesSerial) {
		this.preferencesSerial = preferencesSerial;
	}
	public Long getShowInReport() {
		return showInReport;
	}
	public void setShowInReport(Long showInReport) {
		this.showInReport = showInReport;
	}
	public Long getShowInTab() {
		return showInTab;
	}
	public void setShowInTab(Long showInTab) {
		this.showInTab = showInTab;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserPreferencesKey() {
		return userPreferencesKey;
	}
	public void setUserPreferencesKey(String userPreferencesKey) {
		this.userPreferencesKey = userPreferencesKey;
	}
	public String getUserPreferencesType() {
		return userPreferencesType;
	}
	public void setUserPreferencesType(String userPreferencesType) {
		this.userPreferencesType = userPreferencesType;
	}
	public String getUserPreferencesValue() {
		return userPreferencesValue;
	}
	public void setUserPreferencesValue(String userPreferencesValue) {
		this.userPreferencesValue = userPreferencesValue;
	}
	public List<DischargeDetailEntity> getAdviceList() {
		return adviceList;
	}
	public void setAdviceList(List<DischargeDetailEntity> adviceList) {
		this.adviceList = adviceList;
	}
	public List<DischargeDetailEntity> getAdditionalList() {
		return additionalList;
	}
	public void setAdditionalList(List<DischargeDetailEntity> additionalList) {
		this.additionalList = additionalList;
	}
	public List<DisMedicineEntity> getTratmentOnDischargeList() {
		return tratmentOnDischargeList;
	}
	public void setTratmentOnDischargeList(List<DisMedicineEntity> tratmentOnDischargeList) {
		this.tratmentOnDischargeList = tratmentOnDischargeList;
	}
	public List<DischargeDetailEntity> getInvestigationList() {
		return investigationList;
	}
	public void setInvestigationList(List<DischargeDetailEntity> investigationList) {
		this.investigationList = investigationList;
	}
	public List<DischargeDetailEntity> getHospitalizationInfoList() {
		return hospitalizationInfoList;
	}
	public void setHospitalizationInfoList(List<DischargeDetailEntity> hospitalizationInfoList) {
		this.hospitalizationInfoList = hospitalizationInfoList;
	}
	public List<DischargeDetailEntity> getOtNoteInfoList() {
		return otNoteInfoList;
	}
	public void setOtNoteInfoList(List<DischargeDetailEntity> otNoteInfoList) {
		this.otNoteInfoList = otNoteInfoList;
	}
	public List<DischargeDetailEntity> getOtherConsultantList() {
		return otherConsultantList;
	}
	public void setOtherConsultantList(List<DischargeDetailEntity> otherConsultantList) {
		this.otherConsultantList = otherConsultantList;
	}
	public List<DischargeDetailEntity> getSpecialistDoctorList() {
		return specialistDoctorList;
	}
	public void setSpecialistDoctorList(List<DischargeDetailEntity> specialistDoctorList) {
		this.specialistDoctorList = specialistDoctorList;
	}
	public List<DischargeDetailEntity> getDisPatOtherInfoList() {
		return disPatOtherInfoList;
	}
	public void setDisPatOtherInfoList(List<DischargeDetailEntity> disPatOtherInfoList) {
		this.disPatOtherInfoList = disPatOtherInfoList;
	}
	public List<DischargeDetailEntity> getDietList() {
		return dietList;
	}
	public void setDietList(List<DischargeDetailEntity> dietList) {
		this.dietList = dietList;
	}
	public List<DischargeDetailEntity> getLabInvestFindingsList() {
		return labInvestFindingsList;
	}
	public void setLabInvestFindingsList(List<DischargeDetailEntity> labInvestFindingsList) {
		this.labInvestFindingsList = labInvestFindingsList;
	}
	public List<DischargeDetailEntity> getNonLabInvestFindingsList() {
		return nonLabInvestFindingsList;
	}
	public void setNonLabInvestFindingsList(List<DischargeDetailEntity> nonLabInvestFindingsList) {
		this.nonLabInvestFindingsList = nonLabInvestFindingsList;
	}
	public List<DischargeDetailEntity> getFutureInvestigationList() {
		return futureInvestigationList;
	}
	public void setFutureInvestigationList(List<DischargeDetailEntity> futureInvestigationList) {
		this.futureInvestigationList = futureInvestigationList;
	}
	public List<DischargeDetailEntity> getDietAdviceList() {
		return dietAdviceList;
	}
	public void setDietAdviceList(List<DischargeDetailEntity> dietAdviceList) {
		this.dietAdviceList = dietAdviceList;
	}
	public DischargeDetailEntity getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(DischargeDetailEntity diagnosis) {
		this.diagnosis = diagnosis;
	}
	public DischargeDetailEntity getHistoryAndExamination() {
		return historyAndExamination;
	}
	public void setHistoryAndExamination(DischargeDetailEntity historyAndExamination) {
		this.historyAndExamination = historyAndExamination;
	}
	public DischargeDetailEntity getHospitalCourseManagement() {
		return hospitalCourseManagement;
	}
	public void setHospitalCourseManagement(DischargeDetailEntity hospitalCourseManagement) {
		this.hospitalCourseManagement = hospitalCourseManagement;
	}
	public Map<String, Boolean> getPrintPreferenceInfo() {
		return printPreferenceInfo;
	}
	public void setPrintPreferenceInfo(Map<String, Boolean> printPreferenceInfo) {
		this.printPreferenceInfo = printPreferenceInfo;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getGeneralNotes() {
		return generalNotes;
	}
	public void setGeneralNotes(String generalNotes) {
		this.generalNotes = generalNotes;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorSignature() {
		return doctorSignature;
	}
	public void setDoctorSignature(String doctorSignature) {
		this.doctorSignature = doctorSignature;
	}
	public String getAdmissionType() {
		return admissionType;
	}
	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}
	private List<DischargeDetailEntity> additionalList;
	private List<DisMedicineEntity> tratmentOnDischargeList;
	private List<DischargeDetailEntity> investigationList;
	private List<DischargeDetailEntity> hospitalizationInfoList;
	private List<DischargeDetailEntity> otNoteInfoList;
	
	private List<DischargeDetailEntity> otherConsultantList;
	private List<DischargeDetailEntity> specialistDoctorList;
	private List<DischargeDetailEntity> disPatOtherInfoList;
	private List<DischargeDetailEntity> dietList;
	private List<DischargeDetailEntity> labInvestFindingsList;
	private List<DischargeDetailEntity> nonLabInvestFindingsList;
	// futureInvestigationList
	private List<DischargeDetailEntity> futureInvestigationList;
	private List<DischargeDetailEntity> dietAdviceList;
	
	
	
	private DischargeDetailEntity diagnosis;
	private DischargeDetailEntity historyAndExamination;
	private DischargeDetailEntity hospitalCourseManagement;
	
	private Map<String, Boolean> printPreferenceInfo;
	
	private Date visitDate;
	private String notes;
	private String generalNotes;
	
	private String doctorName;
	private String doctorSignature;
	private String admissionType;

}
