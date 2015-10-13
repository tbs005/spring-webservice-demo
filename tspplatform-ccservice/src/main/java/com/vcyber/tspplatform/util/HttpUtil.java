package com.vcyber.tspplatform.util;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http接口调用工具类
 * @author 王炜华
 *
 */
public class HttpUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(XMLTransfer.class);
    /** 
     *  post调用http接口获取数据
     */  
    public static String post(String xml) {  
    	logger.info("HttpUtil Request xml is:{}",xml);
    	
    	HttpClient client = new DefaultHttpClient();  
        HttpPost post = new HttpPost("http://139.196.23.90:8080/tspCANBUS/SafeCallServlet");  
  
        StringEntity paramEntity = null;
		try {
			paramEntity = new StringEntity(xml,"UTF-8");
		} catch (UnsupportedEncodingException e1) {
			logger.error("HttpUtil.post StringEntity error:{}",e1);
		}
 
		post.setEntity(paramEntity);
		
		post.setHeader("Content-Type", "text/xml;charset=utf-8");
		
        HttpResponse response = null;
		try {
			response = client.execute(post);
		} catch (IOException e) {
			logger.error("HttpUtil execute(post) error:{}",e);
		}  
  
   
        HttpEntity entity = response.getEntity();  
        
        String entityMsg = null;
        
		try {
			entityMsg = EntityUtils.toString(entity,"UTF-8");
		} catch (ParseException e) {
			logger.error("HttpUtil entity parse error:{}",e);
		} catch (IOException e) {
			logger.error("HttpUtil entity parse IO error:{}",e);
		}
		
		logger.info("HttpUtil Response xml is:{}",entityMsg);
		return entityMsg;
    } 
    
/*    public static void main(String[] args) {
    	HttpUtil http = new HttpUtil();
    	System.out.println(http.post(""));
	}*/
}
