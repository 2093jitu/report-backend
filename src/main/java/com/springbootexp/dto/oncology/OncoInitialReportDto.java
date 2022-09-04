package com.springbootexp.dto.oncology;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
public class OncoInitialReportDto {
	
	private PatientInfoDto patientInfo;
	private List<OncoPatProtocolDto> oncoPatProtocolList;
	public PatientInfoDto getPatientInfo() {
		return patientInfo;
	}
	public void setPatientInfo(PatientInfoDto patientInfo) {
		this.patientInfo = patientInfo;
	}
	public List<OncoPatProtocolDto> getOncoPatProtocolList() {
		return oncoPatProtocolList;
	}
	public void setOncoPatProtocolList(List<OncoPatProtocolDto> oncoPatProtocolList) {
		this.oncoPatProtocolList = oncoPatProtocolList;
	}

}
