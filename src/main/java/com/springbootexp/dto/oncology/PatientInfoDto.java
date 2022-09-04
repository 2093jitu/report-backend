package com.springbootexp.dto.oncology;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class PatientInfoDto {
	private Long id;
	private Long protocolNo;
	private String patProtocolname;
	private String shortName;
	private Long diagnosisNo;
	private String diagnosisVal;
	private String toxicity;
	private Long cycleDays;
	private Long totalCycle;
	private String comments;
	private String note;
	private String referenceFrom;
	private Long finalizeFlag;
	private Date startingDate;
	private String status;
	private Long doctorNo;
	private Long regNo;
	private String patientName;
	private String genderData;
	private String mStatusdata;
	private Date dob;
	private String age;
	private String phoneMobile;
	private String hospitalId;
	private Long consultationNo;
	private String consultationId;
	private Long activeStatus;
	private String doctorName;	
	private String doctorDegree;	
	private String userName;
	private String scheduleNote;
	private String requestDate;
	private List<OncoPatOtherDataDto> patOtherDataDtoList;
	private List<OncoPatDrugReqDtlDto> oncoPatDrugReqDtlDtoList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProtocolNo() {
		return protocolNo;
	}
	public void setProtocolNo(Long protocolNo) {
		this.protocolNo = protocolNo;
	}
	public String getPatProtocolname() {
		return patProtocolname;
	}
	public void setPatProtocolname(String patProtocolname) {
		this.patProtocolname = patProtocolname;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Long getDiagnosisNo() {
		return diagnosisNo;
	}
	public void setDiagnosisNo(Long diagnosisNo) {
		this.diagnosisNo = diagnosisNo;
	}
	public String getDiagnosisVal() {
		return diagnosisVal;
	}
	public void setDiagnosisVal(String diagnosisVal) {
		this.diagnosisVal = diagnosisVal;
	}
	public String getToxicity() {
		return toxicity;
	}
	public void setToxicity(String toxicity) {
		this.toxicity = toxicity;
	}
	public Long getCycleDays() {
		return cycleDays;
	}
	public void setCycleDays(Long cycleDays) {
		this.cycleDays = cycleDays;
	}
	public Long getTotalCycle() {
		return totalCycle;
	}
	public void setTotalCycle(Long totalCycle) {
		this.totalCycle = totalCycle;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getReferenceFrom() {
		return referenceFrom;
	}
	public void setReferenceFrom(String referenceFrom) {
		this.referenceFrom = referenceFrom;
	}
	public Long getFinalizeFlag() {
		return finalizeFlag;
	}
	public void setFinalizeFlag(Long finalizeFlag) {
		this.finalizeFlag = finalizeFlag;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}
	public Long getRegNo() {
		return regNo;
	}
	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getGenderData() {
		return genderData;
	}
	public void setGenderData(String genderData) {
		this.genderData = genderData;
	}
	public String getmStatusdata() {
		return mStatusdata;
	}
	public void setmStatusdata(String mStatusdata) {
		this.mStatusdata = mStatusdata;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneMobile() {
		return phoneMobile;
	}
	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}
	public String getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}
	public Long getConsultationNo() {
		return consultationNo;
	}
	public void setConsultationNo(Long consultationNo) {
		this.consultationNo = consultationNo;
	}
	public String getConsultationId() {
		return consultationId;
	}
	public void setConsultationId(String consultationId) {
		this.consultationId = consultationId;
	}
	public Long getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Long activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorDegree() {
		return doctorDegree;
	}
	public void setDoctorDegree(String doctorDegree) {
		this.doctorDegree = doctorDegree;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getScheduleNote() {
		return scheduleNote;
	}
	public void setScheduleNote(String scheduleNote) {
		this.scheduleNote = scheduleNote;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public List<OncoPatOtherDataDto> getPatOtherDataDtoList() {
		return patOtherDataDtoList;
	}
	public void setPatOtherDataDtoList(List<OncoPatOtherDataDto> patOtherDataDtoList) {
		this.patOtherDataDtoList = patOtherDataDtoList;
	}
	public List<OncoPatDrugReqDtlDto> getOncoPatDrugReqDtlDtoList() {
		return oncoPatDrugReqDtlDtoList;
	}
	public void setOncoPatDrugReqDtlDtoList(List<OncoPatDrugReqDtlDto> oncoPatDrugReqDtlDtoList) {
		this.oncoPatDrugReqDtlDtoList = oncoPatDrugReqDtlDtoList;
	}

}
