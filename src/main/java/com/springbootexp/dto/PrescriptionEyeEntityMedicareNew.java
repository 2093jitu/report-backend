package com.springbootexp.dto;

public class PrescriptionEyeEntityMedicareNew {
	 private Long id;
	    private String SphRight;
	    private String cylRight;
	    private String axisRight;
	    private String vaRight;
	    private String SphLeft;
	    private String cylLeft;
	    private String axisLeft;
	    private String vaLeft;
	    private Integer isPrintable;
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
		public String getSphRight() {
			return SphRight;
		}
		public void setSphRight(String sphRight) {
			SphRight = sphRight;
		}
		public String getCylRight() {
			return cylRight;
		}
		public void setCylRight(String cylRight) {
			this.cylRight = cylRight;
		}
		public String getAxisRight() {
			return axisRight;
		}
		public void setAxisRight(String axisRight) {
			this.axisRight = axisRight;
		}
		public String getVaRight() {
			return vaRight;
		}
		public void setVaRight(String vaRight) {
			this.vaRight = vaRight;
		}
		public String getSphLeft() {
			return SphLeft;
		}
		public void setSphLeft(String sphLeft) {
			SphLeft = sphLeft;
		}
		public String getCylLeft() {
			return cylLeft;
		}
		public void setCylLeft(String cylLeft) {
			this.cylLeft = cylLeft;
		}
		public String getAxisLeft() {
			return axisLeft;
		}
		public void setAxisLeft(String axisLeft) {
			this.axisLeft = axisLeft;
		}
		public String getVaLeft() {
			return vaLeft;
		}
		public void setVaLeft(String vaLeft) {
			this.vaLeft = vaLeft;
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
	    
	    
}
