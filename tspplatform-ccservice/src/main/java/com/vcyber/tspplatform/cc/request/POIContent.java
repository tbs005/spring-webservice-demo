package com.vcyber.tspplatform.cc.request;

/**
 * POI详细内容 
 * @author 王炜华
 *
 */
public class POIContent {

	/**
	 * 行政区代码
	 */
	private String admin_code;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 电话
	 */
	private String telephone;
	
	/**
	 * POI类型
	 */
	private String poi_type;
	
	/**
	 * 来源类型
	 */
	private String from_type;

	public String getAdmin_code() {
		return admin_code;
	}

	public void setAdmin_code(String admin_code) {
		this.admin_code = admin_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPoi_type() {
		return poi_type;
	}

	public void setPoi_type(String poi_type) {
		this.poi_type = poi_type;
	}

	public String getFrom_type() {
		return from_type;
	}

	public void setFrom_type(String from_type) {
		this.from_type = from_type;
	}
	
}
