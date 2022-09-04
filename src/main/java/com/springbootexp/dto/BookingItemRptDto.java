package com.springbootexp.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BookingItemRptDto {
	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
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

	public List<BookingItemDto> getReportDataList() {
		return reportDataList;
	}

	public void setReportDataList(List<BookingItemDto> reportDataList) {
		this.reportDataList = reportDataList;
	}

	private String reportTitle;
	private String companyName;
	private String companyAddress;
	private String departmentName;
	private String dateCriteria;
	private Date fromDate;
	private Date toDate;
	private String comLogo;
	private String dateRangeName;

	private List<BookingItemDto> reportDataList;
}
