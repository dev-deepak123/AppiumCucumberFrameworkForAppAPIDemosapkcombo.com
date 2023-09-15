package stepdefinations;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import com.qa.pages.CreateContactPage;
import com.qa.pages.DisplayOptionsPage;
import com.qa.util.Test_Base;
import com.qa.util.Test_Util;

import io.cucumber.java.en.Then;

public class Create_New_Contact_Step_Defination extends Test_Base{
	
	private static Logger log = LogManager.getLogger(Create_New_Contact_Step_Defination.class) ;//Logger
	
	public CreateContactPage createContactPage = new CreateContactPage(wd);
	Test_Util util = new Test_Util();
	
	@Then("user click on the text")
	public void user_click_on_the_text() {
		log.info("*****user click on the text*************");
		createContactPage.clicktest();;
	}
	
	@Then("user click on the Linkify")
	public void user_click_on_the_linkify() {
		log.info("*****user click on the Linkify*************");
		createContactPage.clicklinkify();
	}
	
	@Then("click on the here")
	public void click_on_the_here() {
		log.info("*****click on the here text*************");
		util.clickText(createContactPage.textLable);
	}
	
	@Then("click on the Create new contact")
	public void click_on_the_create_new_contact() throws InterruptedException {
		
		log.info("*****click on the Create new contact*************");
		createContactPage.clickcreateNewContact();
		
	}
	
	@Then("click on the cancel")
	public void click_on_the_cancel() {
		
		
		
		try {
			
			String str = createContactPage.cancelLable.getText();
			
			if(str == str)
			{
				log.info("*****click on the cancel*************");
				createContactPage.cancelLable.click();
			}
			
			
		} catch(Exception e) {
			
		}
		
		
	}
	
	@Then("fill the first name {string}")
	public void fill_the_first_name(String string) {
		log.info("*****fill the first name*************");
		createContactPage.fillfisrtName(string);
	}
	
	@Then("fill the last name {string}")
	public void fill_the_last_name(String string) {
		log.info("*****fill the Last name*************");
		createContactPage.filllastName(string);
	}

	@Then("enter the phone number {string}")
	public void enter_the_phone_number(String string) {
		log.info("*****enter the phone number*************");
		createContactPage.fillphone1Lable(string);
	}
	@Then("select the home")
	public void select_the_home() {
		log.info("*****select the home*************");
		createContactPage.clickselect1();
		
	}
	@Then("enter the email {string}")
	public void enter_the_email(String string) {
		log.info("*****enter the email*************");
		util.verticalswipe(0.90, 0.10, 0.90);
		createContactPage.fillEmail(string);
	}
	@Then("select mobile")
	public void select_mobile() {
		log.info("*****select mobile from scroll bar*************");
		createContactPage.clickemailAddress();
	}
	@Then("Clcik on Save")
	public void clcik_on_save() {
		log.info("*****Clcik on Save*************");
		createContactPage.clicksaveContact();
	}
	@Then("Check that number is save or not")
	public void check_that_number_is_save_or_not() {
		log.info("*****Check that number is save or not*************");
		Assert.assertTrue(createContactPage.title_contact());
	}

}
