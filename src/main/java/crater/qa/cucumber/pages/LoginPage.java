package crater.qa.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crater.qa.base.BasePage;




public class LoginPage extends BasePage{

	@FindBy(name="txtUsername")
	WebElement username;
	@FindBy(name="txtPassword")
	WebElement password;
	@FindBy(name="Submit")
	WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public  void loginapp(String uname,String pass) throws InterruptedException {
		username.sendKeys(uname);
		password.sendKeys(pass);
		Thread.sleep(5000);
		login.click();
		
	}
	
	
	
	

	
}
 
