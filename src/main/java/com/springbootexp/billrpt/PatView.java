package com.springbootexp.billrpt;

import java.util.Date;

public class PatView {
	private Long id;

    private String admissionId;

    private Date admissionDate;

    private Date admissionDateTime;

    private Long regNo;
    
    private String hospitalId;

    private String patientName;

    private String age;

    private String gender;

    private Long rankNo;

    private String rankName;

    private Long unitNo;

    private String unitName;
    
    private String patientAddress;

    private String personalNo;

    private String phoneMobile;

    private Long refDoctorNo;

    private Long primaryDocNo;

    private String primaryDoctorName;

    private String doctorRank;

    private Long dutyDoctoeNo;

    private Long initialBedNo;

    private Long currentBedNo;

    private Integer patientStatus;

    private Long buNo;

    private String buName;

    private String admRemarks;

    private Integer diseqFlag;

    private Long disReqBy;

    private Date disReqTime;

    private Integer disFlag;

    private Long disBy;

    private Date disDate;

    private Date disDateTime;

    private Integer dueDisFlag;

    private Long refAdmissionNo;

    private Long motherAdmissionNo;

    private Long corClientNo;

    private String corclientEmpId;

    private Long empNo;

    private String relation;

    private Long ssCreator;

    private Date ssCreatedOn;

    private Long ssCreatedSession;

    private Long ssModifier;

    private Date ssModifiedON;

    private Long ssModifiedSesson;

    private Long companyNo;

    private Date ssUploadedOn;

    private Integer clearenceFlag;

    private Date clearenceDateTime;

    private Date joiningDate;

    private Long cardNo;
	private String relationServiceHolder;

	private String shRelation;
	private String serviceHolderName;

	private Long regType;
	private String regTypeName;

    private String milMedForm;

    private String patientValuables;

    private String wardName;
    
    private Long wardNo;

    private String causeOfAdmission;

    private String contactPerson; // nokName

    private String contactPersonAddress;

    private String contactPersonMobile;
    
    private String admCategory;
    
    private String rbNo;
    
    private String manualCategory;
    
    private Long slNo;
    
    private Long slYy;
    
    private String refExternalHospital;
    
    private Long refRequestNo;

    private Long ageYy;

    private Long attendantNo;

    private Integer attActiveStatus;
    
    private Date fromDate;

    private Date toDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getAdmissionDateTime() {
		return admissionDateTime;
	}

	public void setAdmissionDateTime(Date admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}

	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getRankNo() {
		return rankNo;
	}

	public void setRankNo(Long rankNo) {
		this.rankNo = rankNo;
	}

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public Long getUnitNo() {
		return unitNo;
	}

