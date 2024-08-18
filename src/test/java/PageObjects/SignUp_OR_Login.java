package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignUp_OR_Login extends basePage  {

	public SignUp_OR_Login(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//h2[contains(text(),\"New User Signup!\")]")
	WebElement txtSignUpOrLogin;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement txtname;
	
	@FindBy(xpath="(//input[@name=\"email\"])[2]")
	WebElement txtEmail;
	
	@FindBy(xpath="(//button[@class=\"btn btn-default\"])[2]")
	WebElement clkSignUp;
	
	@FindBy(xpath="//h2[contains(text(),\"Login to your account\")]")
	WebElement chkloginvisi;
	
	@FindBy(xpath="//form[@action=\"/login\"]//input[@name=\"email\"]")
	WebElement TxtLogin;
	
	@FindBy(xpath="//form[@action=\"/login\"]//input[@name=\"password\"]")
	WebElement TxtPass;
	
	@FindBy(xpath="(//button[@class=\"btn btn-default\"])[1]")
	WebElement clkLogin;
	
	@FindBy(xpath="//form[@action=\"/login\"]//p")
	WebElement chkIncoorectsmg;
	//Login Side
	public String verify_newuser_loginVisible() {
		return chkloginvisi.getText();
	}
	public void Enter_Login_Mail(String s) {
		TxtLogin.sendKeys(s);
	}
	
	public void Enter_Login_pass(String pa) {
		TxtPass.sendKeys(pa);
	}
	
	public void Click_Login() {
		clkLogin.click();;
	}
	public String check_Smg() {
		return chkIncoorectsmg.getText();
	}
//Sign up side
	public String verify_newuser_signUpVisible() {
		return txtSignUpOrLogin.getText();
	}
	
	public void Enter_Name_Email() {
		String s=randomString();
		System.out.println(s);
		txtname.sendKeys(s);
		String p=randomString()+"@gmail.com";
		System.out.println(p);
		txtEmail.sendKeys(p);
	}
	 
	public void Click_SignUp() {
		clkSignUp.click();
	}
	
}
