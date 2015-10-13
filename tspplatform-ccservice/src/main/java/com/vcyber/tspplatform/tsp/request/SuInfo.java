package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SU_INFO")
public class SuInfo {
	
	@XStreamAlias("SU_COM_NAME")
	private String su_com_name;
	
	@XStreamAlias("SU_RESULT")
	private String su_result;
	
	public String getSu_com_name() {
		return su_com_name;
	}
	public void setSu_com_name(String su_com_name) {
		this.su_com_name = su_com_name;
	}
	public String getSu_result() {
		return su_result;
	}
	public void setSu_result(String su_result) {
		this.su_result = su_result;
	}
	
	

}
