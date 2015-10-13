package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 基本信息
 */
@XStreamAlias("PRIVATE_INFO")
public class Privateinfo {
	/*
	 * 昵称
	 */
	@XStreamAlias("NICKNAME")
	private String nickname;
	/*
	 * 真实姓名
	 */
	@XStreamAlias("NAME")
	private String name;
	/*
	 * 证件类型
	 */
	@XStreamAlias("CREDENTIALS")
	private String credentials;
	/*
	 * 证件号码
	 */
	@XStreamAlias("CREDENTIALSNUM")
	private String credentialsnum;
	/*
	 * 性别
	 */
	@XStreamAlias("SEX")
	private String sex;
	/*
	 * 生日
	 */
	@XStreamAlias("BIRTHDAY")
	private String birthday;
	/*
	 * 移动电话
	 */
	@XStreamAlias("MOBILEPHONE")
	private String mobilephone;
	/*
	 * 所属地
	 */
	@XStreamAlias("CITY")
	private String city;


	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getCredentialsnum() {
		return credentialsnum;
	}

	public void setCredentialsnum(String credentialsnum) {
		this.credentialsnum = credentialsnum;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirtschry() {
		return birthday;
	}

	public void setBirtschry(String birtschry) {
		this.birthday = birtschry;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
