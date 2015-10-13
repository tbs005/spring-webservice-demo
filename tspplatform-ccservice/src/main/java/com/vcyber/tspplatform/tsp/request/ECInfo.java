package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * ECall业务数据同步
 */
@XStreamAlias("EC_INFO")
public class ECInfo {
	
	/*
	 * 工单编号
	 */
	@XStreamAlias("EVENT_ID")
	private String event_id;
	
	/*
	 * 来电人姓名
	 */
	@XStreamAlias("COMING_NAME")
	private String coming_name;
	/*
	 * 来电电话
	 */
	@XStreamAlias("COMING_TEL")
	private String coming_tel;
	/*
	 * 来电时间
	 */
	@XStreamAlias("COMING_TIME")
	private String coming_time;
	
	/*
	 * 撤职编号
	 */
	@XStreamAlias("CUST_ID")
	private String cust_id;
	
	/*
	 * 车牌号
	 */
	@XStreamAlias("LIC_NO")
	private String lic_no;
	
	/*
	 * 省份 编码
	 */
	@XStreamAlias("PROVINCE")
	private String province;
	
	/*
	 * 城市编码
	 */
	@XStreamAlias("CITY")
	private String city;
	
	/*
	 * 发生故障时间
	 */
	@XStreamAlias("FAILURE_TIME")
	private String failure_time;
	
	/*
	 * 故障地点
	 */
	@XStreamAlias("FAULT_ADDDESC")
	private String fault_adddesc;
	
	/*
	 * 工单编号
	 */
	@XStreamAlias("S_ADDR")
	private String s_addr;
	
	/*
	 * 工单编号 
	 */
	@XStreamAlias("S_LON")
	private String s_lon;
	/*
	 * 工单编号
	 */
	@XStreamAlias("S_LAT")
	private String s_lat;
	/*
	 * 故障原因 
	 */
	@XStreamAlias("FAULT_REASON")
	private String fault_reason;
	/*
	 * 客户需求
	 */
	@XStreamAlias("CUST_DEMAND")
	private String cust_demand;
	
	/*
	 * 工单状态 1：结案，0：未结案
	 */
	@XStreamAlias("EVENT_STATUS")
	private String event_status;
	
	/*
	 *  结案描述 
	 */
	@XStreamAlias("CLOSED_DESC")
	private String closed_desc;
	/*
	 * 结案时间
	 */
	@XStreamAlias("CLOSED_TIME")
	private String closed_time;
	
	@XStreamAlias("PL_INFO")
	private PLInfo pl_info;
	
	@XStreamAlias("HS_INFO")
	private HSInfo hs_info;
	
	public String getEvent_id() {
		return event_id;
	}
	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}
	public String getComing_name() {
		return coming_name;
	}
	public void setComing_name(String coming_name) {
		this.coming_name = coming_name;
	}
	public String getComing_tel() {
		return coming_tel;
	}
	public void setComing_tel(String coming_tel) {
		this.coming_tel = coming_tel;
	}
	public String getComing_time() {
		return coming_time;
	}
	public void setComing_time(String coming_time) {
		this.coming_time = coming_time;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getLic_no() {
		return lic_no;
	}
	public void setLic_no(String lic_no) {
		this.lic_no = lic_no;
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
	public String getFailure_time() {
		return failure_time;
	}
	public void setFailure_time(String failure_time) {
		this.failure_time = failure_time;
	}
	public String getFault_adddesc() {
		return fault_adddesc;
	}
	public void setFault_adddesc(String fault_adddesc) {
		this.fault_adddesc = fault_adddesc;
	}
	public String getS_addr() {
		return s_addr;
	}
	public void setS_addr(String s_addr) {
		this.s_addr = s_addr;
	}
	public String getS_lon() {
		return s_lon;
	}
	public void setS_lon(String s_lon) {
		this.s_lon = s_lon;
	}
	public String getS_lat() {
		return s_lat;
	}
	public void setS_lat(String s_lat) {
		this.s_lat = s_lat;
	}

	public String getCust_demand() {
		return cust_demand;
	}
	public void setCust_demand(String cust_demand) {
		this.cust_demand = cust_demand;
	}
	public String getEvent_status() {
		return event_status;
	}
	public void setEvent_status(String event_status) {
		this.event_status = event_status;
	}
	public String getClosed_desc() {
		return closed_desc;
	}
	public void setClosed_desc(String closed_desc) {
		this.closed_desc = closed_desc;
	}
	public String getClosed_time() {
		return closed_time;
	}
	public void setClosed_time(String closed_time) {
		this.closed_time = closed_time;
	}

	public PLInfo getPl_info() {
		return pl_info;
	}
	public void setPl_info(PLInfo pl_info) {
		this.pl_info = pl_info;
	}
	public HSInfo getHs_info() {
		return hs_info;
	}
	public void setHs_info(HSInfo hs_info) {
		this.hs_info = hs_info;
	}
	public String getFault_reason() {
		return fault_reason;
	}
	public void setFault_reason(String fault_reason) {
		this.fault_reason = fault_reason;
	}
	
	

}
