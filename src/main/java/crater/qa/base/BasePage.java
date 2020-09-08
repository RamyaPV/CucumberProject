package crater.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import crater.qa.util.TestUtil;





public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static String propertyfilepath="C:\\Users\\RamyaPV\\Desktop\\Ajira\\Crater\\src\\main\\java\\crater\\qa\\config\\config.properties";
	
	public BasePage(){
		try {
		prop=new Properties();
		
			FileInputStream fis=new FileInputStream(propertyfilepath);
			prop.load(fis);
		}  catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		
	public void initialization() {
		String browsername=prop.getProperty("Browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\RamyaPV\\Desktop\\Ajira\\Crater\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
		}else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\RamyaPV\\Desktop\\Ajira\\Crater\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
			
			
		}
		
	}
	
	public void isFailed() {
		
	}
}





