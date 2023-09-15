package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features="src/test/java/features",
			glue = 	{"stepdefinations","hooks"},	

			dryRun = false, //true //false
			monochrome = true,
			tags = "@tag1"
		
	)
	public class ApiDemoRunner extends AbstractTestNGCucumberTests {
		
		

	}