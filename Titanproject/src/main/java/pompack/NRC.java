package pompack;

 
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilpack.propReader;



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
	public String validatepassingAircraftModel()
	{
//		return AircraftModel.isDisplayed();
		String ActualText = AircraftModel.getText();
		return ActualText;
		
	}
	
	
	@FindBy (xpath ="//label[text()='BBAM AVIATION SERVICES']")
	private WebElement CustomerName;
	public boolean validateCustomerName()
	{
		return CustomerName.isDisplayed();
	}
	
	@FindBy (id="lblAUTHCERT")
	private WebElement AuthorityofCertification;
	public boolean validateAuthorityofCertification()
	{
		return AuthorityofCertification.isEnabled();
	}
	
	//select[@id='ddlPackage']
	@FindBy (xpath ="//select[@id='ddlPackage']")
	private WebElement Visitpackages;
	public void clickonvisitpackages()
	{
		Visitpackages.click();
	}
	
		
	//select[@id='ddlPackage']
	@FindBy (xpath = "//select[@id='ddlPackage']")
	private List<WebElement> oneWorkorder;
	public void selectoneworkorder()
	{
		oneWorkorder.get(oneWorkorder.size()-1).click();
	}
		
	
	//option[text()='AWO-HSR-000621-0722']
	@FindBy (xpath ="//option[text()='AWO-HSR-000736-0523']")
	private WebElement selectvisitpackage;
	public void selectvisitpackage()
	{
		 selectvisitpackage.click();
	}
	
	//select[@id='ddlTask']
	@FindBy (xpath ="//select[@id='ddlTask']")
	private WebElement FindingfromTask;
	public void clickonfindingfromtask()
	{
		FindingfromTask.click();
	}
	
	@FindBy (xpath ="//option[text()='OPPORTUNITY INSPECTION']")
	private WebElement selecttask;
	public void clickonselecttask()
	{
		selecttask.click();
	}
	
	//select[@id='ddlATA']
	@FindBy (xpath ="//select[@id='ddlATA']")
	private WebElement ATA;
	public void clickonATA()
	{
		ATA.click();
	}
	
	//option[@value='05']
	@FindBy (xpath ="//option[@value='09']")
	private WebElement selectATA;
	public void clickononeATA()
	{
		selectATA.click();
	}
	
	//select[@id='ddlSubATA']
	@FindBy (xpath ="//select[@id='ddlSubATA']")
	private WebElement SubATA;
	public void clickonsubATA()
	{
		SubATA.click();
	}
	
	//option[@value='02']
	@FindBy (xpath ="//option[normalize-space()='02']")
	private WebElement SelectSubATA;
	public void clickononesubATA()
	{
		SelectSubATA.click();
	}
	
	//button[@title='Select Zone/Trade']
	@FindBy (xpath ="//button[@title='Select Zone/Trade']")
	private WebElement ZoneorTrade;
	public void clickonZoneorTrade()
	{
		ZoneorTrade.click();
	}
	
	//input[@value='436']
	@FindBy (xpath ="//input[@value='435']")
	private WebElement Selectzone;
	public void Selectonezone()
	{
		Selectzone.click();
	}
	
	//input[@id='txtDate']
	@FindBy (xpath ="//input[@id='txtDate']")
	private WebElement NRCdate;
	public void SelectNRCdate()
	{
		NRCdate.click();
//		NRCdate.clear();
//		NRCdate.sendKeys("02-May-23");
	}
	
	//input[@id='txtTime']
	@FindBy (xpath ="//input[@id='txtTime']")
	private WebElement NRCtime;
	public void SelectNRCtime()
	{
		NRCtime.sendKeys("0800");
	}
	
	//button[@title='Select Trade to Action']
	@FindBy (xpath ="//button[@title='Select Trade to Action']")
	private WebElement Tradetoaction;
	public void clickonTradetoaction()
	{
		Tradetoaction.click();
	}
	
	//input[@value='100']
	@FindBy (xpath ="//input[@value='100']")
	private WebElement selectTradetoaction;
	public void selectoneTradetoaction()
	{
		selectTradetoaction.click();
	}
	
	//select[@id='ddlDuplicate']
	@FindBy (xpath ="//select[@id='ddlDuplicate']")
	private WebElement duplicateinsprequired;
	public void clickonduplicateinsprequired()
	{
		duplicateinsprequired.click();
	}
	
	//option[text()='Yes']
	@FindBy (xpath ="//option[text()='No']")
	private WebElement duplicateinsprequiredNo;
	public void clickonduplicateinsprequiredNo()
	{
		duplicateinsprequiredNo.click();
	}
	
	
	
	//textarea[@id='txtDefect']
	@FindBy (xpath ="//textarea[@id='txtDefect']")
	private WebElement Defectordamage;
	public void Enterdefectordamage() throws IOException
	{
		Defectordamage.click();
		Defectordamage.sendKeys(propReader.ExcelStringValueReader("data",36,1));
//		Defectordamage.sendKeys("Test Defect");
		
	}
	
	//td[contains(text(),'Add Record')])[1]
	@FindBy (xpath ="//body[1]/div[1]/div[1]/div[5]/div[5]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement Addrecord;
	public void ClickonAddrecordbutton()
	{
		Addrecord.click();
	}
	
	//a[@onclick='return View_OffPart()']
	@FindBy (xpath ="//a[@onclick='return View_OffPart()']")
	private WebElement OffpartNo;
	public void ClickonOffpartMagnifierglass()
	{
		OffpartNo.click();
	}
	
	//button[@id='btnSearch']
	@FindBy (xpath ="//button[@id='btnSearch']")
	private WebElement Searchbutton;
	public void ClickonSearchbutton()
	{
		Searchbutton.click();
	}
	
	//tr[@id='grid_gridPart_rec_1']//input[@type='checkbox']
	@FindBy (xpath ="//tr[@id='grid_gridPart_rec_1']//input[@type='checkbox']")
	private WebElement Selectfirstpart;
	public void Selectfirstpartcheckbox()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Selectfirstpart));
	
		Selectfirstpart.click();
	}
	
	//tr[@id='grid_gridPart_rec_2']//input[@type='checkbox']
	@FindBy (xpath ="//tr[@id='grid_gridPart_rec_2']//input[@type='checkbox']")
	private WebElement Selectsecondpart;
	public void Selectsecondpartcheckbox()
	{
		Selectsecondpart.click();
	}
	
	//button[normalize-space()='OK']
	@FindBy (xpath ="//button[normalize-space()='OK']")
	private WebElement okbutton;
	public void Clickonokbutton()
	{
		okbutton.click();
	}

	@FindBy (xpath ="//tr[@id='grid_grid_rec_1']//td[4]")
	private WebElement OffserialNo;
	public void ClickonOffserialNo()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(OffserialNo));
