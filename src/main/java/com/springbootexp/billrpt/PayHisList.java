package com.springbootexp.billrpt;

import java.util.Date;

public class PayHisList {

	private Long payNo;
	private String paymentId;
	private Long paymentNo;
	private Long admissionNo;
	private Date paymentDate;
	private Date paymentDateTime;
	private Long paymentTypeNo;
	private String paymentTypeName;
	private Long paymentMode;
	private String paymentModeName;
	private Long collectionMode;
	private String collectionModeName;
	private String trnType;
	private Float paymentAmount;
	public Long getPayNo() {
		return payNo;
	}
	public void setPayNo(Long payNo) {
		this.payNo = payNo;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public Long getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(Long paymentNo) {
		this.paymentNo = paymentNo;
	}
	public Long getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Date getPaymentDateTime() {
		return paymentDateTime;
	}
	public void setPaymentDateTime(Date paymentDateTime) {
		this.paymentDateTime = paymentDateTime;
	}
	public Long getPaymentTypeNo() {
		return paymentTypeNo;
	}
	public void setPaymentTypeNo(Long paymentTypeNo) {
		this.paymentTypeNo = paymentTypeNo;
	}
	public String getPaymentTypeName() {
		return paymentTypeName;
	}
	public void setPaymentTypeName(String paymentTypeName) {
		this.paymentTypeName = paymentTypeName;
	}
	public Long getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(Long paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentModeName() {
		return paymentModeName;
	}
	public void setPaymentModeName(String paymentModeName) {
		this.paymentModeName = paymentModeName;
	}
	public Long getCollectionMode() {
		return collectionMode;
	}
	public void setCollectionMode(Long collectionMode) {
		this.collectionMode = collectionMode;
	}
	public String getCollectionModeName() {
		return collectionModeName;
	}
	public void setCollectionModeName(String collectionModeName) {
		this.collectionModeName = collectionModeName;
	}
	public String getTrnType() {
		return trnType;
	}
	public void setTrnType(String trnType) {
		this.trnType = trnType;
	}
	public Float getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
}
