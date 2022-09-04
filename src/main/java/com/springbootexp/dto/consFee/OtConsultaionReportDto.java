package com.springbootexp.dto.consFee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OtConsultaionReportDto {
	
	private Long doctorNo;
	private String personalNumber;
	private String rankName;
	private String doctorName;
	private String specializationName;
	private String docWithSp;
	private String admissionId;
	private Double conSales;
	private Double con30Percen;
	private Double otSales;
	private Double ot20Percen;
	private Double percnTotal;

}
