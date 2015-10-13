package com.vcyber.tspplatform.tsp.request;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 报警取消
 */
@XStreamAlias("ACR")
public class ACRRequest{
	/*
	 * 报警情况
	 */
	
	private List<ACRAlaminfo> acralamInfo;

	public List<ACRAlaminfo> getAcralamInfo() {
		return acralamInfo;
	}

	public void setAcralamInfo(List<ACRAlaminfo> acralamInfo) {
		this.acralamInfo = acralamInfo;
	}





	
}
