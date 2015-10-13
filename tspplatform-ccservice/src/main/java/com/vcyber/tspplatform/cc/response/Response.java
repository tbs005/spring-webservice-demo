package com.vcyber.tspplatform.cc.response;

import java.util.List;

public class Response<T> {
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
	private Object h_service_parameter;
	
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
	 * 响应时间
	 */
	private String h_response_time;
	
	/**
	 * 请求优先级
	 */
	private String h_priority;
	
	/**
	 * 返回码
	 */
	private String h_result_code;
	
	/**
	 * 请求时报文长度
	 */
	private String h_package_length;
	
	
	/**
	 * 请求来源
	 */
	private String h_source;
	
	/**
	 * 响应的报文长度
	 */
	private String h_respackage_length;
	
	
	/**
	 * 返回结果集
	 */
	private List<T> h_recordset;
	

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

	public Object getH_service_parameter() {
		return h_service_parameter;
	}

	public void setH_service_parameter(Object h_service_parameter) {
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

	public String getH_response_time() {
		return h_response_time;
	}

	public void setH_response_time(String h_response_time) {
		this.h_response_time = h_response_time;
	}

	public String getH_priority() {
		return h_priority;
	}

	public void setH_priority(String h_priority) {
		this.h_priority = h_priority;
	}

	public String getH_result_code() {
		return h_result_code;
	}

	public void setH_result_code(String h_result_code) {
		this.h_result_code = h_result_code;
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

	public String getH_respackage_length() {
		return h_respackage_length;
	}

	public void setH_respackage_length(String h_respackage_length) {
		this.h_respackage_length = h_respackage_length;
	}

	public List<T> getH_recordset() {
		return h_recordset;
	}

	public void setH_recordset(List<T> h_recordset) {
		this.h_recordset = h_recordset;
	}
	
//	private List<>
}
