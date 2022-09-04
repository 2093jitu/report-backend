package com.springbootexp.billrpt;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OpdBillingSalesDto{

	private Date invoiceDate;
	private Long invoiceNo;
	private String invoiceId;
	private String salesByName;
	private String refDocName;
	private Double sales;
	private Double vat;
	private Double urgentFee;
	private Double serviceCharge;
	private Double totalCancel;
	private Double totalSales;
	private Double totalDiscAmt;
	private Double netSale;
	private String patientName;

	// sales summary
	// private String salesByName;
	private Long toInv;
	// private Long sales;
	// private Long vat;
	// private Long urgentFee;
	// private Long serviceCharge;
	// private Long totalCancel;
	// private Long totalSales;
	// private Long totalDiscAmt;
	// private Long netSale;

	//for item wise dtl and summary
	private String buName;
	// private Long invoiceDate;
	private Long itemNo;
	private String itemId;
	private String itemName;
	private Double itemRate;
	private String invNo;
	private Long itemQty;
	private Long cancelQty;
	// private Long netSale;
	private Double netVat;
	private Double netUrgentFee;
	private Double netServiceCharge;
	private Double netTotalSale;

	//last
	private Long totalInv;

	
	
	

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
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

	public String getSalesByName() {
		return salesByName;
	}

	public void setSalesByName(String salesByName) {
		this.salesByName = salesByName;
	}

	public String getRefDocName() {
		return refDocName;
	}

	public void setRefDocName(String refDocName) {
		this.refDocName = refDocName;
	}

	public Double getSales() {
		return sales;
	}

	public void setSales(Double sales) {
		this.sales = sales;
	}

	public Double getVat() {
		return vat;
	}

	public void setVat(Double vat) {
		this.vat = vat;
	}

	public Double getUrgentFee() {
		return urgentFee;
	}

	public void setUrgentFee(Double urgentFee) {
		this.urgentFee = urgentFee;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Double getTotalCancel() {
		return totalCancel;
	}

	public void setTotalCancel(Double totalCancel) {
		this.totalCancel = totalCancel;
	}

	public Double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(Double totalSales) {
		this.totalSales = totalSales;
	}

	public Double getTotalDiscAmt() {
		return totalDiscAmt;
	}

	public void setTotalDiscAmt(Double totalDiscAmt) {
		this.totalDiscAmt = totalDiscAmt;
	}

	public Double getNetSale() {
		return netSale;
	}

	public void setNetSale(Double netSale) {
		this.netSale = netSale;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getToInv() {
		return toInv;
	}

	public void setToInv(Long toInv) {
		this.toInv = toInv;
	}

	public String getBuName() {
		return buName;
	}

	public void setBuName(String buName) {
		this.buName = buName;
	}

	public Long getItemNo() {
		return itemNo;
	}

	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemRate() {
		return itemRate;
	}

	public void setItemRate(Double itemRate) {
		this.itemRate = itemRate;
	}

	public String getInvNo() {
		return invNo;
	}

	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}

	public Long getItemQty() {
		return itemQty;
	}

	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}

	public Long getCancelQty() {
		return cancelQty;
	}

	public void setCancelQty(Long cancelQty) {
		this.cancelQty = cancelQty;
	}

	public Double getNetVat() {
		return netVat;
	}

	public void setNetVat(Double netVat) {
		this.netVat = netVat;
	}

	public Double getNetUrgentFee() {
		return netUrgentFee;
	}

	public void setNetUrgentFee(Double netUrgentFee) {
		this.netUrgentFee = netUrgentFee;
	}

	public Double getNetServiceCharge() {
		return netServiceCharge;
	}

	public void setNetServiceCharge(Double netServiceCharge) {
		this.netServiceCharge = netServiceCharge;
	}

	public Double getNetTotalSale() {
		return netTotalSale;
	}

	public void setNetTotalSale(Double netTotalSale) {
		this.netTotalSale = netTotalSale;
	}

	public Long getTotalInv() {
		return totalInv;
	}

	public void setTotalInv(Long totalInv) {
		this.totalInv = totalInv;
	}

}
