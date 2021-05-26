package PageAction;

import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Dashboard extends BaseClass
{
	
	public Dashboard()
	{
		PageFactory.initElements(driver, this);
	}
 
}
