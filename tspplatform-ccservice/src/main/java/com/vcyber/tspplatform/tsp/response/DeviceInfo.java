
package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 设备信息
 */
@XStreamAlias("DEVICE_INFO")
public class DeviceInfo {
	/*
	 * 车辆vinCode值
	 */
	@XStreamAlias("TERM_ID")
	private String term_id;
	/*
	 * 备注
	 */
	@XStreamAlias("REMARKS")
	private String remarks;


	public String getTerm_id() {
		return term_id;
	}

	public void setTerm_id(String term_id) {
		this.term_id = term_id;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
