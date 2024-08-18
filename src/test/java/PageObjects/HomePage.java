package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basePage{
    public HomePage(WebDriver driver) {
    	super(driver);
    }

    @FindBy(xpath="//a[@href=\"/login\"]")
    WebElement clkSignUp_OR_Login;
    
    @FindBy(xpath="//a[@href=\"/contact_us\"]")
    WebElement ClkContactUs;
    
    public String Verify_HomePage() {
    	return driver.getTitle();
    }
    public void click_signUp_Login(){
    	clkSignUp_OR_Login.click();
    }
    public void Click_contactus() {
    	ClkContactUs.click();
    }
	}
