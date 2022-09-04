package com.springbootexp.dto;

import java.util.Date;
import java.util.List;

import com.springbootexp.billrpt.OpdBillingSalesDto;

public class CommonDto {
	private String reportTitle;
	private String companyName;
	private String companyLogo;
	private String companyAddress1;
	private String companyAddress2;
	private String departmentName;
	private String dateCriteria;
	private Date fromDate;
	private Date toDate;
	private String comLogo;
	private String dateRangeName;
	String printType;
	private Integer rptType;
	String printTypeName;
	List<?> dataList;
	List<OpdBillingSalesDto> reportDataList;
	public List<OpdBillingSalesDto> getReportDataList() {
		return reportDataList;
	}
	public void setReportDataList(List<OpdBillingSalesDto> reportDataList) {
		this.reportDataList = reportDataList;
	}
	Object dataObj;
	Object rptForObj;
	
	
	
	public Integer getRptType() {
		return rptType;
	}
	public void setRptType(Integer rptType) {
		this.rptType = rptType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getReportTitle() {
		return reportTitle;
	}
	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
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
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDateCriteria() {
		return dateCriteria;
	}
	public void setDateCriteria(String dateCriteria) {
		this.dateCriteria = dateCriteria;
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
	public String getComLogo() {
		return comLogo;
	}
	public void setComLogo(String comLogo) {
		this.comLogo = comLogo;
	}
	public String getDateRangeName() {
		return dateRangeName;
	}
	public void setDateRangeName(String dateRangeName) {
		this.dateRangeName = dateRangeName;
	}
	public List<?> getDataList() {
		return dataList;
	}
	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}
	public Object getDataObj() {
		return dataObj;
	}
	public void setDataObj(Object dataObj) {
		this.dataObj = dataObj;
	}
	public Object getRptForObj() {
		return rptForObj;
	}
	public void setRptForObj(Object rptForObj) {
		this.rptForObj = rptForObj;
	}
	public String getPrintType() {
		return printType;
	}
	public void setPrintType(String printType) {
		this.printType = printType;
	}
	public String getPrintTypeName() {
		return printTypeName;
	}
	public void setPrintTypeName(String printTypeName) {
		this.printTypeName = printTypeName;
	}
	
	
}
