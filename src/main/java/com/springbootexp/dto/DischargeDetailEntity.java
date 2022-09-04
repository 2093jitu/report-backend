package com.springbootexp.dto;

import java.util.Date;

public class DischargeDetailEntity {

	
	private Long id;
		
	
	private Long disSumNo;
	
	
	private Long transactionNo;


	private String setupVal;
		
	
	private Long setupValType;
		
	
	private Long setupValParType;

	
	private String setupValUnit;
		

	private Long referenceId;

	
	private Long inReportSerial;
	

	private Long inReportGroupSerial;
				
	
	private String findings;
		
	
	private String findingsClob;
		
		
	private Long findingsRefId;
		

	private Integer activeStatus = 1;
	

	private Integer isDeleted=0;

	private Date actionDate;
	

	
	
	public DischargeDetailEntity() {
		
	}

	public DischargeDetailEntity(Long transactionNo, String setupVal, String setupValUnit, Long inReportSerial,
			Long inReportGroupSerial, String findings, Date actionDate, String attrName, String normalRange) {
	
		this.transactionNo = transactionNo;
		this.setupVal = setupVal;
		this.setupValUnit = setupValUnit;
		this.inReportSerial = inReportSerial;
		this.inReportGroupSerial = inReportGroupSerial;
		this.findings = findings;
		this.actionDate = actionDate;
		this.attrName = attrName;
		this.normalRange = normalRange;
	}

	public DischargeDetailEntity( Long inReportSerial,String setupVal, String findingsClob, Date actionDate) {
		super();
		this.inReportSerial = inReportSerial;
		this.setupVal = setupVal;
		this.findingsClob = findingsClob;
		this.actionDate = actionDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDisSumNo() {
		return disSumNo;
	}

	public void setDisSumNo(Long disSumNo) {
		this.disSumNo = disSumNo;
	}

	public Long getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(Long transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getSetupVal() {
		return setupVal;
	}

	public void setSetupVal(String setupVal) {
		this.setupVal = setupVal;
	}

	public Long getSetupValType() {
		return setupValType;
	}

	public void setSetupValType(Long setupValType) {
		this.setupValType = setupValType;
	}

	public Long getSetupValParType() {
		return setupValParType;
	}

	public void setSetupValParType(Long setupValParType) {
		this.setupValParType = setupValParType;
	}

	public String getSetupValUnit() {
		return setupValUnit;
	}

	public void setSetupValUnit(String setupValUnit) {
		this.setupValUnit = setupValUnit;
	}

	public Long getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	public Long getInReportSerial() {
		return inReportSerial;
	}

	public void setInReportSerial(Long inReportSerial) {
		this.inReportSerial = inReportSerial;
	}

	public Long getInReportGroupSerial() {
		return inReportGroupSerial;
	}

	public void setInReportGroupSerial(Long inReportGroupSerial) {
		this.inReportGroupSerial = inReportGroupSerial;
	}

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getFindingsClob() {
		return findingsClob;
	}

	public void setFindingsClob(String findingsClob) {
		this.findingsClob = findingsClob;
	}

	public Long getFindingsRefId() {
		return findingsRefId;
	}

	public void setFindingsRefId(Long findingsRefId) {
		this.findingsRefId = findingsRefId;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getNormalRange() {
		return normalRange;
	}

	public void setNormalRange(String normalRange) {
		this.normalRange = normalRange;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	private String attrName;
	

	private String normalRange;
	
	private String comments;
}
