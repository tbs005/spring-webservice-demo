package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @AUTHOR 李黎明
 * 报警结果反馈
 */
@XStreamAlias("ARR")
public class ARRRequest {
	
	/*
	 * 处理结果码 0:未联系上车主;1: 已联系车主
	 */
	@XStreamAlias("DEALRESULT")
	private String dealresult;
	
	/*
	 * 处理的信息 此处为具体的处理详细信息
	 */
	@XStreamAlias("RESULTINFO")
	private String resultinfo;

	public ARRRequest() {

	}

	public ARRRequest(String dealresult, String resultinfo) {
		this.dealresult=dealresult;
		this.resultinfo=resultinfo;

	}

	public String getDealresult() {
		return dealresult;
	}

	public void setDealresult(String dealresult) {
		this.dealresult = dealresult;
	}

	public String getResultinfo() {
		return resultinfo;
	}

	public void setResultinfo(String resultinfo) {
		this.resultinfo = resultinfo;
	}
}
