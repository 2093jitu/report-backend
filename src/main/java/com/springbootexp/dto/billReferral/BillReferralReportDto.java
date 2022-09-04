package com.springbootexp.dto.billReferral;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BillReferralReportDto {

	Date fromDate;
	Date toDate;

	private List<BillReferralDataDto> billReferralDataList;

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

	public List<BillReferralDataDto> getBillReferralDataList() {
		return billReferralDataList;
	}

	public void setBillReferralDataList(List<BillReferralDataDto> billReferralDataList) {
		this.billReferralDataList = billReferralDataList;
	}

}
