package com.vcyber.tspplatform.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.vcyber.tspplatform.cc.request.BCallHelpInfoSetRequest;
import com.vcyber.tspplatform.cc.request.CCAuthVertifyRequest;
import com.vcyber.tspplatform.cc.request.ECallHelpInfoSetRequest;
import com.vcyber.tspplatform.cc.request.POIInfoSetRequest;
import com.vcyber.tspplatform.cc.request.Request;
import com.vcyber.tspplatform.cc.request.RingResultRequest;
import com.vcyber.tspplatform.cc.request.VehicleEmergeInfoRequest;
import com.vcyber.tspplatform.cc.request.VehicleFaultInfoRequest;
import com.vcyber.tspplatform.cc.request.VehiclePosRequest;
import com.vcyber.tspplatform.cc.response.Response;
import com.vcyber.tspplatform.cc.response.UserInfo;
import com.vcyber.tspplatform.cc.response.VehicleEmergeInfo;
import com.vcyber.tspplatform.cc.response.VehicleEmergeInfoResponse;
import com.vcyber.tspplatform.cc.response.VehicleFaultInfoResponse;
import com.vcyber.tspplatform.cc.response.VehiclePosResponse;
import com.vcyber.tspplatform.service.CCService;
import com.vcyber.tspplatform.tsp.request.BCInfo;
import com.vcyber.tspplatform.tsp.request.BCRRequest;
import com.vcyber.tspplatform.tsp.request.CCRRequest;
import com.vcyber.tspplatform.tsp.request.Destination;
import com.vcyber.tspplatform.tsp.request.ECInfo;
import com.vcyber.tspplatform.tsp.request.ECRRequest;
import com.vcyber.tspplatform.tsp.request.HSInfo;
import com.vcyber.tspplatform.tsp.request.PLInfo;
import com.vcyber.tspplatform.tsp.request.PoiInfo;
import com.vcyber.tspplatform.tsp.request.SCHR;
import com.vcyber.tspplatform.tsp.request.SLRRequest;
import com.vcyber.tspplatform.tsp.request.TSPRequest;
import com.vcyber.tspplatform.tsp.request.VLRRuquest;
import com.vcyber.tspplatform.tsp.response.CCA;
import com.vcyber.tspplatform.tsp.response.CCAResponse;
import com.vcyber.tspplatform.tsp.response.Clientinfo;
import com.vcyber.tspplatform.tsp.response.SCHA;
import com.vcyber.tspplatform.tsp.response.SLA;
import com.vcyber.tspplatform.tsp.response.SLAResponse;
import com.vcyber.tspplatform.tsp.response.VLA;
import com.vcyber.tspplatform.tsp.response.VLAResponse;
import com.vcyber.tspplatform.util.HttpUtil;
import com.vcyber.tspplatform.util.XMLTransfer;


@Component  
@WebService(endpointInterface = "com.vcyber.tspplatform.service.CCService")  
public class CCServiceImpl implements CCService{
	private static final Logger logger = LoggerFactory.getLogger(CCServiceImpl.class);
	
	@Override
	@SuppressWarnings("unchecked")
	public String ccAuthVertify(String json) {
		logger.info("[身份认证]请求参数为:{}",json);

		Request<CCAuthVertifyRequest> request = (Request<CCAuthVertifyRequest>)JSON.parseObject(json,Request.class);
		
		//创建http请求类
		TSPRequest<CCRRequest> tspRequest = new TSPRequest<CCRRequest>();
		
		logger.info("[身份认证]请求services_type参数为:{}",request.getServices_type());
		SCHR schr = new SCHR();
		schr.setBussiness_id(request.getBusiness_id());
		schr.setServices_type(request.getServices_type());
		schr.setProtocol_version(request.getH_version_id());
		schr.setNet_accout(request.getNet_account());
		schr.setNet_passwd(request.getNet_passwd());
		schr.setMsisdn(request.getMsisdn());
		schr.setRequestid(request.getH_request_id());
		schr.setTestflag(request.getH_test_flag());
		
		CCRRequest ccr = new CCRRequest();
		ccr.setClient_posswd(request.getClient_passwd());
		
		tspRequest.setSchr(schr);
		tspRequest.setBody(ccr);
		
		//创建xml转换类
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.aliasSystemAttribute(null, "class");
		xStream.aliasField("SCHR", TSPRequest.class, "schr");
		xStream.aliasField("CCR", TSPRequest.class, "body");
		xStream.autodetectAnnotations(true); 
		String xmlRequest = xStream.toXML(tspRequest);
		
		//调用T平台接口获取数据
		String xmlResponse = HttpUtil.post(xmlRequest);
		
		
		XStream xStreamToBean = new XStream(new DomDriver());
		xStreamToBean.autodetectAnnotations(true); 
		xStreamToBean.alias("TSP_Req", CCAResponse.class);
		CCAResponse ccaResponse = (CCAResponse) xStreamToBean.fromXML(xmlResponse);
		
		//获取返回header
		SCHA scha = ccaResponse.getScha();
		String resultCode = "0";
		if (!"0200".equals(scha.getResultcode())) {
			resultCode = "500";
		}
		
		//获取返回body
		CCA cca = (CCA) ccaResponse.getCca();
		Clientinfo clientInfo = cca.getClientInfo();
		
		//用户基本信息
		UserInfo userInfo = new UserInfo();
		userInfo.setReal_name(clientInfo.getName());
		userInfo.setCustomer_id(Long.parseLong(clientInfo.getId()));
		userInfo.setUser_name(clientInfo.getNickname());
				
		
		//向callcenter返回数据
		
		String xmlResult = XMLTransfer.ccXMLTransfer(userInfo);
		logger.info("[身份认证]返回数据为:{}",xmlResult);
		
		return xmlResult;
	}

