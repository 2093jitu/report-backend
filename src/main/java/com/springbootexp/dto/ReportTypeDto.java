package com.springbootexp.dto;

public class ReportTypeDto {
   private Long rptId;
   private String reptTool;
   private String rptName;
   private String rptFormat;
   private String dtl;
   
   
public ReportTypeDto(Long rptId, String reptTool, String rptName,String rptFormat,String dtl) {
	super();
	this.rptId = rptId;
	this.reptTool = reptTool;
	this.rptName = rptName;
	this.rptFormat = rptFormat;
	this.dtl = dtl;
}
public String getRptFormat() {
	return rptFormat;
}
public void setRptFormat(String rptFormat) {
	this.rptFormat = rptFormat;
}
public Long getRptId() {
	return rptId;
}
public void setRptId(Long rptId) {
	this.rptId = rptId;
}
public String getReptTool() {
	return reptTool;
}
public void setReptTool(String reptTool) {
	this.reptTool = reptTool;
}
public String getRptName() {
	return rptName;
}
public void setRptName(String rptName) {
	this.rptName = rptName;
}
public String getDtl() {
	return dtl;
}
public void setDtl(String dtl) {
	this.dtl = dtl;
}
   
   
}
