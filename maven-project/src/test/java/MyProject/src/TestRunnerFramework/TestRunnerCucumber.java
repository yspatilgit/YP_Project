package TestRunnerFramework;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature" , glue = {"StepLibraryFramework"}, tags = ("@Testirctc") 
			//plugin = {"pretty:targetPretty/cucumber", "html:targetCucumber/cucumber", "json:targetJson/cucumber", "junit:targetJunit/cucumber"},
			
		)

public class TestRunnerCucumber {
	
	

}
