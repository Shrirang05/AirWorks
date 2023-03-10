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
//	WPO-HSR-000187-0223
	@FindBy (xpath = "//input[@id='txtWoNo']")
	private WebElement workorderno;
	public void Passingworkorderno()
	{
		workorderno.sendKeys("WPO-HSR-000192-0223");
	}
	
	//input[@id='txtTypeCheck']
	@FindBy (xpath = "//input[@id='txtTypeCheck']")
	private WebElement typeofcheck;
	public void Passingtypeofcheck()
	{
		typeofcheck.sendKeys("1C CHECK");
	}
	
	//span[normalize-space()='Select Customer']
	@FindBy (xpath = "//span[normalize-space()='Select Customer']")
	private WebElement selectcustomer;
	public void selectcustomerforRegAircraft()
	{
		selectcustomer.click();
	}
	
	//label[normalize-space()='BBAM AVIATION SERVICES']
	@FindBy (xpath = "//label[normalize-space()='BBAM AVIATION SERVICES']")
	private WebElement BBAMservices;
	public void selectcustomerBBAM()
	{
		BBAMservices.click();
	}
	//option[normalize-space()='Hosur']
	@FindBy (xpath = "//option[normalize-space()='Hosur']")
	private WebElement Station;
	public void selectthestation()
	{
		Station.click();
	}
	
	//option[@value='2C CHECK']
	@FindBy (xpath = "//option[@value='2C CHECK']")
	private WebElement selectTypeofcheck;
	public void clickoneTypeofcheck()
	{
		selectTypeofcheck.click(); 
	}
	
	
	//button[@id='Search']
	@FindBy (xpath = "//button[@id='Search']")
	private WebElement SearchButton;
	public void clickonsearchbutton()
	{
		SearchButton.click();
	}
	
//	WPO-HSR-000190-0223
	//div[@title='WPO-HSR-000187-0223']
	@FindBy (xpath = "//div[@title='WPO-HSR-000192-0223']")
	private WebElement selectworkorder;
	public void clickonworkordertoedit()
	{
		selectworkorder.click();
	}
	
//	https://pretitan.airworks.in/WorkOrder/CreateWorkOrder?WONo=WPO-HSR-000187-0223
	
	@FindBy (xpath = "//select[@id='ddlEngineWO']//option[@value='117'][normalize-space()='V2500-A1']")
	private WebElement changeEngine;
	public void clickonanotherEngine()
	{
		changeEngine.click();
	}
	
	//select[@id='ddlPlanningCheckSPOC']
	@FindBy (xpath = "//select[@id='ddlPlanningCheckSPOC']")
	private WebElement Editplanningcheckspocselected;
	public void Buttonofspoc()
	{
		 planningcheckspocselected.click();
	}
	
	//label[contains(text(),'ANIL')]
	@FindBy (xpath = "//option[@value='A00868']")
	private WebElement planningcheckspocselected;
	public void ButtonofAnilSpoc()
	{
		 planningcheckspocselected.click();
	}
	
	//button[@id='btnCreateWorkOrder']
	@FindBy (xpath = "//button[@id='btnCreateWorkOrder']")
	private WebElement Updateworkorder;
	public void clickonupdateworkorder()
	{
		Updateworkorder.click();
	}
	
	//select[@id='ddlStation']
	
	//option[normalize-space()='Cochin']
	@FindBy (xpath = "//option[normalize-space()='Cochin']")
	private WebElement SelectStation;
	public void Cochinstation()
	{
		SelectStation.click();
	}
	
	@FindBy (xpath = "//input[@id='txtPndStDate']")
	private WebElement plannedstartdate;
	public void clickonplannedstartdate()
	{
		plannedstartdate.clear();
		plannedstartdate.sendKeys("20-02-2023");
	}
	

	@FindBy (xpath = "//input[@id='txtPndEndDate']")
	private WebElement plannedEnddate;
	public void clickonplannedEnddate()
	{
		plannedEnddate.clear();
		plannedEnddate.sendKeys("25-02-2023");
	}

	@FindBy (xpath = "//input[@id='txtActStartDate']")
	private WebElement Actualstartdate;
	public void clickonActualstartdate()
	{
		Actualstartdate.clear();
		Actualstartdate.sendKeys("20-02-2023");
	}
	
	//button[@id='btnWorkOrderConfirm']
	@FindBy (xpath = "//button[@id='btnWorkOrderConfirm']")
	private WebElement Confirmworkorderbutton;
	public void clickonConfirmworkorderbutton()
	{
		Confirmworkorderbutton.click();
	
	}
	
	//button[normalize-space()='ok']
	@FindBy (xpath = "//button[normalize-space()='ok']")
	private WebElement Acceptworkorder;
	public void clickonAcceptworkorder()
	{
		Acceptworkorder.click();
	
	}
	
}
