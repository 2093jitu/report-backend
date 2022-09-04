package com.springbootexp.cabinrpt.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CabinShareReportDto {

	private String personalNumber;
	private String patientName;
	private String regType;
	private String relation;
	private Double totalSale;
	private Double govt35;
	private Double rnd30;
	private Double staff10;
	private Double commdt25;
	private Long admissionNo;
	private String admissionId;
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getRegType() {
		return regType;
	}
	public void setRegType(String regType) {
		this.regType = regType;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public Double getTotalSale() {
		return totalSale;
	}
	public void setTotalSale(Double totalSale) {
		this.totalSale = totalSale;
	}
	public Double getGovt35() {
		return govt35;
	}
	public void setGovt35(Double govt35) {
		this.govt35 = govt35;
	}
	public Double getRnd30() {
		return rnd30;
	}
	public void setRnd30(Double rnd30) {
		this.rnd30 = rnd30;
	}
	public Double getStaff10() {
		return staff10;
	}
	public void setStaff10(Double staff10) {
		this.staff10 = staff10;
	}
	public Double getCommdt25() {
		return commdt25;
	}
	public void setCommdt25(Double commdt25) {
		this.commdt25 = commdt25;
	}
	public Long getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}
	public String getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	
}
