package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.SignUp_OR_Login;

public class TC03_Login_Failed extends BaseClass{
	@Test
	public void Login_Failed() {
	HomePage h=new HomePage(driver);
	String s=h.Verify_HomePage();
	System.out.println(s);
	h.click_signUp_Login();
	
	SignUp_OR_Login s1=new SignUp_OR_Login(driver);
	String b=s1.verify_newuser_loginVisible();
	System.out.println(b);
	s1.Enter_Login_Mail(p.getProperty("email2"));
	s1.Enter_Login_pass(p.getProperty("pass2"));
	s1.Click_Login();
	String sms=s1.check_Smg();
	System.out.println(sms);
	Assert.assertEquals(sms,"Your email or password is incorrect!");
	
	}

}
