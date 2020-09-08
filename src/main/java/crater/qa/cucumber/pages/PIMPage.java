package crater.qa.cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import crater.qa.base.BasePage;

public class PIMPage extends BasePage {
	
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimlink;
	@FindBy(xpath="//a[contains(text(),'Add Employee')]")
	WebElement addEmployeelink;
	@FindBy(xpath="//h1[contains(text(),'Add Employee')]")
	WebElement addemplable;
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@class='duplexBox']")
	WebElement uploadpic;
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement save;
	@FindBy(xpath="//h1[contains(text(),'Personal Details')]")
	WebElement pdlable;
	@FindBy(xpath="//input[@value='Edit']")
	WebElement personaldetailseditbtn;
	@FindBy(xpath="//li//input/..//label[contains(text(),'Male')]")
	WebElement radiomale;
	@FindBy(xpath="//li//input/..//label[contains(text(),'Female')]")
	WebElement radiofemale;
	@FindBy(xpath="//input[@id='personal_DOB']")
	WebElement dob;
	@FindBy(linkText="Employee List")
	WebElement emplist_link;
	@FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
	WebElement emp_name;
	@FindBy(xpath="//input[@name='_search']")
	WebElement search_btn;
	@FindBy(linkText="0079")
	WebElement id;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickPIM() {
		Actions action=new Actions(driver);
		action.moveToElement(pimlink).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(addEmployeelink));
		addEmployeelink.click();
	}
	public boolean validatelable() {
		return addemplable.isDisplayed();
	}
	
	public void addEmployee(String firstName,String lastName) throws Exception {
		
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
//		try {
//			Thread.sleep(3000);
//			uploadpic.sendKeys("C:\\Users\\RamyaPV\\Desktop\\pics\\picimage.jfif");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//			System.out.println("Unable to upload pic" + e);
//			
//		}
//	Thread.sleep(2000);
		save.click();
		
		
	}
	
	public boolean personaldetails() {
		return pdlable.isDisplayed();
	}
	
	public void editPersonaldetails(String empname,String gender,String nationality,String Maritalstatus,String DOB) {
		//to click emp list
		Actions action_click=new Actions(driver);
		action_click.moveToElement(pimlink).build().perform();
		emplist_link.click();
		emp_name.sendKeys(empname,Keys.ENTER);
		search_btn.click();
		id.click();
		personaldetailseditbtn.click();
		//selecting the Gender Radio button based on input
		List<WebElement> radiooptions=driver.findElements(By.xpath("//input[@name='personal[optGender]']"));
		int count=radiooptions.size();
		for(int i=0;i<count;i++) {
			String value=radiooptions.get(i).getAttribute("value");
			if(value.equals(gender)) {
				radiooptions.get(i).click();
				break;
			}
			}
		//to select the nationality
		Select natinalty_dropdown=new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
		natinalty_dropdown.selectByVisibleText(nationality);
		//to select the marital status 
		Select maritalstatus_dropdown=new Select(driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")));
		maritalstatus_dropdown.selectByVisibleText(Maritalstatus);
		//date of birth calendar but entering as text
		dob.sendKeys(DOB,Keys.ENTER);
		
		
	}
	
	

}
