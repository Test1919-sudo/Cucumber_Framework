package stepDefinition;

import com.baseclass.BaseClass;

import PageAction.Dashboard;
import PageAction.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardSD extends BaseClass
{
	LoginPage login;
	Dashboard dashboard;
	
	@Given("^Login to application$")
	public void login_to_application() throws Throwable {
	    login.enterUserName();
	    login.enterPassword();
	    login.loginSubmit();
	}

	@When("^Verify page title$")
	public void verify_page_title() throws Throwable {
	    
	}

	@Then("^User should able to filter/Task List/Notification list on dashboard$")
	public void user_should_able_to_filter_Task_List_Notification_list_on_dashboard() throws Throwable {
	   
	}


}
