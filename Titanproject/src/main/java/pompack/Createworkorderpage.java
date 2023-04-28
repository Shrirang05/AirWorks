package pompack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createworkorderpage 
{
  
	private WebDriver driver;
	public Actions Act;
	
	public Createworkorderpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	//a[@id='4823'] = for pre-titan
	@FindBy (xpath ="//a[@id='4823']")
	private WebElement AMROclick;
	public void clickonamrobutton()
	{
		AMROclick.click();
	}
	
	@FindBy (linkText = "Planning")
	private WebElement planning;
	public void clickonplanningbutton()
	{
		planning.click();
	}
	
	@FindBy (xpath = "//a[text()='Work Order']")
	private WebElement workorder;
	public void clickonworkorder()
	{
		workorder.click();
	}
	
	@FindBy (xpath = "//a[normalize-space()='Create Work Order']")
	private WebElement createworkorder;
	public void clickoncreateworkorder()
	{
		createworkorder.click();
	}
	
	//label[text()='CREATE WORK ORDER']
	@FindBy (xpath = "//label[text()='CREATE WORK ORDER']")
	private WebElement validatecreateworkorder;
	public boolean validateclickoncreateworkorder()
	{
		return validatecreateworkorder.isDisplayed();
	}
	
	
	@FindBy (xpath = "//select[@id='ddlNumType']")
	private WebElement Numberingtype;
	public void clickonnumberingtype()
	{
		Numberingtype.click(); 
	}
	//option[normalize-space()='WPO-HSR-']												
	//option[normalize-space()='WPO-HSR']
	@FindBy (xpath ="//option[normalize-space()='WPO-HSR-']")
	private WebElement WPOHSR;
	public void SelectoWPOHSR()
	{
		WPOHSR.click(); 
	}
	
	//option[text()='WPO-HSR-']
	@FindBy (xpath ="//option[text()='WPO-HSR-']")
	private WebElement validateWPOHSR;
	public boolean validateSelectoWPOHSR()
	{
		return WPOHSR.isDisplayed(); 
	}
	
	
	
	
	//button[@title='Select Aircraft Regn']
	
	@FindBy (xpath ="//button[@title='Select Aircraft Regn']")
	private WebElement AircraftReg;
	
	@FindBy (xpath ="(//label[@class='radio'])[2]")
	private WebElement BTTB;
	
	//label[normalize-space()='2-BTTB']
	public void clickonAircraftReg()
	{
		AircraftReg.click(); 
		BTTB.click();
		
	}
	
	
	//select[@id='ddlEngineWO']
	
	@FindBy (xpath = "//select[@id='ddlEngineWO']")
	private WebElement Engine;
	public void clickonEngine()
	{
		Engine.click(); 
	}
	
	@FindBy (xpath = "//select[@id='ddlEngineWO']//option[@value='6'][normalize-space()='CFM56-5B']")
	private WebElement selectEngine;
	public void selectonEngine()
	{
		selectEngine.click(); 
	}
	
	//select[@id='txtTypeOfCheck']
	
	@FindBy (xpath = "//select[@id='txtTypeOfCheck']")
	private WebElement Typeofcheck;
	public void selectTypeofcheck()
	{
		Typeofcheck.click(); 
	}
	
	//option[@value='1 C CHECK']
	//option[@value='1C CHECK']
	@FindBy (xpath = "//option[@value='1C CHECK']")
	private WebElement selectTypeofcheck;
	public void clickoneTypeofcheck()
	{
		selectTypeofcheck.click(); 
	}
	
	//input[@id='txtCustWorkPkgNo']
	@FindBy (xpath = "//input[@id='txtCustWorkPkgNo']")
	private WebElement Customerworkorderno;
	public void passingtheCustomerworkorderno()
	{
		Customerworkorderno.clear();
		Customerworkorderno.sendKeys("ABC@123"); 
	}
	
	
//	String startCalender = "//input[@id='txtPndStDate']";
//	String dateX = "/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody/tr/td";
//	String actMonthX = "//div[@class='w2ui-calendar-title title']";
//	String nextX = "//div[@class='w2ui-calendar-next next']";

	
	@FindBy (xpath = "//input[@id='txtPndStDate']")
	private WebElement plannedstartdate;
	public void clickonplannedstartdate()
	{
		plannedstartdate.sendKeys("20-04-2023");
	}
	

	@FindBy (xpath = "//input[@id='txtPndEndDate']")
	private WebElement plannedEnddate;
	public void clickonplannedEnddate()
	{
		plannedEnddate.sendKeys("30-04-2023");
	}
	
	@FindBy (xpath = "//input[@id='txtActStartDate']")
	private WebElement Actualstartdate;
	public void clickonActualstartdate()
	{
		Actualstartdate.sendKeys("21-04-2023");
	}
	//span[normalize-space()='Select Planning Check SPOC']
	//button[@title='Select Planning Check SPOC']
	@FindBy (xpath = "//button[@title='Select Planning Check SPOC']")
	private WebElement planningcheckspoc;
	public void clickonplanningcheckspoc()
	{
		 planningcheckspoc.click();
	}
	
	@FindBy (xpath = "//input[@value='ACFT046']")
	private WebElement planningcheckspocselected;
	public void ButtonofAkhilesKSpoc()
	{
		planningcheckspocselected.click();
	}
	
	
	
	@FindBy (xpath = "//select[@id='ddlStation']")
	private WebElement Station;
	public void selectthestation()
	{
		Station.click();
	}
	
	
	@FindBy (xpath = "//option[normalize-space()='Hosur']")
	private WebElement SelectStation;
	public void Hosurstation()
	{
		SelectStation.click();
	}
	
	@FindBy (xpath = "//select[@id='ddlFormat']")
	private WebElement Format;
	public void SelectFormat()
	{
		Format.click();
	}
	
	
	@FindBy (xpath = "//option[@value='Base']")
	private WebElement BaseFormat;
	public void SelectBaseMaintainance()
	{
		BaseFormat.click();
	}
	
	//input[@id='txtSeries']
	@FindBy (xpath = "//input[@id='txtSeries']")
	private WebElement Series;
	public void passingtheseries()
	{
		Series.clear();
		Series.sendKeys("12345");
	}
	
	
	// Starting For Maintainance data
	@FindBy (xpath = "//textarea[@id='txtMaintData']")
	private WebElement Maintainancedata;
	public void SelectMaintainancedata()
	{
		Maintainancedata.click();
	}
	
	//span[normalize-space()='Select Task Type']
	@FindBy (xpath ="//button[@title='Select Task Type']")
	private WebElement Tasktype;
	public void SelecttheTasktype()
	{
		Tasktype.click();
	}
	
	@FindBy (xpath = "//input[@value='ADs | SBs | (EOs)']")
	private WebElement ADsTasktype;
	public void SelecttheADsTasktype()
	{
		ADsTasktype.click();
	}
	
	@FindBy (xpath = "//label[normalize-space()='AWR']")
	private WebElement AWRTasktype;
	public void SelecttheAWRTasktype()
	{
		AWRTasktype.click();
	}
	
	@FindBy (xpath = "//label[normalize-space()='Customer In-house/ADD']")
	private WebElement ADDTasktype;
	public void SelecttheADDTasktype()
	{
		ADDTasktype.click();
	}
	
	@FindBy (xpath = "//label[normalize-space()='NRC']")
	private WebElement NRCTasktype;
	public void SelecttheNRCTasktype()
	{
		NRCTasktype.click();
	}
	
	@FindBy (xpath = "//label[normalize-space()='Routine Task Card']")
	private WebElement RoutineTaskcard;
	public void SelecttheRoutineTaskcard()
	{
		RoutineTaskcard.click();
	}
	
	@FindBy (xpath = "//input[@id='txtMDFromDate']")
	private WebElement MDfromdate;
	public void SelecttheMDfromdate() throws InterruptedException
	{
		
		MDfromdate.click();
		Thread.sleep(1000);
//		MDfromdate.clear();
//		Thread.sleep(2000);
//		for (int i=1;i<=10;i++)
//		{
//			Act.sendKeys(Keys.BACK_SPACE);
//			Thread.sleep(2000);
//		}
//		MDfromdate.sendKeys("18-02-2023");
//		MDfromdate.click();
	}
	
//	//input[@id='txtMDFromDate']
//	//td[normalize-space()='18']
//	@FindBy (xpath = "//input[@id='txtMDFromDate']")
//	private WebElement Maintainancestartdate;
//	public void SelecttheMaintainancestartdate()
//	{
////		Maintainancestartdate.click();
//		Maintainancestartdate.clear();
//		Maintainancestartdate.sendKeys("18-02-2023");
////		Maintainancestartdate.click();
//	}
	

	
	@FindBy (xpath = "//input[@id='txtMDFromTo']")
	private WebElement MaintainanceEnddate;
	public void SelecttheMaintainanceEnddate() throws InterruptedException
	{
		
		MaintainanceEnddate.click();
		
//		for (int i=1;i<=10;i++)
//		{
//			Act.sendKeys(Keys.BACK_SPACE);
//		}
//		Act.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
//		MaintainanceEnddate.sendKeys("19-02-2023");
	}
	
	
//	@FindBy (xpath = "//td[contains(text(),'28')]")
//	private WebElement MaintainanceTodate;
//	public void SelecttheMaintainanceTodate()
//	{
//		MaintainanceTodate.click();
//	}
	
	//select[@id='ddlFormat']
	//select[@id='ddlFormat']
	//input[@id='txtPndStDate']
	//td[normalize-space()='17']
	//select[@id='ddlNumType']
	
	
	
	
	
	
	
	@FindBy (xpath = "//textarea[@id='txtMD']")
	private WebElement Maintainancedatafilled;
	public void passingtheMaintainanceData()
	{
		Maintainancedatafilled.sendKeys("Aircraft Maintainance Data");
	}
	

    @FindBy (xpath = "//select[@id='ddlMDStatus']")
	private WebElement Maintainancedatastatus;
	public void passingtheMaintainancestatus()
	{
		Select s = new Select(Maintainancedatastatus);
		s.selectByValue("1");
	}
	
	
	@FindBy (id="btnMDSave")
	private WebElement AddButton;
    public void clickonAddButton()
	{
    	 AddButton.click();
    	
//    	js.executeScript(argument, null)
//    	Act.moveToElement(AddButton).click().build().perform();
	}
    
    @FindBy (xpath = "//div[@id='Maintenance_DataModal']//button[@type='button'][normalize-space()='Close']")
	private WebElement CloseButton;
    public void clickonCloseButton()
	{
    	CloseButton.click();
	}
    
    @FindBy (xpath = "//a[@title='Search Task']")
   	private WebElement Magnifier;
    public void clickonMagnifierglass()
   	{
    	   Magnifier.click();
   	}
    
    @FindBy (xpath = "//select[@id='ddlAircraftModelMasterssVT']")
    private WebElement BaseAircraftmodel;
    public void clickonBaseAircraftmodel()
    {
    	BaseAircraftmodel.click();
    } 
    
    @FindBy (xpath = "//select[@id='ddlAircraftModelMasterssVT']//option[@value='46'][normalize-space()='BOEING 737-800']")
    private WebElement A318Aircraftmodel;
    public void selectBaseAircraftmodel()
    {
    	A318Aircraftmodel.click();
    } 
    
    @FindBy (xpath = "//button[@onclick='bindTask()']")
    private WebElement SearchButton;
    public void clickonSearchButton()
    {
    	SearchButton.click();
    }
    
  //tr[@id='grid_gridTask_rec_1']//input[@type='checkbox']
    @FindBy (xpath = " //tr[@id='grid_gridTask_rec_1']//input[contains(@type,'checkbox')]")
    private WebElement Firstcheckbox;
    public void clickonFirstcheckbox()
    {
    	Firstcheckbox.click();
    }
    
    @FindBy (xpath = "//tr[@id='grid_gridTask_rec_2']//input[contains(@type,'checkbox')]")
    private WebElement Secondcheckbox;
    public void clickonSecondcheckbox()
    {
    	Secondcheckbox.click();
    }
    
    @FindBy (xpath = "//tr[@id='grid_gridTask_rec_3']//input[contains(@type,'checkbox')]")
    private WebElement Thirdcheckbox;
    public void clickonThirdcheckbox()
    {
    	Thirdcheckbox.click();
    }
    
    @FindBy (xpath = "//tr[@id='grid_gridTask_rec_4']//input[contains(@type,'checkbox')]")
    private WebElement Fourthcheckbox;
    public void clickonFourthcheckbox()
    {
    	Fourthcheckbox.click();
    }
    
    @FindBy (xpath = "//tr[@id='grid_gridTask_rec_5']//input[contains(@type,'checkbox')]")
    private WebElement Fifthcheckbox;
    public void clickonFifthcheckbox()
    {
    	Fifthcheckbox.click();
    }
    
    
    @FindBy (xpath = "//button[@id='btnbindTask']")
    private WebElement OkButton;
    public void clickonokButton()
    {
    	OkButton.click();
    }
    
  
    @FindBy (xpath = "//div[@id='demoModal']//button[contains(@type,'button')][normalize-space()='Close']")
    private WebElement CloseButtonsearchcriteriatask;
    public void clickoncloseButton()
    {
    	CloseButtonsearchcriteriatask.click();
    }

  //button[@id='btnCreateWorkOrder']
    
    

    @FindBy (id="btnCreateWorkOrder")
    private WebElement workorderbutton;
    public void clickonworkorderbutton()
    {
      workorderbutton.isEnabled();
	  workorderbutton.click();
    	
    	
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("arguments[0].click(),workorderbutton");
        

	  
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	js.executeScript("window.scrollBy(0,1000)");
    	
//    	WebDriverWait wait = new WebDriverWait(driver, 20);
//    	wait.until(ExpectedConditions.visibilityOf(workorderbutton));
//        workorderbutton.click();
//    	
//    	 workorderbutton.click();
    	
    	
    }
    
    
    
    
  //i[@class='fa fa-bars']
    @FindBy (xpath = "//i[@class='fa fa-bars']")
    private WebElement Menubutton;
    public void clickonMenubutton()
    {
    	 Menubutton.click();
    }
    

       
   
    
    
    
	
	
	
	
	
	
	
	
	
	
//  JavascriptExecutor js = (JavascriptExecutor) driver;
//  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    workorderbutton.click();
//  
//  js.executeScript("document.getElementById('btnCreateWorkOrder').click()");
     
//   Act = new Actions(driver);
//	 Act.moveToElement(workorderbutton).perform();
//	 Act.sendKeys(Keys.ENTER).perform();
//	 
	 
//	WebDriverWait wait = new WebDriverWait(driver, 20);
//	wait.until(ExpectedConditions.visibilityOf(workorderbutton));
//workorderbutton.click();
	
	
	
	
	
	
	
	
	
}
