package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
	 
	public class LoginPage extends BasePage{
		
		public LoginPage (WebDriver driver) {
	        super(driver);
	    }
	 
		@FindBy(how = How.ID, using = "log")
	 
		public WebElement txtbx_UserName;
	 
		@FindBy(how = How.ID, using = "pwd")
	 
		public WebElement txtbx_Password;
		public void Login()
		{
			
		}
		public void SignIn()
		{
			
		}
		public void ForgotPassword()
		{
			
		}
	}