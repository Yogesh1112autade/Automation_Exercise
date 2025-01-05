package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;

public class TC13_VerifyProductQuantityInCart extends  BaseClass{
	
	@Test
	public void VerifyQuantity() {
		
		HomePage h=new HomePage(driver);
		System.out.println(h.Verify_HomePage());
		h.Click_View_Product();
	}

}
