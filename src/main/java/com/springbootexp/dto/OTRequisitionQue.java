package com.springbootexp.dto;

import java.util.Date;
import java.util.List;

public class OTRequisitionQue extends CommonDto{
	
	
	private Long id;
	private Long otReqNo;
	private Long otReqdtlNo;
	private Long regNo;
	private String hospitalNumber;
	private Long consultationNo;
	private Long admissionNo;
	private String admissionId;
	private Date admissionDate;
	private String patientName;
	private String gender;
	private String age;
	private String phoneMobile;
	private Long itemNo;
	private String itemName;
	private Long ipdWardNo;
	private String wardName;
	private String departmentName;
	private Date reqDate;
	private Date ssCreatedOn;
	private Date ssModifiedOn;

	// =========== new Flag ============
	private Integer requisitionFlag;
	private Integer anestCheckupFlag;
	private String anestCheckupBy;
	private Date anestCheckupOn;
	private Integer confirmationFlag;
	private String confirmationBy;
	private Date confirmationOn;
	private Integer receptionFlag;
	private String recepConfirmedBy;
	private Date recepConfirmedOn;
	private String recepRejectedBy;
	private Date recepRejectedOn;
	private Integer otInoutFlag;
	private String otInBy;
	private Date otInOn;
	private String otOutBy;
	private Date otOutOn;
	private Long surgeonNo;
	private String surgeonName;
	

	private Integer consentType; //1 = GENERAL, 2 = MODERATE, 3 = HIGHRISK;

	private Integer preOrderNote;

	private Integer postOrderNote;

	private Integer postAnesthNote;

	private Integer postNursingNote;

	private Integer postOtNote;

	private Integer specialRemarks;

	private String asagType;
	

	private Long roomNo;
	private String roomName;

	private Date bookingDate;

	private Integer anestCheckupGraterThan;
	private Integer otInoutNotEqual;

	
	
	public OTRequisitionQue() {
		super();
	}

	public OTRequisitionQue(String hospitalNumber, String admissionId, String patientName, String gender, String age,
			String itemName) {
		super();
		this.hospitalNumber = hospitalNumber;
		this.admissionId = admissionId;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.itemName = itemName;
	}

	List<Long> wordNoList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOtReqNo() {
		return otReqNo;
	}

	public void setOtReqNo(Long otReqNo) {
		this.otReqNo = otReqNo;
	}

	public Long getOtReqdtlNo() {
		return otReqdtlNo;
	}

