
package com.vcyber.tspplatform.service.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.6
 * 2015-09-25T08:18:19.831+08:00
 * Generated source version: 3.0.6
 * 
 */
public final class TSPCCServiceSoap_TSPCCServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "TSPCCService");

    private TSPCCServiceSoap_TSPCCServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TSPCCService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TSPCCService ss = new TSPCCService(wsdlURL, SERVICE_NAME);
        TSPCCServiceSoap port = ss.getTSPCCServiceSoap();  
        
        {
        System.out.println("Invoking tspcctBoxRing...");
        java.lang.String _tspcctBoxRing_jsonStr = "{\"h_version_id\":\"10.01\",\"h_language\":\"zh\",\"h_service_name\":\"telephonering_request\",\"h_service_parameter\":{\"service_name\":\"telephonering_request\",\"telephone_code\":\"15001111222\"}}";
        java.lang.String _tspcctBoxRing__return = port.tspcctBoxRing(_tspcctBoxRing_jsonStr);
        System.out.println("tspcctBoxRing.result=" + _tspcctBoxRing__return);


        }

        System.exit(0);
    }

}
