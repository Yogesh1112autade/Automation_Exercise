package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.SignUp_OR_Login;

public class TC04_LogOutUser extends BaseClass {
	@Test
	public void Logout() {
		HomePage h=new HomePage(driver);
		String s=h.Verify_HomePage();
		System.out.println(s);
		Assert.assertEquals(s,"Automation Exercise");
		h.click_signUp_Login();
		
SignUp_OR_Login s1=new SignUp_OR_Login(driver);
		
		String b=s1.verify_newuser_loginVisible();
		Assert.assertEquals(b,"Login to your account");
		System.out.println(b);
		s1.Enter_Login_Mail(p.getProperty("email"));
		s1.Enter_Login_pass(p.getProperty("pass"));
		s1.Click_Login();
		
	}

}
