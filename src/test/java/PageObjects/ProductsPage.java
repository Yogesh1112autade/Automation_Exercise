package PageObjects;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends basePage{

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id=\"search_product\"]")
	public WebElement search;
	
	@FindBy(xpath="//button[@id=\"submit_search\"]")
	public WebElement clkSearch;
	
	@FindBy(xpath="//div[@class=\"productinfo text-center\"]//p")
    public WebElement ProductName;
	
	@FindBy(xpath="(//a[@class=\"btn btn-default add-to-cart\"])[1]")
	public WebElement ClkAddFristProduct;
	
	@FindBy(xpath="(//a[@class=\"btn btn-default add-to-cart\"])[3]")
	public WebElement ClkAddSecondProduct;
	
	@FindBy(xpath="//button[@class=\"btn btn-success close-modal btn-block\"]")
	public WebElement ClkContinueShopping;
	
	@FindBy(xpath="//p//a[@href=\"/view_cart\"]")
	public WebElement ClkCart;
	
	public String Verify_Page() {
		return driver.getTitle();
	}
	// TC08
	@FindBy(xpath="//a[@href=\"/product_details/1\"]")private WebElement ClkviewProduct;
	@FindBy(xpath="//h2[contains(text(),\"Blue Top\")]")private WebElement GetProductName;
	@FindBy(xpath="//p[contains(text(),\"Women > Tops\")]") private WebElement GetCategory;
	@FindBy(xpath="//span[contains(text(),\"Rs. 500\")]") private WebElement GetPrice;
	@FindBy(xpath="//p[contains(text(),\" In Stock\")]") @CacheLookup private WebElement GetStock;
	@FindBy(xpath="//p[contains(text(),\" New\")]") @CacheLookup private WebElement Getcondition;
	@FindBy(xpath="//p[contains(text(),\" Polo\")]") @CacheLookup private WebElement Getbrand;
	public void click_ViewProduct() {
		ClkviewProduct.click();
	}
	public void ProductDetails() {
		System.out.println("Product:"+GetProductName.getText());
		System.out.println(GetCategory.getText());
		System.out.println("Price:"+GetPrice.getText());
		System.out.println(GetStock.getText());
		System.out.println(Getcondition.getText());
		System.out.println(Getbrand.getText());
		
	}
	
	//TC09
	@FindBy(xpath="//div[@class=\"productinfo text-center\"]//p[contains(text(),\"Top\")]")
	public List <WebElement> GetSearchedProduct;
	
	public void PrintSearchedProduct() {
     for(int i=0;i<GetSearchedProduct.size();i++) {
    	
 		System.out.println( GetSearchedProduct.get(i).getText());
     }

	}
}
