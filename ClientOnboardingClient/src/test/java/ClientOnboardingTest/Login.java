package ClientOnboardingTest;

import org.testng.annotations.Test;

import ClientOnboarding.LoginManager;

public class Login extends BaseTest{
	@Test (priority = 0)
    public void LoginToApplication()
	{
		LoginManager loginManager = new LoginManager(driver);
		loginManager.LoginToApplication();
	}
}
