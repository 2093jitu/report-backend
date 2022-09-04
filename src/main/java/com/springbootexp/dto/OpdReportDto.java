package com.springbootexp.dto;

import java.util.Date;

public class OpdReportDto extends CommonDto{
	
	private Long doctorNo;
    private Date appointDate;
    private Long shiftdtlNo;
    private Long regNo;
    private Long patientType;
    private String salutation;
    private String patientName;
    private String phoneMobile;
    private String email;
    private Date dob;
    private Long ageDd;
    private Long ageMm;
    private Long ageYy;
    private String gender;
    private String mStatus;
    private String bloodGroup;
    private String address;
    private Long consultationType;
    private String consultationTypeName;
    private String appointType;
    private Long appointStatus;
    private Long appFromFlag;
    private String chifComplain;
    private Long slotNo;
    private Long slotSl;
    private Date startTime;
    private Date endTime;
	private String remsrks;
	private Boolean isBlock;
	
	private String appointmentId;
	private String age;
	private String shift;
	private String doctorName;
	private String userName;
	private String hospitalNo;
	private String degree;
	private Long newPatient;
	private Long repotingPatient;
	private Long firstFollUpPatient;
	private Long totalPatient;
	private String departmentName;
	private String status;
	
	private Date cancelTime;
	private String cancelBy;
	private String cancelReason;
	
	
	
	public OpdReportDto(Long doctorNo, Date appointDate, String patientName, String phoneMobile, String gender,
			Date startTime, String appointmentId, String age, String shift, String doctorName, String userName,
			String hospitalNo) {
		super();
		this.doctorNo = doctorNo;
		this.appointDate = appointDate;
		this.patientName = patientName;
		this.phoneMobile = phoneMobile;
		this.gender = gender;
		this.startTime = startTime;
		this.appointmentId = appointmentId;
		this.age = age;
		this.shift = shift;
		this.doctorName = doctorName;
		this.userName = userName;
		this.hospitalNo = hospitalNo;
	}
	
	
	
	public OpdReportDto(String doctorName, String degree, Long newPatient, Long repotingPatient,
			Long firstFollUpPatient, Long totalPatient, String departmentName) {
		super();
		this.doctorName = doctorName;
		this.degree = degree;
		this.newPatient = newPatient;
		this.repotingPatient = repotingPatient;
		this.firstFollUpPatient = firstFollUpPatient;
		this.totalPatient = totalPatient;
		this.departmentName = departmentName;
	}



	public OpdReportDto() {
		super();
	}



	public Long getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}
	public Date getAppointDate() {
		return appointDate;
	}
	public void setAppointDate(Date appointDate) {
		this.appointDate = appointDate;
	}
	public Long getShiftdtlNo() {
		return shiftdtlNo;
	}
	public void setShiftdtlNo(Long shiftdtlNo) {
		this.shiftdtlNo = shiftdtlNo;
	}
	public Long getRegNo() {
		return regNo;
	}
	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}
	public Long getPatientType() {
		return patientType;
	}
	public void setPatientType(Long patientType) {
		this.patientType = patientType;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPhoneMobile() {
		return phoneMobile;
	}
	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getAgeDd() {
		return ageDd;
	}
	public void setAgeDd(Long ageDd) {
		this.ageDd = ageDd;
	}
	public Long getAgeMm() {
		return ageMm;
	}
	public void setAgeMm(Long ageMm) {
		this.ageMm = ageMm;
	}
	public Long getAgeYy() {
		return ageYy;
	}
	public void setAgeYy(Long ageYy) {
		this.ageYy = ageYy;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getmStatus() {
		return mStatus;
	}
	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getConsultationType() {
		return consultationType;
	}
	public void setConsultationType(Long consultationType) {
		this.consultationType = consultationType;
	}
	public String getConsultationTypeName() {
		return consultationTypeName;
	}
	public void setConsultationTypeName(String consultationTypeName) {
		this.consultationTypeName = consultationTypeName;
	}
	public String getAppointType() {
		return appointType;
	}
	public void setAppointType(String appointType) {
		this.appointType = appointType;
	}
	public Long getAppointStatus() {
		return appointStatus;
	}
	public void setAppointStatus(Long appointStatus) {
		this.appointStatus = appointStatus;
	}
	public Long getAppFromFlag() {
		return appFromFlag;
	}
	public void setAppFromFlag(Long appFromFlag) {
		this.appFromFlag = appFromFlag;
	}
	public String getChifComplain() {
		return chifComplain;
	}
	public void setChifComplain(String chifComplain) {
		this.chifComplain = chifComplain;
	}
	public Long getSlotNo() {
		return slotNo;
	}
	public void setSlotNo(Long slotNo) {
		this.slotNo = slotNo;
	}
	public Long getSlotSl() {
		return slotSl;
	}
	public void setSlotSl(Long slotSl) {
		this.slotSl = slotSl;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getRemsrks() {
		return remsrks;
	}
	public void setRemsrks(String remsrks) {
		this.remsrks = remsrks;
	}
	public Boolean getIsBlock() {
		return isBlock;
	}
	public void setIsBlock(Boolean isBlock) {
		this.isBlock = isBlock;
	}
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHospitalNo() {
		return hospitalNo;
	}
	public void setHospitalNo(String hospitalNo) {
		this.hospitalNo = hospitalNo;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Long getNewPatient() {
		return newPatient;
	}
	public void setNewPatient(Long newPatient) {
		this.newPatient = newPatient;
	}
	public Long getRepotingPatient() {
		return repotingPatient;
	}
	public void setRepotingPatient(Long repotingPatient) {
		this.repotingPatient = repotingPatient;
	}
	public Long getFirstFollUpPatient() {
		return firstFollUpPatient;
	}
	public void setFirstFollUpPatient(Long firstFollUpPatient) {
		this.firstFollUpPatient = firstFollUpPatient;
	}
	public Long getTotalPatient() {
		return totalPatient;
	}
	public void setTotalPatient(Long totalPatient) {
		this.totalPatient = totalPatient;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCancelTime() {
		return cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}
	public String getCancelBy() {
		return cancelBy;
	}
	public void setCancelBy(String cancelBy) {
		this.cancelBy = cancelBy;
	}
	public String getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	
	
}
