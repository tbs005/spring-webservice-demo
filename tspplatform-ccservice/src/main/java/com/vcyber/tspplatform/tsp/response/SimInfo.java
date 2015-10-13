package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * Sim卡信息
 */
@XStreamAlias("SIM_INFO")
public class SimInfo {
	/*
	 * IMSI号
	 */
	@XStreamAlias("IMSI")
	private String imsi;
	/*
	 * 电话号码
	 */
	@XStreamAlias("PHONENO")
	private String phoneno;


	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

}
