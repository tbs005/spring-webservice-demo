package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 救援信息
 */
@XStreamAlias("HS_INFO")
public class HSInfo {
	
	/*
	 * 120案件编号
	 */
	@XStreamAlias("HOSP_NO")
	private String hosp_no;
	
	/*
	 * 医疗救援结果
	 */
	@XStreamAlias("HS_RESULT")
	private String hs_result;
	
	public String getHosp_no() {
		return hosp_no;
	}
	public void setHosp_no(String hosp_no) {
		this.hosp_no = hosp_no;
	}
	public String getHs_result() {
		return hs_result;
	}
	public void setHs_result(String hs_result) {
		this.hs_result = hs_result;
	}

}
