package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 车辆控制指令通知
 */
@XStreamAlias("VCR")
public class VCRRequest {
	/*
	 * 操作指令
	 */
	@XStreamAlias("CONTROLINSTRUCTIONS")
	private String controlinstructions;

	public String getControlinstructions() {
		return controlinstructions;
	}

	public void setControlinstructions(String controlinstructions) {
		this.controlinstructions = controlinstructions;
	}


}
