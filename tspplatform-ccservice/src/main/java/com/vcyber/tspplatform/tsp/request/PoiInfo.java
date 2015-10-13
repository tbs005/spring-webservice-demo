package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * 目的地信息
 * @author 李黎明
 */
@XStreamAlias("POIINFO")
public class PoiInfo {
	
	/*
	 * 位置名称
	 */
	@XStreamAlias("PNAME")
	private String panme;
	
	/*
	 *经度 
	 */
	@XStreamAlias("LON")
	private String lon;
	
	/*
	 * 纬度
	 */
	@XStreamAlias("LAT")
	private String lat;
	
	/*
	 * 电话
	 */
	@XStreamAlias("TEL")
	private String tel;
	
	/*
	 * 地址
	 */
	@XStreamAlias("ADD")
	private String add;
	
	public String getPanme() {
		return panme;
	}
	public void setPanme(String panme) {
		this.panme = panme;
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