	@Override
	@SuppressWarnings({ "unchecked", "unused" })
	public String vehiclePos(String json) {
		logger.info("[车辆位置]请求参数为:{}", json);

		Request<VehiclePosRequest> request = (Request<VehiclePosRequest>) JSON.parseObject(json, Request.class);
		
//		VehiclePosRequest parameter = (VehiclePosRequest)request.getH_service_parameter();
		
		// 创建http请求类
		TSPRequest<VLRRuquest> tspRequest = new TSPRequest<VLRRuquest>();
		
		SCHR schr = new SCHR();
		schr.setBussiness_id(request.getBusiness_id());
		schr.setServices_type(request.getServices_type());
		schr.setProtocol_version(request.getH_version_id());
		schr.setNet_accout(request.getNet_account());
		schr.setNet_passwd(request.getNet_passwd());
		schr.setMsisdn(request.getMsisdn());
		schr.setRequestid(request.getH_request_id());
		schr.setTestflag(request.getH_test_flag());
		
		VLRRuquest vlr = new VLRRuquest();

		tspRequest.setSchr(schr);
		tspRequest.setBody(vlr);

		// 创建xml转换类
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.autodetectAnnotations(true); 
		xStream.aliasSystemAttribute(null, "class");
		xStream.aliasField("SCHR", TSPRequest.class, "schr");
		xStream.aliasField("VLR", TSPRequest.class, "body");
		
		String xmlRequest = xStream.toXML(tspRequest);

		// 调用T平台接口获取数据
		String xmlResponse = HttpUtil.post(xmlRequest);
		

		XStream xStreamToBean = new XStream(new DomDriver());
		xStreamToBean.autodetectAnnotations(true); 
		xStreamToBean.alias("TSP_Req", VLAResponse.class);
		VLAResponse response = (VLAResponse) xStreamToBean.fromXML(xmlResponse);

		// 获取返回header

		SCHA scha = response.getScha();
		String resultCode = "0";
		if (!"0200".equals(scha.getResultcode())) {
			resultCode = "500";
		}
		// 获取返回body
		List<VehiclePosResponse> listv = new ArrayList<VehiclePosResponse>();

		VLA vla = response.getVla();
		VehiclePosResponse v = new VehiclePosResponse();
		v.setDirection(vla.getDirection());
		v.setLatitude(vla.getLat());
		v.setLongitude(vla.getLon());
		v.setSpeed(vla.getSpeed());

		listv.add(v);

		Response<VehiclePosResponse> vehiclePosResponse = new Response<VehiclePosResponse>();
		vehiclePosResponse.setH_version_id(request.getH_version_id());
		vehiclePosResponse.setH_business_id(request.getH_business_id());
		vehiclePosResponse.setH_language(request.getH_language());
		vehiclePosResponse.setH_test_flag(request.getH_test_flag());
		vehiclePosResponse.setH_request_time(request.getH_request_time());
		vehiclePosResponse.setH_session_id(request.getH_session_id());
		vehiclePosResponse.setH_request_id(request.getH_request_id());
		vehiclePosResponse.setH_response_time("");
		vehiclePosResponse.setH_priority(request.getH_priority());
		vehiclePosResponse.setH_package_length(request.getH_package_length());
		vehiclePosResponse.setH_respackage_length("");
		vehiclePosResponse.setH_source(request.getH_source());
		vehiclePosResponse.setH_service_name(request.getH_service_name());
		vehiclePosResponse.setH_service_parameter(request.getH_service_parameter());
		vehiclePosResponse.setH_recordset(listv);// 返回数据内容
		vehiclePosResponse.setH_result_code(resultCode);// 请求成功标识

		String result = JSON.toJSONString(vehiclePosResponse);
		logger.info("[车辆位置]返回数据为:{}", result);

		return result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public String poiInfo(String json) {
		
		logger.info("[一键导航POI结果下发]请求参数为:{}",json);
		
		Request<POIInfoSetRequest> request = (Request<POIInfoSetRequest>)JSON.parseObject(json,Request.class);
		Map parameter = (Map) request.getH_service_parameter();
		Map content = (Map) parameter.get("content");
		
		//创建http请求类
		TSPRequest<SLRRequest> tspRequest = new TSPRequest<SLRRequest>();
		
		SCHR schr = new SCHR();
		schr.setProtocol_version(request.getH_version_id());
		schr.setBussiness_id(request.getBusiness_id());
		schr.setServices_type(request.getServices_type());
		schr.setNet_accout(request.getNet_account());
		schr.setNet_passwd(request.getNet_passwd());
		schr.setMsisdn(request.getMsisdn());
		schr.setRequestid(request.getH_request_id());
		schr.setTestflag(request.getH_test_flag());
		
		SLRRequest slr = new SLRRequest();
		
		slr.setSetResult("0200");
		slr.setNavicondition("0");
		
		
		List<PoiInfo> poiList = new ArrayList<PoiInfo>();
		
		PoiInfo poiInfo = new PoiInfo();
		poiInfo.setLon(parameter.get("longitude").toString());
		poiInfo.setLat(parameter.get("latitude").toString());
		poiInfo.setPanme(parameter.get("name").toString());
		poiInfo.setTel(content.get("telephone").toString());
		poiInfo.setAdd(content.get("address").toString());
		
		poiList.add(poiInfo);
		
		Destination destination = new Destination();
		destination.setPoiInfo(poiList);
		
		
		slr.setDestination(destination);
		
//		slr.setVia(via);
		
		
		
		tspRequest.setSchr(schr);
		tspRequest.setBody(slr);
		
		//创建xml转换类
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.autodetectAnnotations(true); 
		xStream.aliasSystemAttribute(null, "class");
		xStream.aliasField("SCHR", TSPRequest.class, "schr");
		xStream.aliasField("SLR", TSPRequest.class, "body");
		xStream.addImplicitCollection(Destination.class, "poiInfo");
		String xmlRequest = xStream.toXML(tspRequest);
		
		//调用T平台接口获取数据
		String xmlResponse = HttpUtil.post(xmlRequest);
		
		
		XStream xStreamToBean = new XStream(new DomDriver());
		xStreamToBean.autodetectAnnotations(true); 
		xStreamToBean.alias("TSP_Req", SLAResponse.class);
		SLAResponse slaResponse = (SLAResponse) xStreamToBean.fromXML(xmlResponse);
		
		//获取返回header
		SCHA scha = slaResponse.getScha();
		String resultCode = "0";
		if (!"0200".equals(scha.getResultcode())) {
			resultCode = "500";
		}
		
		//获取返回body
		
		
		Response<Object> response  = new Response<Object>();
		response.setH_version_id(request.getH_version_id());
		response.setH_business_id(request.getH_business_id());
		response.setH_language(request.getH_language());
		response.setH_test_flag(request.getH_test_flag());
		response.setH_request_time(request.getH_request_time());
		response.setH_session_id(request.getH_session_id());
		response.setH_request_id(request.getH_request_id());
		response.setH_response_time("");
		response.setH_priority(request.getH_priority());
		response.setH_package_length(request.getH_package_length());
		response.setH_respackage_length("");
		response.setH_source(request.getH_source());
		response.setH_service_name(request.getH_service_name());
		response.setH_service_parameter(request.getH_service_parameter());
		response.setH_result_code(resultCode);//请求成功标识
		response.setH_source(request.getH_source());
		
		String result = JSON.toJSONString(response);
		logger.info("[一键导航POI结果下发]返回数据为:{}",result);
		
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String vehicleFaultInfo(String json) {
		logger.info("[车辆故障信息]请求参数为:{}",json);
		Request<VehicleFaultInfoRequest> request = (Request<VehicleFaultInfoRequest>)JSON.parseObject(json,Request.class);
		Map parameter = (Map) request.getH_service_parameter();
		Map suInfo = (Map) parameter.get("su_info");
		
		
		// 创建http请求类
		TSPRequest<BCRRequest> tspRequest = new TSPRequest<BCRRequest>();
		
		SCHR schr = new SCHR();
		schr.setProtocol_version(request.getH_version_id());
		schr.setBussiness_id(request.getBusiness_id());
		schr.setServices_type(request.getServices_type());
		schr.setNet_accout(request.getNet_account());
		schr.setNet_passwd(request.getNet_passwd());
		schr.setMsisdn(request.getMsisdn());
		schr.setRequestid(request.getH_request_id());
		schr.setTestflag(request.getH_test_flag());
		
		BCRRequest bcr = new BCRRequest();
		
		BCInfo bcInfo = new BCInfo();
		bcInfo.setEvent_id(parameter.get("event_id").toString());
		bcInfo.setComing_name(parameter.get("coming_name").toString());
		bcInfo.setComing_tel(parameter.get("coming_tel").toString());
		bcInfo.setComing_time(parameter.get("coming_time").toString());
		bcInfo.setCust_id(parameter.get("cust_id").toString());
		bcInfo.setLic_no(parameter.get("lic_no").toString());
		bcInfo.setProvince(parameter.get("province").toString());
		bcInfo.setCity(parameter.get("city").toString());
		bcInfo.setFailure_time(parameter.get("failure_time").toString());
		bcInfo.setFault_adddesc(parameter.get("fault_addresc").toString());
		bcInfo.setS_addr(parameter.get("s_addr").toString());
		bcInfo.setS_lon(parameter.get("s_lon").toString());
		bcInfo.setS_lat(parameter.get("s_lat").toString());
		bcInfo.setFault_reason(parameter.get("fault_reason").toString());
		bcInfo.setCust_demand(parameter.get("cust_demand").toString());
		bcInfo.setEvent_status(parameter.get("event_status").toString());
		bcInfo.setClosed_desc(parameter.get("closed_desc").toString());
		bcInfo.setClosed_time(parameter.get("closed_time").toString());
		
		com.vcyber.tspplatform.tsp.request.SuInfo  su_info = new com.vcyber.tspplatform.tsp.request.SuInfo();
		su_info.setSu_com_name(suInfo.get("su_com_name").toString());
		su_info.setSu_result(suInfo.get("su_result").toString());
		
		bcInfo.setSu_info(su_info);
		bcr.setBcInfo(bcInfo);
		
		tspRequest.setSchr(schr);
		tspRequest.setBody(bcr);

		// 创建xml转换类
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.autodetectAnnotations(true);
		xStream.aliasSystemAttribute(null, "class");
		xStream.aliasField("SCHR", TSPRequest.class, "schr");
		xStream.aliasField("BCR", TSPRequest.class, "body");
		String xmlRequest = xStream.toXML(tspRequest);

		// 调用T平台接口获取数据
		String xmlResponse = HttpUtil.post(xmlRequest);
		

		XStream xStreamToBean = new XStream(new DomDriver());
		xStreamToBean.autodetectAnnotations(true); 
		xStreamToBean.alias("TSP_Req", SLAResponse.class);
		SLAResponse slaResponse = (SLAResponse) xStreamToBean.fromXML(xmlResponse);

		// 获取返回header

		SCHA scha = slaResponse.getScha();
		String resultCode = "0";
		if (!"0200".equals(scha.getResultcode())) {
			resultCode = "500";
		}
		// 获取返回body
		List<VehicleFaultInfoResponse> vehicleFaultlist = new ArrayList<VehicleFaultInfoResponse>();
		
//		 VLA vla = slaResponse.getVla();
	
		VehicleEmergeInfo emergeInfo = new VehicleEmergeInfo();
		emergeInfo.setItem_code("111");
		emergeInfo.setItem_name("发动机错误");
		emergeInfo.setColl_value("12");
		
		List<VehicleEmergeInfo> vehicle_faultinfo = new ArrayList<VehicleEmergeInfo>();
		vehicle_faultinfo.add(emergeInfo);

		
		VehicleFaultInfoResponse v = new 	VehicleFaultInfoResponse();
		VehiclePosResponse t = new VehiclePosResponse();
		
		v.setLatitude(t.getLatitude());
        v.setLongitude(t.getLongitude());		
		v.setVehicle_faultinfo(vehicle_faultinfo);
		
		vehicleFaultlist.add(v);

		
		Response<VehicleFaultInfoResponse> response = new Response<VehicleFaultInfoResponse>();
		response.setH_version_id(request.getH_version_id());
		response.setH_business_id(request.getH_business_id());
		response.setH_language(request.getH_language());
		response.setH_test_flag(request.getH_test_flag());
		response.setH_request_time(request.getH_request_time());
		response.setH_session_id(request.getH_session_id());
		response.setH_request_id(request.getH_request_id());
		response.setH_response_time(null);
		response.setH_priority(request.getH_priority());
		response.setH_package_length(request.getH_package_length());
		response.setH_respackage_length(null);
		response.setH_source(request.getH_source());
		response.setH_service_name(request.getH_service_name());
		response.setH_service_parameter(request.getH_service_parameter());
		response.setH_recordset(vehicleFaultlist);// 返回数据内容
		response.setH_result_code(resultCode);// 请求成功标识
		
		String result = JSON.toJSONString(response);
		logger.info("[车辆位置]返回数据为:{}", result);

		return result;
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public String bcallHelpInfo(String json) {
		logger.info("[车辆救援结果下发]请求参数为:"+json);
		
		Request<BCallHelpInfoSetRequest> request = (Request<BCallHelpInfoSetRequest>)JSON.parseObject(json,Request.class);
		Map parameter = (Map) request.getH_service_parameter();
		Map suInfo = (Map) parameter.get("su_info");
		
		//创建http请求类
		TSPRequest<BCRRequest> tspRequest = new TSPRequest<BCRRequest>();
		
		SCHR schr = new SCHR();
		schr.setProtocol_version(request.getH_version_id());
		schr.setBussiness_id(request.getBusiness_id());
		schr.setServices_type(request.getServices_type());
		schr.setNet_accout(request.getNet_account());
		schr.setNet_passwd(request.getNet_passwd());
		schr.setMsisdn(request.getMsisdn());
		schr.setRequestid(request.getH_request_id());
		schr.setTestflag(request.getH_test_flag());
		
		BCRRequest bcr = new BCRRequest();
		
		BCInfo bcInfo = new BCInfo();
		bcInfo.setEvent_id(parameter.get("event_id").toString());
		bcInfo.setComing_name(parameter.get("coming_name").toString());
		bcInfo.setComing_tel(parameter.get("coming_tel").toString());
		bcInfo.setComing_time(parameter.get("coming_time").toString());
		bcInfo.setCust_id(parameter.get("cust_id").toString());
		bcInfo.setLic_no(parameter.get("lic_no").toString());
		bcInfo.setProvince(parameter.get("province").toString());
		bcInfo.setCity(parameter.get("city").toString());
		bcInfo.setFailure_time(parameter.get("failure_time").toString());
		bcInfo.setFault_adddesc(parameter.get("fault_addresc").toString());
		bcInfo.setS_addr(parameter.get("s_addr").toString());
		bcInfo.setS_lon(parameter.get("s_lon").toString());
		bcInfo.setS_lat(parameter.get("s_lat").toString());
		bcInfo.setFault_reason(parameter.get("fault_reason").toString());
		bcInfo.setCust_demand(parameter.get("cust_demand").toString());
		bcInfo.setEvent_status(parameter.get("event_status").toString());
		bcInfo.setClosed_desc(parameter.get("closed_desc").toString());
		bcInfo.setClosed_time(parameter.get("closed_time").toString());
		
		com.vcyber.tspplatform.tsp.request.SuInfo  su_info = new com.vcyber.tspplatform.tsp.request.SuInfo();
		su_info.setSu_com_name(suInfo.get("su_com_name").toString());
		su_info.setSu_result(suInfo.get("su_result").toString());
		
		bcInfo.setSu_info(su_info);
		bcr.setBcInfo(bcInfo);
		
		
		tspRequest.setSchr(schr);
		tspRequest.setBody(bcr);
		
		//创建xml转换类
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.autodetectAnnotations(true);
		xStream.aliasSystemAttribute(null, "class");
		xStream.aliasField("SCHR", TSPRequest.class, "schr");
		xStream.aliasField("BCR", TSPRequest.class, "body");
		String xmlRequest = xStream.toXML(tspRequest);
		
		//调用T平台接口获取数据
		String xmlResponse = HttpUtil.post(xmlRequest);
		
		
		XStream xStreamToBean = new XStream(new DomDriver());
		xStreamToBean.autodetectAnnotations(true); 
		xStreamToBean.alias("TSP_Req", SLAResponse.class);
		SLAResponse slaResponse = (SLAResponse) xStreamToBean.fromXML(xmlResponse);
		
		//获取返回header
		SCHA scha = slaResponse.getScha();
		String resultCode = "0";
		if (!"0200".equals(scha.getResultcode())) {
			resultCode = "500";
		}
		
		//获取返回body
		
		Response<Object> response  = new Response<Object>();
		response.setH_version_id(request.getH_version_id());
		response.setH_business_id(request.getH_business_id());
		response.setH_language(request.getH_language());
		response.setH_test_flag(request.getH_test_flag());
		response.setH_request_time(request.getH_request_time());
		response.setH_session_id(request.getH_session_id());
		response.setH_request_id(request.getH_request_id());
		response.setH_response_time(null);
		response.setH_priority(request.getH_priority());
		response.setH_package_length(request.getH_package_length());
		response.setH_respackage_length(null);
		response.setH_source(request.getH_source());
		response.setH_service_name(request.getH_service_name());
		response.setH_service_parameter(request.getH_service_parameter());
//		response.setH_recordset(vehicleFaultlist);// 返回数据内容
		response.setH_result_code(resultCode);// 请求成功标识
		
		String result = JSON.toJSONString(response);
		logger.info("[车辆救援结果下发]返回数据为:"+result);
		
		return result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public String vehicleEmergeInfo(String json) {
		logger.info("[车辆故障信息]请求参数为:{}",json);
		
		Request<VehicleEmergeInfoRequest> request = (Request<VehicleEmergeInfoRequest>)JSON.parseObject(json,Request.class);
		Map parameter = (Map) request.getH_service_parameter();
		Map plInfo = (Map) parameter.get("pl_info");
		Map hsInfo = (Map) parameter.get("hs_info");
		
		//创建http请求类
		TSPRequest<ECRRequest> tspRequest = new TSPRequest<ECRRequest>();
		
		SCHR schr = new SCHR();
		schr.setProtocol_version(request.getH_version_id());
		schr.setBussiness_id(request.getBusiness_id());
		schr.setServices_type(request.getServices_type());
		schr.setNet_accout(request.getNet_account());
		schr.setNet_passwd(request.getNet_passwd());
		schr.setMsisdn(request.getMsisdn());
		schr.setRequestid(request.getH_request_id());
		schr.setTestflag(request.getH_test_flag());
		
		ECRRequest ecr = new ECRRequest();
		
		ECInfo ecInfo = new ECInfo();
		ecInfo.setEvent_id(parameter.get("event_id").toString());
		ecInfo.setComing_name(parameter.get("coming_name").toString());
		ecInfo.setComing_tel(parameter.get("coming_tel").toString());
		ecInfo.setComing_time(parameter.get("coming_time").toString());
		ecInfo.setCust_id(parameter.get("cust_id").toString());
		ecInfo.setLic_no(parameter.get("lic_no").toString());
		ecInfo.setProvince(parameter.get("province").toString());
		ecInfo.setCity(parameter.get("city").toString());
		ecInfo.setFailure_time(parameter.get("failure_time").toString());
		ecInfo.setFault_adddesc(parameter.get("fault_addresc").toString());
		ecInfo.setS_addr(parameter.get("s_addr").toString());
		ecInfo.setS_lon(parameter.get("s_lon").toString());
		ecInfo.setS_lat(parameter.get("s_lat").toString());
		ecInfo.setFault_reason(parameter.get("fault_reason").toString());
		ecInfo.setCust_demand(parameter.get("cust_demand").toString());
		ecInfo.setEvent_status(parameter.get("event_status").toString());
		ecInfo.setClosed_desc(parameter.get("closed_desc").toString());
		ecInfo.setClosed_time(parameter.get("closed_time").toString());
		
		PLInfo pl_info = new PLInfo();
		pl_info.setPilice_no(plInfo.get("pilice_no").toString());
		pl_info.setPl_result(plInfo.get("pl_result").toString());
		
		HSInfo hs_Info = new HSInfo();
		hs_Info.setHosp_no(hsInfo.get("hosp_no").toString());
		hs_Info.setHs_result(hsInfo.get("hs_result").toString());
		
		ecInfo.setPl_info(pl_info);
		ecInfo.setHs_info(hs_Info);
		
		ecr.setEcInfo(ecInfo);;
		
		
		tspRequest.setSchr(schr);
		tspRequest.setBody(ecr);
		
		//创建xml转换类
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.autodetectAnnotations(true);
		xStream.aliasSystemAttribute(null, "class");
		xStream.aliasField("SCHR", TSPRequest.class, "schr");
		xStream.aliasField("ECR", TSPRequest.class, "body");
		String xmlRequest = xStream.toXML(tspRequest);
		
		//调用T平台接口获取数据
		String xmlResponse = HttpUtil.post(xmlRequest);
		
		
		XStream xStreamToBean = new XStream(new DomDriver());
		xStreamToBean.autodetectAnnotations(true); 
		xStreamToBean.alias("TSP_Req", SLAResponse.class);
		SLAResponse slaResponse = (SLAResponse) xStreamToBean.fromXML(xmlResponse);
		
		//获取返回header
		SCHA scha = slaResponse.getScha();
		String resultCode = "0";
		if (!"0200".equals(scha.getResultcode())) {
			resultCode = "500";
		}
		//获取返回body
		
		
		
		VehicleEmergeInfo info = new VehicleEmergeInfo();
		info.setItem_code("1002");
		info.setItem_name("发动机熄火");
		info.setColl_value("12");
		
		List<VehicleEmergeInfo>  emergeInfoList = new ArrayList<VehicleEmergeInfo>();
		emergeInfoList.add(info);
		
		VehicleEmergeInfoResponse emergeInfo = new VehicleEmergeInfoResponse();
		emergeInfo.setLongitude("E004435069750");
		emergeInfo.setLatitude("N001498639250");
		emergeInfo.setVehicle_emergeinfo(emergeInfoList);
		
		List<VehicleEmergeInfoResponse> recordsetList = new ArrayList<VehicleEmergeInfoResponse>();
		recordsetList.add(emergeInfo);
		
		Response<VehicleEmergeInfoResponse> response  = new Response<VehicleEmergeInfoResponse>();
		response.setH_version_id(request.getH_version_id());
		response.setH_business_id(request.getH_business_id());
		response.setH_language(request.getH_language());
		response.setH_test_flag(request.getH_test_flag());
		response.setH_request_time(request.getH_request_time());
		response.setH_session_id(request.getH_session_id());
		response.setH_request_id(request.getH_request_id());
		response.setH_response_time(null);
		response.setH_priority(request.getH_priority());
		response.setH_package_length(request.getH_package_length());
		response.setH_respackage_length(null);
		response.setH_source(request.getH_source());
		response.setH_service_name(request.getH_service_name());
		response.setH_service_parameter(request.getH_service_parameter());
		response.setH_recordset(recordsetList);
		response.setH_result_code(resultCode);//请求成功标识
		response.setH_source(request.getH_source());
		
		String result = JSON.toJSONString(response);
		logger.info("[车辆故障信息]返回数据为:{}",result);
		
		return result;
	}

	@Override
	public String ecallHelpInfo(String json) {
		logger.info("[车辆紧急救援结果下发]请求参数为:{}",json);
		@SuppressWarnings("unchecked")
		Request<ECallHelpInfoSetRequest> request = (Request<ECallHelpInfoSetRequest>)JSON.parseObject(json,Request.class);
		Map parameter = (Map) request.getH_service_parameter();
		Map plInfo = (Map) parameter.get("pl_info");
		Map hsInfo = (Map) parameter.get("hs_info");
		
		//创建http请求类
		TSPRequest<ECRRequest> tspRequest = new TSPRequest<ECRRequest>();
		
		SCHR schr = new SCHR();
		schr.setProtocol_version(request.getH_version_id());
		schr.setBussiness_id(request.getBusiness_id());
		schr.setServices_type(request.getServices_type());
		schr.setNet_accout(request.getNet_account());
		schr.setNet_passwd(request.getNet_passwd());
		schr.setMsisdn(request.getMsisdn());
		schr.setRequestid(request.getH_request_id());
		schr.setTestflag(request.getH_test_flag());
		
		ECRRequest ecr = new ECRRequest();
		
		ECInfo ecInfo = new ECInfo();
		ecInfo.setEvent_id(parameter.get("event_id").toString());
		ecInfo.setComing_name(parameter.get("coming_name").toString());
		ecInfo.setComing_tel(parameter.get("coming_tel").toString());
		ecInfo.setComing_time(parameter.get("coming_time").toString());
		ecInfo.setCust_id(parameter.get("cust_id").toString());
		ecInfo.setLic_no(parameter.get("lic_no").toString());
		ecInfo.setProvince(parameter.get("province").toString());
		ecInfo.setCity(parameter.get("city").toString());
		ecInfo.setFailure_time(parameter.get("failure_time").toString());
		ecInfo.setFault_adddesc(parameter.get("fault_addresc").toString());
		ecInfo.setS_addr(parameter.get("s_addr").toString());
		ecInfo.setS_lon(parameter.get("s_lon").toString());
		ecInfo.setS_lat(parameter.get("s_lat").toString());
		ecInfo.setFault_reason(parameter.get("fault_reason").toString());
		ecInfo.setCust_demand(parameter.get("cust_demand").toString());
		ecInfo.setEvent_status(parameter.get("event_status").toString());
		ecInfo.setClosed_desc(parameter.get("closed_desc").toString());
		ecInfo.setClosed_time(parameter.get("closed_time").toString());
		
		PLInfo pl_info = new PLInfo();
		pl_info.setPilice_no(plInfo.get("pilice_no").toString());
		pl_info.setPl_result(plInfo.get("pl_result").toString());
		
		HSInfo hs_Info = new HSInfo();
		hs_Info.setHosp_no(hsInfo.get("hosp_no").toString());
		hs_Info.setHs_result(hsInfo.get("hs_result").toString());
		
		ecInfo.setPl_info(pl_info);
		ecInfo.setHs_info(hs_Info);
		ecr.setEcInfo(ecInfo);;
		
		
		tspRequest.setSchr(schr);
		tspRequest.setBody(ecr);
		
		//创建xml转换类
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.autodetectAnnotations(true);
		xStream.aliasSystemAttribute(null, "class");
		xStream.aliasField("SCHR", TSPRequest.class, "schr");
		xStream.aliasField("ECR", TSPRequest.class, "body");
		String xmlRequest = xStream.toXML(tspRequest);
		
		//调用T平台接口获取数据
		String xmlResponse = HttpUtil.post(xmlRequest);
		
		
		XStream xStreamToBean = new XStream(new DomDriver());
		xStreamToBean.autodetectAnnotations(true); 
		xStreamToBean.alias("TSP_Req", SLAResponse.class);
		SLAResponse slaResponse = (SLAResponse) xStreamToBean.fromXML(xmlResponse);
		
		//获取返回header
		SCHA scha = slaResponse.getScha();
		String resultCode = "0";
		if (!"0200".equals(scha.getResultcode())) {
			resultCode = "500";
		}
		//获取返回body
		
		
		
		Response<Object> response  = new Response<Object>();
		response.setH_version_id(request.getH_version_id());
		response.setH_business_id(request.getH_business_id());
		response.setH_language(request.getH_language());
		response.setH_test_flag(request.getH_test_flag());
		response.setH_request_time(request.getH_request_time());
		response.setH_session_id(request.getH_session_id());
		response.setH_request_id(request.getH_request_id());
		response.setH_response_time(null);
		response.setH_priority(request.getH_priority());
		response.setH_package_length(request.getH_package_length());
		response.setH_respackage_length(null);
		response.setH_source(request.getH_source());
		response.setH_service_name(request.getH_service_name());
		response.setH_service_parameter(request.getH_service_parameter());
		response.setH_result_code(resultCode);//请求成功标识
		response.setH_source(request.getH_source());
		
		String result = JSON.toJSONString(response);
		logger.info("[车辆紧急救援结果下发]返回数据为:{}",result);
		
		return result;
	}

	@Override
	public String ringResult(String json) {
		logger.info("[振铃结果上送]请求参数为:{}",json);
		@SuppressWarnings("unchecked")
		Request<RingResultRequest> request = (Request<RingResultRequest>)JSON.parseObject(json,Request.class);
		
		
		Response<Object> response  = new Response<Object>();
		response.setH_version_id(request.getH_version_id());
		response.setH_service_name(request.getH_service_name());
		response.setH_result_code("0");//请求成功标识
		response.setH_source(request.getH_source());
		
		String result = JSON.toJSONString(response);
		logger.info("[振铃结果上送]返回数据为:{}",result);
		
		return result;
	}


}
