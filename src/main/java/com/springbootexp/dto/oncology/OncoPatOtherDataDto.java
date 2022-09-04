package com.springbootexp.dto.oncology;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class OncoPatOtherDataDto {

	private Long id; 	
	private Long parentNo; 
	private Long parentType; 
	private Long otherDataType; 
	private String otherData; 
	private String findings; 
	private String unit; 
	private Long referenceId; 
	private Long inReportSerial; 
	private Long activeStat;
	private Long showInReport;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getParentNo() {
		return parentNo;
	}
	public void setParentNo(Long parentNo) {
		this.parentNo = parentNo;
	}
	public Long getParentType() {
		return parentType;
	}
	public void setParentType(Long parentType) {
		this.parentType = parentType;
	}
	public Long getOtherDataType() {
		return otherDataType;
	}
	public void setOtherDataType(Long otherDataType) {
		this.otherDataType = otherDataType;
	}
	public String getOtherData() {
		return otherData;
	}
	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}
	public String getFindings() {
		return findings;
	}
	public void setFindings(String findings) {
		this.findings = findings;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Long getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}
	public Long getInReportSerial() {
		return inReportSerial;
	}
	public void setInReportSerial(Long inReportSerial) {
		this.inReportSerial = inReportSerial;
	}
	public Long getActiveStat() {
		return activeStat;
	}
	public void setActiveStat(Long activeStat) {
		this.activeStat = activeStat;
	}
	public Long getShowInReport() {
		return showInReport;
	}
	public void setShowInReport(Long showInReport) {
		this.showInReport = showInReport;
	} 

}
