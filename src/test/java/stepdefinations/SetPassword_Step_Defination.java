package stepdefinations;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qa.pages.GraphicPage;
import com.qa.pages.SetPasswordPage;
import com.qa.util.Test_Base;

import io.cucumber.java.en.Then;

public class SetPassword_Step_Defination extends Test_Base{
	
	private static Logger log = LogManager.getLogger(SetPassword_Step_Defination.class) ;//Logger
	public GraphicPage graphicPage = new GraphicPage(wd);
	
	public SetPasswordPage setPasswordPage = new SetPasswordPage(wd);
	
	@Then("click on the App text")
	public void click_on_the_app_text() {
		log.info("********click on the App text************");
		setPasswordPage.clickapp();
	}
	
	@Then("click on the Device admin")
	public void click_on_the_device_admin() {
		log.info("********click on the Device admin************");
		setPasswordPage.clickdeviceAdmin();
	}
	
	@Then("click on the Password expiration")
	public void click_on_the_password_expiration() {
		log.info("********click on the Password expiration************");
		setPasswordPage.clickpasswordExpiration();
	}
	
	@Then("click on the set password")
	public void click_on_the_set_password() {
		log.info("********click on the set password************");
		setPasswordPage.clicksetPassword();
	}
	
	@Then("click on the fingerprint and password")
	public void click_on_the_fingerprint_and_password() {
		
		log.info("********click on the fingerprint and password***********");
		
//		assertEquals(setPasswordPage.titlescreenlockLable.getText(),"Choose screen lock");
       setPasswordPage.clickfingerprintpassword();
		setPasswordPage.clickno();
	}
	
	@Then("send the password {string}")
	public void send_the_password(String string) {
		
		log.info("********send the password***********");
		setPasswordPage.clickpassword(string);
		setPasswordPage.clicknextButton();
	}
	@Then("reenter the confirm password {string}")
	public void reenter_the_confirm_password(String string) {
		log.info("********reenter the confirm password***********");
		setPasswordPage.clickconfirmpassword(string);
	}
	
	@Then("click on the confirm button")
	public void click_on_the_confirm_button() {
		log.info("********click on the confirm button***********");
		setPasswordPage.clickconfirmButton();
	}
	
	@Then("Click on do not show notification")
	public void click_on_do_not_show_notification() {
		log.info("********Click on do not show notification***********");
		setPasswordPage.clickdonotShowNotification();
	}
	
	@Then("click on the confirm")
	public void click_on_the_confirm() {
		log.info("********click on the confirm***********");
		setPasswordPage.clickdonebutton();
		assertEquals(setPasswordPage.title123.getText(),"Touch the sensor");
	}
	@Then("click on skip")
	public void click_on_skip() {
		log.info("********click on skip***********");
		setPasswordPage.clickskipbutton();
	}

}
