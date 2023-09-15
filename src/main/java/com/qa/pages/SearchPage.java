package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.util.Test_Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPage extends Test_Base{
	
	public SearchPage(AppiumDriver<MobileElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App']")
	public  MobileElement appLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Search']")
	public  MobileElement searchLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invoke Search']")
	public  MobileElement invokeSearchLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App/Search/Invoke Search']")
	public  MobileElement titleinvokeSearchLable;
	
	@AndroidFindBy(id="com.hmh.api:id/txt_query_prefill")
	public  MobileElement prefilQueryLable;
	
	@AndroidFindBy(id="com.hmh.api:id/txt_query_appdata")
	public  MobileElement appdataLable;
	
	//methods
	public void appClick() {
		appLable.click();
	}
	
	public void searchClick() {
		searchLable.click();
	}
	
	public void invokeSearchClick() {
		invokeSearchLable.click();
	}
	
	public void fillprefilQuery(String data) {
		prefilQueryLable.sendKeys(data);
	}
	
	public void fillappData(String data1) {
		appdataLable.sendKeys(data1);
	}


}
