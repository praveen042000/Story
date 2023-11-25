package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags="@ValidCredentials" ,features="src/test/resources/Feature/Login.feature",
glue ="stepDefinition",
plugin= {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"pretty", "html:target/cucumber/cucumber-reports.html",
		"json:target/cucumber/cucumber-reports.json"
})

public class CucumberRunner {
	

}
