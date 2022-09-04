package com.springbootexp.dto;

import java.util.Date;
import java.util.List;

import com.springbootexp.dto.oncology.OncoPatProtocolDtlDto;

public class OncoStickerDto {
	private String patientName;
	private String doctorName;
	private Long regNo;
	private String hospitalId;
	private String age;
	private Date date;
	private Long dayNo;
	private Long cycleNo;
	private List<OncoPatProtocolDtlDto> drugList;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getDayNo() {
		return dayNo;
	}
	public void setDayNo(Long dayNo) {
		this.dayNo = dayNo;
	}
	public Long getCycleNo() {
		return cycleNo;
	}
	public void setCycleNo(Long cycleNo) {
		this.cycleNo = cycleNo;
	}
	public List<OncoPatProtocolDtlDto> getDrugList() {
		return drugList;
	}
	public void setDrugList(List<OncoPatProtocolDtlDto> drugList) {
		this.drugList = drugList;
	}
	
}
