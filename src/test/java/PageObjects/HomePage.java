package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends basePage{
    public HomePage(WebDriver driver) {
    	super(driver);
    }

    @FindBy(xpath="//a[@href=\"/login\"]")
    public WebElement clkSignUp_OR_Login;
    
    @FindBy(xpath="//a[@href=\"/contact_us\"]")
    public WebElement ClkContactUs;
    
    @FindBy(xpath="//li//a[@href=\"/test_cases\"]")
    public WebElement ClkTestCases;
    
    @FindBy(xpath="//a[@href='/products']")
    public  WebElement ClkProduct;
    
    @FindBy(xpath="(//a[@href=\"/view_cart\"])[1]")
    public WebElement Clkcart;
    
    public String Verify_HomePage() {
    	return driver.getTitle();
    }
    public void click_signUp_Login(){
    	clkSignUp_OR_Login.click();
    }
    public void Click_contactus() {
    	ClkContactUs.click();
    }
    public void Click_TestCases() {
    	ClkTestCases.click();
    	 }
    public void Click_Product() {
    	ClkProduct.click();
    	String name=driver.getTitle();
    	System.out.println("NAme:"+name);
    }
    
    public void Click_cart() {
    	Clkcart.click();
    }
    //TC13
    
    @FindBy(xpath="//a[@href=\"/product_details/2\"]")
    public WebElement btnMenTShirtviewProduct;
    
    @FindBy(xpath="//input[@name=\"quantity\"]")
    public WebElement btnQuantity;
    
    @FindBy(xpath="//button[@class=\"btn btn-default cart\"]")
    public WebElement btnAddCart;
    
    @FindBy(xpath="//u[contains(text(),\"View Cart\")]")
    public WebElement btnViewCart;
    
    @FindBy(xpath="//td[@class=\"cart_quantity\"]")
    public WebElement btnCheckQuantity;
    
    public void Click_View_Product() {
    	btnMenTShirtviewProduct.click();
    	System.out.println(driver.getTitle());
    	Assert.assertEquals("Automation Exercise - Product Details", driver.getTitle());
    	btnQuantity.clear();
    	btnQuantity.sendKeys("10");
    	
    	btnAddCart.click();
    	btnViewCart.click();
    	System.out.println("Check Quantity:"+btnCheckQuantity.getText());
    	Assert.assertEquals("10",btnCheckQuantity.getText());
    }
    
	}
