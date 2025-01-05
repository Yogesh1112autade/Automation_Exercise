package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends basePage{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id=\"susbscribe_email\"]")
	WebElement TxtEmail;
	
	@FindBy(xpath="//i[@class=\"fa fa-arrow-circle-o-right\"]")
	WebElement ClkArrow;
	
	@FindBy(xpath="//a[contains(text(),\"Blue Top\")]")
	public WebElement checkFristProduct;
	
	@FindBy(xpath="//a[contains(text(),\"Men Tshirt\")]")
	public WebElement CheckSecondProduct;
	
	public void EnterEmail(String email) {
		TxtEmail.sendKeys(email);
	}
	
	public void Click_Arrow() {
		ClkArrow.click();
	}

}
