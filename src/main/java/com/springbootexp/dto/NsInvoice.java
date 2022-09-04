package com.springbootexp.dto;

import java.util.Date;
import java.util.List;

public class NsInvoice extends CommonDto{
	Long invoiceNo;
	String invoiceId;
	String cfRemarks;
	String barcode;
	Date invoiceDatetime;
	Long regNo;
	Long admissionNo;
	String admissionId;
	Long refDocNo;
	Date reportDelivaryDateTime;
	String remarks;
	String ssCreatorName;
	Long corClientNo;
	Long corClientCardNo;
	Long empNo;
	Long relationNo;
	String repSortNo;
	String hospitalNumber;
	String patientName;
	String age;
	String gender;
	String phoneMobile;
	String ssModifierName;
	String patHis;
	String refDocName;
	Long ssCreatedSession;

	Double itemTotal;
	Double netTotalBill;
	Double discAmt;
	String takaInWord;
	Double payAmt;
	Double totalDue;
	String payMessage;
	String bedName;
	
	
	private String itemId;
	private Long itemNo;
	private Long itemtypeNo;
	private String itemName;
	private Long deliveryStatusNo;
	private Long packageItemFlag;
	private Date reportDeliveryTime;
	private Double itemRate;
	private Double itemPrice;
	private Double itemVat;
	private Double urgentFee;
	private Double serviceCharge;
	private Long itemQty;
	private Double itemRateTotal;
	private Double itemVatTotal;
	private Double urgentFeeTotal;
	private Double serviceChargeTotal;
	private Double advance;
	
	private String email;
	private String webAddress;
	private String cardNo;
	private Boolean cardFlag;
	private Integer opPoint;
	private Integer invPoint;
	private Integer redPoint;
	private Integer totalPoint;
	private String cardId;
	private String softwareByStr;
	private String companyPhone;
	private String branchAddress;
	private String salesNotes;
	private String ssModifier;
	
	private String deliveryStatusName;
	private String consultantName;
	
	
	
	private List <NsInvoice>invoiceReportDtlList;
	public List<NsInvoice> getInvoiceReportPaymentList() {
		return invoiceReportPaymentList;
	}
	public void setInvoiceReportPaymentList(List<NsInvoice> invoiceReportPaymentList) {
		this.invoiceReportPaymentList = invoiceReportPaymentList;
	}
	private List <NsInvoice>invoiceReportPaymentList;
	
