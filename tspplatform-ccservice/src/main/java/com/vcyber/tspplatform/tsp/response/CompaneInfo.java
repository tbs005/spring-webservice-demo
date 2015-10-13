package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 公司信息
 */
@XStreamAlias("COMPANY_INFO")
public class CompaneInfo {
	/*
	 * 公司名称
	 */
	@XStreamAlias("CNAME")
	private String cname;
	/*
	 * 公式地址
	 */
	@XStreamAlias("CADDRESS")
	private String caddress;
	/*
	 * 公司电话
	 */
	@XStreamAlias("CPHONE")
	private String cphone;

	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

}
