package stepdefinations;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.qa.pages.SearchPage;
import com.qa.util.Test_Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class App_Search_Step_Defination extends Test_Base{
	
	private static Logger log = LogManager.getLogger(App_Search_Step_Defination.class) ;//Logger
	public SearchPage searchPage = new SearchPage(wd);
	
	@Given("User is on the app")
	public void user_is_on_the_app() {
	    
	}

	@Then("Click on the app")
	public void click_on_the_app() {
		log.info("Click on the app");
		searchPage.appClick();
	}

	@Then("Click on the Search")
	public void click_on_the_search() {
		log.info("********Click on the Search**********");
		searchPage.searchClick();
	}

	@Then("Clcik on Invoke Search")
	public void clcik_on_invoke_search() {
		log.info("********Clcik on Invoke Search**********");
		searchPage.invokeSearchClick();
	}

	@Then("Give the Prefill Query {string}")
	public void give_the_prefill_query(String string) {
		
		log.info("********Give the Prefill Query**********");
		
		//here we assert the title of the page
		assertEquals(searchPage.titleinvokeSearchLable.getText(),"App/Search/Invoke Search");
		log.info("********check the title**********");
		searchPage.fillprefilQuery(string);
		//below we assert that the text which is enter is match which the text we passed
		assertEquals(searchPage.prefilQueryLable.getText(),string);
	}

	@Then("Give the App data {string}")
	public void give_the_app_data(String string) {
		
		log.info("********Give the App data**********");
		searchPage.fillappData(string);
		//below we assert that the text which is enter is match which the text we passed
		assertEquals(searchPage.appdataLable.getText(),string);
	}

}
