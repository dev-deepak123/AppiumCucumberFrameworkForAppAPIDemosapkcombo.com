package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.Test_Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnimationPage extends Test_Base{
	
//	initialize the page factory(locater) on the current class
	public AnimationPage(AppiumDriver<MobileElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	//Page factory or Locater of animation page
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Animation']")
	public  MobileElement animationLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Hide-Show Animations']")
	public  MobileElement hide_showlable;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='0']")
	public MobileElement zeroButtonlable;
	
	@AndroidFindBy(id="com.hmh.api:id/addNewButton")
	public  MobileElement showButtonLable;
	
	//methods for animation page
	public void selectAnimation() {
		animationLable.click();
	}
	
	public void selectHideShow() {
		hide_showlable.click();
	}
	
	public void clickonZero() {
		zeroButtonlable.click();
	}
	
	public void clickshowButton() {
		showButtonLable.click();
	}
	
}
