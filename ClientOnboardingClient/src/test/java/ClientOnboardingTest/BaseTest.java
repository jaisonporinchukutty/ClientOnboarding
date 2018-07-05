package ClientOnboardingTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



 
public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    
 
    @BeforeClass
    public void classLevelSetup() {
        //Create a Chrome driver. All test classes use this.
        driver = new ChromeDriver();
 
        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);
 
        //Maximize Window
        driver.manage().window().maximize();
    }
 
    @BeforeMethod
    public void methodLevelSetup () {
        //Instantiate the Page Class
    	
    }
 
    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
