package stepdefinations;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qa.pages.DisplayOptionsPage;
import com.qa.util.Test_Base;

import io.cucumber.java.en.Then;


public class App_Display_Option_Step_defination extends Test_Base{
	
	private static Logger log = LogManager.getLogger(App_Display_Option_Step_defination.class) ;//Logger
	
	public DisplayOptionsPage dispalyOptionPage = new DisplayOptionsPage(wd);
	
	@Then("click on the App button")
	public void click_on_the_app_button() {
		log.info("*****here we click on the App button*************");
		dispalyOptionPage.clickApp();
	}

	@Then("click on the Action Bar")
	public void click_on_the_action_bar() {
		log.info("*****here we click on the Action Bar*************");
		dispalyOptionPage.clickActionbar();
	}

	@Then("click on the Display Options")
	public void click_on_the_display_options() {
		log.info("*****click on the Display Options*************");
		dispalyOptionPage.clickDisplayOption();
	}

	@Then("click on the Display_show_title and verify it")
	public void click_on_the_display_show_title_and_verify_it() throws InterruptedException {
		
		log.info("*****click on the Display_show_title and verify it*************");
		dispalyOptionPage.clickShowtitle();
		Thread.sleep(1000);
		dispalyOptionPage.clickShowtitle();
		assertEquals(dispalyOptionPage.titlelable.getText(),"App/Action Bar/Display Options");
	}

	@Then("click on the Display_show_custom and verify it")
	public void click_on_the_display_show_custom_and_verify_it() {
		
		log.info("*****click on the Display_show_custom and verify it*************");
		dispalyOptionPage.clickShowtitle();
		dispalyOptionPage.clickShowCustom();
		assertEquals(dispalyOptionPage.titleOfCustomView.getText(),"CUSTOM VIEW!");
	}

	@Then("click on Navigation and verify it")
	public void click_on_navigation_and_verify_it() {
		
		log.info("*****click on Navigation and verify it*************");
		dispalyOptionPage.clickShowCustom();
		dispalyOptionPage.clicknavigation();
		assertEquals(dispalyOptionPage.titleOfNavigationlable.getText(),"TAB 1");
	    
	}

}
