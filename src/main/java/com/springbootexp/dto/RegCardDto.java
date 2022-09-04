package com.springbootexp.dto;

import java.util.Date;

public class RegCardDto {
	private String patientName;
    private String gender;
    private String mobile;
    private String huNo;
    private Date dob;
    private String companyName;
    private String companyAddress1;
    private String companyAddress2;
    private String photo;

    // for DMFR registration card
    private String age;
    private Date regDate;

    // common to ewvm and dmfr
    private String logo;

    // to handle address in regcard
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHuNo() {
		return huNo;
	}
	public void setHuNo(String huNo) {
		this.huNo = huNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress1() {
		return companyAddress1;
	}
	public void setCompanyAddress1(String companyAddress1) {
		this.companyAddress1 = companyAddress1;
	}
	public String getCompanyAddress2() {
		return companyAddress2;
	}
	public void setCompanyAddress2(String companyAddress2) {
		this.companyAddress2 = companyAddress2;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
    
}
