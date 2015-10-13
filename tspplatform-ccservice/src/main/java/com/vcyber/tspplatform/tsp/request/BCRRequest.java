package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * BCall业务数据同步
 */
@XStreamAlias("BCR")
public class BCRRequest {
	
	@XStreamAlias("BC_INFO")
	private BCInfo  bcInfo;

	public BCInfo getBcInfo() {
		return bcInfo;
	}

	public void setBcInfo(BCInfo bcInfo) {
		this.bcInfo = bcInfo;
	}


	

}
