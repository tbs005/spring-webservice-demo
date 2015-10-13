package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 车辆信息
 */
@XStreamAlias("VEHICLE_INFO")
public class VehicleInfo {
	
	@XStreamAlias("ID")
	private String id;
	
	@XStreamAlias("VEHICLE_NO")
	private String vehicle_no;
	
	@XStreamAlias("VEHICLE_BRAND")
	private String vehicle_brand;
	/*
	 * 车辆VinCode值
	 */
	@XStreamAlias("VIN")
	private String vin;
	/*
	 * 车辆类型
	 */
	@XStreamAlias("VEHICLE_TYPE")
	private String vehicle_type;
	/*
	 * 车辆颜色
	 */
	@XStreamAlias("COLOR")
	private String color;
	/*
	 * 车厂
	 */
	@XStreamAlias("DOPT_CODE")
	private String dopt_code;
	/*
	 * 服务期
	 */
	@XStreamAlias("TBOX_CODE")
	private String tbox_code;
	/*
	 * 备注
	 */
//	@XStreamAlias("REMARKS")
//	private String remarks;


	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public String getVehicle_brand() {
		return vehicle_brand;
	}

	public void setVehicle_brand(String vehicle_brand) {
		this.vehicle_brand = vehicle_brand;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public String getDopt_code() {
		return dopt_code;
	}

	public void setDopt_code(String dopt_code) {
		this.dopt_code = dopt_code;
	}

	public String getTbox_code() {
		return tbox_code;
	}

	public void setTbox_code(String tbox_code) {
		this.tbox_code = tbox_code;
	}



}