//		OffserialNo.click();
		s = new Actions (driver);
		s.doubleClick(OffserialNo).perform();

     }
	
	@FindBy (xpath ="//tr[@id='grid_grid_rec_1']//td[4]")
	private WebElement OffserialNoColoumn;
	public void ClickonOffserialNocoloumn() throws IOException
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(OffserialNoColoumn));
//		OffserialNo.click();
		s = new Actions (driver);
		s.sendKeys(propReader.ExcelStringValueReader("data",37,1));
//	    s.sendKeys("Test Off serial No").perform();
     }
	

	//a[@onclick='return View_OnPart()']
	@FindBy (xpath ="//a[@onclick='return View_OnPart()']")
	private WebElement OnpartNo;
	public void ClickonOnpartNomagnifierglass()
	{
		OnpartNo.click();
	}
	
	//body[1]/div[1]/div[1]/div[5]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[6]/div[1]/div[1]
	@FindBy (xpath ="//body[1]/div[1]/div[1]/div[5]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[6]/div[1]/div[1]")
	private WebElement Onparttype;
	public void ClickonOnparttype()
	{
		Onparttype.click();
	}
	
	//td[contains(text(),'Expendable')]
	@FindBy (xpath ="//td[contains(text(),'Expendable')]")
	private WebElement selectOnparttype;
	public void selectOnparttypeExpandable()
	{
		selectOnparttype.click();
	}
	
	//input[@id='grid_grid_edit_1_7']
	@FindBy (xpath ="//input[@id='grid_grid_edit_1_7']")
	private WebElement AlternatepartNo;
	public void EnterAlternatepartNo() throws IOException
	{
		AlternatepartNo.sendKeys(propReader.ExcelStringValueReader("data",38,1));
//		AlternatepartNo.sendKeys("Test Alternate part No");
	}
	
	//input[@id='grid_grid_edit_1_8']
	@FindBy (xpath ="//input[@id='grid_grid_edit_1_8']")
	private WebElement ONserialNo;
	public void EnterONserialNo()
	{
		ONserialNo.sendKeys("Test ON serial No");
	}
	
	
	
	//tr[@id='grid_gridPart_rec_1']//input[@type='checkbox']
	
	//input[@id='grid_grid_edit_1_10']
	@FindBy (xpath ="//tr[@id='grid_grid_rec_1']//td[10]")
	private WebElement IPCREference;
	public void ClickonIPCREference()
	{  
		IPCREference.click();
//		s.doubleClick(IPCREference).perform();
//		IPCREference.sendKeys("TestIPCReferance");
	}
	
	
	//input[@id='grid_grid_edit_1_10']
	@FindBy (xpath ="//input[@id='grid_grid_edit_1_10']")
	private WebElement IPCREferencegrid;
	public void ClickonIPCREferencegrid()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(IPCREference));
