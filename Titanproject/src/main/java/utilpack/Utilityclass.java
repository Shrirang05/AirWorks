package utilpack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass

{

    private WebDriver driver;

	public static void getScreenshot(WebDriver driver, String name) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/" + name + ".jpg");
		FileHandler.copy(sourceFile, destFile);
	}

	public void handlecalender(String dropX, String mnthX, String expMonth, String nxtX, String dtX, String expDate) 
	{

		driver.findElement(By.xpath(dropX)).click();
		String actMonth = driver.findElement(By.xpath(mnthX)).getText();

		while (true) {
			if (actMonth.contains(expMonth)) 
			{
				break;
			} 
			else 
			{
				driver.findElement(By.xpath(nxtX)).click();
			}

		}
		while (true) 
		{
			String actDate = driver.findElement(By.xpath(dtX)).getText();
			if (actDate.contains(expDate)) {
            
				 driver.findElement(By.xpath(dtX)).click();
				 break;
			}
		
		}
	}

	public Utilityclass(WebDriver driver) 
	{
		this.driver = driver;
	}

}
