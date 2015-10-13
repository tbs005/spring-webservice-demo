package com.vcyber.tspplatform.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.vcyber.tspplatform.service.client.TSPCCServiceSoap;

public class ClientTest {
	public static void main(String[] args) {
        //调用WebService参考示例
		
		//创建服务工厂类
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        //设置远程服务提供类
        factory.setServiceClass(TSPCCServiceSoap.class);
        //设置服务地址
        factory.setAddress("http://59.46.215.194:5355/TSPCCService.asmx");

        
        //调用服务工厂创建远程服务接口
        TSPCCServiceSoap service = (TSPCCServiceSoap) factory.create();

        //调用服务接口方法发送请求参数
        String result = service.tspcctBoxRing("{\"h_version_id\":\"10.01\",\"h_language\":\"zh\",\"h_service_name\":\"telephonering_request\",\"h_service_parameter\":{\"service_name\":\"telephonering_request\",\"telephone_code\":\"15001111222\"}}");

        System.out.println(result);


	}
}
