package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 振铃失败通知
 */
@XStreamAlias("RFA")
public class RFA {
	private String rfa;
	public RFA(){
		
	}
	public RFA(String rfa){
		this.rfa=rfa;
		
	}

	public String getRfa() {
		return rfa;
	}

	public void setRfa(String rfa) {
		this.rfa = rfa;
	}

}
