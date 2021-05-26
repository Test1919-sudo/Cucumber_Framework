package PageAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass
{
	
	
	@FindBy(xpath=".//input[@placeholder='Email']")
	WebElement UserName;
	
	@FindBy(xpath=".//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath=".//button[@class='md-button atlas-button-blue md-theme-default']")
	WebElement Submit;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		}
		

	public void enterUserName(){
		UserName.sendKeys("rdixit@delaplex.com");
	}
	
	public void enterPassword(){
		Password.sendKeys("12345678");
	}
	
	public void loginSubmit(){
		Submit.click();
		
		
	}
	
//	public Dashboard loginSubmit(){
//		Submit.click();
//		
//		return new Dashboard();
//	}
	
}
