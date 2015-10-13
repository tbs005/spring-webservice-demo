package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 操作行为上报
 */

public class OBDInfo {
	/*
	 * 行为收集日期，长度10位
	 */
	@XStreamAlias("OBDATE")
	private String obdate;
	
	/*
	 * 操作行为编码，长度4位
	 */
	@XStreamAlias("OBCODE")
	private String obcode;
	/*
	 * 操作行为次数
	 */
	@XStreamAlias("OBTIMES")
	private String obtimes;

	public String getObdate() {
		return obdate;
	}

	public void setObdate(String obdate) {
		this.obdate = obdate;
	}

	public String getObcode() {
		return obcode;
	}

	public void setObcode(String obcode) {
		this.obcode = obcode;
	}

	public String getObtimes() {
		return obtimes;
	}

	public void setObtimes(String obtimes) {
		this.obtimes = obtimes;
	}

	public OBDInfo() {

	}

	public OBDInfo(String obdate,String obcode,String obtimes) {
		this.obdate=obdate;
		this.obcode=obcode;
		this.obtimes=obtimes;

	}

}
