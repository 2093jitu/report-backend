package com.springbootexp.dto;

import java.util.Date;

public class AppAcknoledgementRptDto extends CommonDto {
	private Long slotNo;
	private Long doctorNo;
	private Date slotDate;
	private Long shiftdtlNo;
	private Long slotSl;
	private Date startTime;
	private Date endTime;
	private Long durationMin;
	private Long extraSlot;
	private Long slotSplited;
	private Long slotStatus;
	private Long slotStatusOrg;
	private Long appointNo;
	private String appointId;
	private Date appointDate;
	private Long consultationType;
	private Long regNo;
	private String hospitalNumber;
	private String salutation;
	private String patientName;
	private String patname;
	private String phoneMobile;
	private String email;
	private Date dob;
	private Long ageDd;
	private Long ageMm;
	private Long ageYy;
	private String gender;
	private String maritalStatus;
	private String address;
	private String bloodGroup;
	private String appointType;
	private Long appointStatus;
	private String cancelReason;
	private String chifComplain;
	private Long consultIn;
	private Long consultOut;
	private Date consultInTime;
	private Date consultOutTime;
	private Long noPrint;
	private Long appFromFlag;
	private Long patTypeNo;
	private Long buNo;
	private Long ssCreator;
	private String bookedBy;
	private Long consultationNo;

	private String consultationId;
	private Integer cancelFlag;

	private String modifyByName;
	

	private String buName;

	private String doctorName;
	private Date bokingDate;

	private Date appEndTime;

	private Date appStartTime;
	
	private Date appTimeBefore20Min;
	
	

	public AppAcknoledgementRptDto() {
		super();
	}

	public AppAcknoledgementRptDto(String appointId, String hospitalNumber, String patname, Long ageYy,
			String address, String bookedBy, String buName, String doctorName, Date appStartTime,Date bokingDate) {
		super();
		this.appointId = appointId;
		this.hospitalNumber = hospitalNumber;
		this.patname = patname;
		this.ageYy = ageYy;
		this.address = address;
		this.bookedBy = bookedBy;
		this.buName = buName;
		this.doctorName = doctorName;
		this.appStartTime = appStartTime;
		this.bokingDate = bokingDate;
	}

	public Long getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(Long slotNo) {
		this.slotNo = slotNo;
	}

	public Long getDoctorNo() {
		return doctorNo;
	}

	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}

	public Date getSlotDate() {
		return slotDate;
	}

	public void setSlotDate(Date slotDate) {
		this.slotDate = slotDate;
	}

	public Long getShiftdtlNo() {
		return shiftdtlNo;
	}

	public void setShiftdtlNo(Long shiftdtlNo) {
		this.shiftdtlNo = shiftdtlNo;
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

	public Long getDurationMin() {
		return durationMin;
	}

	public void setDurationMin(Long durationMin) {
		this.durationMin = durationMin;
	}

	public Long getExtraSlot() {
		return extraSlot;
	}

	public void setExtraSlot(Long extraSlot) {
		this.extraSlot = extraSlot;
	}

	public Long getSlotSplited() {
		return slotSplited;
	}

	public void setSlotSplited(Long slotSplited) {
		this.slotSplited = slotSplited;
	}

	public Long getSlotStatus() {
		return slotStatus;
	}

	public void setSlotStatus(Long slotStatus) {
		this.slotStatus = slotStatus;
	}

	public Long getSlotStatusOrg() {
		return slotStatusOrg;
	}

	public void setSlotStatusOrg(Long slotStatusOrg) {
		this.slotStatusOrg = slotStatusOrg;
	}

	public Long getAppointNo() {
		return appointNo;
	}

	public void setAppointNo(Long appointNo) {
		this.appointNo = appointNo;
	}

	public String getAppointId() {
		return appointId;
	}

	public void setAppointId(String appointId) {
		this.appointId = appointId;
	}

	public Date getAppointDate() {
		return appointDate;
	}

	public void setAppointDate(Date appointDate) {
		this.appointDate = appointDate;
	}

	public Long getConsultationType() {
		return consultationType;
	}

	public void setConsultationType(Long consultationType) {
		this.consultationType = consultationType;
	}

	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getHospitalNumber() {
		return hospitalNumber;
	}

	public void setHospitalNumber(String hospitalNumber) {
		this.hospitalNumber = hospitalNumber;
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

	public String getPatname() {
		return patname;
	}

	public void setPatname(String patname) {
		this.patname = patname;
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

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getChifComplain() {
		return chifComplain;
	}

	public void setChifComplain(String chifComplain) {
		this.chifComplain = chifComplain;
	}

	public Long getConsultIn() {
		return consultIn;
	}

	public void setConsultIn(Long consultIn) {
		this.consultIn = consultIn;
	}

	public Long getConsultOut() {
		return consultOut;
	}

	public void setConsultOut(Long consultOut) {
		this.consultOut = consultOut;
	}

	public Date getConsultInTime() {
		return consultInTime;
	}

	public void setConsultInTime(Date consultInTime) {
		this.consultInTime = consultInTime;
	}

	public Date getConsultOutTime() {
		return consultOutTime;
	}

	public void setConsultOutTime(Date consultOutTime) {
		this.consultOutTime = consultOutTime;
	}

	public Long getNoPrint() {
		return noPrint;
	}

	public void setNoPrint(Long noPrint) {
		this.noPrint = noPrint;
	}

	public Long getAppFromFlag() {
		return appFromFlag;
	}

	public void setAppFromFlag(Long appFromFlag) {
		this.appFromFlag = appFromFlag;
	}

	public Long getPatTypeNo() {
		return patTypeNo;
	}

	public void setPatTypeNo(Long patTypeNo) {
		this.patTypeNo = patTypeNo;
	}

	public Long getBuNo() {
		return buNo;
	}

	public void setBuNo(Long buNo) {
		this.buNo = buNo;
	}

	public Long getSsCreator() {
		return ssCreator;
	}

	public void setSsCreator(Long ssCreator) {
		this.ssCreator = ssCreator;
	}

	public String getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
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

	public Integer getCancelFlag() {
		return cancelFlag;
	}

	public void setCancelFlag(Integer cancelFlag) {
		this.cancelFlag = cancelFlag;
	}

	public String getModifyByName() {
		return modifyByName;
	}

	public void setModifyByName(String modifyByName) {
		this.modifyByName = modifyByName;
	}

	public String getBuName() {
		return buName;
	}

	public void setBuName(String buName) {
		this.buName = buName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getBokingDate() {
		return bokingDate;
	}

	public void setBokingDate(Date bokingDate) {
		this.bokingDate = bokingDate;
	}

	public Date getAppEndTime() {
		return appEndTime;
	}

	public void setAppEndTime(Date appEndTime) {
		this.appEndTime = appEndTime;
	}

	public Date getAppStartTime() {
		return appStartTime;
	}

	public void setAppStartTime(Date appStartTime) {
		this.appStartTime = appStartTime;
	}

	public Date getAppTimeBefore20Min() {
		return appTimeBefore20Min;
	}

	public void setAppTimeBefore20Min(Date appTimeBefore20Min) {
		this.appTimeBefore20Min = appTimeBefore20Min;
	}
	
	
}
