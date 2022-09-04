package com.springbootexp.dto.billReferral;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReferenceDoctorDto {
	
	private Long doctorNo;
	private String doctorId;
	private String doctorName;
	private String docDegree;
	private String chamber;
	private String docPhoneMobile;
	private String remarks;
	public Long getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDocDegree() {
		return docDegree;
	}
	public void setDocDegree(String docDegree) {
		this.docDegree = docDegree;
	}
	public String getChamber() {
		return chamber;
	}
	public void setChamber(String chamber) {
		this.chamber = chamber;
	}
	public String getDocPhoneMobile() {
		return docPhoneMobile;
	}
	public void setDocPhoneMobile(String docPhoneMobile) {
		this.docPhoneMobile = docPhoneMobile;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



}
