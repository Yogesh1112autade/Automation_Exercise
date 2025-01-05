package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.ProductsPage;

public class TC08_VerifyAllProducts extends BaseClass{
	
	@Test
	public void verify_product() {
		HomePage h=new HomePage(driver);
		h.Click_Product();
		
		 ProductsPage p=new  ProductsPage(driver);
		 Assert.assertEquals(p.Verify_Page(),"Automation Exercise - All Products"); 
		 
		 p.click_ViewProduct();
		 p.ProductDetails();
		 
	}
	
	

}
