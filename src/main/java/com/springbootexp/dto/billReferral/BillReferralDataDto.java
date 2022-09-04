package com.springbootexp.dto.billReferral;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BillReferralDataDto {

	private Long refDocNo;

	private String doctorId;

	private String doctorName;

	private String address;

	private Long salesrepNo;

	private String empId;

	private String empName;

	private Long invoiceNo;

	private String invoiceId;

	private Long companyNo;

	private Date invoiceDate;

	private Date lastPayDate;

	private String deptName;

	private String itemName;

	private Long intExtFlag;

	private Long secondRefDocNo;

	private Long refPaid;

	private Long refHideFlag;

	private Long itemRate;

	private Long totRefAmt;

	private Long cliDisc;

	private Long docDisc;

	private Long netRefAmt;

	private Long due;

	private Date fromInvoiceDate;

	private Date toInvoiceDate;

	public Long getRefDocNo() {
		return refDocNo;
	}

	public void setRefDocNo(Long refDocNo) {
		this.refDocNo = refDocNo;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getSalesrepNo() {
		return salesrepNo;
	}

	public void setSalesrepNo(Long salesrepNo) {
		this.salesrepNo = salesrepNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(Long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Long getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(Long companyNo) {
		this.companyNo = companyNo;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Date getLastPayDate() {
		return lastPayDate;
	}

	public void setLastPayDate(Date lastPayDate) {
		this.lastPayDate = lastPayDate;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getIntExtFlag() {
		return intExtFlag;
	}

	public void setIntExtFlag(Long intExtFlag) {
		this.intExtFlag = intExtFlag;
	}

	public Long getSecondRefDocNo() {
		return secondRefDocNo;
	}

	public void setSecondRefDocNo(Long secondRefDocNo) {
		this.secondRefDocNo = secondRefDocNo;
	}

	public Long getRefPaid() {
		return refPaid;
	}

	public void setRefPaid(Long refPaid) {
		this.refPaid = refPaid;
	}

	public Long getRefHideFlag() {
		return refHideFlag;
	}

	public void setRefHideFlag(Long refHideFlag) {
		this.refHideFlag = refHideFlag;
	}

	public Long getItemRate() {
		return itemRate;
	}

	public void setItemRate(Long itemRate) {
		this.itemRate = itemRate;
	}

	public Long getTotRefAmt() {
		return totRefAmt;
	}

	public void setTotRefAmt(Long totRefAmt) {
		this.totRefAmt = totRefAmt;
	}

	public Long getCliDisc() {
		return cliDisc;
	}

	public void setCliDisc(Long cliDisc) {
		this.cliDisc = cliDisc;
	}

	public Long getDocDisc() {
		return docDisc;
	}

	public void setDocDisc(Long docDisc) {
		this.docDisc = docDisc;
	}

	public Long getNetRefAmt() {
		return netRefAmt;
	}

	public void setNetRefAmt(Long netRefAmt) {
		this.netRefAmt = netRefAmt;
	}

	public Long getDue() {
		return due;
	}

	public void setDue(Long due) {
		this.due = due;
	}

	public Date getFromInvoiceDate() {
		return fromInvoiceDate;
	}

	public void setFromInvoiceDate(Date fromInvoiceDate) {
		this.fromInvoiceDate = fromInvoiceDate;
	}

	public Date getToInvoiceDate() {
		return toInvoiceDate;
	}

	public void setToInvoiceDate(Date toInvoiceDate) {
		this.toInvoiceDate = toInvoiceDate;
	}

}
