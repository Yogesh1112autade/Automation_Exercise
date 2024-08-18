package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {
  public WebDriver driver;
  public Logger logger;
  public Properties p;
   @BeforeClass
   @Parameters({"os","browser"})
   public void setUp(String os,String br) throws IOException {
	   
	   switch(br.toLowerCase()){
	   case "chrome":
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   break;
	   case "edge":
		   WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
		   break;
	   case "firefox":
		   WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
		   break;
	   default:System.out.println("Invalid browser name	..");return;
	   }
	  //FileReader file=new FileReader("./src//test//config.properties");
	  FileReader file=new FileReader("C:\\Users\\Dell\\Desktop\\Work Place\\Automation_Exercise\\src\\config.properties");
	  p=new Properties();
	  p.load(file);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get(p.getProperty("appUrl"));
		driver.manage().window().maximize();
	
   }
   @AfterClass
   public void tearDown() throws InterruptedException {
   Thread.sleep(3000);
	   driver.close();
   }
}
