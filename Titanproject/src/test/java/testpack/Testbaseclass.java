package testpack;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pompack.Loginpomclass;
import utilpack.Utilityclass;

public class Testbaseclass 
{
	public WebDriver driver ;
	private Loginpomclass MS;

	 @BeforeMethod  
	   	public void SetUp() throws InterruptedException, IOException
		  	{
		 
	     	    System.setProperty("webdriver.chrome.driver", "./DriverFolder/chromedriver.exe");	
	    	    driver = new ChromeDriver();
	 
      	        driver.manage().deleteAllCookies();
		  		driver.manage().window().maximize();
		  		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  		driver.get("https://pretitan.airworks.in/");	

		  		MS = new Loginpomclass(driver);
				
				MS.clickonsigninbutton();
				Thread.sleep(3000);
				
				MS.sendusername();
				Thread.sleep(3000);
				
			
				MS.clickonnextbutton();
				Thread.sleep(3000);
				
			
				MS.sendpassword();
				Thread.sleep(3000);
				
				MS.MSsignin();
				Thread.sleep(3000);
				
			
				MS.clickonyesbutton();
				Thread.sleep(3000);
				

				Utilityclass.getScreenshot(driver, "My login page");
			
		  		
		  	}
		  		
		  		@AfterMethod
				public void tearDown()
				{
					driver.quit();
				}
		  		
		  		

		  	
		  	}