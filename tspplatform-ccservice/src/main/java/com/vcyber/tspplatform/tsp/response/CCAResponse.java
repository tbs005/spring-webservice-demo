package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 客户验证
 */
@XStreamAlias("TSP_Req")
public class CCAResponse{
	
	@XStreamAlias("SCHA")
	private SCHA scha;
	
	@XStreamAlias("CCA")
	private CCA cca;

	public SCHA getScha() {
		return scha;
	}

	public void setScha(SCHA scha) {
		this.scha = scha;
	}

	public CCA getCca() {
		return cca;
	}

	public void setCca(CCA cca) {
		this.cca = cca;
	}
	




}
