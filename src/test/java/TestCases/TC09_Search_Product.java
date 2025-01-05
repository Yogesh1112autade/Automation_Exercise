package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.ProductsPage;

public class TC09_Search_Product extends  BaseClass{
	@Test
	public void Serach() throws InterruptedException {
		String name=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(name);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('Hello, World!');");
		Thread.sleep(3000);
		Assert.assertEquals(title,"Automation Exercise");
		HomePage h=new HomePage(driver);
		h.ClkProduct.click();
		String name1=driver.getTitle();
		
		ProductsPage p=new ProductsPage(driver);
		String value=p.Verify_Page();
		Assert.assertEquals(value, "Automation Exercise - All Products");
		
		p.search.sendKeys("Top");
		p.clkSearch.click();
		p.PrintSearchedProduct();;
//		String product=p.ProductName.getText();
//		Assert.assertEquals(product,"Winter Top");
//		
	}

}
