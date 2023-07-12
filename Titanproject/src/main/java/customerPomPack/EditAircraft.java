package customerPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAircraft 
{
	private WebDriver driver;
	private Actions Act;


	public EditAircraft(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy (xpath ="//a[normalize-space()='View / Edit Aircraft']")
	private WebElement EditAircraft;
	public void ClickOnEditAircraft()
	{
		EditAircraft.click();
	}
	
	//input[@id='txtACM_AIRCRAFT_NO']
	@FindBy (xpath ="//input[@id='txtACM_AIRCRAFT_NO']")
	private WebElement AircraftReg;
	public void EnterAircraftReg()
	{
		AircraftReg.sendKeys("2-BTDT");	
	}
	
	@FindBy (xpath ="//input[@id='txtACM_MANF_SERIAL']")
	private WebElement ManufacturerSerial;
	public void EnterManufacturerSerial()
	{
		ManufacturerSerial.sendKeys("345243");	
	}
	
	//select[@id='ddlAircraftModel']
	@FindBy (xpath ="//select[@id='ddlAircraftModel']")
	private WebElement AircraftModel;
	public void ClickOnAircraftModel()
	{
		AircraftModel.click();
	}
	
	@FindBy (xpath ="//option[text()='BOEING 737-800']")
	private WebElement selectAircraftModel;
	public void selectAircraftModelForEditing()
	{
		selectAircraftModel.click();
	}
	
	@FindBy (xpath ="//select[@id='ddlCustomer']")
	private WebElement SelectOwningAgency;
	public void SelectOwningAgencyForEditing()
	{
		SelectOwningAgency.click();
	}
	
	//option[text()='Owning Agency Test']
	@FindBy (xpath ="//option[text()='Owning Agency Test']")
	private WebElement SelectOwningAgencyTest;
	public void SelectOwningAgencyTestForEditing()
	{
		SelectOwningAgencyTest.click();
	}
	
	//select[@id='ddlOWNERSHIP']
	@FindBy (xpath ="//select[@id='ddlOWNERSHIP']")
	private WebElement SelectAircraftOwnership;
	public void ClickOnSelectAircraftOwnership()
	{
		SelectAircraftOwnership.click();
	}
	
	//option[text()='CUSTOMER']
	@FindBy (xpath ="//option[text()='CUSTOMER']")
	private WebElement SelectCUSTOMERAircraftOwnership;
	public void ClickOnSelectCUSTOMERAircraftOwnership()
	{
		SelectCUSTOMERAircraftOwnership.click();
	}
	
	@FindBy (xpath ="//select[@id='ddlENGAGEMENTTYPE']")
	private WebElement SelectEngagementType;
	public void ClickOnSelectEngagementType()
	{
		SelectEngagementType.click();
	}
	
	@FindBy (xpath ="//option[text()='MAINTENANCE']")
	private WebElement SelectOneEngagementType;
	public void ClickOnSelectOneEngagementType()
	{
		SelectOneEngagementType.click();
	}
	
	//button[@id='Search']
	@FindBy (xpath ="//button[@id='Search']")
	private WebElement SearchButton;
	public void ClickOnSearchButton()
	{
		SearchButton.click();
	}
	
	//a[@id='Edit1']
	@FindBy (xpath ="//a[@id='Edit1']")
	private WebElement EditNewAircraft;
	public void ClickOnEditNewAircraft()
	{
		EditNewAircraft.click();
	}
	
	@FindBy (xpath ="//span[@id='select2-ddlOWNERSHIP-container']")
	private WebElement EditAircraftOwnership;
	public void ClickOnEditAircraftOwnership()
	{
		EditAircraftOwnership.click();
	}
	
	//li[text()='AW OWNED']
	@FindBy (xpath ="//li[text()='AW OWNED']")
	private WebElement EditAircraftOwnershipAWOWNED;
	public void ClickOnEditAircraftOwnershipAWOWNED()
	{
		EditAircraftOwnershipAWOWNED.click();
	}
	
	//li[text()='FULL MAINTENANCE']
	@FindBy (xpath ="//span[text()='MAINTENANCE']")
	private WebElement EditEngagementType;
	public void ClickOnEditEngagementType()
	{
		EditEngagementType.click();
	}
	
	//li[text()='FULL MAINTENANCE']
	@FindBy (xpath ="//li[text()='FULL MAINTENANCE']")
	private WebElement EditOtherEngagementType;
	public void ClickOnEditOtherEngagementType()
	{
		EditOtherEngagementType.click();
	}
	
	@FindBy (xpath ="//span[@id='select2-ddlPREFERREDSTOCKSTATUS-container']")
	private WebElement EditpreferredStock;
	public void ClickOnEditpreferredStock()
	{
		EditpreferredStock.click();
	}
	
	//li[text()='AW OWNED']
	@FindBy (xpath ="//li[text()='AW OWNED']")
	private WebElement EditpreferredStockStatus;
	public void ClickOnEditpreferredStockStatus()
	{
		EditpreferredStockStatus.click();
	}
	
	//button[contains(@title,'Engine1')]
	@FindBy (xpath ="//button[contains(@title,'Engine1')]")
	private WebElement EditConfiguration;
	public void ClickOnEditConfiguration()
	{
		EditConfiguration.click();
	}
	
	//input[@value='2949']
	@FindBy (xpath ="//input[@value='2949']")
	private WebElement Engine2Conf;
	public void SelectEngine2Conf()
	{
		Engine2Conf.click();
	}
	
	//button[@type='button']
	@FindBy (xpath ="//button[@type='button']")
	private WebElement UnclickConfiguration;
	public void ClickOnUnclickConfiguration()
	{
		UnclickConfiguration.click();
	}
	
	//span[@class='select2 select2-container select2-container--classic select2-container--below select2-container--focus']
	@FindBy (xpath ="//span[@class='select2 select2-container select2-container--classic select2-container--below select2-container--focus']//span[@role='combobox']")
	private WebElement AircraftCondition;
	public void ClickOnAircraftCondition()
	{
		AircraftCondition.click();
	}
	
	//li[text()='Under Maintenance']
	@FindBy (xpath ="//li[text()='Under Maintenance']")
	private WebElement AircraftConditionUMain;
	public void ClickOnAircraftConditionUMain()
	{
		AircraftConditionUMain.click();
	}
	
	//span[text()='Fixed Wing']
	@FindBy (xpath ="//span[text()='Fixed Wing']")
	private WebElement ConfigurationClass;
	public void ClickOnConfigurationClass()
	{
		ConfigurationClass.click();
	}
	
	@FindBy (xpath ="//li[text()='Rotor Wing'][1]")
	private WebElement EditConfigurationClass;
	public void ClickOnEditConfigurationClass()
	{
		EditConfigurationClass.click();
	}	
	
	//span[text()='EASA - EUROPEAN UNION']
	@FindBy (xpath ="//span[text()='EASA - EUROPEAN UNION']")
	private WebElement RegulatoryAuthority;
	public void ClickOnRegulatoryAuthority()
	{
		RegulatoryAuthority.click();
	}
	
	//li[text()='DGCA - INDIA']
	@FindBy (xpath ="//li[text()='DGCA - INDIA']")
	private WebElement EditRegulatoryAuthority;
	public void ClickOnEditRegulatoryAuthority()
	{
		EditRegulatoryAuthority.click();
	}
	
	//button[@id='btnsave']
	@FindBy (xpath ="//button[@id='btnsave']")
	private WebElement UpdateButton;
	public void ClickOnUpdateButton()
	{
		UpdateButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