	public NsInvoice(String itemId, String itemName, Date reportDeliveryTime, Double itemRate, Long itemQty,Double itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.reportDeliveryTime = reportDeliveryTime;
		this.itemRate = itemRate;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}
	public NsInvoice(String invoiceId, Date invoiceDatetime, String admissionId, Date reportDelivaryDateTime,
			String remarks, String hospitalNumber, String patientName, String age, String gender, String phoneMobile,
			String refDocName,String bedName, Double itemTotal, Double netTotalBill, Double discAmt,Double totalDue,String payMessage,List <NsInvoice>invoiceReportDtlList) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDatetime = invoiceDatetime;
		this.admissionId = admissionId;
		this.reportDelivaryDateTime = reportDelivaryDateTime;
		this.remarks = remarks;
		this.hospitalNumber = hospitalNumber;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.phoneMobile = phoneMobile;
		this.refDocName = refDocName;
		this.bedName=bedName;
		this.itemTotal = itemTotal;
		this.netTotalBill = netTotalBill;
		this.discAmt = discAmt;
		this.totalDue=totalDue;
		this.payMessage=payMessage;
		this.invoiceReportDtlList=invoiceReportDtlList;
	}
	public List<NsInvoice> getInvoiceReportDtlList() {
		return invoiceReportDtlList;
	}
	public void setInvoiceReportDtlList(List<NsInvoice> invoiceReportDtlList) {
		this.invoiceReportDtlList = invoiceReportDtlList;
	}
	public Long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getCfRemarks() {
		return cfRemarks;
	}
	public void setCfRemarks(String cfRemarks) {
		this.cfRemarks = cfRemarks;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public Date getInvoiceDatetime() {
		return invoiceDatetime;
	}
	public void setInvoiceDatetime(Date invoiceDatetime) {
		this.invoiceDatetime = invoiceDatetime;
	}
	public Long getRegNo() {
		return regNo;
	}
	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}
	public Long getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}
	public String getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	public Long getRefDocNo() {
		return refDocNo;
	}
	public void setRefDocNo(Long refDocNo) {
		this.refDocNo = refDocNo;
	}
	public Date getReportDelivaryDateTime() {
		return reportDelivaryDateTime;
	}
	public void setReportDelivaryDateTime(Date reportDelivaryDateTime) {
		this.reportDelivaryDateTime = reportDelivaryDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSsCreatorName() {
		return ssCreatorName;
	}
	public void setSsCreatorName(String ssCreatorName) {
		this.ssCreatorName = ssCreatorName;
	}
	public Long getCorClientNo() {
		return corClientNo;
	}
	public void setCorClientNo(Long corClientNo) {
		this.corClientNo = corClientNo;
	}
	public Long getCorClientCardNo() {
		return corClientCardNo;
	}
	public void setCorClientCardNo(Long corClientCardNo) {
		this.corClientCardNo = corClientCardNo;
	}
	public Long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}
	public Long getRelationNo() {
		return relationNo;
	}
	public void setRelationNo(Long relationNo) {
		this.relationNo = relationNo;
	}
	public String getRepSortNo() {
		return repSortNo;
	}
	public void setRepSortNo(String repSortNo) {
		this.repSortNo = repSortNo;
	}
	public String getHospitalNumber() {
		return hospitalNumber;
	}
	public void setHospitalNumber(String hospitalNumber) {
		this.hospitalNumber = hospitalNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneMobile() {
		return phoneMobile;
	}
	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}
	public String getSsModifierName() {
		return ssModifierName;
	}
	public void setSsModifierName(String ssModifierName) {
		this.ssModifierName = ssModifierName;
	}
	public String getPatHis() {
		return patHis;
	}
	public void setPatHis(String patHis) {
		this.patHis = patHis;
	}
	public String getRefDocName() {
		return refDocName;
	}
	public void setRefDocName(String refDocName) {
		this.refDocName = refDocName;
	}
	public Long getSsCreatedSession() {
		return ssCreatedSession;
	}
	public void setSsCreatedSession(Long ssCreatedSession) {
		this.ssCreatedSession = ssCreatedSession;
	}
	public Double getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(Double itemTotal) {
		this.itemTotal = itemTotal;
	}
	public Double getNetTotalBill() {
		return netTotalBill;
	}
	public void setNetTotalBill(Double netTotalBill) {
		this.netTotalBill = netTotalBill;
	}
	public Double getDiscAmt() {
		return discAmt;
	}
	public void setDiscAmt(Double discAmt) {
		this.discAmt = discAmt;
	}
	public String getTakaInWord() {
		return takaInWord;
	}
	public void setTakaInWord(String takaInWord) {
		this.takaInWord = takaInWord;
	}
	public Double getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(Double payAmt) {
		this.payAmt = payAmt;
	}
	public Double getTotalDue() {
		return totalDue;
	}
	public void setTotalDue(Double totalDue) {
		this.totalDue = totalDue;
	}
	public String getPayMessage() {
		return payMessage;
	}
	public void setPayMessage(String payMessage) {
		this.payMessage = payMessage;
	}
	public String getBedName() {
		return bedName;
	}
	public void setBedName(String bedName) {
		this.bedName = bedName;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public Long getItemNo() {
		return itemNo;
	}
	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}
	public Long getItemtypeNo() {
		return itemtypeNo;
	}
	public void setItemtypeNo(Long itemtypeNo) {
		this.itemtypeNo = itemtypeNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Long getDeliveryStatusNo() {
		return deliveryStatusNo;
	}
	public void setDeliveryStatusNo(Long deliveryStatusNo) {
		this.deliveryStatusNo = deliveryStatusNo;
	}
	public Long getPackageItemFlag() {
		return packageItemFlag;
	}
	public void setPackageItemFlag(Long packageItemFlag) {
		this.packageItemFlag = packageItemFlag;
	}
	public Date getReportDeliveryTime() {
		return reportDeliveryTime;
	}
	public void setReportDeliveryTime(Date reportDeliveryTime) {
		this.reportDeliveryTime = reportDeliveryTime;
	}
	public Double getItemRate() {
		return itemRate;
	}
	public void setItemRate(Double itemRate) {
		this.itemRate = itemRate;
	}
	public Double getItemVat() {
		return itemVat;
	}
	public void setItemVat(Double itemVat) {
		this.itemVat = itemVat;
	}
	public Double getUrgentFee() {
		return urgentFee;
	}
	public void setUrgentFee(Double urgentFee) {
		this.urgentFee = urgentFee;
	}
	public Double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public Long getItemQty() {
		return itemQty;
	}
	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}
	public Double getItemRateTotal() {
		return itemRateTotal;
	}
	public void setItemRateTotal(Double itemRateTotal) {
		this.itemRateTotal = itemRateTotal;
	}
	public Double getItemVatTotal() {
		return itemVatTotal;
	}
	public void setItemVatTotal(Double itemVatTotal) {
		this.itemVatTotal = itemVatTotal;
	}
	public Double getUrgentFeeTotal() {
		return urgentFeeTotal;
	}
	public void setUrgentFeeTotal(Double urgentFeeTotal) {
		this.urgentFeeTotal = urgentFeeTotal;
	}
	public Double getServiceChargeTotal() {
		return serviceChargeTotal;
	}
	public void setServiceChargeTotal(Double serviceChargeTotal) {
		this.serviceChargeTotal = serviceChargeTotal;
	}
	public Double getAdvance() {
		return advance;
	}
	public void setAdvance(Double advance) {
		this.advance = advance;
	}
	public String getSsModifier() {
		return ssModifier;
	}
	public void setSsModifier(String ssModifier) {
		this.ssModifier = ssModifier;
	}
	public String getDeliveryStatusName() {
		return deliveryStatusName;
	}
	public void setDeliveryStatusName(String deliveryStatusName) {
		this.deliveryStatusName = deliveryStatusName;
	}
	public String getConsultantName() {
		return consultantName;
	}
	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public Boolean getCardFlag() {
		return cardFlag;
	}
	public void setCardFlag(Boolean cardFlag) {
		this.cardFlag = true;
	}
	public Integer getOpPoint() {
		return opPoint;
	}
	public void setOpPoint(Integer opPoint) {
		this.opPoint = opPoint;
	}
	public Integer getInvPoint() {
		return invPoint;
	}
	public void setInvPoint(Integer invPoint) {
		this.invPoint = invPoint;
	}
	public Integer getRedPoint() {
		return redPoint;
	}
	public void setRedPoint(Integer redPoint) {
		this.redPoint = redPoint;
	}
	public Integer getTotalPoint() {
		return totalPoint;
	}
	public void setTotalPoint(Integer totalPoint) {
		this.totalPoint = totalPoint;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getSoftwareByStr() {
		return softwareByStr;
	}
	public void setSoftwareByStr(String softwareByStr) {
		this.softwareByStr = softwareByStr;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	public String getSalesNotes() {
		return salesNotes;
	}
	public void setSalesNotes(String salesNotes) {
		this.salesNotes = salesNotes;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
