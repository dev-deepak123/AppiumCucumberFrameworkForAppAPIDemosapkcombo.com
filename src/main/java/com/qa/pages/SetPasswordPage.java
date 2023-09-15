package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.util.Test_Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SetPasswordPage extends Test_Base{
	
	public SetPasswordPage(AppiumDriver<MobileElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App']")
	public  MobileElement appLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Device Admin']")
	public  MobileElement deviceAdminLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Password expiration']")
	public  MobileElement passwordExpirationLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Set password (user)']")
	public  MobileElement setPasswordLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Unlock selection']")
	public  MobileElement titleOfUnlockLable;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Fingerprint + Password']")
	public  MobileElement fingerprintpasswordLable;
	
	@AndroidFindBy(id="com.android.settings:id/encrypt_dont_require_password")
	public  MobileElement nolable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Choose screen lock']")
	public  MobileElement titlescreenlockLable;
	
	@AndroidFindBy(id="com.android.settings:id/password_entry")
	public  MobileElement passwordLable;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='NEXT']")
	public  MobileElement nextButtonLable;
	
	@AndroidFindBy(id="com.android.settings:id/password_entry")
	public  MobileElement confirmpasswordLable;
	
	@AndroidFindBy(id="com.android.settings:id/next_button")
	public  MobileElement confirmButtonLable;
	
	@AndroidFindBy(id="com.android.settings:id/hide_all")
	public  MobileElement donotShowNotificationLable;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='DONE']")
	public  MobileElement donebuttonLable;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='SKIP']")
	public  MobileElement skipbuttonLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Touch the sensor']")
	public  MobileElement title123;
	
	@AndroidFindBy(id="com.android.settings:id/suw_layout_title")
	public  MobileElement titleofpagesensor;
	
	
	//methods
	public void clickapp() {
		appLable.click();
	}
	
	public void clickdeviceAdmin() {
		deviceAdminLable.click();
	}
	
	public void clickpasswordExpiration() {
		passwordExpirationLable.click();
	}
	
	public void clicksetPassword() {
		setPasswordLable.click();
	}
	
	public void clickfingerprintpassword() {
		fingerprintpasswordLable.click();
	}
	
	public void clickno() {
		nolable.click();
	}
	
	public void clickpassword(String pass) {
		passwordLable.sendKeys(pass);;
	}
	
	public void clicknextButton() {
		nextButtonLable.click();
	}
	
	public void clickconfirmpassword(String pass1) {
		confirmpasswordLable.sendKeys(pass1);;
	}
	
	public void clickconfirmButton() {
		confirmButtonLable.click();
	}
	
	public void clickdonotShowNotification() {
		donotShowNotificationLable.click();
	}
	
	public void clickdonebutton() {
		donebuttonLable.click();
	}
	
	public void clickskipbutton() {
		skipbuttonLable.click();
	}

}
