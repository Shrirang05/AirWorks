package customerTestPack;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pompack.Loginpomclass;
import utilpack.Utilityclass;
import utilpack.propReader;

public class TestBaseClassPreServer2 
{
	public WebDriver driver ;
	private Loginpomclass MS;

	Logger log = Logger.getLogger("Titan");
	 @BeforeMethod  
	   	public void SetUp() throws InterruptedException, IOException
		  	{
			    PropertyConfigurator.configure("log4j.properties");
	     	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrirang.ladda\\git\\repository\\Titanproject\\DriverFolder2\\chromedriver.exe");	
	    	    driver = new ChromeDriver();
	 
      	        driver.manage().deleteAllCookies();
		  		driver.manage().window().maximize();
		  		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		  		driver.get(propReader.init_prop("PreTitanEnv"));	
//		  		driver.get("https://pretitan.airworks.in/Home/Index");
		  	
		  		JavascriptExecutor js = (JavascriptExecutor) driver;
		  		
		  		MS = new Loginpomclass(driver);
			
				MS.clickonsigninbutton();
				log.info("clickonsignINbutton");
				Thread.sleep(3000);
				
				MS.sendusername();
				log.info("Send username");
				Thread.sleep(3000);
				
				
			
				MS.clickonnextbutton();
				log.info("Click on next button");
				Thread.sleep(3000);
				
			
				MS.sendpassword();
				log.info("Send Password");
				Thread.sleep(3000);
				
				
				MS.MSsignin();
				log.info("MS sign in");
				Thread.sleep(3000);
				
			
				MS.clickonyesbutton();
				log.info("Click on yes button");
			
				

				Utilityclass.getScreenshot(driver, "My login page");
				
				
		  	}
		  		
//		  		@AfterMethod
//				public void tearDown()
//				{
//					driver.quit();
//				}
//		  		
		  		

		  	
		  	}