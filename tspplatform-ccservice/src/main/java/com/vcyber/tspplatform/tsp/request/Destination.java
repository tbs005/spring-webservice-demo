package com.vcyber.tspplatform.tsp.request;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 目的地信息
 * @author 王炜华
 *
 */
@XStreamAlias("DESTINATION")
public class Destination {

	private List<PoiInfo>  poiInfo;

	public List<PoiInfo> getPoiInfo() {
		return poiInfo;
	}

	public void setPoiInfo(List<PoiInfo> poiInfo) {
		this.poiInfo = poiInfo;
	}
}
