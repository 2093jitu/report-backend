package com.springbootexp.dto.hospStop;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HospitalStoppageAndIpdDetailsReportDto {

	private String personalNumber;
	private String patientName;
	private String regType;
	private String relation;
	private Long admissionNo;
	private String admissionId;
	private Double stoppageAmt;
	private Double moSplAmt;
	private Double otAmt;
	private Double cabinFee;
	private Double serviceCharge;
	private Date admissionDate;
	private Date dischargeDate;
	private String stayInHospital;
	private Double totalAmt;
	
}
