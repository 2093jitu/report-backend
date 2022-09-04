package com.springbootexp.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BookingItemDto {
	
	private Long id;

	private Long itemNo;
	
	private String itemBookingId;

	private String itemName;

	private Long itemtypeNo;

	private String itemtypeName;

	private Long buNo;

	private String buName;

	private Double salesPrice;

	private Integer deliveryStatus;

	private Date deliveryDate;

	private Date ssCreatedOn;
	
	//===================
	private Long itemBookingNo;

	private String patientId;

	private String salutation;

	private String firstName;

	private String lastName;

	private String patientName;

	private Long patientTypeNo;

	private Date dob;

	private String age;
	
	private String gender;

	private String maritalStatus;

	private String bloodGroup;

	private String mobileNo;

	private String email;

	private String address;

	private String fatherName;

	private String motherName;

	private String nationalId;

	private String religion;

	private String spouseName;

	private String passportNo;

	private Date preferredSamCollDate;

	private Date expectedRepDeliDate;

	private Integer foreignTraveler;
	
	private String foreignTravelerFlag;

	private Date tentativeVisitDate;

	private String countryOfArrival;

	private String ticketNumber;

	private Date ticketDate;

	private String subject;

	private String message;

	private Integer activeStatus;

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

	public String getItemBookingId() {
		return itemBookingId;
	}

	public void setItemBookingId(String itemBookingId) {
		this.itemBookingId = itemBookingId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemtypeNo() {
		return itemtypeNo;
	}

	public void setItemtypeNo(Long itemtypeNo) {
		this.itemtypeNo = itemtypeNo;
	}

	public String getItemtypeName() {
		return itemtypeName;
	}

	public void setItemtypeName(String itemtypeName) {
		this.itemtypeName = itemtypeName;
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

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getSsCreatedOn() {
		return ssCreatedOn;
	}

	public void setSsCreatedOn(Date ssCreatedOn) {
		this.ssCreatedOn = ssCreatedOn;
	}

	public Long getItemBookingNo() {
		return itemBookingNo;
	}

	public void setItemBookingNo(Long itemBookingNo) {
		this.itemBookingNo = itemBookingNo;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getPatientTypeNo() {
		return patientTypeNo;
	}

	public void setPatientTypeNo(Long patientTypeNo) {
		this.patientTypeNo = patientTypeNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public Date getPreferredSamCollDate() {
		return preferredSamCollDate;
	}

	public void setPreferredSamCollDate(Date preferredSamCollDate) {
		this.preferredSamCollDate = preferredSamCollDate;
	}

	public Date getExpectedRepDeliDate() {
		return expectedRepDeliDate;
	}

	public void setExpectedRepDeliDate(Date expectedRepDeliDate) {
		this.expectedRepDeliDate = expectedRepDeliDate;
	}

	public Integer getForeignTraveler() {
		return foreignTraveler;
	}

	public void setForeignTraveler(Integer foreignTraveler) {
		this.foreignTraveler = foreignTraveler;
	}

	public String getForeignTravelerFlag() {
		return foreignTravelerFlag;
	}

	public void setForeignTravelerFlag(String foreignTravelerFlag) {
		this.foreignTravelerFlag = foreignTravelerFlag;
	}

	public Date getTentativeVisitDate() {
		return tentativeVisitDate;
	}

	public void setTentativeVisitDate(Date tentativeVisitDate) {
		this.tentativeVisitDate = tentativeVisitDate;
	}

	public String getCountryOfArrival() {
		return countryOfArrival;
	}

	public void setCountryOfArrival(String countryOfArrival) {
		this.countryOfArrival = countryOfArrival;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public Date getTicketDate() {
		return ticketDate;
	}

	public void setTicketDate(Date ticketDate) {
		this.ticketDate = ticketDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}
}
