package com.vcyber.tspplatform.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface CCService{
	
	/**
	 * 身份认证
	 * @return
	 */
	@WebMethod
	public String ccAuthVertify(@WebParam String json);
	
	/**
	 * 车辆位置
	 * @return
	 */
	@WebMethod
	public String vehiclePos(@WebParam String json);
	
	/**
	 * 一键导航POI结果下发
	 * @return
	 */
	@WebMethod
	public String poiInfo(@WebParam String json);
	
	/**
	 * 车辆故障信息
	 * @return
	 */
	@WebMethod
	public String vehicleFaultInfo(@WebParam String json);
	
	
	/**
	 * 车辆救援结果下发
	 * @return
	 */
	@WebMethod
	public String bcallHelpInfo(@WebParam String json);
	
	/**
	 * 车辆故障信息
	 * @return
	 */
	@WebMethod
	public String vehicleEmergeInfo(@WebParam String json);
	
	/**
	 * 车辆紧急救援结果下发
	 * @return
	 */
	@WebMethod
	public String ecallHelpInfo(@WebParam String json);
	
	/**
	 * 振铃结果上送[T平台唤醒Tbox]
	 * @return
	 */
	@WebMethod
	public String ringResult(@WebParam String json);
}
