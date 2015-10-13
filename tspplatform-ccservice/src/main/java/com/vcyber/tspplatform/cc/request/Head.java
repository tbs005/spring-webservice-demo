package com.vcyber.tspplatform.cc.request;

/**
 * @author 王炜华
 *
 */
public class Head {

	/**
	 * 品牌厂商的业务类型
	 */
	private String bussiness_id;
	/**
	 * 应用程序请求的服务类型
	 */
	private String services_type;
	/**
	 * CallCenter访问TSP平台账号
	 */
	private String net_account;
	/**
	 * CallCenter访问TSP平台密码
	 */
	private String net_passwd;
	/**
	 * 终端手机号码
	 */
	private String msisdn;
	
	public String getBussiness_id() {
		return bussiness_id;
	}
	public void setBussiness_id(String bussiness_id) {
		this.bussiness_id = bussiness_id;
	}
	public String getServices_type() {
		return services_type;
	}
	public void setServices_type(String services_type) {
		this.services_type = services_type;
	}
	public String getNet_account() {
		return net_account;
	}
	public void setNet_account(String net_account) {
		this.net_account = net_account;
	}
	public String getNet_passwd() {
		return net_passwd;
	}
	public void setNet_passwd(String net_passwd) {
		this.net_passwd = net_passwd;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	




}