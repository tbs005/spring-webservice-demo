package com.vcyber.tspplatform.tsp.request;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
/*
 * @author 李黎明
 * 设定位置
 */
@XStreamAlias("SLR")
public class SLRRequest {
	/*
	 * —设定结果
     *0200：设定成功
     *0800：还未设定导航位置
     *0801：取消服务；用户主动取消一键导航服务
     *0802：服务失败；没有检索到结果
     * 当此值为0200时，后续的值才有意义
     */
	@XStreamAlias("SETRESULT")
	private String setResult;
	/*
	 * 导航条件（TBD）长度C1, 0:推荐优先；1：干线优先；2：距离优先；3：一般；默认值为0
	 */
	@XStreamAlias("NAVICONDITION")
	private String navicondition;
	/*
	 * 目的地信息
	 */
	@XStreamAlias("DESTINATION")
	private Destination  destination;
	
	/**
	 * 途径地信息
	 */
	@XStreamAlias("VIA")
	private List<VIA> via;

	public String getSetResult() {
		return setResult;
	}

	public void setSetResult(String setResult) {
		this.setResult = setResult;
	}

	public String getNavicondition() {
		return navicondition;
	}

	public void setNavicondition(String navicondition) {
		this.navicondition = navicondition;
	}

	public List<VIA> getVia() {
		return via;
	}

	public void setVia(List<VIA> via) {
		this.via = via;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	

	

	
	
	

}
