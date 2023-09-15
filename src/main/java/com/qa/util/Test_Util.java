package com.qa.util;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;



public class Test_Util extends Test_Base{
	
	
	public static void takeScreenShot(AppiumDriver<MobileElement> wd,String filename) {

		String screenshotFileName = System.getProperty("user.dir");

		File scrFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File(screenshotFileName + "/screenshots/" + filename + ".png"));
		}
		catch (IOException e) {
		e.printStackTrace();
		}
		}

		public static byte[] getByteScreenshot(AppiumDriver<MobileElement> driver) throws IOException
		{


		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
		}		
		
		public void verticalswipe(double start, double end,double anchor1) {
	    	
	    	Dimension size = wd.manage().window().getSize();
	    	int anchor = (int)(size.width*anchor1);
	    	int startPoint = (int)(size.width*start);
	    	int endPoint = (int)(size.width*end);
	    	
	    	new TouchAction(wd).press(point(anchor,startPoint))
	    	.waitAction(waitOptions(ofMillis(1000))).moveTo(point(anchor,endPoint)).release().perform();
	    }
		
		public void clickText(MobileElement mobile) {
			Point point = mobile.getLocation();
		    new TouchAction(wd).tap(PointOption.point(238, 674)).perform();
		}
		
		

}
