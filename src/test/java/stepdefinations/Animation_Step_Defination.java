package stepdefinations;

import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import com.qa.pages.AnimationPage;
import com.qa.util.Test_Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Animation_Step_Defination extends Test_Base{
	
	private static Logger log = LogManager.getLogger(Animation_Step_Defination.class) ;//Logger
	
	 public AnimationPage animationPage = new AnimationPage(wd);
	
	
	
	@Given("User is in the app")
	public void user_is_in_the_app() {
	    
	}

	@Then("click on Animation button")
	public void click_on_animation_button() {
		log.info("*************here we click on animation text*************");
		animationPage.selectAnimation();
	}

	@Then("click on the Hide-Show Animation")
	public void click_on_the_hide_show_animation() {
		log.info("*************here we click on  Hide-Show Animation text*************");
		animationPage.selectHideShow();
	}

	@Then("click on zero")
	public void click_on_zero() {
		log.info("*************here we click on zero*************");
		animationPage.clickonZero();
		
	}

	@Then("verify that zero is gone or not")
	public void verify_that_zero_is_gone_or_not() {
		
		log.info("*************here we verify that zero is gone or not*************");
		 boolean elText1=false;

		try {
			wd.findElementByXPath("//android.widget.Button[@text='0']");
		}catch(Exception e) {
			elText1=true;
		}
		 
		  Assert.assertTrue(elText1,"Zero element  present on the app screen");
		  
			
	}

	@Then("click on the show button")
	public void click_on_the_show_button() throws InterruptedException {
		log.info("*************here we click on the show button*************");
		animationPage.clickshowButton();
		Thread.sleep(3000);
		
	}

	@Then("verify that zero is visible or not")
	public void verify_that_zero_is_visible_or_not() {
		log.info("*************verify that zero is visible or not*************");
		String elText = animationPage.zeroButtonlable.getText();
		Assert.assertEquals(elText, "0");
	}

}
