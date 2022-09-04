package com.springbootexp.dto.oncology;

import java.util.Date;
import java.util.List;



import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class OncoPatDrugReqDtlDto {
    private Long id;

	private Long patDrugReqNo;

	private Long itemNo;

	private String itemName;
	
	private String itemTypeName; 
	
	private String medTypeName;
	
	private Long issuedQty;
	
	private Long requestQty;

	private Long orderSl;
	
	private Integer activeStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPatDrugReqNo() {
		return patDrugReqNo;
	}

	public void setPatDrugReqNo(Long patDrugReqNo) {
		this.patDrugReqNo = patDrugReqNo;
	}

	public Long getItemNo() {
		return itemNo;
	}

	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemTypeName() {
		return itemTypeName;
	}

	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}

	public String getMedTypeName() {
		return medTypeName;
	}

	public void setMedTypeName(String medTypeName) {
		this.medTypeName = medTypeName;
	}

	public Long getIssuedQty() {
		return issuedQty;
	}

	public void setIssuedQty(Long issuedQty) {
		this.issuedQty = issuedQty;
	}

	public Long getRequestQty() {
		return requestQty;
	}

	public void setRequestQty(Long requestQty) {
		this.requestQty = requestQty;
	}

	public Long getOrderSl() {
		return orderSl;
	}

	public void setOrderSl(Long orderSl) {
		this.orderSl = orderSl;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}	
	
	
	
}
