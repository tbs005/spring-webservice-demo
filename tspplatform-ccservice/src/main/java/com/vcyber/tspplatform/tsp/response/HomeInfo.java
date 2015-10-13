package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author  李黎明
 * 家庭信息
 */
@XStreamAlias("HOME_INFO")
public class HomeInfo {
	/*
	 * 家庭住址
	 */
	@XStreamAlias("HADDRESS")
	private String haddress;
	/*
	 * 家庭电话
	 */
	@XStreamAlias("HPHONE")
	private String hphone;


	public String getHaddress() {
		return haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}

	public String getHphone() {
		return hphone;
	}

	public void setHphone(String hphone) {
		this.hphone = hphone;
	}

}
