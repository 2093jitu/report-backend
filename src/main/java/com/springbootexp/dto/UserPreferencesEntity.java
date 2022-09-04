package com.springbootexp.dto;

public class UserPreferencesEntity {

 	private static final long serialVersionUID = 1L;


	Long id;

	private String title;
	private String userPreferencesType;
	private int preferencesDataType; // 1 for check, 2 for radio 3 text 4 for textarea
	private int preferencesSerial;
	private String userPreferencesKey;

	private String userPreferencesValue;

	private String description;
	private Integer preferencesShowInReport;
	private Integer preferencesShowInTab; // 0 for not -- 1 for Yes --- To show in home tab.

	private Long doctorNo;
	
	
	private Long idNotEqual;
	
	private Integer activeStatus = 1;

	private Integer uiNo = 0;

	public UserPreferencesEntity() {
		super();
	}

	public UserPreferencesEntity(String title, int preferencesSerial, String userPreferencesKey,
			Integer preferencesShowInReport, Integer uiNo) {
		super();
		this.title = title;
		this.preferencesSerial = preferencesSerial;
		this.userPreferencesKey = userPreferencesKey;
		this.preferencesShowInReport = preferencesShowInReport;
		this.uiNo = uiNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserPreferencesType() {
		return userPreferencesType;
	}

	public void setUserPreferencesType(String userPreferencesType) {
		this.userPreferencesType = userPreferencesType;
	}

	public int getPreferencesDataType() {
		return preferencesDataType;
	}

	public void setPreferencesDataType(int preferencesDataType) {
		this.preferencesDataType = preferencesDataType;
	}

	public int getPreferencesSerial() {
		return preferencesSerial;
	}

	public void setPreferencesSerial(int preferencesSerial) {
		this.preferencesSerial = preferencesSerial;
	}

	public String getUserPreferencesKey() {
		return userPreferencesKey;
	}

	public void setUserPreferencesKey(String userPreferencesKey) {
		this.userPreferencesKey = userPreferencesKey;
	}

	public String getUserPreferencesValue() {
		return userPreferencesValue;
	}

	public void setUserPreferencesValue(String userPreferencesValue) {
		this.userPreferencesValue = userPreferencesValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPreferencesShowInReport() {
		return preferencesShowInReport;
	}

	public void setPreferencesShowInReport(Integer preferencesShowInReport) {
		this.preferencesShowInReport = preferencesShowInReport;
	}

	public Integer getPreferencesShowInTab() {
		return preferencesShowInTab;
	}

	public void setPreferencesShowInTab(Integer preferencesShowInTab) {
		this.preferencesShowInTab = preferencesShowInTab;
	}

	public Long getDoctorNo() {
		return doctorNo;
	}

	public void setDoctorNo(Long doctorNo) {
		this.doctorNo = doctorNo;
	}

	public Long getIdNotEqual() {
		return idNotEqual;
	}

	public void setIdNotEqual(Long idNotEqual) {
		this.idNotEqual = idNotEqual;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getUiNo() {
		return uiNo;
	}

	public void setUiNo(Integer uiNo) {
		this.uiNo = uiNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
