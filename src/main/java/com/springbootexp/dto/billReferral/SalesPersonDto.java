package com.springbootexp.dto.billReferral;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SalesPersonDto {

	private Long salesrepNo;
	private String salesrepId;
	private String salesrepName;
	private String marketingCode;
	public Long getSalesrepNo() {
		return salesrepNo;
	}
	public void setSalesrepNo(Long salesrepNo) {
		this.salesrepNo = salesrepNo;
	}
	public String getSalesrepId() {
		return salesrepId;
	}
	public void setSalesrepId(String salesrepId) {
		this.salesrepId = salesrepId;
	}
	public String getSalesrepName() {
		return salesrepName;
	}
	public void setSalesrepName(String salesrepName) {
		this.salesrepName = salesrepName;
	}
	public String getMarketingCode() {
		return marketingCode;
	}
	public void setMarketingCode(String marketingCode) {
		this.marketingCode = marketingCode;
	}


}
