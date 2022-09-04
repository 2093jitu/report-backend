package com.springbootexp.dto.splOtSummary;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SplOtSummaryReportDto {
	
	private Long doctorNo;
	private String personalNumber;
	private String rankName;
	private String doctorName;
	private String specializationName;
	private String specializationName1;
	private String docWithSp;
	private Double conSales;
	private Double con30Percen;
	private Double otSales;
	private Double ot20Percen;
	private Double percnTotal;
	

}
