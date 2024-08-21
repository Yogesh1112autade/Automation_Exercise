package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
    WebDriver driver;
	public basePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public String randomString() {
		   String generatedString=RandomStringUtils.randomAlphabetic(5);
		   return generatedString;
	}
	public String radomNumric() {
		   String generatedinteger=RandomStringUtils.randomNumeric(6);
		   return generatedinteger;
	}
	public String radomMb() {
		   String generatedintegerMB=RandomStringUtils.randomNumeric(10);
		   return generatedintegerMB;
	}
	public String radomAlphaNumeric() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		String generatedinteger=RandomStringUtils.randomNumeric(3);
		   return (generatedString+"@"+generatedinteger);
	}
	public String RanPass() {
		String geneString=RandomStringUtils.randomAlphabetic(6);
		String geneNum=RandomStringUtils.randomAlphanumeric(3);
		return (geneString+"@"+geneNum);
	}

}
