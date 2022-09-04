package com.springbootexp.dto.consFee;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtConsultaionFeeReportPrintDto {
	
	String reportTitle;
	String companyName;
    String companyAddress;
    
    Date fromDate;
    Date toDate;
    
    String comLogo;

    
    List<?> itemList;


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


	public List<?> getItemList() {
		return itemList;
	}


	public void setItemList(List<?> itemList) {
		this.itemList = itemList;
	}
    
    
}
