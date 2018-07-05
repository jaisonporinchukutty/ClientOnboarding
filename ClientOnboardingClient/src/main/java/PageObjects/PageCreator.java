package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
//Note (OB):
//Without Page Factory we can generate and return a new instance of a page by using below line.
//return pageClass.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver, this.wait);
 
public class PageCreator {
 
    public WebDriver driver;
 
    
    public PageCreator(WebDriver driver){
        this.driver = driver;
    }
 
    //
    public  <TPage extends BasePage> TPage GetInstance (Class<TPage> pageClass) {
        try {
            return PageFactory.initElements(driver,  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}