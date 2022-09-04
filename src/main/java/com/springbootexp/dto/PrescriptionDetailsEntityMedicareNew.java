package com.springbootexp.dto;

import java.util.Date;
import java.util.List;

public class PrescriptionDetailsEntityMedicareNew {
	private static final long serialVersionUID = 1L;


	private Long id;
    
	private String preDiagnosisVal;

   	private Integer preDiagnosisValType; // 1 for Investigation


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


   	private Integer imgOnlyFlag = 0; // if 1 only show image if 0 image and data both are show


   	private Long itemRate;


   	private Integer dynamicRateFlag = 0;

	
	private Integer isPrintable;
	private Integer isDeleted;
	private Integer isBold = 0; // 1 for bold 2 for Italic

  
	private Integer inReportSerial = 0;


   	private Integer activeStatus = 1;
	private PrescriptionEntityMedicareNew prescription;


	List<Integer> preDiagnosisValTypes;

	List<PrescriptionEntityMedicareNew> prescriptionList;
	
	

	public PrescriptionDetailsEntityMedicareNew() {
		super();
	}

	public PrescriptionDetailsEntityMedicareNew(String preDiagnosisVal, Integer imgOnlyFlag, Integer isBold,
			Integer inReportSerial,String findingsClob,String findings) {
		super();
		this.preDiagnosisVal = preDiagnosisVal;
		this.imgOnlyFlag = imgOnlyFlag;
		this.isBold = isBold;
		this.inReportSerial = inReportSerial;
		this.findingsClob = findingsClob;
		this.findings = findings;
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

	public Integer getImgOnlyFlag() {
		return imgOnlyFlag;
	}

	public void setImgOnlyFlag(Integer imgOnlyFlag) {
		this.imgOnlyFlag = imgOnlyFlag;
	}

	public Long getItemRate() {
		return itemRate;
	}

	public void setItemRate(Long itemRate) {
		this.itemRate = itemRate;
	}

	public Integer getDynamicRateFlag() {
		return dynamicRateFlag;
	}

	public void setDynamicRateFlag(Integer dynamicRateFlag) {
		this.dynamicRateFlag = dynamicRateFlag;
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

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}

	public PrescriptionEntityMedicareNew getPrescription() {
		return prescription;
	}

	public void setPrescription(PrescriptionEntityMedicareNew prescription) {
		this.prescription = prescription;
	}

	public List<Integer> getPreDiagnosisValTypes() {
		return preDiagnosisValTypes;
	}

	public void setPreDiagnosisValTypes(List<Integer> preDiagnosisValTypes) {
		this.preDiagnosisValTypes = preDiagnosisValTypes;
	}

	public List<PrescriptionEntityMedicareNew> getPrescriptionList() {
		return prescriptionList;
	}

	public void setPrescriptionList(List<PrescriptionEntityMedicareNew> prescriptionList) {
		this.prescriptionList = prescriptionList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
