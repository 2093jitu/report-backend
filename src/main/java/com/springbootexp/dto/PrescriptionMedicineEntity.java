package com.springbootexp.dto;

public class PrescriptionMedicineEntity {
	private Long id;

    private String itemNo;

    private Integer itemQty;

    private String brandName;

    private String brandNameUd;

    private String form;

    private String strength;

    private String dosage;

    private String duration;

    private String durationMu;

    private String durationComment;

    private String relationWithMeal;

    private String route;

    private String medicineComment;

    private Integer prescritionDataType = 4;

    private Long referenceId;
    
    private String genericName;

    private String medicineStat;

    private Long continueFlag;
    
    private Long mixMedicineFlag;

    private String mixMedicineGroup;

    
    private Integer isDeleted;
 
    private Integer isBold = 0;
 
    private Integer inReportSerial = 0;    

    private Integer activeStatus = 1;
    private PrescriptionEntityMedicareNew prescription;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getItemQty() {
		return itemQty;
	}
	public void setItemQty(Integer itemQty) {
		this.itemQty = itemQty;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandNameUd() {
		return brandNameUd;
	}
	public void setBrandNameUd(String brandNameUd) {
		this.brandNameUd = brandNameUd;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
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
	public String getRelationWithMeal() {
		return relationWithMeal;
	}
	public void setRelationWithMeal(String relationWithMeal) {
		this.relationWithMeal = relationWithMeal;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getMedicineComment() {
		return medicineComment;
	}
	public void setMedicineComment(String medicineComment) {
		this.medicineComment = medicineComment;
	}
	public Integer getPrescritionDataType() {
		return prescritionDataType;
	}
	public void setPrescritionDataType(Integer prescritionDataType) {
		this.prescritionDataType = prescritionDataType;
	}
	public Long getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public String getMedicineStat() {
		return medicineStat;
	}
	public void setMedicineStat(String medicineStat) {
		this.medicineStat = medicineStat;
	}
	public Long getContinueFlag() {
		return continueFlag;
	}
	public void setContinueFlag(Long continueFlag) {
		this.continueFlag = continueFlag;
	}
	public Long getMixMedicineFlag() {
		return mixMedicineFlag;
	}
	public void setMixMedicineFlag(Long mixMedicineFlag) {
		this.mixMedicineFlag = mixMedicineFlag;
	}
	public String getMixMedicineGroup() {
		return mixMedicineGroup;
	}
	public void setMixMedicineGroup(String mixMedicineGroup) {
		this.mixMedicineGroup = mixMedicineGroup;
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
}
