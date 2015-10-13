package com.vcyber.tspplatform.tsp.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/*
 * @author李黎明
 * 请求客户的执行密码
 */
@XStreamAlias("CCR")
public class CCRRequest {
	
	/*
	 * 请求客户的执行密码
	 */
	@XStreamAlias("CLIENT_PASSWD")
	private String client_posswd;
	
	public String getClient_posswd() {
		return client_posswd;
	}

	public void setClient_posswd(String client_posswd) {
		this.client_posswd = client_posswd;
	}

}