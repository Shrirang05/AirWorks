package testpack;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pompack.Loginpomclass;
import utilpack.Utilityclass;

public class TC02_VerifyLogoutFunctionality extends TestBaseClassPreServer
{
	private Loginpomclass LO;
	
	
	@Test
	public void verifylogout() throws InterruptedException, IOException
	{
		LO = new Loginpomclass(driver);
		
		LO.clickonsignoutbutton();
	
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
	
	Utilityclass.getScreenshot(driver, "logout proof");
	}
}