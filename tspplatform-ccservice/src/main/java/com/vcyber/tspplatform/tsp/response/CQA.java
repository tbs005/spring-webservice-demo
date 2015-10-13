package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 客户信息查询
 */
@XStreamAlias("CQA")
public class CQA {
	
	@XStreamAlias("DESTINATION")
	private Clientinfo clientifo;
	
	
	public Clientinfo getClientifo() {
		return clientifo;
	}

	public void setClientifo(Clientinfo clientifo) {
		this.clientifo = clientifo;
	}

}
