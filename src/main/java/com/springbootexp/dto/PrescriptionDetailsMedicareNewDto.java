package com.springbootexp.dto;

import java.util.Date;

public class PrescriptionDetailsMedicareNewDto {

	private Long id;
	private String preDiagnosisVal;
	private Integer preDiagnosisValType;
	private Long referenceId;
    private Long duration;
    private String durationMu;
	private Long timeDuration;
	private String timeDurationMu;
	private String quantity;
    private Integer continueFlag = 0;
    private Date followUpDate;
    private String findings;
    private String unit;
	private Long headNo;
    private String findingsClob;
	private Integer isPrintable;
	private Integer isDeleted;
	private Integer isBold = 0; // 1 for bold 2 for Italic
	private Integer inReportSerial = 0;
	private PresLookupDtlEntity lookupDtl;
	private PresLookupDtlEntity lookupDtlGroup;
	
	private Integer imgOnlyFlag;

	
	
	public PrescriptionDetailsMedicareNewDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrescriptionDetailsMedicareNewDto(String preDiagnosisVal, String findings, String findingsClob,
			Integer isBold, Integer inReportSerial, Integer imgOnlyFlag,PresLookupDtlEntity lookupDtl,PresLookupDtlEntity lookupDtlGroup) {
		super();
		this.preDiagnosisVal = preDiagnosisVal;
		this.findings = findings;
		this.findingsClob = findingsClob;
		this.isBold = isBold;
		this.inReportSerial = inReportSerial;
		this.imgOnlyFlag = imgOnlyFlag;
		this.lookupDtl= lookupDtlGroup;
		this.lookupDtl= lookupDtlGroup;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPreDiagnosisVal() {
		return preDiagnosisVal;
	}

	public void setPreDiagnosisVal(String preDiagnosisVal) {
		this.preDiagnosisVal = preDiagnosisVal;
	}

	public Integer getPreDiagnosisValType() {
		return preDiagnosisValType;
	}

	public void setPreDiagnosisValType(Integer preDiagnosisValType) {
		this.preDiagnosisValType = preDiagnosisValType;
	}

	public Long getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getDurationMu() {
		return durationMu;
	}

	public void setDurationMu(String durationMu) {
		this.durationMu = durationMu;
	}

	public Long getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(Long timeDuration) {
		this.timeDuration = timeDuration;
	}

	public String getTimeDurationMu() {
		return timeDurationMu;
	}

	public void setTimeDurationMu(String timeDurationMu) {
		this.timeDurationMu = timeDurationMu;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Integer getContinueFlag() {
		return continueFlag;
	}

	public void setContinueFlag(Integer continueFlag) {
		this.continueFlag = continueFlag;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getHeadNo() {
		return headNo;
	}

	public void setHeadNo(Long headNo) {
		this.headNo = headNo;
	}

	public String getFindingsClob() {
		return findingsClob;
	}

	public void setFindingsClob(String findingsClob) {
		this.findingsClob = findingsClob;
	}

	public Integer getIsPrintable() {
		return isPrintable;
	}

	public void setIsPrintable(Integer isPrintable) {
		this.isPrintable = isPrintable;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getIsBold() {
		return isBold;
	}

	public void setIsBold(Integer isBold) {
		this.isBold = isBold;
	}

	public Integer getInReportSerial() {
		return inReportSerial;
	}

	public void setInReportSerial(Integer inReportSerial) {
		this.inReportSerial = inReportSerial;
	}

	public PresLookupDtlEntity getLookupDtl() {
		return lookupDtl;
	}

	public void setLookupDtl(PresLookupDtlEntity lookupDtl) {
		this.lookupDtl = lookupDtl;
	}

	public PresLookupDtlEntity getLookupDtlGroup() {
		return lookupDtlGroup;
	}

	public void setLookupDtlGroup(PresLookupDtlEntity lookupDtlGroup) {
		this.lookupDtlGroup = lookupDtlGroup;
	}

	public Integer getImgOnlyFlag() {
		return imgOnlyFlag;
	}

	public void setImgOnlyFlag(Integer imgOnlyFlag) {
		this.imgOnlyFlag = imgOnlyFlag;
	}
	
	

}
