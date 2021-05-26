package stepDefinition;

import com.baseclass.BaseClass;

import PageAction.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD extends BaseClass
{
	LoginPage login;
	
	@Given("^Launch Chrome Browser$")
	public void launch_Chrome_Browser() throws Throwable {
		BaseClass.initialization("url");
//		BaseClass.maximizeBrowser();
//		BaseClass.getUrl("url");
	}

	@When("^Enter UserName and Password$")
	public void enter_UserName_and_Password() throws Throwable {
		login=new LoginPage();
        login.enterUserName();
		login.enterPassword();
		/*driver.findElement(By.xpath(".//input[@placeholder='Email']")).sendKeys("rdixit@delaplex.com");
		driver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys("12345678");*/
	}

	@When("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
		login.loginSubmit();

		//driver.findElement(By.xpath(".//button[@class='md-button atlas-button-blue md-theme-default']")).click();
	}

	@Then("^User should navigate to dashboard$")
	public void user_should_navigate_to_dashboard() throws Throwable 
	{

	}

}
