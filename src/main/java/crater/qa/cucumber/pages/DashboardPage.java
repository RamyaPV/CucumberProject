package crater.qa.cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import crater.qa.base.BasePage;



public class DashboardPage extends BasePage{
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement dashboardLogo;
	
	@FindBy(xpath="//span[contains(text(),'Assign Leave')]")
	WebElement assigleave;
	@FindBy(xpath="//input[@class='ac_input inputFormatHint']")
	WebElement employeename;
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
	WebElement frmdate;
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
	WebElement todat;
	@FindBy(xpath="//input[@id='assignBtn']")
	WebElement assignbtn;
	@FindBy(xpath="//div[@class='message success fadable']")
	WebElement successmsg;
	
	
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	public String validatetitle() {
		return driver.getTitle();
	}
	public boolean dashbordlogo() {
		return dashboardLogo.isDisplayed();
		
	}
	
	public void assignLeave() {
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf(assigleave));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", assigleave);
		
	}
	
	public void addLeave(String empname,String levetype,String fromdate,String todate) {
		
		employeename.sendKeys(empname);
		Select leavetype_dropdown=new Select(driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']")));
		leavetype_dropdown.selectByVisibleText(levetype);
		frmdate.click();
		WebElement datepicker= driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
		List<WebElement> fromdt=datepicker.findElements(By.tagName("td"));
		for(WebElement cell:fromdt)
		{
			if(cell.getText().contentEquals(fromdate))
			{
				cell.click();
				break;
			}
		}
		todat.click();
		WebElement datepicker1= driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
		List<WebElement> todt=datepicker1.findElements(By.tagName("td"));
		for(WebElement cell:todt)
		{
			if(cell.getText().contentEquals(todate))
			{
				cell.click();
				break;
			}
		}
		
		assignbtn.click();
	}
	public String validatelable() {
		return successmsg.getText();
		
	}
	
}
