package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Test_CasesPage extends basePage {

	public Test_CasesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//b[contains(text(),\"Test Cases\")]")
	WebElement getTxt;
	
	public String text() {
		return getTxt.getText();
	}

}
