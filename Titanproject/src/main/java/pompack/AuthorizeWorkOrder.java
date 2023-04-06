package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeWorkOrder 
{
	private WebDriver driver;
	private Actions Act;
	
	public  AuthorizeWorkOrder (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//a[normalize-space()='Authorize Work Order']
	@FindBy (xpath = "//a[normalize-space()='Authorize Work Order']")
	private WebElement Authorizedworkorder;
	public void clickonAuthorizedworkorder()
	{
		 Authorizedworkorder.click();
	}
	
	
	//input[@id='txtWoNo']
	@FindBy (xpath = "//input[@id='txtWoNo']")
	private WebElement workorderno;
	public void Passingworkorderno()
	{
		workorderno.sendKeys("WPO-HSR-000192-0223");
	}
	
	//span[normalize-space()='Select Aircraft Regn']
	@FindBy (xpath ="//button[@title='Select Aircraft Regn']")
	private WebElement AircraftReg;
	
	@FindBy (xpath ="(//input[@value='21']")
	private WebElement BTTB;
	
	//label[normalize-space()='2-BTTB']
	public void clickonAircraftReg()
	{
		AircraftReg.click(); 
		BTTB.click();
		
	}
	
	//input[@id='txtTypeCheck']
	@FindBy (xpath = "//input[@id='txtTypeCheck']")
	private WebElement Typeofcheck;
	public void selectTypeofcheck()
	{
		Typeofcheck.sendKeys("2C CHECK");
	}
	
	
	@FindBy (xpath = "//span[normalize-space()='Select Customer']")
	private WebElement selectcustomer;
	public void selectcustomerforRegAircraft()
	{
		selectcustomer.click();
	}
	
	@FindBy (xpath = "//label[normalize-space()='BBAM AVIATION SERVICES']")
	private WebElement BBAMservices;
	public void selectcustomerBBAM()
	{
		BBAMservices.click();
	}
	
	//select[@id='ddlStation']
	@FindBy (xpath = "//select[@id='ddlStation']")
	private WebElement SelectStation;
	public void Selectstation()
	{
		SelectStation.click();
	}
	
	@FindBy (xpath = "//option[normalize-space()='Cochin']")
	private WebElement SelectStationCoachin;
	public void clickonCochinstation()
	{
		SelectStation.click();
	}
	
	//button[@id='Search']
	@FindBy (xpath = "//button[@id='Search']")
	private WebElement Searchbutton;
	public void clickonSearchbutton()
	{
		Searchbutton.click();
	}
	
	
	
	
}
