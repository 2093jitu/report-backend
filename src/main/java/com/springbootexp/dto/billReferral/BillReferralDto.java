package com.springbootexp.dto.billReferral;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BillReferralDto {

	private Long grObjectNo;
	private Long submenuNo;
	private Long userNo;
	private String submenuName;
	public Long getGrObjectNo() {
		return grObjectNo;
	}
	public void setGrObjectNo(Long grObjectNo) {
		this.grObjectNo = grObjectNo;
	}
	public Long getSubmenuNo() {
		return submenuNo;
	}
	public void setSubmenuNo(Long submenuNo) {
		this.submenuNo = submenuNo;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public String getSubmenuName() {
		return submenuName;
	}
	public void setSubmenuName(String submenuName) {
		this.submenuName = submenuName;
	}
	
	

}
