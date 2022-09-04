package com.springbootexp.dto;

import java.util.List;

public class DisMedicineEntity {


	private Long id;
	private Long disSumNo;
	private String genericName;
	private String brandName;
	private String formName;
	private Long itemNo;

	private String route;
	private Long inReportSerial;
	private Integer activeStatus = 1;

	
	private Integer isDeleted = 0;
	
	
	private List<DisMedicineDtlEntity> disMedDtlList; 	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getDisSumNo() {
		return disSumNo;
	}


	public void setDisSumNo(Long disSumNo) {
		this.disSumNo = disSumNo;
	}


	public String getGenericName() {
		return genericName;
	}


	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getFormName() {
		return formName;
	}


	public void setFormName(String formName) {
		this.formName = formName;
	}


	public Long getItemNo() {
		return itemNo;
	}


	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}


	public String getRoute() {
		return route;
	}


	public void setRoute(String route) {
		this.route = route;
	}


	public Long getInReportSerial() {
		return inReportSerial;
	}


	public void setInReportSerial(Long inReportSerial) {
		this.inReportSerial = inReportSerial;
	}


	public Integer getActiveStatus() {
		return activeStatus;
	}


	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}


	public Integer getIsDeleted() {
		return isDeleted;
	}


	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}


	public List<DisMedicineDtlEntity> getDisMedDtlList() {
		return disMedDtlList;
	}


	public void setDisMedDtlList(List<DisMedicineDtlEntity> disMedDtlList) {
		this.disMedDtlList = disMedDtlList;
	}


	public DisMedicineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DisMedicineEntity(String genericName, String brandName, String formName, String route, Long inReportSerial,
			List<DisMedicineDtlEntity> disMedDtlList) {
		super();
		this.genericName = genericName;
		this.brandName = brandName;
		this.formName = formName;
		this.route = route;
		this.inReportSerial = inReportSerial;
		this.disMedDtlList = disMedDtlList;
	}

}
