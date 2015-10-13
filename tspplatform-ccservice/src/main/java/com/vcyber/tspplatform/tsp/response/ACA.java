package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 报警取消
 */
@XStreamAlias("ACA")
public class ACA {
	private String aca;

	

	public String getAca() {
		return aca;
	}

	public void setAca(String aca) {
		this.aca = aca;
	}

}