//		IPCREference.click();
		s = new Actions (driver);
		s.doubleClick(IPCREference).perform();
		
//		IPCREference.sendKeys("TestIPCReferance");
     }
	
	@FindBy (xpath ="//input[@id='grid_grid_edit_1_10']")
	private WebElement IPCREferencegridtext;
	public void ClickonIPCREferencegridtext()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(IPCREference));
		s = new Actions (driver);
		s.sendKeys("Test IPC Referance").perform();
//		IPCREference.sendKeys("TestIPCReferance");
     }
	
	//input[@id='grid_grid_edit_1_13']
	@FindBy (xpath ="//input[@id='grid_grid_edit_1_13']")
	private WebElement ReqQty;
	public void ClickonReqQty()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(ReqQty));
		s = new Actions (driver);
		s.doubleClick(ReqQty).perform();
		s.sendKeys("10").perform();
    }
	
	//input[@id='grid_grid_edit_1_15']
	@FindBy (xpath ="//input[@id='grid_grid_edit_1_15']")
	private WebElement MaterialNeeddate;
	public void EnterMaterialNeeddate()
	{
		MaterialNeeddate.sendKeys("15-06-2023");
	}
	
	//input[@id='grid_grid_edit_1_16']
	@FindBy (xpath ="//input[@id='grid_grid_edit_1_16']")
	private WebElement BatchorRelNote;
	public void EnterBatchorRelNote()
	{
		BatchorRelNote.sendKeys("Test Batch or Rel Note");
	}
	
	//input[@id='grid_grid_edit_1_17']
	@FindBy (xpath ="//tr[@id='grid_grid_rec_1']//td[17]")
	private WebElement usedQuantity;
	public void EnterusedQuantity()
	{
		s = new Actions (driver);
		s.doubleClick(usedQuantity).perform();
//		s.sendKeys("5").perform();
	}
