package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @Author  李黎明
 * 客户验证
 */
@XStreamAlias("SCHA")
public class SCHA {
	/*
	 * 终端手机号码
	 */
	@XStreamAlias("MSISDN")
	private String msisdn;
	/*
	 * 请求发起生成的id
	 */
	@XStreamAlias("REQUESTID")
	private String requestid;
	/*
	 * 用于存放本次请求的应答信息CODE登陆成功返回0200
	 */
	@XStreamAlias("RESULTCODE")
	private String resultcode;
	
	/*
	 * 应用程序使用的协议版本号
	 */
	@XStreamAlias("PROTOCOL_VERSION")
	private String protocol_version;
	
	/*
	 * 品牌厂商的业务类型
	 */
	@XStreamAlias("BUSSINESS_ID")
	private String bussiness_id;
	
	/*
	 * 应用程序请求的服务类型
	 */
	@XStreamAlias("SERVICES_TYPE")
	private String services_type;
	
	

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getRequestid() {
		return requestid;
	}

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getResultcode() {
		return resultcode;
	}

	public void setResultcode(String resultcode) {
		this.resultcode = resultcode;
	}

	public String getProtocol_version() {
		return protocol_version;
	}

	public void setProtocol_version(String protocol_version) {
		this.protocol_version = protocol_version;
	}

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

}
