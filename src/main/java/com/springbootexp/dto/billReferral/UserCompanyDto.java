package com.springbootexp.dto.billReferral;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserCompanyDto {

	private Long companyNo;
	private String companyName;
	private Long defaultFlg;
	public Long getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(Long companyNo) {
		this.companyNo = companyNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getDefaultFlg() {
		return defaultFlg;
	}
	public void setDefaultFlg(Long defaultFlg) {
		this.defaultFlg = defaultFlg;
	}


}
