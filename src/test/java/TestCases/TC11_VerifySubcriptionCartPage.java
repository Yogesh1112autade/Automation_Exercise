package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.CartPage;

public class TC11_VerifySubcriptionCartPage extends BaseClass{
	@Test
	public void verifySubInCartPage() {
		HomePage h=new HomePage(driver);
		h.Click_cart();
		
		CartPage c=new CartPage(driver);
		
		c.EnterEmail("yogeshautade1999@gmail.com");
		c.Click_Arrow();
	}

}
