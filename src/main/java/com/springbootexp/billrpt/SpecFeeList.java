package com.springbootexp.billrpt;

public class SpecFeeList {
	Long id;
	Long headNo;
	String headName;
	Long admissionNo;
	Long invoiceNo;
	Long doctorNo;
	String doctorName;
	Long itemQty;
	Double amt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getHeadNo() {
		return headNo;
	}
	public void setHeadNo(Long headNo) {
		this.headNo = headNo;
	}
	public String getHeadName() {
		return headName;
	}
	public void setHeadName(String headName) {
		this.headName = headName;
	}
	public Long getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}
	public Long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Long getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Long getItemQty() {
		return itemQty;
	}
	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	
}
