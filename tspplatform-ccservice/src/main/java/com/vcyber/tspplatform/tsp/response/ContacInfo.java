package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * 紧急联系人
 */
@XStreamAlias("CONTAC_INF")
public class ContacInfo {
	/*
	 * 姓名
	 */
	@XStreamAlias("NAME")
	private String name;
	/*
	 * 移动电话
	 */
	@XStreamAlias("MOBILE_PHONE")
	private String mobile_phone;
	/*
	 * 固定电话
	 */
	@XStreamAlias("PHONE")
	private String phone;
	/*
	 * 关系
	 */
	@XStreamAlias("RELATION")
	private String relation;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

}
