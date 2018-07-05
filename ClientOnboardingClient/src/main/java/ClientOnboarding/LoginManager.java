package ClientOnboarding;

import org.openqa.selenium.WebDriver;


import PageObjects.LoginPage;
import PageObjects.PageCreator;

public class LoginManager {
	WebDriver driver;
	PageCreator pageCreator;
	public LoginManager(WebDriver webDriver)
	{
		driver = webDriver;
		pageCreator= new PageCreator(driver);
		
	}
	public void LoginToApplication()
	{
		LoginPage loginPage =  pageCreator.GetInstance(LoginPage.class);
		loginPage.Login();
				
	}
}
