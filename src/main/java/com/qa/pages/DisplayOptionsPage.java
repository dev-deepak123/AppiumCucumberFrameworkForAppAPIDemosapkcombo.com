package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.util.Test_Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DisplayOptionsPage extends Test_Base{
	

//	initialize the page factory(locater) on the current class
	public DisplayOptionsPage(AppiumDriver<MobileElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	//page Factory or locators
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App']")
	public  MobileElement appLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Action Bar']")
	public  MobileElement actionbarLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Display Options']")
	public  MobileElement displayOptionLable;
	
	@AndroidFindBy(id="com.hmh.api:id/toggle_show_title")
	public  MobileElement showtitleLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App/Action Bar/Display Options']")
	public  MobileElement titlelable;
	
	@AndroidFindBy(id="com.hmh.api:id/toggle_show_custom")
	public  MobileElement showCustomLable;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='CUSTOM VIEW!']")
	public  MobileElement titleOfCustomView;
	
	@AndroidFindBy(id="com.hmh.api:id/toggle_navigation")
	public  MobileElement navigationLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='TAB 1']")
	public  MobileElement titleOfNavigationlable;
	//methods
	
	public void clickApp() {
		appLable.click();
	}
	
	public void clickActionbar() {
		actionbarLable.click();
	}
	
	public void clickDisplayOption() {
		displayOptionLable.click();
	}
	
	public void clickShowtitle() {
		showtitleLable.click();
	}
	
	public void clickShowCustom() {
		showCustomLable.click();
	}
	
	public void clicknavigation() {
		navigationLable.click();
	}
	
	

}
