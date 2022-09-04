package com.springbootexp.dto;

public class DisUserPreferencesEntity {

    private  Long id;	
	private Long activeStatus=1l;
	private String description;	
	private Long doctorNo;
	private Long preferencesDataType;
	private Long preferencesSerial;	
	private Long showInReport;	
	private Long showInTab;
	private String title;		
	private String userPreferencesKey;
	private String userPreferencesType;		
	private String userPreferencesValue;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Long activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}
	public Long getPreferencesDataType() {
		return preferencesDataType;
	}
	public void setPreferencesDataType(Long preferencesDataType) {
		this.preferencesDataType = preferencesDataType;
	}
	public Long getPreferencesSerial() {
		return preferencesSerial;
	}
	public void setPreferencesSerial(Long preferencesSerial) {
		this.preferencesSerial = preferencesSerial;
	}
	public Long getShowInReport() {
		return showInReport;
	}
	public void setShowInReport(Long showInReport) {
		this.showInReport = showInReport;
	}
	public Long getShowInTab() {
		return showInTab;
	}
	public void setShowInTab(Long showInTab) {
		this.showInTab = showInTab;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUserPreferencesKey() {
		return userPreferencesKey;
	}
	public void setUserPreferencesKey(String userPreferencesKey) {
		this.userPreferencesKey = userPreferencesKey;
	}
	public String getUserPreferencesType() {
		return userPreferencesType;
	}
	public void setUserPreferencesType(String userPreferencesType) {
		this.userPreferencesType = userPreferencesType;
	}
	public String getUserPreferencesValue() {
		return userPreferencesValue;
	}
	public void setUserPreferencesValue(String userPreferencesValue) {
		this.userPreferencesValue = userPreferencesValue;
	}
}
