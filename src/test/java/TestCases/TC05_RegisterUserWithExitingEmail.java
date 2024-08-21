package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.SignUp_OR_Login;

public class TC05_RegisterUserWithExitingEmail extends BaseClass{

	@Test
	public void chechWithExitingEmail() {
		HomePage h=new HomePage(driver);
		h.click_signUp_Login();
		
		SignUp_OR_Login s=new SignUp_OR_Login(driver);
		s.Enter_Name_Email(p.getProperty("name"),p.getProperty("email"));
		s.Click_SignUp();
		
	}
}
