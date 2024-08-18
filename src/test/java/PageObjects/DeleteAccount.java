package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccount extends basePage{

	public DeleteAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//li//a//b")
	WebElement chkloggedName;
	
	@FindBy(xpath="//a[@href=\"/delete_account\"]")
	WebElement clkDeleteAccount;
	
	@FindBy(xpath="//b[contains(text(),\"Account Deleted!\")]")
	WebElement veriDeleteAccount;
	
	public String Check_loggeedName() {
		return chkloggedName.getText();
	}
   public void clickAccountDelete() {
	   clkDeleteAccount.click();
   }
   
   public String Check_DeleteAccout() {
		return veriDeleteAccount.getText();
	}
}
