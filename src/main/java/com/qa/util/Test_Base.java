package com.qa.util;

import java.net.URL;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Test_Base {
	
	public static AppiumDriver<MobileElement> wd ;
    public static AppiumDriverLocalService service;
	
	public static Properties prop;
 
    public static void setup() {
    	
    	
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	Xls_Reader reader = new Xls_Reader("./src/main/java/com/qa/util/Book1.xlsx");
    	System.out.println("******************************************************"+reader.sheet.getRow(1).getCell(1).getStringCellValue());
    	capabilities.setCapability("platformVersion",reader.sheet.getRow(0).getCell(1).getStringCellValue());
    	capabilities.setCapability("platformName", reader.sheet.getRow(1).getCell(1).getStringCellValue());
    	capabilities.setCapability("appPackage", reader.sheet.getRow(2).getCell(1).getStringCellValue());
    	capabilities.setCapability("appActivity", reader.sheet.getRow(3).getCell(1).getStringCellValue());
    	capabilities.setCapability("app",reader.sheet.getRow(5).getCell(1).getStringCellValue() );
    	capabilities.setCapability("deviceName",reader.sheet.getRow(4).getCell(1).getStringCellValue());
    	capabilities.setCapability("fullReset", true);
    	capabilities.setCapability("isHeadless", true);
    	
    	try {
    		wd = new AppiumDriver<MobileElement>(new URL(reader.sheet.getRow(6).getCell(1).getStringCellValue()),capabilities);
    		wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
       

}