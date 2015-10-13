package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * 失败原因，文字描述
 *1：终端无响应；2：电话欠费；3；号码不存在。
 */
@XStreamAlias("RFR")
public class RFRequest {
	
	@XStreamAlias("REASON")
	private String reason;

	

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


}
