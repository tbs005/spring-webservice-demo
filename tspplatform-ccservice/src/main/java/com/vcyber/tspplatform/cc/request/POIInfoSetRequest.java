package com.vcyber.tspplatform.cc.request;

/**
 * 一键导航结果（POI）下发
 * @author 王炜华
 *
 */
public class POIInfoSetRequest {
	
	/**
	 * 服务名称
	 */
	private String service_name;
	
	/**
	 * 用户id
	 */
	private String cust_id;
	
	/**
	 * POI经度
	 */
	private String longitude;
	
	/**
	 * POI纬度
	 */
	private String latitude;
	
	/**
	 * POI的名称
	 */
	private String name;
	
	/**
	 * POI详细内容
	 */
	private POIContent content;

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public POIContent getContent() {
		return content;
	}

	public void setContent(POIContent content) {
		this.content = content;
	}

}
