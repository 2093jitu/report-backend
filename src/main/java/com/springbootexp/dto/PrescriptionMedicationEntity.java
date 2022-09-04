package com.springbootexp.dto;

import java.util.List;

public class PrescriptionMedicationEntity {
	 private static final long serialVersionUID = 3158191695575270092L;

	 
		private Long id; 
		private Long itemNo; 
		private String genericName; 
		private String brandName; 
		private String formName; 
		private String strength; 
		private String route;  
		private Integer isBold = 0; 
		private Long inReportSerial = 0L; 
		private Integer isDeleted = 0; 
		private Integer activeStatus = 1; 
		private Long genericNo;
		

		private Long referenceId;
		



//		private Long genericNo;

		
		private PrescriptionEntityMedicareNew prescription;
		private List<PrescriptionMedicationDtlEntity> presMedDtlList;
		List<PrescriptionEntityMedicareNew> prescriptionList;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getItemNo() {
			return itemNo;
		}
		public void setItemNo(Long itemNo) {
			this.itemNo = itemNo;
		}
		public String getGenericName() {
			return genericName;
		}
		public void setGenericName(String genericName) {
			this.genericName = genericName;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getFormName() {
			return formName;
		}
		public void setFormName(String formName) {
			this.formName = formName;
		}
		public String getStrength() {
			return strength;
		}
		public void setStrength(String strength) {
			this.strength = strength;
		}
		public String getRoute() {
			return route;
		}
		public void setRoute(String route) {
			this.route = route;
		}
		public Integer getIsBold() {
			return isBold;
		}
		public void setIsBold(Integer isBold) {
			this.isBold = isBold;
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
		public Integer getActiveStatus() {
			return activeStatus;
		}
		public void setActiveStatus(Integer activeStatus) {
			this.activeStatus = activeStatus;
		}
		public Long getGenericNo() {
			return genericNo;
		}
		public void setGenericNo(Long genericNo) {
			this.genericNo = genericNo;
		}
		public Long getReferenceId() {
			return referenceId;
		}
		public void setReferenceId(Long referenceId) {
			this.referenceId = referenceId;
		}
		public PrescriptionEntityMedicareNew getPrescription() {
			return prescription;
		}
		public void setPrescription(PrescriptionEntityMedicareNew prescription) {
			this.prescription = prescription;
		}
		public List<PrescriptionMedicationDtlEntity> getPresMedDtlList() {
			return presMedDtlList;
		}
		public void setPresMedDtlList(List<PrescriptionMedicationDtlEntity> presMedDtlList) {
			this.presMedDtlList = presMedDtlList;
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
