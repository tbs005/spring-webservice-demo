package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 报警反馈结果或操作行为上报
 */
@XStreamAlias("ARA")
public class ARA {
	
	private String ara;


	public String getAra() {
		return ara;
	}

	public void setAra(String ara) {
		this.ara = ara;
	}

}
