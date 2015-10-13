package com.vcyber.tspplatform.cc.response;

/**
 * 车辆故障信息
 * @author 王炜华
 *
 */
public class VehicleEmergeInfo {

	/**
	 * 故障编号
	 */
	private String item_code;
	
	/**
	 * 故障中文说明
	 */
	private String item_name;
	
	/**
	 * 故障值
	 */
	private String coll_value;

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getColl_value() {
		return coll_value;
	}

	public void setColl_value(String coll_value) {
		this.coll_value = coll_value;
	}
}
