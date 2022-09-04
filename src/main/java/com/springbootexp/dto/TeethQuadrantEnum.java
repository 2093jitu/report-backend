package com.springbootexp.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;

@Getter
public enum TeethQuadrantEnum {

	
	TEETH11(11, false, 1), TEETH12(12, false, 1), TEETH13(13, false, 1), TEETH14(14, false, 1), TEETH15(15, false, 1), TEETH16(16, false, 1), TEETH17(17, false, 1), TEETH18(18, false, 1), 

	TEETH21(21, false, 2), TEETH22(22, false, 2), TEETH23(23, false, 2), TEETH24(24, false, 2), TEETH25(25, false, 2), TEETH26(26, false, 2), TEETH27(27, false, 2), TEETH28(28, false, 2),

	TEETH31(31, false, 3), TEETH32(32, false, 3), TEETH33(33, false, 3), TEETH34(34, false, 3), TEETH35(35, false, 3), TEETH36(36, false, 3), TEETH37(37, false, 3), TEETH38(38, false, 3),

	TEETH41(41, false, 4), TEETH42(42, false, 4), TEETH43(43, false, 4), TEETH44(44, false, 4), TEETH45(45, false, 4), TEETH46(46, false, 4), TEETH47(47, false, 4), TEETH48(48, false, 4),

	TEETH51(51, false, 1), TEETH52(52, false, 1), TEETH53(53, false, 1), TEETH54(54, false, 1), TEETH55(55, false, 1), 

	TEETH61(61, false, 2), TEETH62(62, false, 2), TEETH63(63, false, 2), TEETH64(64, false, 2), TEETH65(65, false, 2), 

	TEETH71(71, false, 3), TEETH72(72, false, 3), TEETH73(73, false, 3), TEETH74(74, false, 3), TEETH75(75, false, 3), 
	
	TEETH81(81, false, 4), TEETH82(82, false, 4), TEETH83(83, false, 4), TEETH84(84, false, 4), TEETH85(85, false, 4); 


	private long key;
	private boolean val;
	private long quadrantHead;

	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	public boolean isVal() {
		return val;
	}

	public void setVal(boolean val) {
		this.val = val;
	}

	public long getQuadrantHead() {
		return quadrantHead;
	}

	public void setQuadrantHead(long quadrantHead) {
		this.quadrantHead = quadrantHead;
	}

	TeethQuadrantEnum(long key, boolean val, long quadrantHead) {
		this.key = key;
		this.val = val;
		this.quadrantHead = quadrantHead;
	}
	
	public static long findHeadNoByKey(long key) {
		for (TeethQuadrantEnum r : TeethQuadrantEnum.values()) {
			if (r.getKey() == key)
				return r.getQuadrantHead();
		}
		return 0;
	}
	
	public static List<Map<String, Object>> getTeethQuadrantList() {
		 
		 List<Map<String, Object>> teethQuadrantMapList = new ArrayList<Map<String, Object>>();
		
		for (TeethQuadrantEnum teethQuadrantEnum : TeethQuadrantEnum.values()) {
			
			Map<String, Object> teethQuadrantMap = new HashMap<String, Object>();
			teethQuadrantMap.put("key", teethQuadrantEnum.getKey());
			teethQuadrantMap.put("val", teethQuadrantEnum.isVal());
			
			teethQuadrantMapList.add(teethQuadrantMap);
		}
		
		return teethQuadrantMapList;		
	}
	
	
	public static  Map<String, Boolean> getTeethQuadrantMap() {
		 

		Map<String, Boolean> masterMap = new HashMap<String,Boolean>();
		
		for (TeethQuadrantEnum teethQuadrantEnum : TeethQuadrantEnum.values()) {
			
		masterMap.put(String.valueOf(teethQuadrantEnum.getKey()), teethQuadrantEnum.isVal());
	} 
		
		return masterMap;
	}
}
