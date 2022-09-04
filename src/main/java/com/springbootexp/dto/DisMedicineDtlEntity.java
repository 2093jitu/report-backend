package com.springbootexp.dto;

import java.util.Date;

public class DisMedicineDtlEntity {

	private Long id;

	private Long disMedNo;

	private String dosage;

	private String duration;

	private String durationMu;

	private String durationComment;

	private Long itemQty;

	private String medicineComment;

	private String eye;

	private String eyeDrop;

	private Long inReportSerial;

	private Long activeStatus = 1L;

	private Integer continueFlag = 0;
	
	private Integer isDeleted = 0;

	public Long getId() {
		return id;
	}

	public Long getDisMedNo() {
		return disMedNo;
	}

	public void setDisMedNo(Long disMedNo) {
		this.disMedNo = disMedNo;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDurationMu() {
		return durationMu;
	}

	public void setDurationMu(String durationMu) {
		this.durationMu = durationMu;
	}

	public String getDurationComment() {
		return durationComment;
	}

	public void setDurationComment(String durationComment) {
		this.durationComment = durationComment;
	}

	public Long getItemQty() {
		return itemQty;
	}

	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}

	public String getMedicineComment() {
		return medicineComment;
	}

	public void setMedicineComment(String medicineComment) {
		this.medicineComment = medicineComment;
	}

	public String getEye() {
		return eye;
	}

	public void setEye(String eye) {
		this.eye = eye;
	}

	public String getEyeDrop() {
		return eyeDrop;
	}

	public void setEyeDrop(String eyeDrop) {
		this.eyeDrop = eyeDrop;
	}

	public Long getInReportSerial() {
		return inReportSerial;
	}

	public void setInReportSerial(Long inReportSerial) {
		this.inReportSerial = inReportSerial;
	}

	public Long getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Long activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getContinueFlag() {
		return continueFlag;
	}

	public void setContinueFlag(Integer continueFlag) {
		this.continueFlag = continueFlag;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DisMedicineDtlEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DisMedicineDtlEntity(String dosage, String duration, String durationMu, String medicineComment,
			Long inReportSerial,Long itemQty) {
		super();
		this.dosage = dosage;
		this.duration = duration;
		this.durationMu = durationMu;
		this.medicineComment = medicineComment;
		this.inReportSerial = inReportSerial;
		this.itemQty = itemQty;
	}

	
}
