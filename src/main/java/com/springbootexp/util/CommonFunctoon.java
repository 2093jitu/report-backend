package com.springbootexp.util;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.parser.JSONParser;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ibm.icu.text.SimpleDateFormat;
import com.springbootexp.billrpt.BillCollectionDto;
import com.springbootexp.billrpt.OpdBillingSalesDto;
import com.springbootexp.dto.DataTableRequest;
import com.springbootexp.dto.DataTableResults;
import com.springbootexp.dto.DisMedicineDtlEntity;
import com.springbootexp.dto.DisUserPreferencesEntity;
import com.springbootexp.dto.DischargeDetailEntity;
import com.springbootexp.dto.NsInvoice;
import com.springbootexp.dto.OTRequisitionQue;
import com.springbootexp.dto.OpdReportDto;
import com.springbootexp.dto.PrescriptionDetailsEntityMedicareNew;
import com.springbootexp.dto.PrescriptionDetailsMedicareNewDto;
import com.springbootexp.dto.QuestionnaireLookupDtlDto;
import com.springbootexp.dto.ReportTypeDto;
import com.springbootexp.dto.UserPreferencesEntity;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class CommonFunctoon {
	public OTRequisitionQue getOTRequisitionQue() {
		OTRequisitionQue oTRequisitionQue = new OTRequisitionQue("H51803004139", "A1803000039", "MR. IRFAN", "M",
				"91Y 3D", "APPENDICECTOMY");
		return oTRequisitionQue;
	}

	public List<QuestionnaireLookupDtlDto> getQuestionnaireLookupDtlDtoItemList() {
		List<QuestionnaireLookupDtlDto> list = new ArrayList<QuestionnaireLookupDtlDto>();
		list.add(new QuestionnaireLookupDtlDto("Associated Medical Problem", 1l, 6l, null, null, getSingleItemList(7)));
		list.add(new QuestionnaireLookupDtlDto("Effort Toleranc", 2l, 6l, null, null, getSingleItemList(2)));
		list.add(new QuestionnaireLookupDtlDto("Pre Operative Hisotry", 2l, 6l, null, null, getSingleItemList(3)));
		list.add(new QuestionnaireLookupDtlDto("Anesthesia Record", 2l, 6l, null, null, getSingleItemList(4)));
		return list;
	}

	public List<QuestionnaireLookupDtlDto> getSingleItemList(int no) {
		List<QuestionnaireLookupDtlDto> list = new ArrayList<QuestionnaireLookupDtlDto>();
		if (no == 7) {
			list.add(new QuestionnaireLookupDtlDto("CVS", 1l, 1l, "ok", "ok"));
			list.add(new QuestionnaireLookupDtlDto("RESP", 2l, 1l, "ok", "ok"));
			list.add(new QuestionnaireLookupDtlDto("Endocrine", 3l, 1l, "ok", "ok"));
			list.add(new QuestionnaireLookupDtlDto("RESHaemopoieticP", 4l, 1l, "ok", "ok"));
			list.add(new QuestionnaireLookupDtlDto("Gastro/Genitourinary", 5l, 1l, "ok", "ok"));
			list.add(new QuestionnaireLookupDtlDto("Neuro/Masculoskeletal", 6l, 1l, "ok", "ok"));
			list.add(new QuestionnaireLookupDtlDto("Others", 7l, 1l, "ok", "ok"));
			List<QuestionnaireLookupDtlDto> list1 = new ArrayList<QuestionnaireLookupDtlDto>();
			list1.add(new QuestionnaireLookupDtlDto("Machine", 1l, 5l, null, "true"));
			list1.add(new QuestionnaireLookupDtlDto("Airway And Teeth", 2l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Suction", 3l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Consent", 4l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Scanwenger", 5l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Mood Available", 6l, 5l, null, "true"));
			list1.add(new QuestionnaireLookupDtlDto("Last Solid", 7l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Last Fluid", 8l, 5l, null, "true"));
			list.add(new QuestionnaireLookupDtlDto("Any steroid in Past 6 months", 8l, 5l, "yes", "yes", list1));
		} else if (no == 2) {
			list.add(new QuestionnaireLookupDtlDto("For Level Ground", 1l, 1l, "ok", "ok"));
			list.add(new QuestionnaireLookupDtlDto("For Stairs", 2l, 1l, "ok", "ok"));
		} else if (no == 3) {
			List<QuestionnaireLookupDtlDto> list2 = new ArrayList<QuestionnaireLookupDtlDto>();
			list2.add(new QuestionnaireLookupDtlDto("yes", 1l, 4l, null, null));
			list2.add(new QuestionnaireLookupDtlDto("no", 2l, 4l, null, null));
			list.add(new QuestionnaireLookupDtlDto("Do You Smoke", 1l, 4l, "yes", "yes", list2));

			List<QuestionnaireLookupDtlDto> list3 = new ArrayList<QuestionnaireLookupDtlDto>();
			list3.add(new QuestionnaireLookupDtlDto("yes", 1l, 4l, null, null));
			list3.add(new QuestionnaireLookupDtlDto("no", 2l, 4l, null, null));
			list.add(new QuestionnaireLookupDtlDto("Do You Regularly Consume Alcohol", 1l, 4l, null, null, list3));

			List<QuestionnaireLookupDtlDto> list4 = new ArrayList<QuestionnaireLookupDtlDto>();
			list4.add(new QuestionnaireLookupDtlDto("yes", 1l, 4l, null, null));
			list4.add(new QuestionnaireLookupDtlDto("no", 2l, 4l, "yes", "yes"));
			list.add(new QuestionnaireLookupDtlDto("Any past Serial Illness/Hospitalization", 1l, 4l, null, null,
					list4));

			List<QuestionnaireLookupDtlDto> list5 = new ArrayList<QuestionnaireLookupDtlDto>();
			list5.add(new QuestionnaireLookupDtlDto("yes", 1l, 4l, null, null));
			list5.add(new QuestionnaireLookupDtlDto("no", 2l, 4l, null, null));
			list.add(new QuestionnaireLookupDtlDto("Do You Regularly Consume Alcohol", 1l, 4l, null, null, list5));

			List<QuestionnaireLookupDtlDto> list6 = new ArrayList<QuestionnaireLookupDtlDto>();
			list6.add(new QuestionnaireLookupDtlDto("yes", 1l, 4l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("no", 2l, 4l, null, null));
			list.add(new QuestionnaireLookupDtlDto("Any Recent Changed in Health Status", 1l, 4l, null, "no", list6));

			List<QuestionnaireLookupDtlDto> list7 = new ArrayList<QuestionnaireLookupDtlDto>();
			list7.add(new QuestionnaireLookupDtlDto("yes", 1l, 4l, null, null));
			list7.add(new QuestionnaireLookupDtlDto("no", 2l, 4l, null, null));
			list.add(new QuestionnaireLookupDtlDto("Any steroid in Past 6 months", 1l, 4l, "yes", "yes", list7));

//			list.add(new QuestionnaireLookupDtlDto("For Stairs", 2l, 1l, "ok", "ok"));
		} else if (no == 4) {

			list.add(new QuestionnaireLookupDtlDto("Surgeon", 1l, 1l, "ok", "ok"));

			list.add(new QuestionnaireLookupDtlDto("Date:", 2l, 8l, null, null));
			list.add(new QuestionnaireLookupDtlDto("Operatio:", 3l, 1l, null, "2021-04-22T17:00:00.656Z"));
			list.add(new QuestionnaireLookupDtlDto("Entry Time:", 4l, 9l, null, null));

			List<QuestionnaireLookupDtlDto> list1 = new ArrayList<QuestionnaireLookupDtlDto>();
			list1.add(new QuestionnaireLookupDtlDto("Machine", 1l, 5l, null, "true"));
			list1.add(new QuestionnaireLookupDtlDto("Airway And Teeth", 2l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Suction", 3l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Consent", 4l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Scanwenger", 5l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Mood Available", 6l, 5l, null, "true"));
			list1.add(new QuestionnaireLookupDtlDto("Last Solid", 7l, 5l, null, null));
			list1.add(new QuestionnaireLookupDtlDto("Last Fluid", 8l, 5l, null, "true"));
			list.add(new QuestionnaireLookupDtlDto("Any steroid in Past 6 months", 4l, 5l, "yes", "yes", list1));

			List<QuestionnaireLookupDtlDto> list2 = new ArrayList<QuestionnaireLookupDtlDto>();
			list2.add(new QuestionnaireLookupDtlDto("Heated Humidifier", 1l, 5l, null, null));
			list2.add(new QuestionnaireLookupDtlDto("NG Tube", 2l, 5l, null, null));
			list2.add(new QuestionnaireLookupDtlDto("Urinary Catheter", 3l, 5l, null, null));
			list2.add(new QuestionnaireLookupDtlDto("Warming Blanket", 4l, 5l, null, null));
			list2.add(new QuestionnaireLookupDtlDto("Rapid Fluid Infusor", 5l, 5l, null, null));
			list2.add(new QuestionnaireLookupDtlDto("Warming mattress", 6l, 5l, null, null));
			list2.add(new QuestionnaireLookupDtlDto("Others", 7l, 5l, null, null));

			list.add(new QuestionnaireLookupDtlDto("Additional Equipment", 5l, 5l, "yes", "yes", list2));

			List<QuestionnaireLookupDtlDto> list3 = new ArrayList<QuestionnaireLookupDtlDto>();
			list3.add(new QuestionnaireLookupDtlDto("Supine", 1l, 5l, null, null));
			list3.add(new QuestionnaireLookupDtlDto("Lithotomy", 2l, 5l, null, null));
			list3.add(new QuestionnaireLookupDtlDto("Prone", 3l, 5l, null, null));
			list3.add(new QuestionnaireLookupDtlDto("Literal", 4l, 5l, null, null));
			list3.add(new QuestionnaireLookupDtlDto("Others", 5l, 5l, null, null));
//			list3.add(new QuestionnaireLookupDtlDto("Mood Available", 6l, 5l,  null, null));
//			list3.add(new QuestionnaireLookupDtlDto("Last Solid", 7l, 5l, null, null));
//			list3.add(new QuestionnaireLookupDtlDto("Last Fluid", 8l, 5l,  null, null));
			list.add(new QuestionnaireLookupDtlDto("POSITION", 6l, 5l, "yes", "yes", list3));

			List<QuestionnaireLookupDtlDto> list4 = new ArrayList<QuestionnaireLookupDtlDto>();
			list4.add(new QuestionnaireLookupDtlDto("At Side", 1l, 5l, null, null));
			list4.add(new QuestionnaireLookupDtlDto("ArmBoard", 2l, 5l, null, null));
//			list4.add(new QuestionnaireLookupDtlDto("Suction", 3l, 5l, null, null));
//			list4.add(new QuestionnaireLookupDtlDto("Consent", 4l, 5l,  null, null));
//			list4.add(new QuestionnaireLookupDtlDto("Scanwenger", 5l, 5l, null, null));
//			list4.add(new QuestionnaireLookupDtlDto("Mood Available", 6l, 5l,  null, null));
//			list4.add(new QuestionnaireLookupDtlDto("Last Solid", 7l, 5l, null, null));
//			list4.add(new QuestionnaireLookupDtlDto("Last Fluid", 8l, 5l,  null, null));
			list.add(new QuestionnaireLookupDtlDto("L ARMS R", 7l, 5l, "yes", "yes", list4));

			List<QuestionnaireLookupDtlDto> list5 = new ArrayList<QuestionnaireLookupDtlDto>();
			list5.add(new QuestionnaireLookupDtlDto("Tap/ Tegaderm", 1l, 5l, null, null));
			list5.add(new QuestionnaireLookupDtlDto("Eyes Drops/Gauze", 2l, 5l, null, null));
//			list5.add(new QuestionnaireLookupDtlDto("Suction", 3l, 5l, null, null));
//			list5.add(new QuestionnaireLookupDtlDto("Consent", 4l, 5l,  null, null));
//			list5.add(new QuestionnaireLookupDtlDto("Scanwenger", 5l, 5l, null, null));
//			list5.add(new QuestionnaireLookupDtlDto("Mood Available", 6l, 5l,  null, null));
//			list5.add(new QuestionnaireLookupDtlDto("Last Solid", 7l, 5l, null, null));
//			list5.add(new QuestionnaireLookupDtlDto("Last Fluid", 8l, 5l,  null, null));
			list.add(new QuestionnaireLookupDtlDto("EYES", 8l, 5l, "yes", "yes", list5));

			List<QuestionnaireLookupDtlDto> list6 = new ArrayList<QuestionnaireLookupDtlDto>();
			list6.add(new QuestionnaireLookupDtlDto("Asleep", 1l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("Fibreoptic", 2l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("Awake", 3l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("In Situ", 4l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("Oral", 5l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("Tracheo", 6l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("Nasal L/R", 7l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("Difficult Airway", 8l, 5l, null, null));
			list6.add(new QuestionnaireLookupDtlDto("Preoxgenate", 8l, 5l, null, null));
			list.add(new QuestionnaireLookupDtlDto("Intubation", 9l, 5l, "yes", "yes", list6));

			List<QuestionnaireLookupDtlDto> list7 = new ArrayList<QuestionnaireLookupDtlDto>();
			list7.add(new QuestionnaireLookupDtlDto("Spont/Assistend", 1l, 5l, null, null));
			list7.add(new QuestionnaireLookupDtlDto("Vol/Press Controlled", 2l, 5l, null, null));
			list7.add(new QuestionnaireLookupDtlDto("HFV/Let ventilation", 3l, 5l, null, null));
			list7.add(new QuestionnaireLookupDtlDto("One Lung Ventilation", 4l, 5l, null, null));
			list7.add(new QuestionnaireLookupDtlDto("Others", 5l, 5l, null, null));
			list7.add(new QuestionnaireLookupDtlDto("Ventilation", 6l, 5l, null, null));
			list7.add(new QuestionnaireLookupDtlDto("Pack:Out", 7l, 5l, null, null));

			list.add(new QuestionnaireLookupDtlDto("Ventilation", 10l, 5l, "yes", "yes", list7));

			List<QuestionnaireLookupDtlDto> list8 = new ArrayList<QuestionnaireLookupDtlDto>();
			list8.add(new QuestionnaireLookupDtlDto("Circle", 1l, 5l, null, null));
			list8.add(new QuestionnaireLookupDtlDto("Brains", 2l, 5l, null, null));
			list8.add(new QuestionnaireLookupDtlDto("T-Place", 3l, 5l, null, null));
			list8.add(new QuestionnaireLookupDtlDto("O2Mask", 4l, 5l, null, null));
			list8.add(new QuestionnaireLookupDtlDto("Nasal", 5l, 5l, null, null));
			list8.add(new QuestionnaireLookupDtlDto("Others", 6l, 5l, null, null));

			list.add(new QuestionnaireLookupDtlDto("Breathign System", 11l, 5l, "yes", "yes", list8));
		}

//		list.add(new QuestionnaireLookupDtlDto("Endocrine", 3l, 1l, "ok", "ok"));
//		list.add(new QuestionnaireLookupDtlDto("RESHaemopoieticP", 4l, 1l, "ok", "ok"));
//		list.add(new QuestionnaireLookupDtlDto("Gastro/Genitourinary", 5l, 1l, "ok", "ok"));
//		list.add(new QuestionnaireLookupDtlDto("Neuro/Masculoskeletal", 6l, 1l, "ok", "ok"));
//		list.add(new QuestionnaireLookupDtlDto("Others", 7l, 1l, "ok", "ok"));

		return list;
	}

	@SuppressWarnings({ "null", "unused" })
	public List<NsInvoice> getNsInvoiceItemList(boolean tr) {
		List<NsInvoice> list = new ArrayList<NsInvoice>();
		if (tr) {
			list.add(new NsInvoice("0512", "CBC", new Date(), 500.00, null,450.00));
			list.add(new NsInvoice("0513", "ESR (Tube)", new Date(), 25.00, null,0.00));
			list.add(new NsInvoice("0514", "VACUETTE VIOLET 2/3 ML", new Date(), 15.00, null,0.00));
			list.add(new NsInvoice("0515", "VACUETTE NEEDLE ", new Date(), 15.00, null,0.00));

		}else {
			list.add(new NsInvoice("PR0512", "Abetis Plus", new Date(), 15.00, 30l,60.00));
			list.add(new NsInvoice("PR0513", "Ace", new Date(), 8.06 , 20l,8.06*20l));
			list.add(new NsInvoice("PR0514", "Daporex ", new Date(), 15.00, 1l,15.00));
			list.add(new NsInvoice("PR0515", "Famotidine 20mg & 40mg/tablet", new Date(), 25.00, 1l,15.00));
			
		}
		return list;
		
	}

	
	
	

	public List<?> getReportTypeDtoDataList() {
		List<ReportTypeDto> list = new ArrayList<ReportTypeDto>();
		list.add(new ReportTypeDto(1l, "Jasprsoft v 6.4.0", "Discharge chertificate", "PDF","report design layout render by user preference, using List element, data transfer master dataset to child, child to master, using multi-design Format."));
		
		list.add(new ReportTypeDto(2l, "Jasprsoft v 6.4.0", "Prescription Report", "PDF","report design layout render by user preference, using List element, data transfer master dataset to child, child to master, using multi-design Format."));
		
		
		list.add(new ReportTypeDto(3l, "Jasprsoft v 6.4.0", "Sales Detailes Report", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(4l, "Jasprsoft v 6.4.0", "Item wise Sales Detailes Report", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(5l, "Jasprsoft v 6.4.0", "Sales Detailes Report", "XLSX","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(6l, "Jasprsoft v 6.4.0", "Item wise Sales Detailes Report", "XLSX","using subreport, using group function in report design"));
		
		
		
		list.add(new ReportTypeDto(7l, "Birt Reporting", "CHEMOTHERAPY ORDER", "PDF","using Grid, table element, using group function in report design, create  multi dataset"));
		list.add(new ReportTypeDto(8l, "Birt Reporting", "Chemotherapy and Appointment", "PDF","using Grid, table element, using group function in report design, create  multi dataset"));
		list.add(new ReportTypeDto(9l, "Birt Reporting", "Discharge chertificate", "PDF","using multi-design Format && Grid, table element, using group function in report design, create  multi dataset"));
		
//		list.add(new ReportTypeDto(9l, "Jasprsoft v 6.4.0", "Opd Appoinmentreport Details", "PDF"));
		list.add(new ReportTypeDto(10l, "Jasprsoft v 6.4.0", "Opd Appoinmentreport Details", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(11l, "Jasprsoft v 6.4.0", "Bill Collection", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(12l, "Jasprsoft v 6.4.0", "Bill Collection details", "PDF","using subreport, using group function in report design"));
		
		list.add(new ReportTypeDto(13l, "Jasprsoft v 6.4.0", "Bill Referral", "PDF","using subreport, using group function in report design,add report summary"));
//		list.add(new ReportTypeDto(14l, "Jasprsoft v 6.4.0", "Specialist Fees and Operation Charge Monthly Summary", "PDF"));
		list.add(new ReportTypeDto(15l, "Jasprsoft v 6.4.0", "Cabin / ICU Cabin / Ventilate Charge ", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(16l, "Jasprsoft v 6.4.0", "Specialist Fees and Operation Charge Monthly", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(17l, "Jasprsoft v 6.4.0", "Hospital Stoppage & IPD Details", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(18l, "Jasprsoft v 6.4.0", "Invoice", "PDF","using list element"));
		list.add(new ReportTypeDto(19l, "Jasprsoft v 6.4.0", "Patient Appointment Acknowledgement", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(20l, "Jasprsoft v 6.4.0", "HIGH RISK CONSENT FOR SURGERY", "PDF","using subreport, using group function in report design"));
		list.add(new ReportTypeDto(21l, "Jasprsoft v 6.4.0", "CONSENT FOR ANESTHESIA", "PDF","report  design some static data"));
		list.add(new ReportTypeDto(22l, "Jasprsoft v 6.4.0", "OT Questionary Report", "PDF","using horizontal list, and multi-dynamic design format"));
		list.add(new ReportTypeDto(23l, "Jasprsoft v 6.4.0", "Item Booking Report", "PDF","sing subreport, using group function in report design"));
		list.add(new ReportTypeDto(24l, "Jasprsoft v 6.4.0", "Health Card", "PDF","Card dising"));
		list.add(new ReportTypeDto(25l, "Jasprsoft v 6.4.0", "Employ ID Card", "PDF","Card dising"));
		list.add(new ReportTypeDto(26l, "Jasprsoft v 6.4.0", "Barcode", "PDF","Barcode designe"));
		list.add(new ReportTypeDto(27l, "Jasprsoft v 6.4.0", "Pos Invoice", "PDF","Using list element"));
		list.add(new ReportTypeDto(28l, "Birt Reporting", "Drug Sticker", "PDF","Using table element"));
		list.add(new ReportTypeDto(29l, "Jasprsoft v 6.4.0", "CrossTab Report", "PDF","Using Crosstab"));
		
//		list.add(new ReportTypeDto(24l, "Jasprsoft v 6.4.0", "Item Booking Report", "PDF"));
//		list.add(new ReportTypeDto(11l, "Jasprsoft v 6.4.0", "Discharge chertificate","PDF"));
//		list.add(new ReportTypeDto(12l, "Jasprsoft v 6.4.0", "Discharge chertificate"));
//		list.add(new ReportTypeDto(13l, "Jasprsoft v 6.4.0", "Discharge chertificate"));
		return list;

	}

	public List<OpdReportDto> getOpdreportDto(int type) {
		List<OpdReportDto> list = new ArrayList<OpdReportDto>();
		if (type == 1) {

			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(2l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abdur Rohim", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
			list.add(new OpdReportDto(1l, new Date(), "fajle rabbi", "01824565156", "Male", new Date(), "AP1234556",
					"51Y 3M 25D", "Morning", "Dr Abul Kalam", "fajle", "HN12233344"));
		} else if (type == 2) {
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
			list.add(new OpdReportDto("Dr Abul Kalam", "MBBS , FCPS", 49l, 0l, 50l, 99l, "Medicine"));
			list.add(new OpdReportDto("Dr Anower Ali", "MBBS, FCPS (Radiotherapy)", 20l, 30l, 50l, 100l, "Oncology"));
		}
		return list;
	}

	public List<DisMedicineDtlEntity> getmedDtl(int val) {
		List<DisMedicineDtlEntity> list = new ArrayList<DisMedicineDtlEntity>();
		list.add(new DisMedicineDtlEntity("0+0+1", "5", "continue", "After Meal", 1l, 5l));
		list.add(new DisMedicineDtlEntity("0+0+1", "5", "continue", "Before Meal", 1l, 5l));
		return list;

	}

	public List<BillCollectionDto> getBillCollectionDtl() {
		List<BillCollectionDto> list = new ArrayList<BillCollectionDto>();
		list.add(new BillCollectionDto(1l, "A111", new Date(), "fajle", 1l, null, new BigDecimal(300.00d), null, null,
				null, null));
		list.add(new BillCollectionDto(1l, "A111", new Date(), "fajle", 1l, null, new BigDecimal(300.00d), null, null,
				null, null));
		list.add(new BillCollectionDto(1l, "A111", new Date(), "fajle", 1l, null, new BigDecimal(300.00d), null, null,
				null, null));

		list.add(new BillCollectionDto(2l, "A222", new Date(), "Most Muktara Begum", 1l, null, new BigDecimal(5566.00d),
				null, null, null, null));
		list.add(new BillCollectionDto(2l, "A222", new Date(), "Most Muktara Begum", 3l, null, new BigDecimal(5009.00d),
				1l, null, null, null));
		list.add(new BillCollectionDto(2l, "A222", new Date(), "Most Muktara Begum", 2l, null, new BigDecimal(566.00d),
				null, null, null, null));
		list.add(new BillCollectionDto(2l, "A222", new Date(), "Most Muktara Begum", null, null,
				new BigDecimal(500.00d), 5l, null, null, null));
		list.add(new BillCollectionDto(2l, "A222", new Date(), "Most Muktara Begum", null, null,
				new BigDecimal(500.00d), 6l, null, null, null));

		list.add(new BillCollectionDto(2l, "A333", new Date(), "Md.Aminul Islam", 1l, null, new BigDecimal(5566.00d),
				null, null, null, null));
		list.add(new BillCollectionDto(2l, "A333", new Date(), "Md.Aminul Islam", null, null, new BigDecimal(0.00d), 6l,
				null, null, null));
		list.add(new BillCollectionDto(2l, "A333", new Date(), "Md.Aminul Islam", 3l, null, new BigDecimal(0.00d), null,
				null, null, null));
		list.add(new BillCollectionDto(2l, "A333", new Date(), "Md.Aminul Islam", 2l, null, new BigDecimal(566.00d),
				null, null, null, null));
		return list;

	}

	LocalDate today = LocalDate.now();

	

	public <T> DataTableResults<T> dataTableResults(DataTableRequest<T> dtr, Long pFilterCount, List<T> pList,
			Long totalRecord) {

		DataTableResults<T> dataTableResult = new DataTableResults<T>();
		dataTableResult.setDraw(dtr.getDraw());

		if (dtr.isGlobalSearch()) {
			dataTableResult.setData(pList);
		} else {
			dataTableResult.setData(pList);
		}

		if ((pList != null && pList.size() > 0)) {

			dataTableResult.setRecordsTotal(String.valueOf(totalRecord));

			if (dtr.getPaginationRequest().isFilterByEmpty()) {
				dataTableResult.setRecordsFiltered(String.valueOf(totalRecord));

			} else {
				dataTableResult.setRecordsFiltered(Long.toString(pFilterCount));
			}

		} else {
			dataTableResult.setRecordsTotal("0");
			dataTableResult.setRecordsFiltered("0");
		}

		return dataTableResult;

	}
	
	public <T> T objectMapperReadValue(String content, Class<T> valueType) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {

			return objectMapper.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
					.readValue(content, valueType);

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		// return null;
	}
	
	public static String getJason(String jason) {
		String file=getResoucePath("/jsonFile") + "/"+jason;
		String strJason=null;
		try {
			Object obj = new JSONParser().parse(new FileReader(file));
			strJason = obj.toString();
		} catch (IOException | org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strJason;
	}
	public static String getResoucePath(String filePath) {
		Resource resource = new ClassPathResource(filePath);
		try {
			return resource.getFile().getAbsolutePath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