	public void setUnitNo(Long unitNo) {
		this.unitNo = unitNo;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPersonalNo() {
		return personalNo;
	}

	public void setPersonalNo(String personalNo) {
		this.personalNo = personalNo;
	}

	public String getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public Long getRefDoctorNo() {
		return refDoctorNo;
	}

	public void setRefDoctorNo(Long refDoctorNo) {
		this.refDoctorNo = refDoctorNo;
	}

	public Long getPrimaryDocNo() {
		return primaryDocNo;
	}

	public void setPrimaryDocNo(Long primaryDocNo) {
		this.primaryDocNo = primaryDocNo;
	}

	public String getPrimaryDoctorName() {
		return primaryDoctorName;
	}

	public void setPrimaryDoctorName(String primaryDoctorName) {
		this.primaryDoctorName = primaryDoctorName;
	}

	public String getDoctorRank() {
		return doctorRank;
	}

	public void setDoctorRank(String doctorRank) {
		this.doctorRank = doctorRank;
	}

	public Long getDutyDoctoeNo() {
		return dutyDoctoeNo;
	}

	public void setDutyDoctoeNo(Long dutyDoctoeNo) {
		this.dutyDoctoeNo = dutyDoctoeNo;
	}

	public Long getInitialBedNo() {
		return initialBedNo;
	}

	public void setInitialBedNo(Long initialBedNo) {
		this.initialBedNo = initialBedNo;
	}

	public Long getCurrentBedNo() {
		return currentBedNo;
	}

	public void setCurrentBedNo(Long currentBedNo) {
		this.currentBedNo = currentBedNo;
	}

	public Integer getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(Integer patientStatus) {
		this.patientStatus = patientStatus;
	}

	public Long getBuNo() {
		return buNo;
	}

	public void setBuNo(Long buNo) {
		this.buNo = buNo;
	}

	public String getBuName() {
		return buName;
	}

	public void setBuName(String buName) {
		this.buName = buName;
	}

	public String getAdmRemarks() {
		return admRemarks;
	}

	public void setAdmRemarks(String admRemarks) {
		this.admRemarks = admRemarks;
	}

	public Integer getDiseqFlag() {
		return diseqFlag;
	}

	public void setDiseqFlag(Integer diseqFlag) {
		this.diseqFlag = diseqFlag;
	}

	public Long getDisReqBy() {
		return disReqBy;
	}

	public void setDisReqBy(Long disReqBy) {
		this.disReqBy = disReqBy;
	}

	public Date getDisReqTime() {
		return disReqTime;
	}

	public void setDisReqTime(Date disReqTime) {
		this.disReqTime = disReqTime;
	}

	public Integer getDisFlag() {
		return disFlag;
	}

	public void setDisFlag(Integer disFlag) {
		this.disFlag = disFlag;
	}

	public Long getDisBy() {
		return disBy;
	}

	public void setDisBy(Long disBy) {
		this.disBy = disBy;
	}

	public Date getDisDate() {
		return disDate;
	}

	public void setDisDate(Date disDate) {
		this.disDate = disDate;
	}

	public Date getDisDateTime() {
		return disDateTime;
	}

	public void setDisDateTime(Date disDateTime) {
		this.disDateTime = disDateTime;
	}

	public Integer getDueDisFlag() {
		return dueDisFlag;
	}

	public void setDueDisFlag(Integer dueDisFlag) {
		this.dueDisFlag = dueDisFlag;
	}

	public Long getRefAdmissionNo() {
		return refAdmissionNo;
	}

	public void setRefAdmissionNo(Long refAdmissionNo) {
		this.refAdmissionNo = refAdmissionNo;
	}

	public Long getMotherAdmissionNo() {
		return motherAdmissionNo;
	}

	public void setMotherAdmissionNo(Long motherAdmissionNo) {
		this.motherAdmissionNo = motherAdmissionNo;
	}

	public Long getCorClientNo() {
		return corClientNo;
	}

	public void setCorClientNo(Long corClientNo) {
		this.corClientNo = corClientNo;
	}

	public String getCorclientEmpId() {
		return corclientEmpId;
	}

	public void setCorclientEmpId(String corclientEmpId) {
		this.corclientEmpId = corclientEmpId;
	}

	public Long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Long getSsCreator() {
		return ssCreator;
	}

	public void setSsCreator(Long ssCreator) {
		this.ssCreator = ssCreator;
	}

	public Date getSsCreatedOn() {
		return ssCreatedOn;
	}

	public void setSsCreatedOn(Date ssCreatedOn) {
		this.ssCreatedOn = ssCreatedOn;
	}

	public Long getSsCreatedSession() {
		return ssCreatedSession;
	}

	public void setSsCreatedSession(Long ssCreatedSession) {
		this.ssCreatedSession = ssCreatedSession;
	}

	public Long getSsModifier() {
		return ssModifier;
	}

	public void setSsModifier(Long ssModifier) {
		this.ssModifier = ssModifier;
	}

	public Date getSsModifiedON() {
		return ssModifiedON;
	}

	public void setSsModifiedON(Date ssModifiedON) {
		this.ssModifiedON = ssModifiedON;
	}

	public Long getSsModifiedSesson() {
		return ssModifiedSesson;
	}

	public void setSsModifiedSesson(Long ssModifiedSesson) {
		this.ssModifiedSesson = ssModifiedSesson;
	}

	public Long getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(Long companyNo) {
		this.companyNo = companyNo;
	}

	public Date getSsUploadedOn() {
		return ssUploadedOn;
	}

	public void setSsUploadedOn(Date ssUploadedOn) {
		this.ssUploadedOn = ssUploadedOn;
	}

	public Integer getClearenceFlag() {
		return clearenceFlag;
	}

	public void setClearenceFlag(Integer clearenceFlag) {
		this.clearenceFlag = clearenceFlag;
	}

	public Date getClearenceDateTime() {
		return clearenceDateTime;
	}

	public void setClearenceDateTime(Date clearenceDateTime) {
		this.clearenceDateTime = clearenceDateTime;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public String getRelationServiceHolder() {
		return relationServiceHolder;
	}

	public void setRelationServiceHolder(String relationServiceHolder) {
		this.relationServiceHolder = relationServiceHolder;
	}

	public String getShRelation() {
		return shRelation;
	}

	public void setShRelation(String shRelation) {
		this.shRelation = shRelation;
	}

	public String getServiceHolderName() {
		return serviceHolderName;
	}

	public void setServiceHolderName(String serviceHolderName) {
		this.serviceHolderName = serviceHolderName;
	}

	public Long getRegType() {
		return regType;
	}

	public void setRegType(Long regType) {
		this.regType = regType;
	}

	public String getRegTypeName() {
		return regTypeName;
	}

	public void setRegTypeName(String regTypeName) {
		this.regTypeName = regTypeName;
	}

	public String getMilMedForm() {
		return milMedForm;
	}

	public void setMilMedForm(String milMedForm) {
		this.milMedForm = milMedForm;
	}

	public String getPatientValuables() {
		return patientValuables;
	}

	public void setPatientValuables(String patientValuables) {
		this.patientValuables = patientValuables;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public Long getWardNo() {
		return wardNo;
	}

	public void setWardNo(Long wardNo) {
		this.wardNo = wardNo;
	}

	public String getCauseOfAdmission() {
		return causeOfAdmission;
	}

	public void setCauseOfAdmission(String causeOfAdmission) {
		this.causeOfAdmission = causeOfAdmission;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactPersonAddress() {
		return contactPersonAddress;
	}

	public void setContactPersonAddress(String contactPersonAddress) {
		this.contactPersonAddress = contactPersonAddress;
	}

	public String getContactPersonMobile() {
		return contactPersonMobile;
	}

	public void setContactPersonMobile(String contactPersonMobile) {
		this.contactPersonMobile = contactPersonMobile;
	}

	public String getAdmCategory() {
		return admCategory;
	}

	public void setAdmCategory(String admCategory) {
		this.admCategory = admCategory;
	}

	public String getRbNo() {
		return rbNo;
	}

	public void setRbNo(String rbNo) {
		this.rbNo = rbNo;
	}

	public String getManualCategory() {
		return manualCategory;
	}

	public void setManualCategory(String manualCategory) {
		this.manualCategory = manualCategory;
	}

	public Long getSlNo() {
		return slNo;
	}

	public void setSlNo(Long slNo) {
		this.slNo = slNo;
	}

	public Long getSlYy() {
		return slYy;
	}

	public void setSlYy(Long slYy) {
		this.slYy = slYy;
	}

	public String getRefExternalHospital() {
		return refExternalHospital;
	}

	public void setRefExternalHospital(String refExternalHospital) {
		this.refExternalHospital = refExternalHospital;
	}

	public Long getRefRequestNo() {
		return refRequestNo;
	}

	public void setRefRequestNo(Long refRequestNo) {
		this.refRequestNo = refRequestNo;
	}

	public Long getAgeYy() {
		return ageYy;
	}

	public void setAgeYy(Long ageYy) {
		this.ageYy = ageYy;
	}

	public Long getAttendantNo() {
		return attendantNo;
	}

	public void setAttendantNo(Long attendantNo) {
		this.attendantNo = attendantNo;
	}

	public Integer getAttActiveStatus() {
		return attActiveStatus;
	}

	public void setAttActiveStatus(Integer attActiveStatus) {
		this.attActiveStatus = attActiveStatus;
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
    
}
