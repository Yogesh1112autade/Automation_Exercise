package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductsPage;

public class TC12_AddProductInCart extends BaseClass{
	
	@Test
	public void AddProduct() {
		HomePage h=new HomePage(driver);
		h.Click_Product();
		
		ProductsPage p=new ProductsPage(driver);
		p.ClkAddFristProduct.click();
		p.ClkContinueShopping.click();
		p.ClkAddSecondProduct.click();
		p.ClkCart.click();
		
		CartPage c=new CartPage(driver);
		System.out.println("Frist product:"+c.checkFristProduct.getText());
		System.out.println("Second Product:"+c.CheckSecondProduct.getText());
		
		Assert.assertEquals(c.checkFristProduct.getText(),"Blue Top" );
		Assert.assertEquals(c.CheckSecondProduct.getText(),"Men Tshirt");
	}
	

}