	public void setOtReqdtlNo(Long otReqdtlNo) {
		this.otReqdtlNo = otReqdtlNo;
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

	public Long getConsultationNo() {
		return consultationNo;
	}

	public void setConsultationNo(Long consultationNo) {
		this.consultationNo = consultationNo;
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

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public Long getItemNo() {
		return itemNo;
	}

	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getIpdWardNo() {
		return ipdWardNo;
	}

	public void setIpdWardNo(Long ipdWardNo) {
		this.ipdWardNo = ipdWardNo;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getReqDate() {
		return reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	public Date getSsCreatedOn() {
		return ssCreatedOn;
	}

	public void setSsCreatedOn(Date ssCreatedOn) {
		this.ssCreatedOn = ssCreatedOn;
	}

	public Date getSsModifiedOn() {
		return ssModifiedOn;
	}

	public void setSsModifiedOn(Date ssModifiedOn) {
		this.ssModifiedOn = ssModifiedOn;
	}

	public Integer getRequisitionFlag() {
		return requisitionFlag;
	}

	public void setRequisitionFlag(Integer requisitionFlag) {
		this.requisitionFlag = requisitionFlag;
	}

	public Integer getAnestCheckupFlag() {
		return anestCheckupFlag;
	}

	public void setAnestCheckupFlag(Integer anestCheckupFlag) {
		this.anestCheckupFlag = anestCheckupFlag;
	}

	public String getAnestCheckupBy() {
		return anestCheckupBy;
	}

	public void setAnestCheckupBy(String anestCheckupBy) {
		this.anestCheckupBy = anestCheckupBy;
	}

	public Date getAnestCheckupOn() {
		return anestCheckupOn;
	}

	public void setAnestCheckupOn(Date anestCheckupOn) {
		this.anestCheckupOn = anestCheckupOn;
	}

	public Integer getConfirmationFlag() {
		return confirmationFlag;
	}

	public void setConfirmationFlag(Integer confirmationFlag) {
		this.confirmationFlag = confirmationFlag;
	}

	public String getConfirmationBy() {
		return confirmationBy;
	}

	public void setConfirmationBy(String confirmationBy) {
		this.confirmationBy = confirmationBy;
	}

	public Date getConfirmationOn() {
		return confirmationOn;
	}

	public void setConfirmationOn(Date confirmationOn) {
		this.confirmationOn = confirmationOn;
	}

	public Integer getReceptionFlag() {
		return receptionFlag;
	}

	public void setReceptionFlag(Integer receptionFlag) {
		this.receptionFlag = receptionFlag;
	}

	public String getRecepConfirmedBy() {
		return recepConfirmedBy;
	}

	public void setRecepConfirmedBy(String recepConfirmedBy) {
		this.recepConfirmedBy = recepConfirmedBy;
	}

	public Date getRecepConfirmedOn() {
		return recepConfirmedOn;
	}

	public void setRecepConfirmedOn(Date recepConfirmedOn) {
		this.recepConfirmedOn = recepConfirmedOn;
	}

	public String getRecepRejectedBy() {
		return recepRejectedBy;
	}

	public void setRecepRejectedBy(String recepRejectedBy) {
		this.recepRejectedBy = recepRejectedBy;
	}

	public Date getRecepRejectedOn() {
		return recepRejectedOn;
	}

	public void setRecepRejectedOn(Date recepRejectedOn) {
		this.recepRejectedOn = recepRejectedOn;
	}

	public Integer getOtInoutFlag() {
		return otInoutFlag;
	}

	public void setOtInoutFlag(Integer otInoutFlag) {
		this.otInoutFlag = otInoutFlag;
	}

	public String getOtInBy() {
		return otInBy;
	}

	public void setOtInBy(String otInBy) {
		this.otInBy = otInBy;
	}

	public Date getOtInOn() {
		return otInOn;
	}

	public void setOtInOn(Date otInOn) {
		this.otInOn = otInOn;
	}

	public String getOtOutBy() {
		return otOutBy;
	}

	public void setOtOutBy(String otOutBy) {
		this.otOutBy = otOutBy;
	}

	public Date getOtOutOn() {
		return otOutOn;
	}

	public void setOtOutOn(Date otOutOn) {
		this.otOutOn = otOutOn;
	}

	public Long getSurgeonNo() {
		return surgeonNo;
	}

	public void setSurgeonNo(Long surgeonNo) {
		this.surgeonNo = surgeonNo;
	}

	public String getSurgeonName() {
		return surgeonName;
	}

	public void setSurgeonName(String surgeonName) {
		this.surgeonName = surgeonName;
	}

	public Integer getConsentType() {
		return consentType;
	}

	public void setConsentType(Integer consentType) {
		this.consentType = consentType;
	}

	public Integer getPreOrderNote() {
		return preOrderNote;
	}

	public void setPreOrderNote(Integer preOrderNote) {
		this.preOrderNote = preOrderNote;
	}

	public Integer getPostOrderNote() {
		return postOrderNote;
	}

	public void setPostOrderNote(Integer postOrderNote) {
		this.postOrderNote = postOrderNote;
	}

	public Integer getPostAnesthNote() {
		return postAnesthNote;
	}

	public void setPostAnesthNote(Integer postAnesthNote) {
		this.postAnesthNote = postAnesthNote;
	}

	public Integer getPostNursingNote() {
		return postNursingNote;
	}

	public void setPostNursingNote(Integer postNursingNote) {
		this.postNursingNote = postNursingNote;
	}

	public Integer getPostOtNote() {
		return postOtNote;
	}

	public void setPostOtNote(Integer postOtNote) {
		this.postOtNote = postOtNote;
	}

	public Integer getSpecialRemarks() {
		return specialRemarks;
	}

	public void setSpecialRemarks(Integer specialRemarks) {
		this.specialRemarks = specialRemarks;
	}

	public String getAsagType() {
		return asagType;
	}

	public void setAsagType(String asagType) {
		this.asagType = asagType;
	}

	public Long getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(Long roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Integer getAnestCheckupGraterThan() {
		return anestCheckupGraterThan;
	}

	public void setAnestCheckupGraterThan(Integer anestCheckupGraterThan) {
		this.anestCheckupGraterThan = anestCheckupGraterThan;
	}

	public Integer getOtInoutNotEqual() {
		return otInoutNotEqual;
	}

	public void setOtInoutNotEqual(Integer otInoutNotEqual) {
		this.otInoutNotEqual = otInoutNotEqual;
	}

	public List<Long> getWordNoList() {
		return wordNoList;
	}

	public void setWordNoList(List<Long> wordNoList) {
		this.wordNoList = wordNoList;
	}

	public Date getFromOTDate() {
		return fromOTDate;
	}

	public void setFromOTDate(Date fromOTDate) {
		this.fromOTDate = fromOTDate;
	}

	public Date getToOTDate() {
		return toOTDate;
	}

	public void setToOTDate(Date toOTDate) {
		this.toOTDate = toOTDate;
	}

	public Date getFromReqDate() {
		return fromReqDate;
	}

	public void setFromReqDate(Date fromReqDate) {
		this.fromReqDate = fromReqDate;
	}

	public Date getToReqDate() {
		return toReqDate;
	}

	public void setToReqDate(Date toReqDate) {
		this.toReqDate = toReqDate;
	}

	private Date fromOTDate;

	private Date toOTDate;

	private Date fromReqDate;

	private Date toReqDate;
}
