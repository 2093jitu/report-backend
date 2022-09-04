package com.springbootexp.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class DischargeSummaryDto {
	private String disSumId;
	private String admissionId;
	private Date   admissionDate;
	private Date   disChargeDate;
	private String hospitalId;
	private String disType;
	private String departmentName;
	private String bedName;
	private Long primaryDoctorShow;
	private String primaryDoctorName;
	private Long splDoctorShow;
	private String splDoctorName;
	private String preparedBy;
	private String prepaByDrDegree;
	private String priDOcDegree;
	private String splDOcDegree;
	private String checkedBy;
	private String patName;
	private String patAge;
	private String address;
	private Date   patDob;
	private String patGender;
	private String phoneNo;
	private Long bedNo;
	private String disPatternClob;
	private Long watermarkFlag;
	private String disPattern;
	
	private Map<String, DisUserPreferencesEntity> disUserPreferenceMap;
	
	private List<DisUserPreferencesEntity> userPreferencesList;
	private List<DischargeDetailEntity> adviceList;
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
	
//	change fr
	private List<UserWiseDisData> userWiseDisData;

	public String getDisSumId() {
		return disSumId;
	}

	public void setDisSumId(String disSumId) {
		this.disSumId = disSumId;
	}

	public String getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Date getDisChargeDate() {
		return disChargeDate;
	}

	public void setDisChargeDate(Date disChargeDate) {
		this.disChargeDate = disChargeDate;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getDisType() {
		return disType;
	}

	public void setDisType(String disType) {
		this.disType = disType;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getBedName() {
		return bedName;
	}

	public void setBedName(String bedName) {
		this.bedName = bedName;
	}

	public Long getPrimaryDoctorShow() {
		return primaryDoctorShow;
	}

	public void setPrimaryDoctorShow(Long primaryDoctorShow) {
		this.primaryDoctorShow = primaryDoctorShow;
	}

	public String getPrimaryDoctorName() {
		return primaryDoctorName;
	}

	public void setPrimaryDoctorName(String primaryDoctorName) {
		this.primaryDoctorName = primaryDoctorName;
	}

	public Long getSplDoctorShow() {
		return splDoctorShow;
	}

	public void setSplDoctorShow(Long splDoctorShow) {
		this.splDoctorShow = splDoctorShow;
	}

	public String getSplDoctorName() {
		return splDoctorName;
	}

	public void setSplDoctorName(String splDoctorName) {
		this.splDoctorName = splDoctorName;
	}

	public String getPreparedBy() {
		return preparedBy;
	}

	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}

	public String getPrepaByDrDegree() {
		return prepaByDrDegree;
	}

	public void setPrepaByDrDegree(String prepaByDrDegree) {
		this.prepaByDrDegree = prepaByDrDegree;
	}

	public String getPriDOcDegree() {
		return priDOcDegree;
	}

	public void setPriDOcDegree(String priDOcDegree) {
		this.priDOcDegree = priDOcDegree;
	}

	public String getSplDOcDegree() {
		return splDOcDegree;
	}

	public void setSplDOcDegree(String splDOcDegree) {
		this.splDOcDegree = splDOcDegree;
	}

	public String getCheckedBy() {
		return checkedBy;
	}

	public void setCheckedBy(String checkedBy) {
		this.checkedBy = checkedBy;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getPatAge() {
		return patAge;
	}

	public void setPatAge(String patAge) {
		this.patAge = patAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getPatDob() {
		return patDob;
	}

	public void setPatDob(Date patDob) {
		this.patDob = patDob;
	}

	public String getPatGender() {
		return patGender;
	}

	public void setPatGender(String patGender) {
		this.patGender = patGender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Long getBedNo() {
		return bedNo;
	}

	public void setBedNo(Long bedNo) {
		this.bedNo = bedNo;
	}

	public String getDisPatternClob() {
		return disPatternClob;
	}

	public void setDisPatternClob(String disPatternClob) {
		this.disPatternClob = disPatternClob;
	}

	public Long getWatermarkFlag() {
		return watermarkFlag;
	}

	public void setWatermarkFlag(Long watermarkFlag) {
		this.watermarkFlag = watermarkFlag;
	}

	public String getDisPattern() {
		return disPattern;
	}

	public void setDisPattern(String disPattern) {
		this.disPattern = disPattern;
	}

	public Map<String, DisUserPreferencesEntity> getDisUserPreferenceMap() {
		return disUserPreferenceMap;
	}

	public void setDisUserPreferenceMap(Map<String, DisUserPreferencesEntity> disUserPreferenceMap) {
		this.disUserPreferenceMap = disUserPreferenceMap;
	}

	public List<DisUserPreferencesEntity> getUserPreferencesList() {
		return userPreferencesList;
	}

	public void setUserPreferencesList(List<DisUserPreferencesEntity> userPreferencesList) {
		this.userPreferencesList = userPreferencesList;
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

	public List<UserWiseDisData> getUserWiseDisData() {
		return userWiseDisData;
	}

	public void setUserWiseDisData(List<UserWiseDisData> userWiseDisData) {
		this.userWiseDisData = userWiseDisData;
	}

}
