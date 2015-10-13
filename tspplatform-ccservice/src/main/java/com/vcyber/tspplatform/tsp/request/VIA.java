package com.vcyber.tspplatform.tsp.request;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 途径地信息
 * @author 王炜华
 *
 */
@XStreamAlias("VIA")
public class VIA {

    @XStreamAlias("vorder")
    @XStreamAsAttribute
	private int vorder ;
    
    private List<PoiInfo>  poiInfo;

	public int getVorder() {
		return vorder;
	}

	public void setVorder(int vorder) {
		this.vorder = vorder;
	}

	public List<PoiInfo> getPoiInfo() {
		return poiInfo;
	}

	public void setPoiInfo(List<PoiInfo> poiInfo) {
		this.poiInfo = poiInfo;
	}
}
