package crater.qa.stepDefinition;
import java.util.Map;

import org.junit.Assert;

import crater.qa.base.BasePage;
import crater.qa.cucumber.pages.DashboardPage;
import crater.qa.cucumber.pages.LoginPage;
import crater.qa.cucumber.pages.PIMPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class PIMStep extends BasePage {
	
	LoginPage log;
	DashboardPage dashboard;
	PIMPage pim;
	@Given("^User login with \"([^\"]*)\" ,\"([^\"]*)\"$")
	public void user_login_with(String arg1, String arg2) throws Throwable {
		log=new LoginPage();
		dashboard=new DashboardPage();
		pim=new PIMPage();
		log.loginapp(prop.getProperty("Username"),prop.getProperty("Password"));
		String title= dashboard.validatetitle();
		Assert.assertEquals(title,"OrangeHRM");
		System.out.println("User has successfully logged in");
	}
	@When("^User Clicks the Add Employee Link and fills the employee details$")
	public void user_Clicks_the_Add_Employee_Link_and_fills_the_employee_details(DataTable empdetails) throws Throwable {
//		pim.clickPIM();
//		boolean addemployeelable=pim.validatelable();
//		System.out.println("Add Employee Lable is Displayed :" +addemployeelable);

		for(Map<String,String> values:empdetails.asMaps(String.class, String.class)) {
			pim.clickPIM();
			boolean addemployeelable=pim.validatelable();
			System.out.println("Add Employee Lable is Displayed :" +addemployeelable);
			pim.addEmployee(values.get("firstName"), values.get("lastName"));
			
			}
	
	}
    @Then("^Employee should be added successfully$")
	public void employee_should_be_added_successfully() throws Throwable {
		pim.personaldetails();
	    System.out.println("Employee Added Successfully");
	}
    
    @When("^User Clicks the Edit  and fills the employee Personal details$")
    public void user_Clicks_the_Edit_and_fills_the_employee_Personal_details(DataTable emp_editdetails) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    	for(Map<String,String> editdetails:emp_editdetails.asMaps(String.class, String.class))
    	{
    	pim.editPersonaldetails(editdetails.get("empname"),editdetails.get("gender"), editdetails.get("nationality"), editdetails.get("Marital status"), editdetails.get("DOB"));	
    	}
        
    }

    @Then("^Employee details should be edited and successfully$")
    public void employee_details_should_be_edited_and_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	
    	System.out.println("Emp Details are successfully edited");
       
    }




	
}



