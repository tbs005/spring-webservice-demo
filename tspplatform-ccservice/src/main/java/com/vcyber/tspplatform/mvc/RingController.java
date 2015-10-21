package com.vcyber.tspplatform.mvc;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vcyber.tspplatform.service.client.TSPCCServiceSoap;

/**
 * @author 王炜华
 *
 */
@Controller
public class RingController {
	
	private static final Logger logger = LoggerFactory.getLogger(RingController.class);
	
	@Resource
	TSPCCServiceSoap ringCallService;
	//测试URL：http://localhost:8080/tspplatform-ccservice/ring.html?name=aaa
	@RequestMapping(value="/ring",method=RequestMethod.POST)
	public void ringRequest(@RequestParam("name") String name){
		
		logger.info("请求参数name={}",name);
		System.out.println("请求参数name={}"+name);
		String result = ringCallService.tspcctBoxRing("{\"h_version_id\":\"10.01\",\"h_language\":\"zh\",\"h_service_name\":\"telephonering_request\",\"h_service_parameter\":{\"service_name\":\"telephonering_request\",\"telephone_code\":\"15001111222\"}}");
		System.out.println("result={}"+result);
	}

}
