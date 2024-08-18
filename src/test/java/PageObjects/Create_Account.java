package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_Account extends basePage{

	public Create_Account(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//b[contains(text(),\"Enter Account Information\")]")
	WebElement veri_Enter_acc_info;
	
	@FindBy(xpath="//input[@id=\"id_gender1\"]")
	WebElement selectTitle;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement EntPassword;
	
	@FindBy(xpath="//select[@name=\"days\"]")
	WebElement SelectDays;
	
	@FindBy(xpath="//select[@name=\"months\"]")
	WebElement selectMonth;
	
	@FindBy(xpath="//select[@name=\"years\"]")
	WebElement selectYears;
	
	@FindBy(xpath="//input[@name=\"newsletter\"]")
	WebElement selectNewLetter;
	
	@FindBy(xpath="//input[@id=\"optin\"]")
	WebElement select_receive_Singal;
	
	public String veriFy_accoutPage_Visible() {
		return veri_Enter_acc_info.getText();
	}
	
   public void fill_Info() {
	   selectTitle.click();
	   String s=radomAlphaNumeric();
	   System.out.println("Pass"+s);
	   EntPassword.sendKeys(s);
	   SelectDays.sendKeys("11");
	   selectMonth.sendKeys("May");
	   selectYears.sendKeys("1999");
	   selectNewLetter.click();
	   select_receive_Singal.click();
	   
   }
   
   @FindBy(xpath="//input[@name=\"first_name\"]")
	WebElement EntFristName;
   
   @FindBy(xpath="//input[@id=\"last_name\"]")
	WebElement Ent_lastName;
   
   @FindBy(xpath="//input[@id=\"company\"]")
	WebElement Enter_Company;
   
   @FindBy(xpath="//input[@id=\"address1\"]")
	WebElement Ent_address1;
   
   @FindBy(xpath="//input[@id=\"address2\"]")
	WebElement Ent_address2;
   
   @FindBy(xpath="//select[@name=\"country\"]")
	WebElement Ent_Country;
   
   @FindBy(xpath="//input[@id=\"state\"]")
	WebElement Ent_State;
   
   @FindBy(xpath="//input[@id=\"city\"]")
	WebElement Ent_city;
   
   @FindBy(xpath="//input[@id=\"zipcode\"]")
	WebElement Ent_ZipCode;
   
   @FindBy(xpath="//input[@id=\"mobile_number\"]")
	WebElement Mb;
   public void Fill_Address() {
	   EntFristName.sendKeys(randomString().toUpperCase());
	   Ent_lastName.sendKeys(randomString().toUpperCase());
	   Enter_Company.sendKeys(randomString().toUpperCase());
	   Ent_address1.sendKeys("at="+randomString().toUpperCase());
	   Ent_address2.sendKeys("Tal="+randomString().toUpperCase());
	   Ent_Country.sendKeys("India");
	   Ent_State.sendKeys("Goa");
	   Ent_city.sendKeys("solapur");
	   Ent_ZipCode.sendKeys(radomNumric());
	   Mb.sendKeys(radomMb());
	   
   }
   @FindBy(xpath="(//button[@class=\"btn btn-default\"])[1]")
	WebElement clkCreateAccount;
	
	public void click_CreateAccount() {
		clkCreateAccount.click();
	}
	
}
