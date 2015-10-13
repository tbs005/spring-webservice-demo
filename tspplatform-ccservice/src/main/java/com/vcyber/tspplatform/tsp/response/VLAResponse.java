package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author 王炜华
 *
 */
@XStreamAlias("TSP_Req")
public class VLAResponse {

	@XStreamAlias("SCHA")
	private SCHA scha;
	
	@XStreamAlias("VLA")
	private VLA vla;

	public SCHA getScha() {
		return scha;
	}

	public void setScha(SCHA scha) {
		this.scha = scha;
	}

	public VLA getVla() {
		return vla;
	}

	public void setVla(VLA vla) {
		this.vla = vla;
	}
}
