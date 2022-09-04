package com.springbootexp.dto;

import java.util.Date;
import java.util.List;

public class OpdInvoiceDto {
	
		Long rowId;
		Long invoiceNo;
		String invoiceId;
		String barcode;
		Date invoiceDateTime;
		Long regNo;
		Long admissionNo;
		String admissionId;
		Long refDocNo;
		String refDocName;
		Date reortDeliveryDateTime;
		String remarks;
		Long ssCreator;
		String ssCreatorName;
		Long corClientNo;
		Long corClientCardNo;
		Long empNo;
		Long relationNo;
		Long reportSortNo;
		String hospitalNumber;
		String patientname;
		String age;
		String gender;
		String phoneMobile;
		String itemId;
		Long itemNo;
		Long itemTypeNo;
		String itemName;
		Long deliveryStatusNo;

		String deliveryStatusName;

		Long packageItemFlag;
		Date reportDeliveryTime;
		Date reportDeliveryTimeItemWise;
		Double itemRate;
		Double itemVat;
		Double urgentFee;
		Double serviceCharge;
		Long itemQty;
		Double itemRateTotal;
		Double itemVatTotal;
		Double urgentFeeTotal;
		Double serviceChargeTotal;
		Double advance;
		Double payAmt;
		Double discAmt;

		String address;
		String nokName;
		String nokAddress;
		String nokRelation;
		String personalNumber;

		Double itemTotal;
		Double totalDue;

		Double netTotalBill;
		String takaInWord;
		String payMessage;
		String preparedBy;
		String modifiedBy;

		Long refundAmt;
		Long DiscAmt;
		Long discRefund;

		Double discount;

		String printHeader;

		List<OpdInvoiceDto> itemList;
//		List<OpdInvoiceDiscountSummeryDto> collectionList;

		// company information
		String companyName;
		String companyAddress;
		String printType;
		String printTypeName;

//	    careOf info
		String careOfName;
		String careOfRelation;
		String careOfAddress;
		// mm
		String salutation;
		String fName;
		String passportNo;
		String nationalId;
		String ticketNo;

	}


