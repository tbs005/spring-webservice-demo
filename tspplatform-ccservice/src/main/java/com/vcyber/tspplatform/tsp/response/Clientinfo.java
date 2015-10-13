package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author  李黎明
 * 应答信息
 */
@XStreamAlias("CLIENT_INFO")
public class Clientinfo {
	
	@XStreamAlias("ID")
	private String id;
	
	/*
	 * 真实姓名
	 */
	@XStreamAlias("NAME")
	private String name;
	
	/*
	 * 昵称
	 */
	@XStreamAlias("NICKNAME")
	private String nickname;
	
	/*
	 * 性别
	 */
	@XStreamAlias("SEX")
	private String sex;

	/*
	 * 证件类型
	 */
	@XStreamAlias("TEL")
	private String tel;
	/*
	 * 证件号码
	 */
	@XStreamAlias("E_MAIL")
	private String e_mail;

	/*
	 * 生日
	 */
	@XStreamAlias("PROVINCE")
	private String province;
	
	/*
	 * 所属地
	 */
	@XStreamAlias("CITY")
	private String city;
	
	@XStreamAlias("BIRTHDAY")
	private String birthday;
	
	@XStreamAlias("FAX")
	private String fax;
	
	@XStreamAlias("CREDENTIALS")
	private String credentials;
	
	@XStreamAlias("CREDENTIALS_NUM")
	private String credentials_num;
	
	@XStreamAlias("C_NAME")
	private String c_name;
	
	@XStreamAlias("C_ADDRESS")
	private String c_address;
	
	@XStreamAlias("C_PHONE")
	private String c_phone;
	
	@XStreamAlias("C_POST")
	private String c_post;
	
	@XStreamAlias("H_ADDRESS")
	private String h_address;
	
	@XStreamAlias("H_PHONE")
	private String h_phone;
	
	@XStreamAlias("H_POST")
	private String h_post;
	
	@XStreamAlias("MOBILE_PHONE")
	private String mobile_phone;
	
	@XStreamAlias("REMARKS")
	private String remarks;
	
	@XStreamAlias("VEHICLE_INFO")
	private VehicleInfo vehicle_info;
	
//	@XStreamAlias("PRIVATE_INFO")
//	private Privateinfo private_info;
//	
//	@XStreamAlias("HOME_INFO")
//	private HomeInfo home_info;
//	
//	@XStreamAlias("HEALTH_INFO")
//	private HealthInfo health_info;
//	
//	@XStreamAlias("SECURE_INFO")
//	private SecureInfo secure_info;
	
//	@XStreamAlias("DEVICE_INFO")
//	private DeviceInfo device_info;
//	
//	@XStreamAlias("SIM_INFO")
//	private SimInfo sim_info;
//	
//	@XStreamAlias("COMPANY_INFO")
//	private CompaneInfo compane_info;
//	
//	@XStreamAlias("CONTAC_INF")
//	private ContacInfo contac_info;
	

	public VehicleInfo getVehicle_info() {
		return vehicle_info;
	}
	public void setVehicle_info(VehicleInfo vehicle_info) {
		this.vehicle_info = vehicle_info;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public String getCredentials_num() {
		return credentials_num;
	}
	public void setCredentials_num(String credentials_num) {
		this.credentials_num = credentials_num;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_address() {
		return c_address;
	}
	public void setC_address(String c_address) {
		this.c_address = c_address;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
	public String getC_post() {
		return c_post;
	}
	public void setC_post(String c_post) {
		this.c_post = c_post;
	}
	public String getH_address() {
		return h_address;
	}
	public void setH_address(String h_address) {
		this.h_address = h_address;
	}
	public String getH_phone() {
		return h_phone;
	}
	public void setH_phone(String h_phone) {
		this.h_phone = h_phone;
	}
	public String getH_post() {
		return h_post;
	}
	public void setH_post(String h_post) {
		this.h_post = h_post;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
}
