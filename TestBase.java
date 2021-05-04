package com.qa.AutomateWebsite;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;




public class TestBase
{ 
 public WebDriver driver;
 public Amazonpage amazonOb;
 @Parameters({"Browser","Url"})
 @BeforeMethod
 public void invokeBrowser(String browser, String url)
 {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\buddh\\Desktop\\browser driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	 }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
			 System.setProperty("webdriver.edge.driver","C:\\Users\\buddh\\Desktop\\browser driver\\msedgedriver.exe");
			  driver = new EdgeDriver();
	  }
			  
	amazonOb = new Amazonpage(driver);
	 driver.get(url);
	 driver.manage().window().maximize();
	 
 }

@AfterMethod
public void dropDown()
{
driver.quit();	
}



}


