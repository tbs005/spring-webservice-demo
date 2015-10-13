package com.vcyber.tspplatform.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vcyber.tspplatform.service.client.TSPCCServiceSoap;

public class ClientSpringTest {
	public static void main(String[] args) {
        //创建spring context
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 

		TSPCCServiceSoap soap = context.getBean("ringCallService",TSPCCServiceSoap.class);
		String result = soap.tspcctBoxRing("{\"h_version_id\":\"10.01\",\"h_language\":\"zh\",\"h_service_name\":\"telephonering_request\",\"h_service_parameter\":{\"service_name\":\"telephonering_request\",\"telephone_code\":\"15001111222\"}}");
		
		System.out.println(result);

	}
}
