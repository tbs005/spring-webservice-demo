package com.vcyber.tspplatform.cc.response;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 用户基本信息
 * @author 王炜华
 *
 */

public class UserInfo {
	
	/**
	 * 客户编号
	 */
	@XStreamAlias("customer_id")
	private long customer_id;
	
	/**
	 * 客户名
	 */
	@XStreamAlias("user_name")
	private String user_name;

	/**
	 * 用户来源
	 */
	@XStreamAlias("source")
	private String source;
	
	/**
	 * 创建来源
	 */
	@XStreamAlias("createby")
	private String createby;
	
	/**
	 * 姓名
	 */
	@XStreamAlias("real_name")
	private String real_name;
	
	/**
	 * 性别
	 */
	@XStreamAlias("gender")
	private int gender;
	
	/**
	 * 省/自治洲/直辖市
	 */
	@XStreamAlias("province")
	private String province;
	
	/**
	 * 市
	 */
	@XStreamAlias("city")
	private String city;
	
	/**
	 * 区
	 */
	@XStreamAlias("region")
	private String region;
	
	/**
	 * 移动电话
	 */
	@XStreamAlias("mobile")
	private String mobile;
	
	/**
	 * 固定电话
	 */
	@XStreamAlias("telephone")
	private String telephone;
	
	/**
	 * 联系详细地址
	 */
	@XStreamAlias("address")
	private String address;
	
	/**
	 * 电子邮件地址
	 */
	@XStreamAlias("email")
	private String email;
	
	/**
	 * 是否二手车主[0：否,1：是]
	 */
	@XStreamAlias("is_second_hand")
	private int is_second_hand;
	
	/**
	 * 是否已婚 [0：否,1：是]
	 */
	@XStreamAlias("married")
	private String married;
	
	/**
	 * 邮编
	 */
	@XStreamAlias("postcode")
	private String postcode;
	
	/**
	 * 证件类型
	 */
	@XStreamAlias("cred_type")
	private String cred_type;
	
	/**
	 * 证件号码
	 */
	@XStreamAlias("cred_number")
	private String cred_number;
	
	/**
	 * 客户类型
	 */
	@XStreamAlias("customer_type")
	private String customer_type;
	
	/**
	 * 客户编号（对应CRM系统）
	 */
	@XStreamAlias("uuid")
	private String uuid;
	
	/**
	 * 昵称
	 */
	@XStreamAlias("nick_name")
	private String nick_name;
	
	/**
	 * 生日
	 */
	@XStreamAlias("birthday")
	private Date birthday;
	
	/**
	 * 状态 [0：离线,1：在线]
	 */
	@XStreamAlias("status")
	private int status;
	
	/**
	 * 注册时间
	 */
	@XStreamAlias("register_time")
	private Date register_time;
	
	/**
	 * 激活时间
	 */
	@XStreamAlias("activate_time")
	private Date activate_time;

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIs_second_hand() {
		return is_second_hand;
	}

	public void setIs_second_hand(int is_second_hand) {
		this.is_second_hand = is_second_hand;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCred_type() {
		return cred_type;
	}

	public void setCred_type(String cred_type) {
		this.cred_type = cred_type;
	}

	public String getCred_number() {
		return cred_number;
	}

	public void setCred_number(String cred_number) {
		this.cred_number = cred_number;
	}

	public String getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getRegister_time() {
		return register_time;
	}

	public void setRegister_time(Date register_time) {
		this.register_time = register_time;
	}

	public Date getActivate_time() {
		return activate_time;
	}

	public void setActivate_time(Date activate_time) {
		this.activate_time = activate_time;
	}
	
	
}
