package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author  李黎明
 * 客户信息查询
 */
@XStreamAlias("CQR")
public class CQRRuquest {
	private String cqr;

	public String getCqr() {
		return cqr;
	}

	public void setCqr(String cqr) {
		this.cqr = cqr;
	}

	public CQRRuquest() {

	}

	public CQRRuquest(String cqr) {
		this.cqr=cqr;

	}

}
