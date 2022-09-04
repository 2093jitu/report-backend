package com.springbootexp.dto.oncology;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Component
public class ViewOncoPatProtocolDto {
	
	
	private Long id;
	private Long patProtocolNo;
	private Long itemNo;
	private String itemName;
	private Long medTypeNo;
	private String medTypeNAME;
	private Long routeNo;
	private String routeName;
	private Long dose;
	private Long doseUnitNo;
	private String doseUnitName;
	private Double totalDose;
	private Double givenDose;
	private String duration;
	private String administration;
	private String infusion;
	private Long orderBy;
	private Long activeStatus;
	private Long medTypeOrderBy;
	private Double toDayGivenDose;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPatProtocolNo() {
		return patProtocolNo;
	}
	public void setPatProtocolNo(Long patProtocolNo) {
		this.patProtocolNo = patProtocolNo;
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
	public Long getMedTypeNo() {
		return medTypeNo;
	}
	public void setMedTypeNo(Long medTypeNo) {
		this.medTypeNo = medTypeNo;
	}
	public String getMedTypeNAME() {
		return medTypeNAME;
	}
	public void setMedTypeNAME(String medTypeNAME) {
		this.medTypeNAME = medTypeNAME;
	}
	public Long getRouteNo() {
		return routeNo;
	}
	public void setRouteNo(Long routeNo) {
		this.routeNo = routeNo;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public Long getDose() {
		return dose;
	}
	public void setDose(Long dose) {
		this.dose = dose;
	}
	public Long getDoseUnitNo() {
		return doseUnitNo;
	}
	public void setDoseUnitNo(Long doseUnitNo) {
		this.doseUnitNo = doseUnitNo;
	}
	public String getDoseUnitName() {
		return doseUnitName;
	}
	public void setDoseUnitName(String doseUnitName) {
		this.doseUnitName = doseUnitName;
	}
	public Double getTotalDose() {
		return totalDose;
	}
	public void setTotalDose(Double totalDose) {
		this.totalDose = totalDose;
	}
	public Double getGivenDose() {
		return givenDose;
	}
	public void setGivenDose(Double givenDose) {
		this.givenDose = givenDose;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getAdministration() {
		return administration;
	}
	public void setAdministration(String administration) {
		this.administration = administration;
	}
	public String getInfusion() {
		return infusion;
	}
	public void setInfusion(String infusion) {
		this.infusion = infusion;
	}
	public Long getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(Long orderBy) {
		this.orderBy = orderBy;
	}
	public Long getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Long activeStatus) {
		this.activeStatus = activeStatus;
	}
	public Long getMedTypeOrderBy() {
		return medTypeOrderBy;
	}
	public void setMedTypeOrderBy(Long medTypeOrderBy) {
		this.medTypeOrderBy = medTypeOrderBy;
	}
	public Double getToDayGivenDose() {
		return toDayGivenDose;
	}
	public void setToDayGivenDose(Double toDayGivenDose) {
		this.toDayGivenDose = toDayGivenDose;
	}
	

	

}
