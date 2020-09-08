package crater.qa.stepDefinition;

import java.util.Map;

import org.junit.Assert;

import crater.qa.base.BasePage;
import crater.qa.cucumber.pages.DashboardPage;
import crater.qa.cucumber.pages.LoginPage;
import crater.qa.cucumber.pages.PIMPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashBoardSteps extends BasePage {
	LoginPage log;
	PIMPage pim;
	DashboardPage dashboard;
	
	@Given("^User login with \"([^\"]*)\" ,\"([^\"]*)\" and  is in Dashboardpage$")
	
	public void user_login_with(String arg1, String arg2) throws Throwable {
		log=new LoginPage();
		dashboard=new DashboardPage();
		pim=new PIMPage();
		log.loginapp(prop.getProperty("Username"),prop.getProperty("Password"));
		String title= dashboard.validatetitle();
		Assert.assertEquals(title,"OrangeHRM");
		System.out.println("User has successfully logged in");
	}
//	public void user_login_with_and_is_in_Dashboardpage(String arg1, String arg2) throws Throwable {
//	   log=new LoginPage();
//	   dashboard=new DashboardPage();
//	   log.loginapp(prop.getProperty("Username"), prop.getProperty("Password"));
//	   String title= dashboard.validatetitle();
//		Assert.assertEquals(title,"OrangeHRM");
//		boolean logoispresent=dashboard.dashbordlogo();
//		System.out.println("ORANGE HRM Logo is displayed :" + logoispresent);
//	}

	@When("^user clicks the Assign leave link and  fills the Assign leave form for an Employee$")
public void user_clicks_the_Assign_leave_link_and_fills_the_Assign_leave_form_for_an_Employee(DataTable assignleave) throws Throwable {
		dashboard.assignLeave();
	  for(Map<String,String> valu:assignleave.asMaps(String.class, String.class)) {
		  //dashboard.assignLeave();
		  dashboard.addLeave(valu.get("EmployeeName"), valu.get("Leave Type"), valu.get("From Date"), valu.get("To Date"));  
	  }
	}

	@Then("^User should be able to Assign leave for the Employee$")
	public void user_should_be_able_to_Assign_leave_for_the_Employee() throws Throwable {
	    String label=dashboard.validatelable();
	    System.out.println(label);
	    Assert.assertEquals(label, "Successfully Assigned");
	}
	

}



