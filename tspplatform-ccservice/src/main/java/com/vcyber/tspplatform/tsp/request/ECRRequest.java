package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author  李黎明	
 * Ecall 业务数据同步
 */
@XStreamAlias("ECR")
public class ECRRequest {
	
	@XStreamAlias("EC_INFO")
	private ECInfo ecInfo;

	public ECInfo getEcInfo() {
		return ecInfo;
	}

	public void setEcInfo(ECInfo ecInfo) {
		this.ecInfo = ecInfo;
	}



}
