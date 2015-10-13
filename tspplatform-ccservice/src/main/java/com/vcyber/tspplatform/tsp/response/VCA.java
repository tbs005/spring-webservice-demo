package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 车辆控制指令通知
 */
@XStreamAlias("VCA")
public class VCA {
	/*
	 * 是否需要进行振铃；0：不需要振铃；1：需要振铃
	 */
	@XStreamAlias("RING")
	private String ring;
	
	public String getRing() {
		return ring;
	}

	public void setRing(String ring) {
		this.ring = ring;
	}

}
