package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * T平台应答类
 * @author 王炜华
 *
 * @param <T>
 */
@XStreamAlias("TSP_Req")
public class TspResponse {

	private SCHA scha;
	
	private Object body;

	public SCHA getScha() {
		return scha;
	}

	public void setScha(SCHA scha) {
		this.scha = scha;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}
}
