package crater.qa.stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import crater.qa.base.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BasePage {
	@Before
	public void setUp(Scenario scenario) {
		initialization();
		
	}
	@After
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed()) {
			String testname=scenario.getName();
			System.out.println("The Scenario "+testname+" is failed");
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File src=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\RamyaPV\\Desktop\\Ajira\\Crater\\src\\failed\\screenshot\\failedscreenshot.png");
			try {
				FileUtils.copyFile(src, destination);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		//driver.quit();
	}

}
