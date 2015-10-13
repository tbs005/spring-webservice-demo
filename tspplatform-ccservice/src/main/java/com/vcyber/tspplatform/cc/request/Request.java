package com.vcyber.tspplatform.cc.request;

/**
 * 请求head
 * @author 王炜华
 *
 */
public class Request <T>{
	/**
	 * 协议版本
	 */
	private String h_version_id;
	
	/**
	 * 语言
	 */
	private String h_language;
	
	/**
	 * 测试标志
	 */
	private String h_test_flag;
	
	/**
	 * 业务标示
	 */
	private String h_business_id;
	
	/**
	 * 服务名称
	 */
	private String h_service_name;
	
	/**
	 * 服务参数
	 */
	private T h_service_parameter;
	
	/**
	 * 会话标识
	 */
	private String h_session_id;
	
	/**
	 * 请求标识
	 */
	private String h_request_id;
	
	/**
	 * 请求时间
	 */
	private String h_request_time;
	
	
	/**
	 * 请求优先级
	 */
	private String h_priority;
	
	
	/**
	 * 请求时报文长度
	 */
	private String h_package_length;
	
	
	/**
	 * 请求来源
	 */
	private String h_source;
	
	/**
	 * 品牌厂商的业务类型
	 */
	private String business_id;
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
	
	/**
	 * 安防密码
	 */
	private String client_passwd;

	public String getH_version_id() {
		return h_version_id;
	}

	public void setH_version_id(String h_version_id) {
		this.h_version_id = h_version_id;
	}

	public String getH_language() {
		return h_language;
	}

	public void setH_language(String h_language) {
		this.h_language = h_language;
	}

	public String getH_test_flag() {
		return h_test_flag;
	}

	public void setH_test_flag(String h_test_flag) {
		this.h_test_flag = h_test_flag;
	}

	public String getH_business_id() {
		return h_business_id;
	}

	public void setH_business_id(String h_business_id) {
		this.h_business_id = h_business_id;
	}

	public String getH_service_name() {
		return h_service_name;
	}

	public void setH_service_name(String h_service_name) {
		this.h_service_name = h_service_name;
	}

	public T getH_service_parameter() {
		return h_service_parameter;
	}

	public void setH_service_parameter(T h_service_parameter) {
		this.h_service_parameter = h_service_parameter;
	}

	public String getH_session_id() {
		return h_session_id;
	}

	public void setH_session_id(String h_session_id) {
		this.h_session_id = h_session_id;
	}

	public String getH_request_id() {
		return h_request_id;
	}

	public void setH_request_id(String h_request_id) {
		this.h_request_id = h_request_id;
	}

	public String getH_request_time() {
		return h_request_time;
	}

	public void setH_request_time(String h_request_time) {
		this.h_request_time = h_request_time;
	}

	public String getH_priority() {
		return h_priority;
	}

	public void setH_priority(String h_priority) {
		this.h_priority = h_priority;
	}


	public String getH_package_length() {
		return h_package_length;
	}

	public void setH_package_length(String h_package_length) {
		this.h_package_length = h_package_length;
	}

	public String getH_source() {
		return h_source;
	}

	public void setH_source(String h_source) {
		this.h_source = h_source;
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

	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	public String getClient_passwd() {
		return client_passwd;
	}

	public void setClient_passwd(String client_passwd) {
		this.client_passwd = client_passwd;
	}
	
}
