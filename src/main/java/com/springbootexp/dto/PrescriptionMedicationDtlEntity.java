package com.springbootexp.dto;

public class PrescriptionMedicationDtlEntity {
	  private static final long serialVersionUID = 1L;

		private Long id;
		private String dosage;
		private String duration;
		private String durationMu;
		private String durationComment;
		private String medicineComment;
		private Long itemQty;
		private String eye;
		private String eyeDrop;
		private Integer continueFlag = 0;
		private String relationWithMeal;	
		private Long inReportSerial = 0L;
		private Integer isDeleted = 0;
		private Integer isBold;

		private PrescriptionMedicationEntity presMedicine;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getMedicineComment() {
			return medicineComment;
		}

		public void setMedicineComment(String medicineComment) {
			this.medicineComment = medicineComment;
		}

		public Long getItemQty() {
			return itemQty;
		}

		public void setItemQty(Long itemQty) {
			this.itemQty = itemQty;
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

		public Integer getContinueFlag() {
			return continueFlag;
		}

		public void setContinueFlag(Integer continueFlag) {
			this.continueFlag = continueFlag;
		}

		public String getRelationWithMeal() {
			return relationWithMeal;
		}

		public void setRelationWithMeal(String relationWithMeal) {
			this.relationWithMeal = relationWithMeal;
		}

		public Long getInReportSerial() {
			return inReportSerial;
		}

		public void setInReportSerial(Long inReportSerial) {
			this.inReportSerial = inReportSerial;
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

		public PrescriptionMedicationEntity getPresMedicine() {
			return presMedicine;
		}

		public void setPresMedicine(PrescriptionMedicationEntity presMedicine) {
			this.presMedicine = presMedicine;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
}