//	
	@FindBy (xpath ="//tr[@id='grid_grid_rec_1']//td[17]")
	private WebElement usedQuantitycoloumn;
	public void EnterusedQuantitycoloumn()
	{
		s = new Actions (driver);
		s.sendKeys("5").perform();
	}
	
	//input[@id='txtEstManHours']
	@FindBy (xpath ="//input[@id='txtEstManHours']")
	private WebElement Estimatedmanhours;
	public void EnterEstimetedmanhours()
	{
		Estimatedmanhours.sendKeys("02:00");
	}
	
    //td[contains(text(),'Add Record')])[2]
	@FindBy (xpath ="//body[1]/div[1]/div[1]/div[5]/div[6]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement AddrecordsToolIn;
	public void clickonAddrecordsToolIn()
	{
		AddrecordsToolIn.click();
	}
	
	//a[@onclick='return View_TPartN()']
	@FindBy (xpath ="//a[@onclick='return View_TPartN()']")
	private WebElement ToolpartNomagnifier;
	public void ClickonToolpartNomagnifierglass()
	{
		ToolpartNomagnifier.click();
	}
	
	
	//input[@id='PM_PartNo']
	@FindBy (xpath ="//input[@id='PM_PartNo']")
	private WebElement PartNo;
	public void EnterpartNo()
	{
		PartNo.sendKeys("1/4 OFFSET SCREW DRIVER PHILIPS");
	}
	
	//td[@class='w2ui-grid-data']//input[@type='checkbox']
	@FindBy (xpath ="//td[@class='w2ui-grid-data']//input[@type='checkbox']")
	private WebElement checkboxfortool;
	public void Clickoncheckboxfortool()
	{
		checkboxfortool.click();
	}
	
	@FindBy (xpath ="//button[@id='btnToolSearch']")
	private WebElement ToolSearchbutton;
	public void ClickonToolSearchbutton()
	{
		ToolSearchbutton.click();
	}
	
	//tr[@id='grid_gridToool_rec_1']//td[1]
	@FindBy (xpath ="//td[@id='grid_gridToool_cell_0_select']//input[@type='checkbox']")
	private WebElement Toolpartgrid;
	public void ClickonToolpartgrid()
	{  
		Toolpartgrid.click();
	}
	
	
	//input[@id='grid_gridToool_edit_1_3']
	@FindBy (xpath ="(//td[@class='w2ui-grid-data'])[144]")
	private WebElement ToolserialNo;
	public void ClickonToolserialNo() throws InterruptedException
	{  
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(ToolserialNo));
		s = new Actions (driver);
		s.doubleClick(ToolserialNo).perform();
		Thread.sleep(2000);
		s.sendKeys("10").perform();
    }
	
	//tr[@id='grid_gridToool_rec_1']//td[6]
	@FindBy (xpath ="//tr[@id='grid_gridToool_rec_1']//td[6]")
	private WebElement Calibrationdate;
	public void EnterCalibrationdate() throws InterruptedException
	{  	
		s = new Actions (driver);
		s.doubleClick(Calibrationdate).perform();
		Thread.sleep(2000);
		s.sendKeys("11-05-2023").perform();
    }
	
	//tr[@id='grid_gridToool_rec_1']//td[6]
	@FindBy (xpath ="//tr[@id='grid_gridToool_rec_1']//td[7]")
	private WebElement Needdate;
	public void EnterNeeddate() throws InterruptedException
	{  
        s = new Actions (driver);
		s.doubleClick(Needdate).perform();
		Thread.sleep(2000);
		s.sendKeys("30-06-2023").perform();
    }
	
		
	//button[text()=' Create ']
	@FindBy (xpath ="//button[text()=' Create ']")
	private WebElement Createbutton;
	public void ClickonCreatebutton()
	{  
		Createbutton.click();
	}
	
	//button[normalize-space()='Proceed']
	@FindBy (xpath ="//button[normalize-space()='Proceed']")
	private WebElement Proceedbutton;
	public void ClickonProceedbutton()
	{  
		Proceedbutton.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
