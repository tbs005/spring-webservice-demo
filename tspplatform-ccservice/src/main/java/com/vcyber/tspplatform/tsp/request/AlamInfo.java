package com.vcyber.tspplatform.tsp.request;

public class AlamInfo {
	/*
	 * 报警类型 异常报警:0；移动报警:1；区域报警:2
	 */
	private String alamtype;
	/*
	 * 取消时间，单位分钟;当取消时间为0时，表示用户立即回复
	 */
	private String canceltime;

	public String getAlamtype() {
		return alamtype;
	}

	public void setAlamtype(String alamtype) {
		this.alamtype = alamtype;
	}

	public String getCanceltime() {
		return canceltime;
	}

	public void setCanceltime(String canceltime) {
		this.canceltime = canceltime;
	}

}
