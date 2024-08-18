package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Contact_Us_page;
import PageObjects.HomePage;

public class TC06_Contact_Us_Form extends BaseClass{
	@Test
	public void check_ContactUs() {
		HomePage h=new HomePage(driver);
		h.Click_contactus();
		
		Contact_Us_page c=new Contact_Us_page(driver);
		c.Enter_Name(p.getProperty("name"));
		c.Enter_Email(p.getProperty("email"));
		c.Enter_Subject(p.getProperty("subject"));
		c.Enter_Message(p.getProperty("message"));
	}
	

}
