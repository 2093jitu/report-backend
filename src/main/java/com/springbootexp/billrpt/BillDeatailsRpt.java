package com.springbootexp.billrpt;

import java.util.Date;
import java.util.List;

public class BillDeatailsRpt {
	public String reportTitle;
    public String reportSubTitle;
    public String companyName;
    public String companyAddress;
    public String companyLogo;
    public String dateRangeName;
    public Date fromDate;
    public Date toDate;
    public String printFormate;
    public String rptTempName;
    public String rptSubName;
    public List<OtBillList> otBillList;
    public List<SpecFeeList> specFeeList;
    public List<InvDetailList> invDetailList;
    public List<HeadWiseOtherItem> headWiseOtherItem;
    public List<PayHisList> payHisList;
    public List<BedFeeDetailList> bedFeeDetailList;
    public BillSumView billSumView;
    public PatView patView;
	public String getReportTitle() {
		return reportTitle;
	}
	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}
	
	public String getReportSubTitle() {
		return reportSubTitle;
	}
	public void setReportSubTitle(String reportSubTitle) {
		this.reportSubTitle = reportSubTitle;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}
	public String getDateRangeName() {
		return dateRangeName;
	}
	public void setDateRangeName(String dateRangeName) {
		this.dateRangeName = dateRangeName;
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
	public String getPrintFormate() {
		return printFormate;
	}
	public void setPrintFormate(String printFormate) {
		this.printFormate = printFormate;
	}
	public String getRptTempName() {
		return rptTempName;
	}
	public void setRptTempName(String rptTempName) {
		this.rptTempName = rptTempName;
	}
	public String getRptSubName() {
		return rptSubName;
	}
	public void setRptSubName(String rptSubName) {
		this.rptSubName = rptSubName;
	}
	public List<OtBillList> getOtBillList() {
		return otBillList;
	}
	public void setOtBillList(List<OtBillList> otBillList) {
		this.otBillList = otBillList;
	}
	public List<SpecFeeList> getSpecFeeList() {
		return specFeeList;
	}
	public void setSpecFeeList(List<SpecFeeList> specFeeList) {
		this.specFeeList = specFeeList;
	}
	public List<InvDetailList> getInvDetailList() {
		return invDetailList;
	}
	public void setInvDetailList(List<InvDetailList> invDetailList) {
		this.invDetailList = invDetailList;
	}
	public List<HeadWiseOtherItem> getHeadWiseOtherItem() {
		return headWiseOtherItem;
	}
	public void setHeadWiseOtherItem(List<HeadWiseOtherItem> headWiseOtherItem) {
		this.headWiseOtherItem = headWiseOtherItem;
	}
	public List<PayHisList> getPayHisList() {
		return payHisList;
	}
	public void setPayHisList(List<PayHisList> payHisList) {
		this.payHisList = payHisList;
	}
	public List<BedFeeDetailList> getBedFeeDetailList() {
		return bedFeeDetailList;
	}
	public void setBedFeeDetailList(List<BedFeeDetailList> bedFeeDetailList) {
		this.bedFeeDetailList = bedFeeDetailList;
	}
	public BillSumView getBillSumView() {
		return billSumView;
	}
	public void setBillSumView(BillSumView billSumView) {
		this.billSumView = billSumView;
	}
	public PatView getPatView() {
		return patView;
	}
	public void setPatView(PatView patView) {
		this.patView = patView;
	}
    
    
    
}
