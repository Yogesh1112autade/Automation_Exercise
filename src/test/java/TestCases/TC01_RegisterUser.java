package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.Account_Created;
import PageObjects.Create_Account;
import PageObjects.DeleteAccount;
import PageObjects.HomePage;
import PageObjects.SignUp_OR_Login;

public class TC01_RegisterUser extends BaseClass{
	
	@Test
	public void Register_Account() {
		HomePage h=new HomePage(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h.click_signUp_Login();
		   
		SignUp_OR_Login s=new SignUp_OR_Login(driver);
		s.Enter_Name_Email(p.getProperty("name"),p.getProperty("email"));
		s.Click_SignUp();
		
		Create_Account c=new Create_Account(driver);
		c.fill_Info();
		c.Fill_Address();
		c.click_CreateAccount();
		
		Account_Created a=new Account_Created(driver);
		a.click_Continue();
		//a.click_ad();
		
		DeleteAccount d=new DeleteAccount(driver);
		//d.clickAccountDelete();
	}
	
	
	
}