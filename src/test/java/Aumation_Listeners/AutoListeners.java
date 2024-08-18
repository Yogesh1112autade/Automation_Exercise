package Aumation_Listeners;

import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AutoListeners implements ITestListener{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/NewMyReport.html");
		sparkreporter.config().setDocumentTitle("Testing report");
		sparkreporter.config().setReportName("Testing");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);
		
		extent.setSystemInfo("Computer Name","localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name","Pavan");
		extent.setSystemInfo("os","Windows10");
		extent.setSystemInfo("Browser name","Chrome");
		
		List<String> includeGroups=context.getCurrentXmlTest().getIncludedGroups();
		if(!includeGroups.isEmpty()) {
		extent.setSystemInfo("Groups",includeGroups.toString());
		}
	}
  
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getTestClass().getName()); // create a new enty in the report
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status p/f/s
		
	}

	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); 
					
	}

	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
		
	}

	
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}

}
