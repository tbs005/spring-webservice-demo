package com.vcyber.tspplatform.cc.response;

/**
 * 车辆位置应答
 * @author 王炜华
 *
 */
public class VehiclePosResponse {

	/**
	 * POI经度
	 */
	private String longitude;
	
	/**
	 * POI纬度
	 */
	private String latitude;
	
	/**
	 * 车辆行驶方向(扩展字段，demo阶段不使用)
	 */
	private String direction;
	
	/**
	 * 车辆行驶速度(扩展字段，demo阶段不使用)
	 */
	private String speed;

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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
}
