package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author 王炜华
 *
 */
@XStreamAlias("CCA")
public class CCA {
	
	@XStreamAlias("CLIENT_INFO")
	public Clientinfo clientInfo;

	public Clientinfo getClientInfo() {
		return clientInfo;
	}

	public void setClientInfo(Clientinfo clientInfo) {
		this.clientInfo = clientInfo;
	}
}
