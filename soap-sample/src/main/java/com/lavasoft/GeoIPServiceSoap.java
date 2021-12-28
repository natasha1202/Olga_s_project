package com.lavasoft;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.1
 * 2020-12-20T00:48:42.086+03:00
 * Generated source version: 3.4.1
 *
 */
@WebService(targetNamespace = "http://lavasoft.com/", name = "GeoIPServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface GeoIPServiceSoap {

    /**
     * <br/>Get Country Name by Country ISO2 code<br/>Paramater:Country Code &nbsp;&nbsp;<b>Type:String<b/><br/>Country code  format is ALPHA-2 (CA - for Canada)
     */
    @WebMethod(operationName = "GetCountryNameByISO2", action = "http://lavasoft.com/GetCountryNameByISO2")
    @RequestWrapper(localName = "GetCountryNameByISO2", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetCountryNameByISO2")
    @ResponseWrapper(localName = "GetCountryNameByISO2Response", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetCountryNameByISO2Response")
    @WebResult(name = "GetCountryNameByISO2Result", targetNamespace = "http://lavasoft.com/")
    public java.lang.String getCountryNameByISO2(

        @WebParam(name = "iso2Code", targetNamespace = "http://lavasoft.com/")
        java.lang.String iso2Code
    );

    /**
     * <br/>Get Country and State XML String for a given ip address in x.x.x.x format<br/><br/>Parameter:GetIpAddress address &nbsp;&nbsp;&nbsp;&nbsp;<b>Type:String</b><br/><br/>Return:format in XML < GeoIP >< Country >US< /Country >< State >PA< /State >< /GeoIP > &nbsp;&nbsp;&nbsp;&nbsp;<b>Type:String</b>
     */
    @WebMethod(operationName = "GetLocation", action = "http://lavasoft.com/GetLocation")
    @RequestWrapper(localName = "GetLocation", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetLocation")
    @ResponseWrapper(localName = "GetLocationResponse", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetLocationResponse")
    @WebResult(name = "GetLocationResult", targetNamespace = "http://lavasoft.com/")
    public java.lang.String getLocation()
;

    /**
     * <br/>Get Country and State XML String for a given ip address in x.x.x.x format<br/><br/>Parameter:GetIpAddress address &nbsp;&nbsp;&nbsp;&nbsp;<b>Type:String</b><br/><br/>Return:format in XML < GeoIP >< Country >US< /Country >< State >PA< /State >< /GeoIP > &nbsp;&nbsp;&nbsp;&nbsp;<b>Type:String</b>
     */
    @WebMethod(operationName = "GetIpLocation", action = "http://lavasoft.com/GetIpLocation")
    @RequestWrapper(localName = "GetIpLocation", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetIpLocation")
    @ResponseWrapper(localName = "GetIpLocationResponse", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetIpLocationResponse")
    @WebResult(name = "GetIpLocationResult", targetNamespace = "http://lavasoft.com/")
    public java.lang.String getIpLocation(

        @WebParam(name = "sIp", targetNamespace = "http://lavasoft.com/")
        java.lang.String sIp
    );

    /**
     * <br/>Get Country ISO2 code by Country Name<br/>Paramater:Country Name &nbsp;&nbsp;<b>Type:String<b/>
     */
    @WebMethod(operationName = "GetCountryISO2ByName", action = "http://lavasoft.com/GetCountryISO2ByName")
    @RequestWrapper(localName = "GetCountryISO2ByName", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetCountryISO2ByName")
    @ResponseWrapper(localName = "GetCountryISO2ByNameResponse", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetCountryISO2ByNameResponse")
    @WebResult(name = "GetCountryISO2ByNameResult", targetNamespace = "http://lavasoft.com/")
    public java.lang.String getCountryISO2ByName(

        @WebParam(name = "countryName", targetNamespace = "http://lavasoft.com/")
        java.lang.String countryName
    );

    /**
     * <br/>Get Country and State XML String for a given ip address in x.x.x.x format<br/><br/>Parameter:GetIpAddress address &nbsp;&nbsp;&nbsp;&nbsp;<b>Type:String</b><br/><br/>Return:format in XML < GeoIP >< Country >US< /Country >< State >PA< /State >< /GeoIP > &nbsp;&nbsp;&nbsp;&nbsp;<b>Type:String</b> or <b>string empty</b> 
     */
    @WebMethod(operationName = "GetIpLocation_2_0", action = "http://lavasoft.com/GetIpLocation_2_0")
    @RequestWrapper(localName = "GetIpLocation_2_0", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetIpLocation20")
    @ResponseWrapper(localName = "GetIpLocation_2_0Response", targetNamespace = "http://lavasoft.com/", className = "com.lavasoft.GetIpLocation20Response")
    @WebResult(name = "GetIpLocation_2_0Result", targetNamespace = "http://lavasoft.com/")
    public java.lang.String getIpLocation20(

        @WebParam(name = "sIp", targetNamespace = "http://lavasoft.com/")
        java.lang.String sIp
    );
}
