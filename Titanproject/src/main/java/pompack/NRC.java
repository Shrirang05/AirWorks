package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NRC 
{
	private WebDriver driver;
	private Actions s;
	private Select Act;
	
	public NRC (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//a[normalize-space()='Base Maintenance']
	@FindBy (xpath ="//a[normalize-space()='Base Maintenance']")
	private WebElement Basemaintenance;
	public void clickonBasemaintenance()
	{
		Basemaintenance.click();
	}
	
	//a[normalize-space()='Non Routine']
	@FindBy (xpath ="//a[normalize-space()='Non Routine']")
	private WebElement NonRoutinebutton;
	public void clickonNonRoutinebutton()
	{
		NonRoutinebutton.click();
	}
	
	@FindBy (xpath ="//a[normalize-space()='Create NRC']")
	private WebElement NRCbutton;
	public void clickonNRCbutton()
	{
		NRCbutton.click();
	}
	
	//button[@title='Select Aircraft Regn']
	@FindBy (xpath ="//button[@title='Select Aircraft Regn']")
	private WebElement AircraftRegn;
	public void clickonAircraftRegn()
	{
		 AircraftRegn.click();
//		 Act.selectByValue("2-BTTB");
	}
	
	//input[@value='2-BTTB']
	@FindBy (xpath ="//input[@value='2-BTTB']")
	private WebElement selectAircraftRegn;
	public void clickonselectAircraftRegn()
	{
		selectAircraftRegn.click();
	}
	
	
	//label[@id='lblAircraftModel']
	@FindBy (xpath ="//label[text()='BOEING 737-800']")
	private WebElement AircraftModel;
	public boolean validatepassingAircraftModel()
	{
		return AircraftModel.isDisplayed();
	}
	
	
	@FindBy (xpath ="//label[text()='BBAM AVIATION SERVICES']")
	private WebElement CustomerName;
	public boolean validateCustomerName()
	{
		return AircraftModel.isDisplayed();
	}
	
	
	
	
	
	
}
