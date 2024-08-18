package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Created extends basePage {

	public Account_Created(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//li//a[contains(text(),\" Logged in as \")] ")
	WebElement veri_txt_accountCreate;
	
	@FindBy(xpath="//a[@class=\"btn btn-primary\"]")
	WebElement Clk_continue;
	
	@FindBy(xpath="//div[@style=\"cursor: pointer;\"]//svg//path")
	WebElement clkAd;
	
	public String verify_createdAccount() {
		return veri_txt_accountCreate.getText();
	}

	public void click_Continue() {  
		Clk_continue.click();
	}
	public void click_ad() {
		clkAd.click();
	}
	
}
