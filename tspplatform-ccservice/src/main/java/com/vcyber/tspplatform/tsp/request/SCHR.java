package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/*
 * @auther 李黎明
 * 客户验证
 *  
 */

public class SCHR {
	
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
	
	/*
	 * CallCenter访问TSP平台或TSP访问CallCenter的账号
	 */
	@XStreamAlias("NET_ACCOUNT")
	private String net_accout;
	
	/*
	 * CallCenter访问TSP平台或TSP访问CallCenter的密码
	 */
	@XStreamAlias("NET_PASSWD")
	private String net_passwd;
	/*
	 * 终端手机号码
	 */
	@XStreamAlias("MSISDN")
	private String msisdn;
	/*
	 * 请求发起方生成的ID
	 */
	@XStreamAlias("REQUESTID")
	private String requestid;
	/*
	 * 是否测试请求，0：非测试请求，1:测试请求，可以为空，默认值为0
	 */
	@XStreamAlias("TESTFLAG")
	private String testflag;
	
//	@XStreamAlias("TESTFLAG")
//	private String client_passwd;


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

	public String getNet_accout() {
		return net_accout;
	}

	public void setNet_accout(String net_accout) {
		this.net_accout = net_accout;
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

	public String getRequestid() {
		return requestid;
	}

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getTestflag() {
		return testflag;
	}

	public void setTestflag(String testflag) {
		this.testflag = testflag;
	}

}
