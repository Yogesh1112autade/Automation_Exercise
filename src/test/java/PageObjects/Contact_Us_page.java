package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Us_page extends basePage{

	public Contact_Us_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   @FindBy(xpath="(//h2[@class=\"title text-center\"])[2]")
   WebElement verify_Get;
   
   @FindBy(xpath="//input[@name=\"name\"]")
   WebElement txtName;
   
   @FindBy(xpath="//input[@name=\"email\"]")
   WebElement txtEmail;
   
   @FindBy(xpath="//input[@name=\"subject\"]")
   WebElement txtSubject;
   
   @FindBy(xpath="//textarea[@id=\"message\"]")
   WebElement txtYourMessage;
   
   public String Verify_ContactUs_Page() {
	   return verify_Get.getText();
   }
   public void Enter_Name(String name) {
	   txtName.sendKeys(name);
   }
   
   public void Enter_Email(String email) {
	   txtEmail.sendKeys(email);
   }
   
   public void Enter_Subject(String sub) {
	   txtSubject.sendKeys(sub);
   }
   
   public void Enter_Message(String smg) {
	   txtYourMessage.sendKeys(smg);
   }
}
