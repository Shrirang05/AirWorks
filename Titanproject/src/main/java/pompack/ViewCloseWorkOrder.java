package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ViewCloseWorkOrder 
{
	private WebDriver driver;
	private Actions s;
	private Select Act;
	
	public ViewCloseWorkOrder (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath ="//a[@id='4824']")
	private WebElement GAMROclickpretitan;
	public void clickonGAMRObuttonpretitan()
	{
		GAMROclickpretitan.click();
	}
	
	@FindBy (xpath ="//a[normalize-space()='Routine']")
	private WebElement Routinedropdown;
	public void clickonRoutinedropdown()
	{
		Routinedropdown.click();
	}
	
	
	@FindBy (xpath ="//a[text()='View / Close Work Order'][1]")
	private WebElement ViewCloseworkorder;
	public void clickonViewCloseworkorder()
	{
		ViewCloseworkorder.click();
	}
	
	//button[@title='Aircraft REGN']
	@FindBy (xpath ="//span[@id='select2-ddlAirInfo-container']")
	private WebElement AircraftReg;
	public void clickonAircraftReg()
	{
		AircraftReg.click();
	}
	
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement AircraftRegnsearchbox;
	public void clickonAircraftRegsearchbox()
	{
		AircraftRegnsearchbox.sendKeys("VT-SNT");
	}
	
	@FindBy (xpath ="//li[text()='VT-SNT']")
	private WebElement oneAircraftRegn;
	public void clickononeAircraftRegn()
	{
		oneAircraftRegn.click();;
	}
	
	
	
	@FindBy (xpath ="//span[@id='select2-ddlWO-container']")
	private WebElement selectworkorder;
	public void clickonselectworkorder()
	{
		selectworkorder.click();
	}
	
	
	//input[@aria-label='Search']
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement selectworkorderserachbox;
	public void clickonselectworkordercheckbox()
	{
		selectworkorderserachbox.sendKeys("VP-067109-2021");
	}
	
	//li[text()='VP-067109-2021']
	@FindBy (xpath ="//li[text()='VP-067109-2021']")
	private WebElement selectoneworkorder;
	public void clickonselectoneworkorder()
	{
		selectoneworkorder.click();
	}
	
	//button[@title='STATUS']
	@FindBy (xpath ="//button[@title='STATUS']")
	private WebElement status;
	public void clickonstatus()
	{
		status.click();
	}
	
	//input[@value='O']
	@FindBy (xpath ="//input[@value='PE']")
	private WebElement pendingesignstatus;
	public void clickonpendingesignstatus()
	{
		pendingesignstatus.click();
	}
	
	//span[@id='select2-ddlATA-container']
	@FindBy (xpath ="//span[@id='select2-ddlATA-container']")
	private WebElement ATA;
	public void clickonATA()
	{
		ATA.click();
	}
	
	//li[text()='32']
	@FindBy (xpath ="//li[text()='25']")
	private WebElement ATA25;
	public void clickonATA25()
	{
		ATA25.click();
	}
	
	//span[@id='select2-ddlStation-container']
	@FindBy (xpath ="//span[@id='select2-ddlStation-container']")
	private WebElement Location;
	public void clickonLocation()
	{
		Location.click();
	}
	
	//input[@aria-label='Search']
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement Locationsearchbox;
	public void clickonLocationsearchbox()
	{
		Locationsearchbox.sendKeys("CHN HANGAR");
	}
	
	//li[text()='CHN HANGAR']
	@FindBy (xpath ="//li[text()='CHN HANGAR']")
	private WebElement selectLocation;
	public void clickonselectLocation()
	{
		selectLocation.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//For Test server
	
	@FindBy (xpath ="//body//div[@class='container body']//li[@class='active']//li[@class='active']//li[3]//a[1]")
	private WebElement ViewCloseworkorderTest;
	public void clickonViewCloseworkorderTest()
	{
		ViewCloseworkorderTest.click();
	}
	
	//span[text()='Aircraft REGN']
	@FindBy (xpath ="//span[text()='Aircraft REGN']")
	private WebElement AircraftRegnTest;
	public void clickonAircraftRegnTest()
	{
		AircraftRegnTest.click();
	}
	
	//input[@type='search']
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement Aircraftserchest;
	public void clickonAircraftserchest()
	{   
		 Aircraftserchest.sendKeys("VT-IBR");
	    
	}
	
	@FindBy (xpath ="//li[text()='VT-IBR']")
	private WebElement AircraftVTTest;
	public void clickonAircraftVTTest()
	{   
	    AircraftVTTest.click();
	}
	
	@FindBy (xpath ="//span[@id='select2-ddlWO-container']")
	private WebElement VisitPackageTest;
	public void clickonVisitPackageTest()
	{
		VisitPackageTest.click();
	}
	
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement SelectonevisitpackagesearchTest;
	public void SelectonevisitpackagesearchTest() 
	{
		SelectonevisitpackagesearchTest.sendKeys("WO-000014-2021");
		
	}
	
	//li[text()='WO-000014-2021']
	@FindBy (xpath ="//li[text()='WO-000014-2021']")
	private WebElement SelectonevisitpackageTest;
	public void SelectonevisitpackageTest() 
	{
		SelectonevisitpackageTest.click();
	}
	
	@FindBy (xpath ="//button[@title='STATUS']")
	private WebElement StatusTest;
	public void clickonStatusTest()
	{
		StatusTest.click();
	}
	
	@FindBy (xpath ="//input[@value='C']")
	private WebElement OpenStatusTest;
	public void clickonOpenStatusTest()
	{
		OpenStatusTest.click();
	}
	
	//span[text()='Closed By']
	@FindBy (xpath ="//span[text()='Closed By']")
	private WebElement ClosedBy;
	public void clickonClosedBy()
	{
		ClosedBy.click();
	}
	
	//input[@aria-label='Search']
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement ClosedBysearch;
	public void EnterClosedBysearch()
	{
		ClosedBysearch.sendKeys("PRASHANT RAMCHANDRA INDULKAR (GUR060)");
	}
	
	//li[text()='PRASHANT RAMCHANDRA INDULKAR (GUR060)']
	@FindBy (xpath ="//li[text()='PRASHANT RAMCHANDRA INDULKAR (GUR060)']")
	private WebElement ClosedByPerson;
	public void SelectClosedByPerson()
	{
		ClosedByPerson.click();
	}
	
	@FindBy (xpath ="//span[text()='Duplicate INSP']")
	private WebElement DuplicateINSP;
	public void ClickonDuplicateINSP()
	{
		DuplicateINSP.click();
	}
	
	//li[text()='No']
	@FindBy (xpath ="//li[text()='No']")
	private WebElement DuplicateINSPNo;
	public void ClickonDuplicateINSPasNo()
	{
		DuplicateINSPNo.click();
	}
	
	//span[text()='CRITICAL TASK']
	@FindBy (xpath ="//span[text()='CRITICAL TASK']")
	private WebElement CriticalTask;
	public void ClickonCriticalTask()
	{
		CriticalTask.click();
	}
	
	@FindBy (xpath ="//li[text()='No']")
	private WebElement CriticalTaskNo;
	public void ClickonCriticalTaskNo()
	{
		CriticalTaskNo.click();
	}
	
	//span[text()='Location']
	@FindBy (xpath ="//span[text()='Location']")
	private WebElement Loaction;
	public void ClickonLoaction()
	{
		Loaction.click();
	}
	
	//li[text()='Mumbai']
	@FindBy (xpath ="//li[text()='Mumbai']")
	private WebElement LoactionMumbai;
	public void ClickonLoactionMumbai()
	{
		LoactionMumbai.click();
	}
	
	//button[@id='Search']
	@FindBy (xpath ="//button[@id='Search']")
	private WebElement searchbutton;
	public void ClickonSearchButton()
	{
		searchbutton.click();
	}
	
	
	
	
	
	// For staging server
	
	@FindBy (xpath ="//a[@id='3526']")
	private WebElement GAMROclick;
	public void clickonGAMRObutton()
	{
		GAMROclick.click();
	}
	
	//a[text()='View / Close Work Order'][1]
	@FindBy (xpath ="//a[text()='View / Close Work Order'][1]")
	private WebElement Viewcloseworkorderstag;
	public void clickonViewcloseworkorderstag()
	{
		Viewcloseworkorderstag.click();
	}
	
	//span[@id='select2-ddlAirInfo-container']
	@FindBy (xpath ="//span[@id='select2-ddlAirInfo-container']")
	private WebElement AircraftRegnStag;
	public void clickonAircraftRegnStag()
	{
		AircraftRegnStag.click();
	}
	
	//input[@aria-label='Search']
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement SearchTextStag;
	public void clickonSearchTextStag()
	{
		SearchTextStag.sendKeys("VT-IBR");
	}
	
	//li[text()='VT-IBR']
	@FindBy (xpath ="//li[text()='VT-IBR']")
	private WebElement AircraftRegn;
	public void SelectonAircraftRegnStag()
	{
		AircraftRegn.click();
	}
	
	
	//span[@id='select2-ddlWO-container']
	@FindBy (xpath ="//span[@id='select2-ddlWO-container']")
	private WebElement Selectworkorder;
	public void clickonSelectworkorderstag()
	{
		Selectworkorder.click();
	}
	
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement WorkorderSearchTextStag;
	public void clickonWorkorderSearchTextStag()
	{
		 WorkorderSearchTextStag.sendKeys("MH-000004-2023");
	}
	
	//li[text()='MH-000004-2023']
	@FindBy (xpath ="//li[text()='MH-000004-2023']")
	private WebElement Selectoneworkorder;
	public void SelectoneworkorderStag()
	{
		Selectoneworkorder.click();
	}
	
	//button[@title='STATUS']
	@FindBy (xpath ="//button[@title='STATUS']")
	private WebElement Selectworkorderstatus;
	public void SelectworkorderstatusStag()
	{
		Selectworkorderstatus.click();
	}
	
	//input[@value='O']
	@FindBy (xpath ="//input[@value='O']")
	private WebElement Selectworkorderstatusopen;
	public void SelectworkorderstatusopenStag()
	{
		Selectworkorderstatusopen.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
