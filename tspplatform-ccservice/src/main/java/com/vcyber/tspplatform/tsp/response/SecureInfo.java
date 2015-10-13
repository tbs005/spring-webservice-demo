package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 保险信息
 */
@XStreamAlias("SECURE_INFO")
public class SecureInfo {
	/*
	 * 保险类型
	 */
	@XStreamAlias("TYPE")
	private String type;
	/*
	 * 保险类型
	 */
	@XStreamAlias("COMPANY")
	private String company;
	/*
	 * 保险类型
	 */
	@XStreamAlias("CONTRACTNO")
	private String contractno;
	/*
	 * 保险类型
	 */
	@XStreamAlias("CLERKNAME")
	private String clerkname;
	/*
	 * 保险类型
	 */
	@XStreamAlias("CLERKPHONE")
	private String clerkphone;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getContractno() {
		return contractno;
	}
	public void setContractno(String contractno) {
		this.contractno = contractno;
	}
	public String getClerkname() {
		return clerkname;
	}
	public void setClerkname(String clerkname) {
		this.clerkname = clerkname;
	}
	public String getClerkphonex() {
		return clerkphone;
	}
	public void setClerkphonex(String clerkphonex) {
		this.clerkphone = clerkphonex;
	}
	
}
