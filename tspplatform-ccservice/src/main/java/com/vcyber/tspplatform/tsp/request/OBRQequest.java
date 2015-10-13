package com.vcyber.tspplatform.tsp.request;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 操作行为上报
 */
@XStreamAlias("OBR")
public class OBRQequest {
	
	private List<OBDInfo> obdinfo;

	public List<OBDInfo> getObdinfo() {
		return obdinfo;
	}

	public void setObdinfo(List<OBDInfo> obdinfo) {
		this.obdinfo = obdinfo;
	}



}
