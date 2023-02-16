package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editworkorderpage 
{
	private WebDriver driver;
	private Actions Act;
	

	public Editworkorderpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//li[@class='active']//a[normalize-space()='Edit Work Order']
	@FindBy (xpath = "//li[@class='active']//a[normalize-space()='Edit Work Order']")
	private WebElement Editworkorder;
	public void clickonEditworkorder()
	{
		Editworkorder.click();
	}
	
	//button[@id='Search']
	@FindBy (xpath = "//button[@id='Search']")
	private WebElement SearchButton;
	public void clickonsearchbutton()
	{
		SearchButton.click();
	}
	
	//div[@title='WPO-HSR-000187-0223']
	@FindBy (xpath = "//div[@title='WPO-HSR-000187-0223']")
	private WebElement selectworkorder;
	public void clickonworkordertoedit()
	{
		selectworkorder.click();
	}
	
//	https://pretitan.airworks.in/WorkOrder/CreateWorkOrder?WONo=WPO-HSR-000187-0223
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
