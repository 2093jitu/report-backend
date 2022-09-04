package com.springbootexp.billrpt;

import java.math.BigDecimal;
import java.util.Date;



;

public class BillCollectionDto {

	private Long id;

	private Long regNo;

	private String hospitalNumber;

	private Long admissionNo;

	private String admissionId;

	private String rbNo;

	private Date admissionDate;

	private Date admissionDatetime;

	private String personalNumber;

	private String patientName;

	private Date payDate;

	private Date payDatetime;

	private Long collMode;

	private String collModeName;

	private BigDecimal payAmt;
	private Long payTypeNo;

	private String regType;

	private String rank;

	private Long investigationAmt;

	
	
	public BillCollectionDto(Long admissionNo, String admissionId, Date admissionDate, String patientName,
			Long collMode, String collModeName, BigDecimal payAmt, Long payTypeNo, String regType, String rank,
			Long investigationAmt) {
		super();
		this.admissionNo = admissionNo;
		this.admissionId = admissionId;
		this.admissionDate = admissionDate;
		this.patientName = patientName;
		this.collMode = collMode;
		this.collModeName = collModeName;
		this.payAmt = payAmt;
		this.payTypeNo = payTypeNo;
		this.regType = regType;
		this.rank = rank;
		this.investigationAmt = investigationAmt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getHospitalNumber() {
		return hospitalNumber;
	}

	public void setHospitalNumber(String hospitalNumber) {
		this.hospitalNumber = hospitalNumber;
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

	public String getRbNo() {
		return rbNo;
	}

	public void setRbNo(String rbNo) {
		this.rbNo = rbNo;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Date getAdmissionDatetime() {
		return admissionDatetime;
	}

	public void setAdmissionDatetime(Date admissionDatetime) {
		this.admissionDatetime = admissionDatetime;
	}

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

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Date getPayDatetime() {
		return payDatetime;
	}

	public void setPayDatetime(Date payDatetime) {
		this.payDatetime = payDatetime;
	}

	public Long getCollMode() {
		return collMode;
	}

	public void setCollMode(Long collMode) {
		this.collMode = collMode;
	}

	public String getCollModeName() {
		return collModeName;
	}

	public void setCollModeName(String collModeName) {
		this.collModeName = collModeName;
	}

	public BigDecimal getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}

	public Long getPayTypeNo() {
		return payTypeNo;
	}

	public void setPayTypeNo(Long payTypeNo) {
		this.payTypeNo = payTypeNo;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Long getInvestigationAmt() {
		return investigationAmt;
	}

	public void setInvestigationAmt(Long investigationAmt) {
		this.investigationAmt = investigationAmt;
	}
	
}
