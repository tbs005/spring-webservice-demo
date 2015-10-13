package com.vcyber.tspplatform.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.vcyber.tspplatform.cc.response.UserInfo;

public class XMLTransfer {
	
	private static final Logger logger = LoggerFactory.getLogger(XMLTransfer.class);

	public static String ccXMLTransfer(UserInfo userInfo){
		
		//new XmlFriendlyNameCoder("_-", "_") 去掉生成的下划线
		XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
		xStream.alias("Table", UserInfo.class);
		String xml = xStream.toXML(userInfo);
		
		StringBuilder result  = new StringBuilder();
		result.append("<NewDataSet>");
		result.append(xml);
		result.append("</NewDataSet>");
		
		logger.info("ccXMLTransfer xml is:{}",result.toString());
		return result.toString();
	}
	
	
}
