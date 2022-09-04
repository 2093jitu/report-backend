package com.springbootexp.billrpt;

import java.math.BigDecimal;
import java.util.Date;

public class HeadWiseOtherItem {
	    public Long id;
	    public Long admissionNo;
	    public String particular;
	    public BigDecimal totalAmount;
	    public Date admissionDate;
	    public Date disDate;
	    public Long stayInDay;
	    public Long headNo;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getAdmissionNo() {
			return admissionNo;
		}
		public void setAdmissionNo(Long admissionNo) {
			this.admissionNo = admissionNo;
		}
		public String getParticular() {
			return particular;
		}
		public void setParticular(String particular) {
			this.particular = particular;
		}
		public BigDecimal getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(BigDecimal totalAmount) {
			this.totalAmount = totalAmount;
		}
		public Date getAdmissionDate() {
			return admissionDate;
		}
		public void setAdmissionDate(Date admissionDate) {
			this.admissionDate = admissionDate;
		}
		public Date getDisDate() {
			return disDate;
		}
		public void setDisDate(Date disDate) {
			this.disDate = disDate;
		}
		public Long getStayInDay() {
			return stayInDay;
		}
		public void setStayInDay(Long stayInDay) {
			this.stayInDay = stayInDay;
		}
		public Long getHeadNo() {
			return headNo;
		}
		public void setHeadNo(Long headNo) {
			this.headNo = headNo;
		}
	    
}
