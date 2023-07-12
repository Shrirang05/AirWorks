package customerPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAircraft 
{
	private WebDriver driver;
	private Actions Act;


	public CreateAircraft(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//a[normalize-space()='Aircrafts']
	@FindBy (xpath ="//a[normalize-space()='Aircrafts']")
	private WebElement Aircrafts;
	public void ClickOnAircraft()
	{
		Aircrafts.click();
	}
	
	@FindBy (xpath ="//a[normalize-space()='Create Aircraft']")
	private WebElement CreateAircraft;
	public void ClickCreateAircraft()
	{
		CreateAircraft.click();
	}
	
	@FindBy (xpath ="//input[@id='txtaircraftreg']")
	private WebElement AircraftReg;
	public void EnterAircraftReg()
	{
		AircraftReg.sendKeys("2-BTDT");
	}
	
	@FindBy (xpath ="//input[@id='txtmanufacturerserial']")
	private WebElement ManufacturerSerial;
	public void EnterManufacturerSerial()
	{
		ManufacturerSerial.sendKeys("345243");
	}
	
	@FindBy (xpath ="//span[@id='select2-ddlAircraftModel-container']")
	private WebElement AircraftModel;
	public void ClickOnAircraftModel()
	{
		AircraftModel.click();
	}
	
	//li[@id='select2-ddlAircraftModel-result-uxqj-46']
	@FindBy (xpath ="//li[text()='BOEING 737-800']")
	private WebElement oneAircraftModel;
	public void SelectoneAircraftModel()
	{
		oneAircraftModel.click();
	}
	
	//input[@id='txtdateofmanufacture']
	@FindBy (xpath ="//input[@id='txtdateofmanufacture']")
	private WebElement DateOfManufacture;
	public void EnterDateOfManufacture()
	{
		DateOfManufacture.sendKeys("05-07-2023");
	}
	
	@FindBy (xpath ="//input[@id='txtregcert']")
	private WebElement RegCertificate;
	public void EnterRegCertificate()
	{
		RegCertificate.sendKeys("4627345");
	}
	
	@FindBy (xpath ="//input[@id='txtissuedate']")
	private WebElement IssueDate;
	public void EnterIssueDate()
	{
		IssueDate.sendKeys("06-07-2023");
	}
	
	@FindBy (xpath ="//span[@id='select2-ddlOWNERSHIP-container']")
	private WebElement AircraftOwnership;
	public void ClickOnAircraftOwnership()
	{
		AircraftOwnership.click();
	}
	
	@FindBy (xpath ="//li[text()='CUSTOMER']")
	private WebElement OneAircraftOwnership;
	public void SelectOneAircraftOwnership()
	{
		OneAircraftOwnership.click();
	}
	
	//span[@id='select2-ddlCustomer-container']
	@FindBy (xpath ="//span[@id='select2-ddlCustomer-container']")
	private WebElement OwningAgency;
	public void ClickOnOwningAgency()
	{
		OwningAgency.click();
	}
	
	//span[@id='select2-ddlCustomer-container']
	@FindBy (xpath ="//li[text()='Owning Agency Test']")
	private WebElement OwningAgencyTest;
	public void ClickOnOwningAgencyTest()
	{
		OwningAgencyTest.click();
	}
	
	@FindBy (xpath ="//span[@id='select2-ddlEngagementType-container']")
	private WebElement EngagementType;
	public void ClickOnEngagementType()
	{
		EngagementType.click();
	}
	
	@FindBy (xpath ="//li[text()='MAINTENANCE']")
	private WebElement OneEngagementType;
	public void ClickOnOneEngagementType()
	{
		OneEngagementType.click();
	}
	
	//span[@id='select2-ddlPREFERREDSTOCKSTATUS-container']
	@FindBy (xpath ="//span[@id='select2-ddlPREFERREDSTOCKSTATUS-container']")
	private WebElement PreferredStockStatus;
	public void ClickOnPreferredStockStatus()
	{
		PreferredStockStatus.click();
	}
	
	@FindBy (xpath ="//li[text()='CUSTOMER']")
	private WebElement OnePreferredStockStatus;
	public void SelectOnePreferredStockStatus()
	{
		OnePreferredStockStatus.click();
	}
	
	//button[@title='Select Configuration']
	@FindBy (xpath ="//button[@title='Select Configuration']")
	private WebElement Configuration;
	public void ClickOnConfiguration()
	{
		Configuration.click();
	}
	
	//input[@value='2948']
	@FindBy (xpath ="//input[@value='2948']")
	private WebElement ConfigurationEngine1;
	public void SelectConfigurationEngine1()
	{
		ConfigurationEngine1.click();
	}
	
	//label[@id='txtplannercode']
	@FindBy (xpath ="//label[text()='1234']")
	private WebElement PlannerCode;
	public String ValidatePlannerCode()
	{
		String actualText = PlannerCode.getText();
		return actualText;
	}
	
	//span[@id='select2-ddlWorkCenter-container']
	@FindBy (xpath ="//span[@id='select2-ddlWorkCenter-container']")
	private WebElement DefaultMainBase;
	public void ClickOnDefaultMainBase()
	{
		DefaultMainBase.click();
	}
	
	//li[@id='select2-ddlWorkCenter-result-i6j7-Hosur']
	@FindBy (xpath ="//li[text()='Hosur']")
	private WebElement HosurDefaultMainBase;
	public void SelectHosurDefaultMainBase()
	{
		HosurDefaultMainBase.click();
	}
	
	@FindBy (xpath ="//input[@id='txtinductiondate']")
	private WebElement InductionDate;
	public void EnterInductionDate()
	{
		InductionDate.click();
	}
	
	//input[@id='txtoperationaldate']
	@FindBy (xpath ="//input[@id='txtoperationaldate']")
	private WebElement OperationalDate;
	public void EnterOperationalDate()
	{
		OperationalDate.click();
	}
	
	//span[@id='select2-ddlAircraftCondition-container']
	@FindBy (xpath ="//span[@id='select2-ddlAircraftCondition-container']")
	private WebElement AircraftCondition;
	public void ClickOnAircraftCondition()
	{
		AircraftCondition.click();
	}
	
	@FindBy (xpath ="//input[@id='txtconditiondate']")
	private WebElement ConditionFromDate;
	public void ClickOnConditionFromDate()
	{
		ConditionFromDate.click();
	}
	
	//span[@id='select2-ddlConfigClass-container']
	@FindBy (xpath ="//span[@id='select2-ddlConfigClass-container']")
	private WebElement ConfigurationClass;
	public void ClickOnConfigurationClass()
	{
		ConfigurationClass.click();
	}
	
	//li[@id='select2-ddlConfigClass-result-4edi-1']
	@FindBy (xpath ="//li[text()='Fixed Wing'][1]")
	private WebElement FixedWingConfigurationClass;
	public void ClickOnFixedWingConfigurationClass()
	{
		FixedWingConfigurationClass.click();
	}
	
	//span[@id='select2-ddlREGULATORY-container']
	@FindBy (xpath ="//span[@id='select2-ddlREGULATORY-container']")
	private WebElement RegulatoryAuthority;
	public void ClickOnRegulatoryAuthority()
	{
		RegulatoryAuthority.click();
	}
	
	//li[@id='select2-ddlREGULATORY-result-f036-2936']
	@FindBy (xpath ="//li[text()='EASA - EUROPEAN UNION']")
	private WebElement OneRegulatoryAuthority;
	public void SelectOneRegulatoryAuthority()
	{
		OneRegulatoryAuthority.click();
	}
	
	@FindBy (xpath ="//button[@id='btnsave']")
	private WebElement SaveButton;
	public void ClickOnSaveButton()
	{
		SaveButton.click();
	}
	
	//button[text()='ok']
	@FindBy (xpath ="//button[text()='ok']")
	private WebElement OkButton;
	public void ClickonokButton()
	{
		OkButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
