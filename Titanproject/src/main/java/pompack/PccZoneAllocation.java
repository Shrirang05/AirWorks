package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PccZoneAllocation 
{
	private WebDriver driver;
	private Actions Act;
	

	public PccZoneAllocation(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = "//a[normalize-space()='PCC']")
	private WebElement PCC;
	public void clickonPCC()
	{
		PCC.click();
	}
	
	//a[normalize-space()='Base Check']
	@FindBy (xpath = "//a[normalize-space()='Base Check']")
	private WebElement Basecheck;
	public void clickonBasecheck()
	{
		Basecheck.click();
	}
	
	//a[normalize-space()='Zone Allocation']
	@FindBy (xpath = "//a[normalize-space()='Zone Allocation']")
	private WebElement ZoneAllocation;
	public void clickonZoneAllocation()
	{
		ZoneAllocation.click();
	}
	
	@FindBy (xpath = "//button[@title='Aircraft Regn']")
	private WebElement AircraftRegn;
	public void clickonAircraftRegn()
	{
		AircraftRegn.click();
	}
	
	//input[@value='2-BTTB']
	@FindBy (xpath = "//input[@value='2-BTTB']")
	private WebElement BTTB;
	public void clickonBTTB()
	{
		BTTB.click();
	}
	
	
	@FindBy (xpath = "//label[@id='txtModel']")
	private WebElement Model;
	public boolean checktheModel()
	{
		return Model.isDisplayed();
		
	}
	
	@FindBy (xpath = "//span[normalize-space()='Work Order']")
	private WebElement Workorder;
	public void selectworkorder()
	{
		Workorder.click();
	}
	
	@FindBy (xpath = "//label[normalize-space()='WPO-HSR-000229-0423']")
	private WebElement oneWorkorder;
	public void selectoneworkorder()
	{
		oneWorkorder.click();
	}
	
	//button[normalize-space()='Search']
	@FindBy (xpath = "//button[normalize-space()='Search']")
	private WebElement Searchbutton;
	public void  clickonSearchbutton()
	{
		Searchbutton.click();
	}
	
	//tr[@id='grid_grid_rec_1']//td[1]
	@FindBy (xpath = "//tr[@id='grid_grid_rec_1']//td[1]")
	private WebElement Firstrow;
	public void  clickonFirstrow()
	{
		Firstrow.click();
	}
	
	@FindBy (xpath = "//a[@title='Search AME']")
	private WebElement AMEMagnifier;
	public void  clickonAMEMagnifier()
	{
		AMEMagnifier.click();
	}
	

	@FindBy (xpath = "//div[@id='modelAME']//div[@class='modal-body']//button[1]")
	private WebElement selectAME;
	public void  clickonAME()
	{
		selectAME.click();
	}
	

	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='G00210']")
	private WebElement selectoneAME;
	public void  clickononeAME()
	{
		selectoneAME.click();
	}
	
	//button[@aria-expanded='true']
	@FindBy (xpath = "//div[@id='modelAME']//div[@class='modal-body']//button[1]")
	private WebElement deselectAME;
	public void  clickondeselectAME()
	{
		deselectAME.click();
	}
	
    
	@FindBy (xpath = "//div[@id='modelAME']//button[@type='button'][normalize-space()='Close']")
	private WebElement closeAME;
	public void  clickoncloseAME()
	{
		closeAME.click();
	}
	
	@FindBy (xpath = "//a[@title='Search Tech']")
	private WebElement Technicianmagnifier;
	public void  clickonTechnicianmagnifier()
	{
		Technicianmagnifier.click();
	}
	
	//div[@id='modelTech']//button[@title='None selected']
	@FindBy (xpath = "//div[@id='modelTech']//button[@title='None selected']")
	private WebElement selectTechnician;
	public void  clickonTechnician()
	{
		selectTechnician.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='A01252']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='A01252']")
	private WebElement selectoneTechnician;
	public void  clickononeTechnician()
	{
		selectoneTechnician.click();
	}
	
	//button[@aria-expanded='true']
	@FindBy (xpath = "//button[@aria-expanded='true']")
	private WebElement deselectTechnician;
	public void  clickondeselectTechnician()
	{
		deselectTechnician.click();
	}
	
	//div[@id='modelTech']//button[@type='button'][normalize-space()='Close']
	@FindBy (xpath = "//div[@id='modelTech']//button[@type='button'][normalize-space()='Close']")
	private WebElement Techclosebutton;
	public void  clickonTechclosebutton()
	{
		Techclosebutton.click();
	}
	
	//span[normalize-space()='Select Aircraft Co-Ordinator']
	@FindBy (xpath = "	//span[normalize-space()='Select Aircraft Co-Ordinator']")
	private WebElement Aircraftcoordinator;
	public void  clickonAircraftcoordinator()
	{
		Aircraftcoordinator.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='A00945']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='A00945']")
	private WebElement selectAircraftcoordinator;
	public void  clickononeAircraftcoordinator()
	{
		selectAircraftcoordinator.click();
	}
	
	@FindBy (xpath = "//input[@id='txtArrivalDate']")
	private WebElement Arrivaldate;
	public void  clickonArrivaldate()
	{   
		Arrivaldate.click();
//		Arrivaldate.clear();
//		Arrivaldate.sendKeys("23-04-2023");
		
	}
	
	//input[@id='txtStartDate']
	@FindBy (xpath = "//input[@id='txtStartDate']")
	private WebElement startdate;
	public void  clickonstartdate()
	{
		startdate.click();
	}
	
	//input[@id='txtTargetDate']
	@FindBy (xpath = "//input[@id='txtTargetDate']")
	private WebElement Targetdate;
	public void  clickonTargetdate()
	{
		Targetdate.click();
	}
	
	//input[@id='txtAOGCutOffDate']
	@FindBy (xpath = "//input[@id='txtAOGCutOffDate']")
	private WebElement AOGcutoffdate;
	public void  clickonAOGcutoffdate()
	{
		AOGcutoffdate.click();
	}
	//input[@id='txtAOGCutOffTime']
	@FindBy (xpath = "//input[@id='txtAOGCutOffTime']")
	private WebElement AOGcutofftime;
	public void  passingAOGcutofftime()
	{
		 AOGcutofftime.sendKeys("01:15");
	}
	
	//input[@id='txtRTSDate']
	@FindBy (xpath = "//input[@id='txtRTSDate']")
	private WebElement RTSdate;
	public void  clickonRTSdate()
	{
		 RTSdate.click();
	}
	
	//input[@id='txtRTSTime']
	@FindBy (xpath = "//input[@id='txtRTSTime']")
	private WebElement RTStime;
	public void  passingRTStime()
	{
		RTStime.sendKeys("02:00");
	}
	
	//body[1]/div[1]/div[1]/div[5]/div[3]/div[5]/span[1]/div[1]/button[1]
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[3]/div[5]/span[1]/div[1]/button[1]")
	                  
	private WebElement pcccheckspok;
	public void clickonpcccheckspoc()
	{
		pcccheckspok.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='A00581']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='A00945']")
	private WebElement pickonepcccheckspok;
	public void clickonepcccheckspoc()
	{
		pickonepcccheckspok.click();
	}
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[3]/div[6]/span[1]/div[1]/button[1]")
	private WebElement Maintainancecheckspoc;
	public void clickonMaintainancecheckspoc()
	{
		 Maintainancecheckspoc.click();
	}
	
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='A00935']")
	private WebElement pickonemaintainancecheckspoc;
	public void clickonpickonemaintainancecheckspoc()
	{
		pickonemaintainancecheckspoc.click();
	}
	
	@FindBy (xpath = "//button[@id='btnsubmit']")
	private WebElement Submitbutton;
	public void clickonSubmitbutton()
	{
		Submitbutton.click();
	}
	
	
	
}

