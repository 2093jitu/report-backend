package com.springbootexp.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserWisePresDataDto {
private String vitalListHorizontally;
	
	private int preferencesSerial;
	private String userPreferencesKey;
	private String userPreferencesValue;
	private Integer preferencesShowInReport;
	private Integer preferencesShowInTab;
	private String title;

	private List<PrescriptionAllNotesEntityMedicareNew> reasonForReferralList;
	private List<PrescriptionFinalizeEntityMedicareNew> finalizationList;
	private List<PrescriptionPhysicalClinicalDetailEntityMedicareNew> physicalExamList;
	private List<PrescriptionPhysicalClinicalDetailEntityMedicareNew> historyList;
	private List<PrescriptionDetailsEntityMedicareNew> vitalList; // dataType 53
	private List<PrescriptionDetailsEntityMedicareNew> anthropometryList; // dataType 54
	private List<PrescriptionDetailsEntityMedicareNew> pathologhList; // dataType 1
	private List<PrescriptionDetailsEntityMedicareNew> radiologyList; // dataType 2
	private List<PrescriptionDetailsEntityMedicareNew> packageList; // dataType 63
	private List<PrescriptionDetailsEntityMedicareNew> diagnosisList; // dataType 6
	private List<PrescriptionDetailsEntityMedicareNew> chiefComplainList; // dataType 7
	private List<PrescriptionDetailsEntityMedicareNew> adviceList; // dataType 8
	private List<PrescriptionDetailsEntityMedicareNew> pastIllnessList; // dataType 9
	private List<PrescriptionDetailsEntityMedicareNew> investigationList; // combined pathologyList and radiologyList

	private List<PrescriptionDetailsEntityMedicareNew> disposalList; // dataType 10
	private List<PrescriptionDetailsEntityMedicareNew> referredOPDList; // dataType 11
	private List<PrescriptionDetailsEntityMedicareNew> referralList; // dataType 14
	private List<PrescriptionDetailsEntityMedicareNew> diseaseList; // dataType 24
	private List<PrescriptionDetailsEntityMedicareNew> investigationFindingsList; // dataType 25
	private List<PrescriptionDetailsEntityMedicareNew> referredDoctorList; // dataType 30
	private List<PrescriptionDetailsEntityMedicareNew> clinicalHisotryList; // dataType 32
	private List<PrescriptionDetailsEntityMedicareNew> treatmentList; // dataType 35
	private List<PrescriptionDetailsEntityMedicareNew> dentalFindingsListRight; // dataType 27
	private List<PrescriptionDetailsEntityMedicareNew> dentalFindingsListLeft; // dataType 27
	private List<PrescriptionDetailsEntityMedicareNew> dentalFindingsListAll; // dataType 27
	private List<PrescriptionDetailsEntityMedicareNew> daycareServiceList;// data type 65
	private List<PrescriptionEyeEntityMedicareNew> eyeFindingsList;

	private List<PrescriptionDetailsEntityMedicareNew> dietAdviceList; // dataType 55

	private List<PrescriptionMedicationEntity> patMedicationList; // dataType 4
	private List<PrescriptionDetailsEntityMedicareNew> patClinicalHistoryList; // dataType 9
	private List<PrescriptionDetailsMedicareNewDto> patPhysicalExamList; // dataType 15
	private List<PrescriptionDetailsMedicareNewDto> patHistoryList; // dataType 16
	private List<PrescriptionDetailsEntityMedicareNew> patReferredDoctorList; // dataType 30
	private PrescriptionDetailsEntityMedicareNew patGeneralNote; // dataType 48
	private PrescriptionDetailsEntityMedicareNew patInvestigationNote; // dataType 56
	private PrescriptionDetailsEntityMedicareNew patMedicationNote; // dataType 57
	private List<PrescriptionDetailsMedicareNewDto> patFinalizationOneList; // dataType 58
	private List<PrescriptionDetailsMedicareNewDto> patFinalizationTwoList; // dataType 59
	private List<PrescriptionDetailsMedicareNewDto> patFinalizationThreeList; // dataType 60
	private PrescriptionDetailsEntityMedicareNew patClinicalHistoryNote; // dataType 61

	private boolean printCombine = true;
	private boolean printFinalExam = false;

	private List<PrescriptionMedicineEntity> medicineList;
	private Map<String, Boolean> printPreferenceInfo;

	private Date visitDate;
	private String notes;
	private String dentalTreatment;
	private String generalNotes;

	private String doctorName;
	private String doctorSignature;
	private String doctorDigitalSignature;

	private String relation;

	private PrescriptionDetailsEntityMedicareNew eyeIPD;
	private PrescriptionDetailsEntityMedicareNew eyeRemarks;

	private List<PrescriptionDetailsEntityMedicareNew> eyeAddPowerListLeft;
	private List<PrescriptionDetailsEntityMedicareNew> eyeAddPowerListRight;
	private List<PrescriptionDetailsEntityMedicareNew> eyeGlassTypeList;
	private List<PrescriptionDetailsEntityMedicareNew> eyeGlassUsageTypeList;

	private List<PrescriptionDetailsEntityMedicareNew> physicalTherapyList; // dataType 41
	private List<PrescriptionDetailsEntityMedicareNew> therapeuticExerciseList; // dataType 42
	private List<PrescriptionDetailsEntityMedicareNew> orthosisList; // dataType 43

	private List<PrescriptionDetailsEntityMedicareNew> referredToWardList; // dataType 47
	private List<PrescriptionDetailsEntityMedicareNew> noteList; // dataType 48
	private List<PrescriptionDetailsEntityMedicareNew> planList; // dataType 49
	public String getVitalListHorizontally() {
		return vitalListHorizontally;
	}
	public void setVitalListHorizontally(String vitalListHorizontally) {
		this.vitalListHorizontally = vitalListHorizontally;
	}
	public int getPreferencesSerial() {
		return preferencesSerial;
	}
	public void setPreferencesSerial(int preferencesSerial) {
		this.preferencesSerial = preferencesSerial;
	}
	public String getUserPreferencesKey() {
		return userPreferencesKey;
	}
	public void setUserPreferencesKey(String userPreferencesKey) {
		this.userPreferencesKey = userPreferencesKey;
	}
	public String getUserPreferencesValue() {
		return userPreferencesValue;
	}
	public void setUserPreferencesValue(String userPreferencesValue) {
		this.userPreferencesValue = userPreferencesValue;
	}
	public Integer getPreferencesShowInReport() {
		return preferencesShowInReport;
	}
	public void setPreferencesShowInReport(Integer preferencesShowInReport) {
		this.preferencesShowInReport = preferencesShowInReport;
	}
	public Integer getPreferencesShowInTab() {
		return preferencesShowInTab;
	}
	public void setPreferencesShowInTab(Integer preferencesShowInTab) {
		this.preferencesShowInTab = preferencesShowInTab;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<PrescriptionAllNotesEntityMedicareNew> getReasonForReferralList() {
		return reasonForReferralList;
	}
	public void setReasonForReferralList(List<PrescriptionAllNotesEntityMedicareNew> reasonForReferralList) {
		this.reasonForReferralList = reasonForReferralList;
	}
	public List<PrescriptionFinalizeEntityMedicareNew> getFinalizationList() {
		return finalizationList;
	}
	public void setFinalizationList(List<PrescriptionFinalizeEntityMedicareNew> finalizationList) {
		this.finalizationList = finalizationList;
	}
	public List<PrescriptionPhysicalClinicalDetailEntityMedicareNew> getPhysicalExamList() {
		return physicalExamList;
	}
	public void setPhysicalExamList(List<PrescriptionPhysicalClinicalDetailEntityMedicareNew> physicalExamList) {
		this.physicalExamList = physicalExamList;
	}
	public List<PrescriptionPhysicalClinicalDetailEntityMedicareNew> getHistoryList() {
		return historyList;
	}
	public void setHistoryList(List<PrescriptionPhysicalClinicalDetailEntityMedicareNew> historyList) {
		this.historyList = historyList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getVitalList() {
		return vitalList;
	}
	public void setVitalList(List<PrescriptionDetailsEntityMedicareNew> vitalList) {
		this.vitalList = vitalList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getAnthropometryList() {
		return anthropometryList;
	}
	public void setAnthropometryList(List<PrescriptionDetailsEntityMedicareNew> anthropometryList) {
		this.anthropometryList = anthropometryList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getPathologhList() {
		return pathologhList;
	}
	public void setPathologhList(List<PrescriptionDetailsEntityMedicareNew> pathologhList) {
		this.pathologhList = pathologhList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getRadiologyList() {
		return radiologyList;
	}
	public void setRadiologyList(List<PrescriptionDetailsEntityMedicareNew> radiologyList) {
		this.radiologyList = radiologyList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getPackageList() {
		return packageList;
	}
	public void setPackageList(List<PrescriptionDetailsEntityMedicareNew> packageList) {
		this.packageList = packageList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDiagnosisList() {
		return diagnosisList;
	}
	public void setDiagnosisList(List<PrescriptionDetailsEntityMedicareNew> diagnosisList) {
		this.diagnosisList = diagnosisList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getChiefComplainList() {
		return chiefComplainList;
	}
	public void setChiefComplainList(List<PrescriptionDetailsEntityMedicareNew> chiefComplainList) {
		this.chiefComplainList = chiefComplainList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getAdviceList() {
		return adviceList;
	}
	public void setAdviceList(List<PrescriptionDetailsEntityMedicareNew> adviceList) {
		this.adviceList = adviceList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getPastIllnessList() {
		return pastIllnessList;
	}
	public void setPastIllnessList(List<PrescriptionDetailsEntityMedicareNew> pastIllnessList) {
		this.pastIllnessList = pastIllnessList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getInvestigationList() {
		return investigationList;
	}
	public void setInvestigationList(List<PrescriptionDetailsEntityMedicareNew> investigationList) {
		this.investigationList = investigationList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDisposalList() {
		return disposalList;
	}
	public void setDisposalList(List<PrescriptionDetailsEntityMedicareNew> disposalList) {
		this.disposalList = disposalList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getReferredOPDList() {
		return referredOPDList;
	}
	public void setReferredOPDList(List<PrescriptionDetailsEntityMedicareNew> referredOPDList) {
		this.referredOPDList = referredOPDList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getReferralList() {
		return referralList;
	}
	public void setReferralList(List<PrescriptionDetailsEntityMedicareNew> referralList) {
		this.referralList = referralList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDiseaseList() {
		return diseaseList;
	}
	public void setDiseaseList(List<PrescriptionDetailsEntityMedicareNew> diseaseList) {
		this.diseaseList = diseaseList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getInvestigationFindingsList() {
		return investigationFindingsList;
	}
	public void setInvestigationFindingsList(List<PrescriptionDetailsEntityMedicareNew> investigationFindingsList) {
		this.investigationFindingsList = investigationFindingsList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getReferredDoctorList() {
		return referredDoctorList;
	}
	public void setReferredDoctorList(List<PrescriptionDetailsEntityMedicareNew> referredDoctorList) {
		this.referredDoctorList = referredDoctorList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getClinicalHisotryList() {
		return clinicalHisotryList;
	}
	public void setClinicalHisotryList(List<PrescriptionDetailsEntityMedicareNew> clinicalHisotryList) {
		this.clinicalHisotryList = clinicalHisotryList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getTreatmentList() {
		return treatmentList;
	}
	public void setTreatmentList(List<PrescriptionDetailsEntityMedicareNew> treatmentList) {
		this.treatmentList = treatmentList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDentalFindingsListRight() {
		return dentalFindingsListRight;
	}
	public void setDentalFindingsListRight(List<PrescriptionDetailsEntityMedicareNew> dentalFindingsListRight) {
		this.dentalFindingsListRight = dentalFindingsListRight;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDentalFindingsListLeft() {
		return dentalFindingsListLeft;
	}
	public void setDentalFindingsListLeft(List<PrescriptionDetailsEntityMedicareNew> dentalFindingsListLeft) {
		this.dentalFindingsListLeft = dentalFindingsListLeft;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDentalFindingsListAll() {
		return dentalFindingsListAll;
	}
	public void setDentalFindingsListAll(List<PrescriptionDetailsEntityMedicareNew> dentalFindingsListAll) {
		this.dentalFindingsListAll = dentalFindingsListAll;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDaycareServiceList() {
		return daycareServiceList;
	}
	public void setDaycareServiceList(List<PrescriptionDetailsEntityMedicareNew> daycareServiceList) {
		this.daycareServiceList = daycareServiceList;
	}
	public List<PrescriptionEyeEntityMedicareNew> getEyeFindingsList() {
		return eyeFindingsList;
	}
	public void setEyeFindingsList(List<PrescriptionEyeEntityMedicareNew> eyeFindingsList) {
		this.eyeFindingsList = eyeFindingsList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getDietAdviceList() {
		return dietAdviceList;
	}
	public void setDietAdviceList(List<PrescriptionDetailsEntityMedicareNew> dietAdviceList) {
		this.dietAdviceList = dietAdviceList;
	}
	public List<PrescriptionMedicationEntity> getPatMedicationList() {
		return patMedicationList;
	}
	public void setPatMedicationList(List<PrescriptionMedicationEntity> patMedicationList) {
		this.patMedicationList = patMedicationList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getPatClinicalHistoryList() {
		return patClinicalHistoryList;
	}
	public void setPatClinicalHistoryList(List<PrescriptionDetailsEntityMedicareNew> patClinicalHistoryList) {
		this.patClinicalHistoryList = patClinicalHistoryList;
	}
	public List<PrescriptionDetailsMedicareNewDto> getPatPhysicalExamList() {
		return patPhysicalExamList;
	}
	public void setPatPhysicalExamList(List<PrescriptionDetailsMedicareNewDto> patPhysicalExamList) {
		this.patPhysicalExamList = patPhysicalExamList;
	}
	public List<PrescriptionDetailsMedicareNewDto> getPatHistoryList() {
		return patHistoryList;
	}
	public void setPatHistoryList(List<PrescriptionDetailsMedicareNewDto> patHistoryList) {
		this.patHistoryList = patHistoryList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getPatReferredDoctorList() {
		return patReferredDoctorList;
	}
	public void setPatReferredDoctorList(List<PrescriptionDetailsEntityMedicareNew> patReferredDoctorList) {
		this.patReferredDoctorList = patReferredDoctorList;
	}
	public PrescriptionDetailsEntityMedicareNew getPatGeneralNote() {
		return patGeneralNote;
	}
	public void setPatGeneralNote(PrescriptionDetailsEntityMedicareNew patGeneralNote) {
		this.patGeneralNote = patGeneralNote;
	}
	public PrescriptionDetailsEntityMedicareNew getPatInvestigationNote() {
		return patInvestigationNote;
	}
	public void setPatInvestigationNote(PrescriptionDetailsEntityMedicareNew patInvestigationNote) {
		this.patInvestigationNote = patInvestigationNote;
	}
	public PrescriptionDetailsEntityMedicareNew getPatMedicationNote() {
		return patMedicationNote;
	}
	public void setPatMedicationNote(PrescriptionDetailsEntityMedicareNew patMedicationNote) {
		this.patMedicationNote = patMedicationNote;
	}
	public List<PrescriptionDetailsMedicareNewDto> getPatFinalizationOneList() {
		return patFinalizationOneList;
	}
	public void setPatFinalizationOneList(List<PrescriptionDetailsMedicareNewDto> patFinalizationOneList) {
		this.patFinalizationOneList = patFinalizationOneList;
	}
	public List<PrescriptionDetailsMedicareNewDto> getPatFinalizationTwoList() {
		return patFinalizationTwoList;
	}
	public void setPatFinalizationTwoList(List<PrescriptionDetailsMedicareNewDto> patFinalizationTwoList) {
		this.patFinalizationTwoList = patFinalizationTwoList;
	}
	public List<PrescriptionDetailsMedicareNewDto> getPatFinalizationThreeList() {
		return patFinalizationThreeList;
	}
	public void setPatFinalizationThreeList(List<PrescriptionDetailsMedicareNewDto> patFinalizationThreeList) {
		this.patFinalizationThreeList = patFinalizationThreeList;
	}
	public PrescriptionDetailsEntityMedicareNew getPatClinicalHistoryNote() {
		return patClinicalHistoryNote;
	}
	public void setPatClinicalHistoryNote(PrescriptionDetailsEntityMedicareNew patClinicalHistoryNote) {
		this.patClinicalHistoryNote = patClinicalHistoryNote;
	}
	public boolean isPrintCombine() {
		return printCombine;
	}
	public void setPrintCombine(boolean printCombine) {
		this.printCombine = printCombine;
	}
	public boolean isPrintFinalExam() {
		return printFinalExam;
	}
	public void setPrintFinalExam(boolean printFinalExam) {
		this.printFinalExam = printFinalExam;
	}
	public List<PrescriptionMedicineEntity> getMedicineList() {
		return medicineList;
	}
	public void setMedicineList(List<PrescriptionMedicineEntity> medicineList) {
		this.medicineList = medicineList;
	}
	public Map<String, Boolean> getPrintPreferenceInfo() {
		return printPreferenceInfo;
	}
	public void setPrintPreferenceInfo(Map<String, Boolean> printPreferenceInfo) {
		this.printPreferenceInfo = printPreferenceInfo;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDentalTreatment() {
		return dentalTreatment;
	}
	public void setDentalTreatment(String dentalTreatment) {
		this.dentalTreatment = dentalTreatment;
	}
	public String getGeneralNotes() {
		return generalNotes;
	}
	public void setGeneralNotes(String generalNotes) {
		this.generalNotes = generalNotes;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorSignature() {
		return doctorSignature;
	}
	public void setDoctorSignature(String doctorSignature) {
		this.doctorSignature = doctorSignature;
	}
	public String getDoctorDigitalSignature() {
		return doctorDigitalSignature;
	}
	public void setDoctorDigitalSignature(String doctorDigitalSignature) {
		this.doctorDigitalSignature = doctorDigitalSignature;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public PrescriptionDetailsEntityMedicareNew getEyeIPD() {
		return eyeIPD;
	}
	public void setEyeIPD(PrescriptionDetailsEntityMedicareNew eyeIPD) {
		this.eyeIPD = eyeIPD;
	}
	public PrescriptionDetailsEntityMedicareNew getEyeRemarks() {
		return eyeRemarks;
	}
	public void setEyeRemarks(PrescriptionDetailsEntityMedicareNew eyeRemarks) {
		this.eyeRemarks = eyeRemarks;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getEyeAddPowerListLeft() {
		return eyeAddPowerListLeft;
	}
	public void setEyeAddPowerListLeft(List<PrescriptionDetailsEntityMedicareNew> eyeAddPowerListLeft) {
		this.eyeAddPowerListLeft = eyeAddPowerListLeft;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getEyeAddPowerListRight() {
		return eyeAddPowerListRight;
	}
	public void setEyeAddPowerListRight(List<PrescriptionDetailsEntityMedicareNew> eyeAddPowerListRight) {
		this.eyeAddPowerListRight = eyeAddPowerListRight;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getEyeGlassTypeList() {
		return eyeGlassTypeList;
	}
	public void setEyeGlassTypeList(List<PrescriptionDetailsEntityMedicareNew> eyeGlassTypeList) {
		this.eyeGlassTypeList = eyeGlassTypeList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getEyeGlassUsageTypeList() {
		return eyeGlassUsageTypeList;
	}
	public void setEyeGlassUsageTypeList(List<PrescriptionDetailsEntityMedicareNew> eyeGlassUsageTypeList) {
		this.eyeGlassUsageTypeList = eyeGlassUsageTypeList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getPhysicalTherapyList() {
		return physicalTherapyList;
	}
	public void setPhysicalTherapyList(List<PrescriptionDetailsEntityMedicareNew> physicalTherapyList) {
		this.physicalTherapyList = physicalTherapyList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getTherapeuticExerciseList() {
		return therapeuticExerciseList;
	}
	public void setTherapeuticExerciseList(List<PrescriptionDetailsEntityMedicareNew> therapeuticExerciseList) {
		this.therapeuticExerciseList = therapeuticExerciseList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getOrthosisList() {
		return orthosisList;
	}
	public void setOrthosisList(List<PrescriptionDetailsEntityMedicareNew> orthosisList) {
		this.orthosisList = orthosisList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getReferredToWardList() {
		return referredToWardList;
	}
	public void setReferredToWardList(List<PrescriptionDetailsEntityMedicareNew> referredToWardList) {
		this.referredToWardList = referredToWardList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getNoteList() {
		return noteList;
	}
	public void setNoteList(List<PrescriptionDetailsEntityMedicareNew> noteList) {
		this.noteList = noteList;
	}
	public List<PrescriptionDetailsEntityMedicareNew> getPlanList() {
		return planList;
	}
	public void setPlanList(List<PrescriptionDetailsEntityMedicareNew> planList) {
		this.planList = planList;
	}
	
	
	
	
}
