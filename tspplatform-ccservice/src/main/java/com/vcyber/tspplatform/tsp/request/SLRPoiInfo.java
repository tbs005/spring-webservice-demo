package com.vcyber.tspplatform.tsp.request;
/*
 * @author 李黎明
 * 目的位置信息
 */
public class SLRPoiInfo {
	/*
	 * 位置名称
	 */
	private String pname;
	/*
	 * 经度
	 */
	private String lon;
	/*
	 *纬度
	 */
	private String lat;
	/*
	 *电话
	 */
	private String tel;
	/*
	 * 位置地址
	 */
	private String add;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}	
	

}
