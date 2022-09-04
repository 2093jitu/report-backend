package com.springbootexp.dto;

import java.util.Date;

public class PrescriptionEntityMedicareNew {
	  private Long id;
	    private Long registrationNo;
	    private String hospitalId;
	    private Long consultationNo;
	    private String consultationId;
	    private Long doctorNo;
	    private Long appointmentNo;
	    private Long departmentNo;
	    private String departmentName;
	    private int isPatientIn;
	    private int isPatientOut;

	    private Integer activeStatus = 1;

	    private Integer ipdFlag;

	    private Long admissionNo;
	    private String admissionId;
	    private Long wardNo;

	    private String wardName;

	    private String bedId;

	    private String bedName;
	    private Integer continuePresFlag = 0;
	    private Long continuePresNo; 
	    private Integer refferedPresFlag = 0;
	    private Long refferedPresNo;

	   
	    private Long consultationTypeNo;

	 
	    private Long patientTypeNo;
	    private Long shiftNo;
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getRegistrationNo() {
			return registrationNo;
		}

		public void setRegistrationNo(Long registrationNo) {
			this.registrationNo = registrationNo;
		}

		public String getHospitalId() {
			return hospitalId;
		}

		public void setHospitalId(String hospitalId) {
			this.hospitalId = hospitalId;
		}

		public Long getConsultationNo() {
			return consultationNo;
		}

		public void setConsultationNo(Long consultationNo) {
			this.consultationNo = consultationNo;
		}

		public String getConsultationId() {
			return consultationId;
		}

		public void setConsultationId(String consultationId) {
			this.consultationId = consultationId;
		}

		public Long getDoctorNo() {
			return doctorNo;
		}

		public void setDoctorNo(Long doctorNo) {
			this.doctorNo = doctorNo;
		}

		public Long getAppointmentNo() {
			return appointmentNo;
		}

		public void setAppointmentNo(Long appointmentNo) {
			this.appointmentNo = appointmentNo;
		}

		public Long getDepartmentNo() {
			return departmentNo;
		}

		public void setDepartmentNo(Long departmentNo) {
			this.departmentNo = departmentNo;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public int getIsPatientIn() {
			return isPatientIn;
		}

		public void setIsPatientIn(int isPatientIn) {
			this.isPatientIn = isPatientIn;
		}

		public int getIsPatientOut() {
			return isPatientOut;
		}

		public void setIsPatientOut(int isPatientOut) {
			this.isPatientOut = isPatientOut;
		}

		public Integer getActiveStatus() {
			return activeStatus;
		}

		public void setActiveStatus(Integer activeStatus) {
			this.activeStatus = activeStatus;
		}

		public Integer getIpdFlag() {
			return ipdFlag;
		}

		public void setIpdFlag(Integer ipdFlag) {
			this.ipdFlag = ipdFlag;
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

		public Long getWardNo() {
			return wardNo;
		}

		public void setWardNo(Long wardNo) {
			this.wardNo = wardNo;
		}

		public String getWardName() {
			return wardName;
		}

		public void setWardName(String wardName) {
			this.wardName = wardName;
		}

		public String getBedId() {
			return bedId;
		}

		public void setBedId(String bedId) {
			this.bedId = bedId;
		}

		public String getBedName() {
			return bedName;
		}

		public void setBedName(String bedName) {
			this.bedName = bedName;
		}

		public Integer getContinuePresFlag() {
			return continuePresFlag;
		}

		public void setContinuePresFlag(Integer continuePresFlag) {
			this.continuePresFlag = continuePresFlag;
		}

		public Long getContinuePresNo() {
			return continuePresNo;
		}

		public void setContinuePresNo(Long continuePresNo) {
			this.continuePresNo = continuePresNo;
		}

		public Integer getRefferedPresFlag() {
			return refferedPresFlag;
		}

		public void setRefferedPresFlag(Integer refferedPresFlag) {
			this.refferedPresFlag = refferedPresFlag;
		}

		public Long getRefferedPresNo() {
			return refferedPresNo;
		}

		public void setRefferedPresNo(Long refferedPresNo) {
			this.refferedPresNo = refferedPresNo;
		}

		public Long getConsultationTypeNo() {
			return consultationTypeNo;
		}

		public void setConsultationTypeNo(Long consultationTypeNo) {
			this.consultationTypeNo = consultationTypeNo;
		}

		public Long getPatientTypeNo() {
			return patientTypeNo;
		}

		public void setPatientTypeNo(Long patientTypeNo) {
			this.patientTypeNo = patientTypeNo;
		}

		public Long getShiftNo() {
			return shiftNo;
		}

		public void setShiftNo(Long shiftNo) {
			this.shiftNo = shiftNo;
		}

		public Date getFromDate() {
			return fromDate;
		}

		public void setFromDate(Date fromDate) {
			this.fromDate = fromDate;
		}

		public Date getToDate() {
			return toDate;
		}

		public void setToDate(Date toDate) {
			this.toDate = toDate;
		}

		public Long getRefNo() {
			return refNo;
		}

		public void setRefNo(Long refNo) {
			this.refNo = refNo;
		}

		public String getDoctorName() {
			return doctorName;
		}

		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}

		public String getNurseName() {
			return nurseName;
		}

		public void setNurseName(String nurseName) {
			this.nurseName = nurseName;
		}

		private Date fromDate;        
	    private Date toDate;        
	    private Long refNo; 

	    private String doctorName;

	    private String nurseName;
	    
//	    private ViewDoctorEntity doctorInfo;
//	    private ViewCoreConsultationEntityMedicareNew consulatation;
//	    private List<ViewIpdPrescriptionEntityMedicareNew> continuePrescriptionList;
}
