package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 获取车辆信息
 */

@XStreamAlias("VLA")
public class VLA {
	/*
	 * 经度
	 */
	@XStreamAlias("LON")
	private String lon;
	/*
	 * 纬度
	 */
	@XStreamAlias("LAT")
	private String lat;
	/*
	 * 方向
	 */
	@XStreamAlias("DIRECTION")
	private String direction;
	/*
	 * 速度
	 */
	@XStreamAlias("SPEED")
	private String speed;

	
	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
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
