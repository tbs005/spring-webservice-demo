package com.vcyber.tspplatform.cc.request;

/**
 * 车辆位置请求
 * @author 王炜华
 *
 */
public class VehiclePosRequest {

	/**
	 * 服务名称
	 */
	private String service_name;
	
	/**
	 * 用户id
	 */
	private String cust_id;

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
}
