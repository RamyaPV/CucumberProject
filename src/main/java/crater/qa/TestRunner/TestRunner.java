package crater.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\RamyaPV\\Desktop\\Ajira\\Crater\\src\\main"
				+ "\\java\\crater\\qa\\Features\\PIM.feature",
		glue= {"crater.qa.stepDefinition"},
		dryRun=false,
		plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		tags = {}
		)

public class TestRunner {
	
	
	

}
