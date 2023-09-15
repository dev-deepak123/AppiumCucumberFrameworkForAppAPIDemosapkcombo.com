package hooks;

import io.appium.java_client.service.local.AppiumDriverLocalService;




import com.qa.util.Test_Base;
import com.qa.util.Test_Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Test_Base{
		
	@Before
	public void startAppium1() {
		service = AppiumDriverLocalService.buildDefaultService();
    	service.start();
		setup();	
	}
	

	@After
	public void stopappium(Scenario scenario){
		if(scenario.isFailed()) {
			Test_Util.takeScreenShot(wd, scenario.getName());

			}
		
    	wd.quit();
    	service.stop();
    }
	

}
