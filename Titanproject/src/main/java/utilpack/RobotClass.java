package utilpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RobotClass
{
	private WebDriver driver;

	
	public RobotClass (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}


	public void ImportFromExcel(String fileName) throws AWTException
	{
		
	Robot rb = new Robot();
	rb.delay(2000);
	
	StringSelection ss = new StringSelection("C:\\Users\\Shrirang.ladda\\Downloads\\ImportFiles\\"+fileName);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.delay(2000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.delay(2000);
	}
	
	
	
	
	
}


