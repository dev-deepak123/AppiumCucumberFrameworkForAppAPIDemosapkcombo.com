package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.util.Test_Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateContactPage extends Test_Base{
	
	public CreateContactPage(AppiumDriver<MobileElement> wd) {
        PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	
	//Locater for create conatact page
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Text']")
	public  MobileElement testLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Linkify']")
	public  MobileElement linkifyLable;
	
	@AndroidFindBy(id="com.hmh.api:id/text4")
	public  MobileElement textLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Create new contact']")
	public  MobileElement createNewContactLable;
	
	@AndroidFindBy(id="com.android.contacts:id/left_button")
	public  MobileElement cancelLable;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='First name']")
	public  MobileElement fisrtNameLable;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Last name']")
	public  MobileElement lastNameLable;
	
	@AndroidFindBy(id="com.android.contacts:id/delete_button")
	public  MobileElement deleteLable;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Phone']")
	public  MobileElement phoneLable;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Home']")
	public  MobileElement select1Lable;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Work']")
	public  MobileElement workLable;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email']")
	public  MobileElement emailLable;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@content-desc='Email']")
	public  MobileElement emailAddressLable;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Work']")
	public  MobileElement work1Lable;
	
	@AndroidFindBy(id="com.android.contacts:id/editor_menu_save_button")
	public  MobileElement saveContactLable;
	
	@AndroidFindBy(id="com.android.contacts:id/title_gradient")
	public  MobileElement titleOfCreatedContactLable;
	
	
	//Methods for create contact page
	
	public void clicktest() {
		testLable.click();
	}
	
	public void clicklinkify() {
		linkifyLable.click();
	}
	
	public void clicktext() {
		textLable.click();
	}
	
	public void clickcreateNewContact() {
		createNewContactLable.click();
	}
	
	public void fillfisrtName(String string) {
		fisrtNameLable.sendKeys(string);;
	}
	
	public void filllastName(String string) {
		lastNameLable.sendKeys(string);;
	}
	
	public void fillphone1Lable(String string) {
		deleteLable.click();
		phoneLable.sendKeys(string);
	}
	
	public void clickselect1() {
		select1Lable.click();
		workLable.click();
	}

	
	
	public void fillEmail(String string) {
		emailLable.sendKeys(string);;
	}
	
	public void clickemailAddress() {
		emailAddressLable.click();
		work1Lable.click();
		
	}
	
	public void clicksaveContact() {
		saveContactLable.click();
		
	}
	
	public boolean title_contact() {
	   titleOfCreatedContactLable.getText();
	return  true;
}
	

	
	

}
