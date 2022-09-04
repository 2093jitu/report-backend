package com.springbootexp.dto;

import java.util.List;

public class QuestionnaireLookupDtlDto {


	
	private Long id;
	private Long qsaLookupdtlNoPar;
	private Long qsaLookupNo;
	private String qsaLookupdtlName;
	private String qsaLookupDescr;
	private Long activeStat;
	private Long slNo;
	private String placeHolder;
	private String unitVal;
	private Long inputType;
	private Long isShowHeader;
	private Long remarksFlag;
	private Long remarksInputType;
	
	private List<Long> lookupNoList;
	
	
	//=======additional field========
	private String defaultValue;

	private Integer requiredFlag;

	private String gridColumn;
	
	//================================
	private String qsaDtlVal;
	private String qsaDtlUnit;
	private String qsaDtlRemarks;
	private List<QuestionnaireLookupDtlDto> childLookupDtlList;
	
	
	
	
	
	public QuestionnaireLookupDtlDto() {
		super();
	}
	public QuestionnaireLookupDtlDto(String qsaLookupdtlName, Long slNo, Long inputType, String defaultValue,
			String qsaDtlVal) {
		super();
		this.qsaLookupdtlName = qsaLookupdtlName;
		this.slNo = slNo;
		this.inputType = inputType;
		this.defaultValue = defaultValue;
		this.qsaDtlVal = qsaDtlVal;
	}
	public QuestionnaireLookupDtlDto(String qsaLookupdtlName, Long slNo, Long inputType, String defaultValue,
			String qsaDtlVal, List<QuestionnaireLookupDtlDto> childLookupDtlList) {
		super();
		this.qsaLookupdtlName = qsaLookupdtlName;
		this.slNo = slNo;
		this.inputType = inputType;
		this.defaultValue = defaultValue;
		this.qsaDtlVal = qsaDtlVal;
		this.childLookupDtlList = childLookupDtlList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getQsaLookupdtlNoPar() {
		return qsaLookupdtlNoPar;
	}
	public void setQsaLookupdtlNoPar(Long qsaLookupdtlNoPar) {
		this.qsaLookupdtlNoPar = qsaLookupdtlNoPar;
	}
	public Long getQsaLookupNo() {
		return qsaLookupNo;
	}
	public void setQsaLookupNo(Long qsaLookupNo) {
		this.qsaLookupNo = qsaLookupNo;
	}
	public String getQsaLookupdtlName() {
		return qsaLookupdtlName;
	}
	public void setQsaLookupdtlName(String qsaLookupdtlName) {
		this.qsaLookupdtlName = qsaLookupdtlName;
	}
	public String getQsaLookupDescr() {
		return qsaLookupDescr;
	}
	public void setQsaLookupDescr(String qsaLookupDescr) {
		this.qsaLookupDescr = qsaLookupDescr;
	}
	public Long getActiveStat() {
		return activeStat;
	}
	public void setActiveStat(Long activeStat) {
		this.activeStat = activeStat;
	}
	public Long getSlNo() {
		return slNo;
	}
	public void setSlNo(Long slNo) {
		this.slNo = slNo;
	}
	public String getPlaceHolder() {
		return placeHolder;
	}
	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}
	public String getUnitVal() {
		return unitVal;
	}
	public void setUnitVal(String unitVal) {
		this.unitVal = unitVal;
	}
	public Long getInputType() {
		return inputType;
	}
	public void setInputType(Long inputType) {
		this.inputType = inputType;
	}
	public Long getIsShowHeader() {
		return isShowHeader;
	}
	public void setIsShowHeader(Long isShowHeader) {
		this.isShowHeader = isShowHeader;
	}
	public Long getRemarksFlag() {
		return remarksFlag;
	}
	public void setRemarksFlag(Long remarksFlag) {
		this.remarksFlag = remarksFlag;
	}
	public Long getRemarksInputType() {
		return remarksInputType;
	}
	public void setRemarksInputType(Long remarksInputType) {
		this.remarksInputType = remarksInputType;
	}
	public List<Long> getLookupNoList() {
		return lookupNoList;
	}
	public void setLookupNoList(List<Long> lookupNoList) {
		this.lookupNoList = lookupNoList;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Integer getRequiredFlag() {
		return requiredFlag;
	}
	public void setRequiredFlag(Integer requiredFlag) {
		this.requiredFlag = requiredFlag;
	}
	public String getGridColumn() {
		return gridColumn;
	}
	public void setGridColumn(String gridColumn) {
		this.gridColumn = gridColumn;
	}
	public String getQsaDtlVal() {
		return qsaDtlVal;
	}
	public void setQsaDtlVal(String qsaDtlVal) {
		this.qsaDtlVal = qsaDtlVal;
	}
	public String getQsaDtlUnit() {
		return qsaDtlUnit;
	}
	public void setQsaDtlUnit(String qsaDtlUnit) {
		this.qsaDtlUnit = qsaDtlUnit;
	}
	public String getQsaDtlRemarks() {
		return qsaDtlRemarks;
	}
	public void setQsaDtlRemarks(String qsaDtlRemarks) {
		this.qsaDtlRemarks = qsaDtlRemarks;
	}
	public List<QuestionnaireLookupDtlDto> getChildLookupDtlList() {
		return childLookupDtlList;
	}
	public void setChildLookupDtlList(List<QuestionnaireLookupDtlDto> childLookupDtlList) {
		this.childLookupDtlList = childLookupDtlList;
	}
	
	
	



}
