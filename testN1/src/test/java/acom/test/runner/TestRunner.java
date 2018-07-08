package acom.test.runner;


import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
 @CucumberOptions(
		features = "Feature/Window_Selection.feature"
		,glue={"com.test.stepdefinition"}
		,monochrome=true
		,plugin = "json:target/cucumber-report-feature-composite.json"
		//,plugin = {"pretty", "html:target/cucumber-reports"}
		,tags = {"@SmokeTest"}
		)

		

public class TestRunner {
	
}
 
