package com.springbootexp.dto.oncology;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class OncoPatProtocolDtlDto {

	private Long id;
	private Long patProtocolNo;
	private Long itemNo;
	private String itemName;
	private Long medTypeNo;
	private Long routeNo;
	private Long dose;
	private Long doseUnitNo;
	private String doseUnitName;
	private Double totalDose;
	private Double givenDose;
	private String duration;
	private String administration;
	private String infusion;
	private Long orderBy;
	private Integer activeStatus;
	private Integer isDeleted = 0;
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
	public Long getRouteNo() {
		return routeNo;
	}
	public void setRouteNo(Long routeNo) {
		this.routeNo = routeNo;
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
	public Double getToDayGivenDose() {
		return toDayGivenDose;
	}
	public void setToDayGivenDose(Double toDayGivenDose) {
		this.toDayGivenDose = toDayGivenDose;
	}
	

}
