package com.springbootexp.dto.oncology;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class OncoPatProtocolDto {

	private Long id;
	private Long protocolNo;
	private String patProtocolName;
	private String shortName;
	private Long diagnosisNo;
	private String diagnosisVal;
	private String toxicity;
	private Long cycleDays;
	private Long totalCycle;
	private String comments;
	private String note;
	private String referenceFrom;
	private Long finalizeFlag = 0l;
	private Date startingDate;
	private String status;
	private Long doctorNo;
	private Long regNo;
	private String hospitalId;
	private Long consultationNo;
	private String consultationId;
	private Integer activeStatus = 1;
	private List<OncoPatProtocolDtlDto> oncoPatProtocolDtlList;
	private List<ViewOncoPatProtocolDto> viewOncoPatProtocolDtlList;
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
	public String getPatProtocolName() {
		return patProtocolName;
	}
	public void setPatProtocolName(String patProtocolName) {
		this.patProtocolName = patProtocolName;
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
	public Integer getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}
	public List<OncoPatProtocolDtlDto> getOncoPatProtocolDtlList() {
		return oncoPatProtocolDtlList;
	}
	public void setOncoPatProtocolDtlList(List<OncoPatProtocolDtlDto> oncoPatProtocolDtlList) {
		this.oncoPatProtocolDtlList = oncoPatProtocolDtlList;
	}
	public List<ViewOncoPatProtocolDto> getViewOncoPatProtocolDtlList() {
		return viewOncoPatProtocolDtlList;
	}
	public void setViewOncoPatProtocolDtlList(List<ViewOncoPatProtocolDto> viewOncoPatProtocolDtlList) {
		this.viewOncoPatProtocolDtlList = viewOncoPatProtocolDtlList;
	}
	

}
