package TestCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.Test_CasesPage;

public class TC07_VerifyTestCase extends BaseClass{
	@Test
	public void verify_testPage() throws InterruptedException {
		
		
		Thread.sleep(3000);
		HomePage h=new HomePage(driver);
		h.Click_TestCases();
		
//		Set<String> Windows=driver.getWindowHandles();
//		
//		Iterator <String> i=Windows.iterator();
//		String ParentId=i.next();
//		System.out.println("ParentID:"+ParentId);
//		
//		String childId=i.next();
//		System.out.println("ChildId:"+childId);
		Test_CasesPage t=new Test_CasesPage(driver);
	//	driver.switchTo().window(childId);
		String value=t.text();
		
		Assert.assertEquals(value,"TEST CASES");
	}
  
}
