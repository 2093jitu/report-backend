package com.springbootexp.billrpt;

import java.math.BigDecimal;

public class BillSumView {
	
	    private Long admissionNo;
		private BigDecimal totalBill;
		private BigDecimal totalDiscount;
		private BigDecimal netBill;
		private BigDecimal totalCollection;
		private BigDecimal totalRefund;
		private BigDecimal netCollection;
		private BigDecimal due;
		private BigDecimal bills;
		private BigDecimal billsReturn;
		
		private BigDecimal initialCollection;
		private BigDecimal dueCollection;
		private BigDecimal refund;
		private BigDecimal initialDiscount;
		private BigDecimal secondDiscount;
		private BigDecimal initialDiscountReturn;
		private BigDecimal secondDiscountReturn;
		private BigDecimal vat;
		private BigDecimal vatReturn;
		private BigDecimal urgentFee;
		private BigDecimal urgentFeeReturn;
		private BigDecimal serviceCharge;
		private BigDecimal serviceChargeReturn;
		
		 public String netBillInWard;

		public Long getAdmissionNo() {
			return admissionNo;
		}

		public void setAdmissionNo(Long admissionNo) {
			this.admissionNo = admissionNo;
		}

		public BigDecimal getTotalBill() {
			return totalBill;
		}

		public void setTotalBill(BigDecimal totalBill) {
			this.totalBill = totalBill;
		}

		public BigDecimal getTotalDiscount() {
			return totalDiscount;
		}

		public void setTotalDiscount(BigDecimal totalDiscount) {
			this.totalDiscount = totalDiscount;
		}

		public BigDecimal getNetBill() {
			return netBill;
		}

		public void setNetBill(BigDecimal netBill) {
			this.netBill = netBill;
		}

		public BigDecimal getTotalCollection() {
			return totalCollection;
		}

		public void setTotalCollection(BigDecimal totalCollection) {
			this.totalCollection = totalCollection;
		}

		public BigDecimal getTotalRefund() {
			return totalRefund;
		}

		public void setTotalRefund(BigDecimal totalRefund) {
			this.totalRefund = totalRefund;
		}

		public BigDecimal getNetCollection() {
			return netCollection;
		}

		public void setNetCollection(BigDecimal netCollection) {
			this.netCollection = netCollection;
		}

		public BigDecimal getDue() {
			return due;
		}

		public void setDue(BigDecimal due) {
			this.due = due;
		}

		public BigDecimal getBills() {
			return bills;
		}

		public void setBills(BigDecimal bills) {
			this.bills = bills;
		}

		public BigDecimal getBillsReturn() {
			return billsReturn;
		}

		public void setBillsReturn(BigDecimal billsReturn) {
			this.billsReturn = billsReturn;
		}

		public BigDecimal getInitialCollection() {
			return initialCollection;
		}

		public void setInitialCollection(BigDecimal initialCollection) {
			this.initialCollection = initialCollection;
		}

		public BigDecimal getDueCollection() {
			return dueCollection;
		}

		public void setDueCollection(BigDecimal dueCollection) {
			this.dueCollection = dueCollection;
		}

		public BigDecimal getRefund() {
			return refund;
		}

		public void setRefund(BigDecimal refund) {
			this.refund = refund;
		}

		public BigDecimal getInitialDiscount() {
			return initialDiscount;
		}

		public void setInitialDiscount(BigDecimal initialDiscount) {
			this.initialDiscount = initialDiscount;
		}

		public BigDecimal getSecondDiscount() {
			return secondDiscount;
		}

		public void setSecondDiscount(BigDecimal secondDiscount) {
			this.secondDiscount = secondDiscount;
		}

		public BigDecimal getInitialDiscountReturn() {
			return initialDiscountReturn;
		}

		public void setInitialDiscountReturn(BigDecimal initialDiscountReturn) {
			this.initialDiscountReturn = initialDiscountReturn;
		}

		public BigDecimal getSecondDiscountReturn() {
			return secondDiscountReturn;
		}

		public void setSecondDiscountReturn(BigDecimal secondDiscountReturn) {
			this.secondDiscountReturn = secondDiscountReturn;
		}

		public BigDecimal getVat() {
			return vat;
		}

		public void setVat(BigDecimal vat) {
			this.vat = vat;
		}

		public BigDecimal getVatReturn() {
			return vatReturn;
		}

		public void setVatReturn(BigDecimal vatReturn) {
			this.vatReturn = vatReturn;
		}

		public BigDecimal getUrgentFee() {
			return urgentFee;
		}

		public void setUrgentFee(BigDecimal urgentFee) {
			this.urgentFee = urgentFee;
		}

		public BigDecimal getUrgentFeeReturn() {
			return urgentFeeReturn;
		}

		public void setUrgentFeeReturn(BigDecimal urgentFeeReturn) {
			this.urgentFeeReturn = urgentFeeReturn;
		}

		public BigDecimal getServiceCharge() {
			return serviceCharge;
		}

		public void setServiceCharge(BigDecimal serviceCharge) {
			this.serviceCharge = serviceCharge;
		}

		public BigDecimal getServiceChargeReturn() {
			return serviceChargeReturn;
		}

		public void setServiceChargeReturn(BigDecimal serviceChargeReturn) {
			this.serviceChargeReturn = serviceChargeReturn;
		}

		public String getNetBillInWard() {
			return netBillInWard;
		}

		public void setNetBillInWard(String netBillInWard) {
			this.netBillInWard = netBillInWard;
		}
		 
}
