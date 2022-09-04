package com.springbootexp.dto.oncology;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class OncoAppScheduleReportDto {

	private PatientInfoDto patientInfo;
	private List<OncoPatProtocolSchedDto> scheduleList;
	public PatientInfoDto getPatientInfo() {
		return patientInfo;
	}
	public void setPatientInfo(PatientInfoDto patientInfo) {
		this.patientInfo = patientInfo;
	}
	public List<OncoPatProtocolSchedDto> getScheduleList() {
		return scheduleList;
	}
	public void setScheduleList(List<OncoPatProtocolSchedDto> scheduleList) {
		this.scheduleList = scheduleList;
	}
	
}
