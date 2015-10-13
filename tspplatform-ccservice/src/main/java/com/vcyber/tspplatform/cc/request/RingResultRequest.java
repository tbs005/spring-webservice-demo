package com.vcyber.tspplatform.cc.request;

/**
 * 振铃结果上送
 * @author 王炜华
 *
 */
public class RingResultRequest {

	/**
	 * 服务名称
	 */
	private String service_name;
	
	/**
	 * 手机号码
	 */
	private String telephone_code;
	
	/**
	 * 成功标识
	 */
	private String ringresult_code;

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getTelephone_code() {
		return telephone_code;
	}

	public void setTelephone_code(String telephone_code) {
		this.telephone_code = telephone_code;
	}

	public String getRingresult_code() {
		return ringresult_code;
	}

	public void setRingresult_code(String ringresult_code) {
		this.ringresult_code = ringresult_code;
	}
}
