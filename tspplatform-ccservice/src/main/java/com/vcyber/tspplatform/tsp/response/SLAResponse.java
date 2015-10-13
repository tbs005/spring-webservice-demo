package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 一键导航POI结果下发
 * @author 王炜华
 *
 */
@XStreamAlias("TSP_Req")
public class SLAResponse {

	@XStreamAlias("SCHA")
	private SCHA scha;
	
	@XStreamAlias("SLA")
	private SLA sla;
	
	@XStreamAlias("VLA")
	private VLA vla;

	public SCHA getScha() {
		return scha;
	}

	public void setScha(SCHA scha) {
		this.scha = scha;
	}

	public SLA getSla() {
		return sla;
	}

	public void setSla(SLA sla) {
		this.sla = sla;
	}

	public VLA getVla() {
		return vla;
	}

	public void setVla(VLA vla) {
		this.vla = vla;
	}



}
