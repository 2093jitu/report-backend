package com.springbootexp.dto.oncology;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class OncoPatProtocolSchedDto {

	private Long id;
	private Long patProtocolNo;
	private Long cycleNo;
	private Long dayNo;
	private Date appointmentDate;
	private Date dueDate;
	private Date givenDate;
	private Integer activeStatus;
	private Long scheduleType;
//	private String schedulNote;
	private List<OncoPatProtocolDtlDto> oncoPatProtocolDtlList;
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
	public Long getCycleNo() {
		return cycleNo;
	}
	public void setCycleNo(Long cycleNo) {
		this.cycleNo = cycleNo;
	}
	public Long getDayNo() {
		return dayNo;
	}
	public void setDayNo(Long dayNo) {
		this.dayNo = dayNo;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getGivenDate() {
		return givenDate;
	}
	public void setGivenDate(Date givenDate) {
		this.givenDate = givenDate;
	}
	public Integer getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}
	public Long getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(Long scheduleType) {
		this.scheduleType = scheduleType;
	}
	public List<OncoPatProtocolDtlDto> getOncoPatProtocolDtlList() {
		return oncoPatProtocolDtlList;
	}
	public void setOncoPatProtocolDtlList(List<OncoPatProtocolDtlDto> oncoPatProtocolDtlList) {
		this.oncoPatProtocolDtlList = oncoPatProtocolDtlList;
	}
	
}
