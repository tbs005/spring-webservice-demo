package com.vcyber.tspplatform.cc.response;

import java.util.List;

/**
 * 车辆故障信息请求(ECall) 应答
 * @author vcybertsp1
 *
 */
public class VehicleEmergeInfoResponse {
	
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
	private List<VehicleEmergeInfo> vehicle_emergeinfo;

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

	public List<VehicleEmergeInfo> getVehicle_emergeinfo() {
		return vehicle_emergeinfo;
	}

	public void setVehicle_emergeinfo(List<VehicleEmergeInfo> vehicle_emergeinfo) {
		this.vehicle_emergeinfo = vehicle_emergeinfo;
	}



}
