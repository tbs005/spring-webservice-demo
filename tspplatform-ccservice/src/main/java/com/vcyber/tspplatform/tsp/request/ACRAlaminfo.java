package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 报警情况
 */
@XStreamAlias("ALAMINFO")
public class ACRAlaminfo{
	/*
	 * 报警类型 异常报警:0；移动报警:1；区域报警:2
	 */
	@XStreamAlias("ALAMTYPE")
	private String alemtype;
	
	/*
	 * 取消时间，单位分钟;当取消时间为0时，表示用户立即回复
	 */
	@XStreamAlias("CANCELTIME")
	private String cancelTime;
	
	public String getAlemtype() {
		return alemtype;
	}
	public void setAlemtype(String alemtype) {
		this.alemtype = alemtype;
	}
	public String getCancelTime() {
		return cancelTime;
	}
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	
	

}
