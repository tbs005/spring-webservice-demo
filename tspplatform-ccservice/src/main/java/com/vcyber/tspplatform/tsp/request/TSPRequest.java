package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("TSP_Req")
public class TSPRequest <T>{

	private SCHR schr;
	private T body;

	public SCHR getSchr() {
		return schr;
	}

	public void setSchr(SCHR schr) {
		this.schr = schr;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}


}
