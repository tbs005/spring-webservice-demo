package com.vcyber.tspplatform.cc.request;

public class PLInfo {
	
	/*
	 * 警方案件编号
	 */
	private String pilice_no;
	/*
	 * 警方救援结果1：完成，0：未完成
	 */
	private String pl_result;
	public String getPilice_no() {
		return pilice_no;
	}
	public void setPilice_no(String pilice_no) {
		this.pilice_no = pilice_no;
	}
	public String getPl_result() {
		return pl_result;
	}
	public void setPl_result(String pl_result) {
		this.pl_result = pl_result;
	}

}
