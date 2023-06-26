package pompack;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilpack.propReader;

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
	
	//label[text()='SELECT WORK ORDER']
	@FindBy (xpath = "//label[text()='SELECT WORK ORDER']")
	private WebElement ValidateEditworkorder;
	public boolean ValidateclickonEditworkorder()
	{
	   return ValidateEditworkorder.isDisplayed();
	}
	
	//div[1]//table[1]//tbody[1]//tr//td[2]
//	@FindBy (xpath = "//div[1]//table[1]//tbody[1]//tr//td[2]")
//	private List <WebElement> workorderselection;
//	public void clickonworkorderselection()
//	{
//		workorderselection.get(workorderselection.size()-1).click();
//	}
	
//	WPO-HSR-000187-0223
	@FindBy (xpath = "//input[@id='txtWoNo']")
	private WebElement workordernoforedit;
	public void Passingworkorderno()
	{
		workordernoforedit.sendKeys(Createworkorderpage.WorkOrderNo);
	}
	
	//input[@id='txtTypeCheck']
	@FindBy (xpath = "//input[@id='txtTypeCheck']")
	private WebElement typeofcheck;
	public void Passingtypeofcheck() throws IOException
	{
//		typeofcheck.sendKeys("1C CHECK");
		typeofcheck.sendKeys(propReader.ExcelStringValueReader("data",13,1));
	}
	
	@FindBy (xpath = "//input[@id='txtCustWorkPkgNo']")
	private WebElement Customerworkorderno;
	public void passingtheCustomerworkordernoforEdit() throws IOException
	{
		Customerworkorderno.clear();
//		Customerworkorderno.sendKeys("Test@123"); 
		Customerworkorderno.sendKeys(propReader.ExcelStringValueReader("data",14,1));
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
//	div[@title='WPO-HSR-000187-0223']
	@FindBy (xpath = "//div[contains(text(),'WPO-HSR-000')]")
	private WebElement selectworkorder;
	public void clickonworkordertoedit()
	{
		selectworkorder.click();
	}
	
//	https://pretitan.airworks.in/WorkOrder/CreateWorkOrder?WONo=WPO-HSR-000187-0223
	
	@FindBy (xpath = "//label[text()='Update Work Order']")
	private WebElement ValidateUpdateworkorder;
	public boolean ValidateclickonUpdateworkorder()
	{
	   return ValidateUpdateworkorder.isDisplayed();
	}
	
	
	
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
	
	
	
	
	@FindBy (xpath = "//input[@id='txtSeries']")
	private WebElement Series;
	public void passingtheseriesforedit() throws IOException
	{
		Series.clear();
//		Series.sendKeys("3456");
		Series.sendKeys(propReader.ExcelIntValueReader("data",15,1));
	}
	
	@FindBy (xpath = "//input[@id='txtPndStDate']")
	private WebElement plannedstartdate;
	public void clickonplannedstartdate()
	{
		plannedstartdate.clear();
		plannedstartdate.sendKeys("04-05-2023");
	}
	

	@FindBy (xpath = "//input[@id='txtPndEndDate']")
	private WebElement plannedEnddate;
	public void clickonplannedEnddate()
	{
		plannedEnddate.clear();
		plannedEnddate.sendKeys("30-05-2023");
	}

	@FindBy (xpath = "//input[@id='txtActStartDate']")
	private WebElement Actualstartdate;
	public void clickonActualstartdate()
	{
		Actualstartdate.clear();
		Actualstartdate.sendKeys("06-05-2023");
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
