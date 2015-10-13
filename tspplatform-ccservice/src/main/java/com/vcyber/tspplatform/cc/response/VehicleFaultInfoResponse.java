package com.vcyber.tspplatform.cc.response;

import java.util.List;

/**
 * 车辆故障信息(BCall)应答
 * @author 王炜华
 *
 */
public class VehicleFaultInfoResponse {

	/**
	 * POI经度
	 */
	private String longitude;
	
	/**
	 * POI纬度
	 */
	private String latitude;
	
	/**
	 * 车辆故障信息
	 */
	private List<VehicleEmergeInfo> vehicle_faultinfo;

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public List<VehicleEmergeInfo> getVehicle_faultinfo() {
		return vehicle_faultinfo;
	}

	public void setVehicle_faultinfo(List<VehicleEmergeInfo> vehicle_faultinfo) {
		this.vehicle_faultinfo = vehicle_faultinfo;
	}


}
