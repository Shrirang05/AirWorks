package pompack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateNRC 
{
	private WebDriver driver;
	private Actions s;
	private Select Act;
	
	public UpdateNRC (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//a[text()='View/Close NRC']
	@FindBy (xpath ="//a[text()='View/Close NRC']")
	private WebElement ViewCloseNRC;
	public void clickonViewCloseNRC()
	{  
		ViewCloseNRC.click();
	}
	
	
	//button[@title='Select Visit Package']
	@FindBy (xpath ="//button[@title='Select Visit Package']")
	private WebElement visitpackage;
	public void clickonvisitpackage()
	{  
		visitpackage.click();
	}
	
	//input[@value='AWO-HSR-000715-0523']
	@FindBy (xpath ="//input[@value='AWO-HSR-000736-0523']")
	private WebElement selectvisitpackage;
	public void clickonselectvisitpackage()
	{  
		selectvisitpackage.click();
	}
	
	//div[@title='R9105105-120900']//a[@id='NA2']
	@FindBy (xpath ="//a[text()='23406105-170800']")
	private WebElement SelectNRCNo;
	public void clickonSelectNRCNo()
	{  
		SelectNRCNo.click();
	}
	
	//button[@id='Search']
	@FindBy (xpath ="//button[@id='Search']")
	private WebElement Searchbutton;
	public void clickonSearchbutton()
	{  
		Searchbutton.click();
	}
	
	public void childwindowhandles()
	{
		Set<String>Cpage = driver.getWindowHandles();
		ArrayList<String>win = new ArrayList<String>(Cpage);
		driver.switchTo().window(win.get(1));
	}
	
	
	@FindBy (xpath ="//input[@id='ddlAirInfo']")
	private WebElement Aircraftregdis;
	public boolean checkforAircraftregdis()
	{  
		return Aircraftregdis.isEnabled();
	}
	
	//input[@id='ddlPackage']
	@FindBy (xpath ="//input[@id='ddlPackage']")
	private WebElement validatevisitpackage;
	public boolean checkforvisitpackage()
	{  
		return validatevisitpackage.isEnabled();
	}
	
	//input[@id='ddlATA']
	@FindBy (xpath ="//input[@id='ddlATA']")
	private WebElement validateATA;
	public boolean checkforATA()
	{  
		return validateATA.isEnabled();
	}
	
	//input[@id='ddlSubATA']
	@FindBy (xpath ="//input[@id='ddlSubATA']")
	private WebElement validatesubATA;
	public boolean checkforsubATA()
	{  
		return validatesubATA.isEnabled();
	}
	
	//input[@id='txtDate']
	@FindBy (xpath ="//input[@id='txtDate']")
	private WebElement UpdateDate;
	public boolean checkforUpdateDate()
	{  
		return UpdateDate.isEnabled();
	}
	
	//input[@id='txtTime']
	@FindBy (xpath ="//input[@id='txtTime']")
	private WebElement UpdateTime;
	public boolean checkforUpdateTime()
	{  
		return UpdateTime.isEnabled();
	}
	
	//input[@id='txtAuthNo']
	@FindBy (xpath ="//input[@id='txtAuthNo']")
	private WebElement AuthNo;
	public boolean checkforAuthNo()
	{  
		return AuthNo.isEnabled();
	}
	
	//input[@id='ddlAUTHCERT']
	@FindBy (xpath ="//input[@id='ddlAUTHCERT']")
	private WebElement Authorityofcertification;
	public boolean checkforAuthorityofcertification()
	{  
		return Authorityofcertification.isEnabled();
	}
	
	//select[@id='ddlTask']
	@FindBy (xpath ="//select[@id='ddlTask']")
	private WebElement Findingfromtask;
	public void clickonFindingfromtask()
	{  
		Findingfromtask.click();
//		Act = new Select (Findingfromtask);
//		Act.selectByVisibleText("OPPORTUNITY INSPECTION");
		
	}
	
	//option[@value='ADDITIONAL TASK']
	@FindBy (xpath ="//option[@value='ADDITIONAL TASK']")
	private WebElement Addtaskasfindingfromtask;
	public void clickonAddtaskasfindingfromtask()
	{  
		Addtaskasfindingfromtask.click();
	}
	
	//button[@title='B1']
	@FindBy (xpath ="//button[@title='B1']")
	private WebElement TradetoactionupdateNRC;
	public void clickonTradetoactionupdateNRC()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(TradetoactionupdateNRC));
		TradetoactionupdateNRC.click();
	}
	
	//input[@value='102']
	@FindBy (xpath ="//input[@value='102']")
	private WebElement B2trade;
	public void clickonB2trade()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(B2trade));
		B2trade.click();
	}
	
	
	//input[@id='txtEstManHours']
	@FindBy (xpath ="//input[@id='txtEstManHours']")
	private WebElement Estimatedmanhoursforupdate;
	public void clickonEstimatedmanhoursforupdate()
	{  
//		Estimatedmanhoursforupdate.clear();
		Estimatedmanhoursforupdate.sendKeys("0100");
	}
	

	@FindBy (xpath ="(//button[@type='button'][normalize-space()='Edit Call Out'])[1]")
	private WebElement Editcallout;
	public void clickonEditcallout()
	{  
		Editcallout.click();
	}
			
	@FindBy (xpath ="//textarea[@id='gridtxtDefect']")
	private WebElement editcallouts;
	public void EnterEditcallouts()
	{  
		editcallouts.sendKeys("Test Defect");
	}
	
	//input[@id='gridDefectDate']
	@FindBy (xpath ="//input[@id='gridDefectDate']")
	private WebElement editcalloutsstartdate;
	public void clickonEditcalloutsstartdate()
	{  
		editcalloutsstartdate.click();
	}
	
	//input[@id='gridDefectTime']
	@FindBy (xpath ="//input[@id='gridDefectTime']")
	private WebElement Editcalloutstarttime;
	public void clickonEditcalloutsstarttime()
	{  
		Editcalloutstarttime.sendKeys("1900");
	}
	
	//button[@id='btngridDefectUpdate']
	@FindBy (xpath ="//button[@id='btngridDefectUpdate']")
	private WebElement Updatebuttonforeditcallout;
	public void clickonUpdatebuttonforeditcallout()
	{  
		Updatebuttonforeditcallout.click();
	}
	
	@FindBy (xpath ="(//button[@type='button'][normalize-space()='Add Image'])[1]")
	private WebElement AddImage;
	public void clickonAddImage()
	{  
		AddImage.click();
	}
	
	//textarea[@id='txtdescription']
	@FindBy (xpath ="//textarea[@id='txtdescription']")
	private WebElement Enterdiscription;
	public void Enterdiscription()
	{  
		Enterdiscription.sendKeys("Enter Discription");
	}

	
	//input[@id='uploadFile']
	@FindBy (xpath ="//input[@id='uploadFile']")
	private WebElement Uploadfile;
	public void clickonuploadfile()
	{  
		Uploadfile.sendKeys("C:\\Users\\Shrirang.ladda\\Desktop\\TestImageforupload.jpg");
	}
	
	//button[@id='btnUpload']
	@FindBy (xpath ="//button[@id='btnUpload']")
	private WebElement uploadfilebutton;
	public void clickonuploadfilebutton()
	{  
		uploadfilebutton.click();
	}
	
	
	//button[normalize-space()='Add Action']
	@FindBy (xpath ="//body[1]/div[1]/div[1]/div[5]/div[7]/div[1]/div[2]/button[1]")
	private WebElement Addactiontaken;
	public void clickonAddactiontaken()
	{  
		Addactiontaken.click();
	}
	
	//textarea[@id='gridtxtActionTaken']
	@FindBy (xpath ="//textarea[@id='gridtxtActionTaken']")
	private WebElement Actiontaken;
	public void EnterActiontaken()
	{  
		Actiontaken.sendKeys("Test Action Taken");
	}
	
	//button[@title='Select Techician']
	@FindBy (xpath ="//button[@title='Select Techician']")
	private WebElement Technician;
	public void ClickonTechnician()
	{  
		Technician.click();
	}
	
	//label[@class='checkbox']//input[@value='G00210']
	@FindBy (xpath ="//label[@class='checkbox']//input[@value='TGUR91']")
	private WebElement oneTechnician;
	public void SelectoneTechnician()
	{  
		oneTechnician.click();
	}
	
	//input[@id='gridDate']
	@FindBy (xpath ="//input[@id='gridDate']")
	private WebElement startdate;
	public void Enterstartdate()
	{  
		startdate.click();
	}
	
	//input[@id='gridTime']
	@FindBy (xpath ="//input[@id='gridTime']")
	private WebElement starttime;
	public void Enterstarttime()
	{  
		starttime.sendKeys("0800");
	}
	
	//input[@id='gridEndDate']
	@FindBy (xpath ="//input[@id='gridEndDate']")
	private WebElement Enddate;
	public void EnterEnddate()
	{  
		Enddate.click();
	}
	
	//input[@id='gridEndTime']
	@FindBy (xpath ="//input[@id='gridEndTime']")
	private WebElement Endtime;
	public void EnterEndtime()
	{  
		Endtime.sendKeys("0900");
	}
	
	//input[@id='gridActualManHours']
	@FindBy (xpath ="//input[@id='gridActualManHours']")
	private WebElement Actualmanhours;
	public void EnterActualmanhours()
	{  
		Actualmanhours.sendKeys("01:00");
	}
	
	//input[@id='gridElapsedHours']
	@FindBy (xpath ="//input[@id='gridElapsedHours']")
	private WebElement Elapsedmanhours;
	public void EnterElapsedmanhours()
	{  
		Elapsedmanhours.sendKeys("01:00");
	}
	
	//input[@id='NextActionReq']
	@FindBy (xpath ="//input[@id='NextActionReq']")
	private WebElement NextActionReuired;
	public void clickonNextActionReuired()
	{  
		NextActionReuired.click();
	}
	
	//span[normalize-space()='Select A.H.Name']
	@FindBy (xpath ="//span[normalize-space()='Select A.H.Name']")
	private WebElement FromselectAHName;
	public void clickonFromselectAHName()
	{  
		FromselectAHName.click();
	}
	
	//div[@id='demoModal']//span[1]//div[1]//button[1]//span[1]
	@FindBy (xpath ="//label[@class='radio']//input[@value='TGUR67']")
	private WebElement FromselectoneAHName;
	public void clickonFromselectoneAHName()
	{  
		 FromselectoneAHName.click();
	}
	
	//button[@id='btngridSave']
	@FindBy (xpath ="//button[@id='btngridSave']")
	private WebElement Addbutton;
	public void clickonAddbutton()
	{  
		Addbutton.click();
	}
	
	//button[text()='ok']
	@FindBy (xpath ="//button[text()='ok']")
	private WebElement okbutton;
	public void clickonokbutton()
	{  
		okbutton.click();
	}
	
	//button[@onclick='CloseActionTaken_Click();'][normalize-space()='Close']
	@FindBy (xpath ="//button[@onclick='CloseActionTaken_Click();'][normalize-space()='Close']")
	private WebElement closebutton;
	public void clickonclosebutton()
	{  
		closebutton.click();
	}
		
		
	@FindBy (xpath ="//button[@id='btn_add_new_defect']")
	private WebElement Addcallout;
	public void clickonAddcallout()
	{ 
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(Addcallout));
		Addcallout.click();
	}
	
	//textarea[@id='gridtxtDefect']
	@FindBy (xpath ="//textarea[@id='gridtxtDefect']")
	private WebElement Callouts;
	public void Entercallouts()
	{  
		Callouts.sendKeys("Test Findings");
	}
	
	//input[@id='gridDefectAH']
	@FindBy (xpath ="//input[@id='gridDefectAH']")
	private WebElement AHNo;
	public boolean validateAHNo()
	{  
	     return AHNo.isEnabled();
	}
	
	//input[@id='gridDefectDate']
	@FindBy (xpath ="//input[@id='gridDefectDate']")
	private WebElement Addcalloutdate;
	public void Addcalloutdate()
	{  
		Addcalloutdate.click();
	}
	
	//input[@id='gridDefectTime']
	@FindBy (xpath ="//input[@id='gridDefectTime']")
	private WebElement Addcalloutdefecttime;
	public void Addcalloutdefecttime()
	{  
		Addcalloutdefecttime.sendKeys("1000");
	}
	
	//button[@id='btngridDefectSave']
	@FindBy (xpath ="//button[@id='btngridDefectSave']")
	private WebElement AddbuttonforAddcallout;
	public void AddbuttonforAddcallout()
	{  
		AddbuttonforAddcallout.click();
	}
	
	
	//button[@class='nbtn nbtn_primary upload_action_taken_img']
	@FindBy (xpath ="//button[@class='nbtn nbtn_primary upload_action_taken_img']")
	private WebElement AddImageactiontaken;
	public void AddImageactiontaken()
	{  
		AddImageactiontaken.click();
	}
	
	@FindBy (xpath ="//textarea[@id='txtdescription']")
	private WebElement EnterdiscriptioninactiontakenImage;
	public void EnterdiscriptioninactiontakenImage()
	{  
		EnterdiscriptioninactiontakenImage.sendKeys("Enter Discription");
	}
	
	//input[@id='uploadFile']
	@FindBy (xpath ="//input[@id='uploadFile']")
	private WebElement fileuploadforActiontakenImage;
	public void fileuploadforActiontakenImage()
	{  
		fileuploadforActiontakenImage.sendKeys("C:\\Users\\Shrirang.ladda\\Desktop\\TestImageforupload.jpg");
	}
	
	//call out 2 started
	
	@FindBy (xpath ="(//button[@type='button'][normalize-space()='Edit Call Out'])[2]")
	private WebElement Editcallout2;
	public void clickonEditcallout2()
	{  
		Editcallout2.click();
	}
	
	//div[@id='defect_wrapper']//div[2]//div[2]//button[1]
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[1]/div[5]/div[7]/div[2]/div[2]/button[1]")
	private WebElement Addactiontaken2;
	public void clickonAddactiontaken2()
	{  
		Addactiontaken2.click();
	}
	
	
	//Materials grids
	
	@FindBy (xpath ="//td[text()='Add Record'][1]")
	private WebElement AddRecord2;
	public void clickonAddRecord2()
	{  
		AddRecord2.click();
	}
	
	//input[@id='grid_grid_edit_2_3']
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_3']")
	private WebElement OffpartNo;
	public void clickonoffpartNogrid()
	{  
		OffpartNo.click();
	}
	
	//a[@onclick='return View_OffPart()']
	@FindBy (xpath ="//a[@onclick='return View_OffPart()']")
	private WebElement OffpartNomagnifier;
	public void clickonoffpartNomagnifier()
	{  
		OffpartNomagnifier.click();
	}
	
	//button[@id='btnSearch']
	@FindBy (xpath ="//button[@id='btnSearch']")
	private WebElement searchbutton;
	public void clickonsearchbutton()
	{  
		searchbutton.click();
	}
		
	//tr[@id='grid_gridPart_rec_4']//input[@type='checkbox']
	@FindBy (xpath ="//tr[@id='grid_gridPart_rec_4']//input[@type='checkbox']")
	private WebElement Partmastercheckbox;
	public void clickonPartmastercheckbox()
	{  
		Partmastercheckbox.click();
	}
		
	//button[normalize-space()='OK']
	@FindBy (xpath ="//button[normalize-space()='OK']")
	private WebElement offpartokbutton;
	public void clickonoffpartokbutton()
	{  
		offpartokbutton.click();
	}
	
	
	//tr[@id='grid_grid_rec_2']//td[1]
	@FindBy (xpath ="//tr[@id='grid_grid_rec_2']//td[4]")
	private WebElement offserialNo;
	public void clickonoffserialNo() 
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(offserialNo));
	
		s = new Actions (driver);
		s.doubleClick(offserialNo).perform();
		
	}
	
	//input[@id='grid_grid_edit_2_4']
	@FindBy (xpath ="//tr[@id='grid_grid_rec_2']//td[4]")
	private WebElement EnteroffserialNo;
	public void EnteroffserialNo()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(EnteroffserialNo));
		s = new Actions (driver);
		s.sendKeys("Testing off serial no.").perform();
	}
	
	//a[@onclick='return View_OnPart()']
	@FindBy (xpath ="//a[@onclick='return View_OnPart()']")
	private WebElement OnpartNo;
	public void clickonOnpartNo()
	{  
		OnpartNo.click();
	}
	
	

	//tr[@id='grid_grid_rec_2']//td[7]
	@FindBy (xpath ="//tr[@id='grid_grid_rec_2']//td[7]")
	private WebElement Alternatepartno;
	public void clickonAlternatepartno()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(Alternatepartno));
	
		s = new Actions (driver);
		s.doubleClick(Alternatepartno).perform();
		
	}
	
	//input[@id='grid_grid_edit_2_8']
	@FindBy (xpath ="//tr[@id='grid_grid_rec_2']//td[7]")
	private WebElement EAlternatepartno;
	public void EnteralternatepartNo()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(EAlternatepartno));
	
		s = new Actions (driver);
		s.sendKeys("Testing Alternate part No").perform();
	}
	
	
	
	//input[@id='grid_grid_edit_2_9']
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_8']")
	private WebElement onserialno;
	public void Enteronserialno()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(onserialno));
	
		onserialno.sendKeys("Testing serial No");
	}
	
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_10']")
	private WebElement IPCReferance;
	public void EnterIPCReferance()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(IPCReferance));
	
		IPCReferance.sendKeys("Testing IPC Referance No.");
	}
	
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_11']")
	private WebElement POS;
	public void EnterPOS()
	{  	
		POS.sendKeys("Left");
	}
	
	//input[@id='grid_grid_edit_2_13']
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_13']")
	private WebElement RequiredQTY;
	public void EnterRequiredQTY()
	{  
		RequiredQTY.sendKeys("1");
	}
	
	//input[@id='grid_grid_edit_2_15']
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_15']")
	private WebElement Needdate;
	public void EnterNeeddate()
	{  
		Needdate.sendKeys("30-05-2023");
	}
	
	//input[@id='grid_grid_edit_2_16']
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_16']")
	private WebElement Batchorreleasenote;
	public void EnterBatchorreleasenote()
	{  
		
		Batchorreleasenote.sendKeys("Testing batch note");
	}
	
	//input[@id='grid_grid_edit_2_17']
	@FindBy (xpath ="//input[@id='grid_grid_edit_2_17']")
	private WebElement Usedqty;
	public void EnterUsedqty()
	{  
		
		Usedqty.sendKeys("1");
	}
	
	
	//a[@title='Search Material Issue']
	@FindBy (xpath ="//a[@title='Search Material Issue']")
	private WebElement MaterialIssueMagnifier;
	public void clickonMaterialissuemagnifier()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(MaterialIssueMagnifier));
		
		MaterialIssueMagnifier.click();
	}
	
	//button[@id='btn_PartialMaterialIssueSearch']
	@FindBy (xpath ="//button[@id='btn_PartialMaterialIssueSearch']")
	private WebElement MaterialIssuesearchbutton;
	public void clickonmaterialIssuesearchbutton()
	{  
		MaterialIssuesearchbutton.click();
	}
	
	//td[@id='grid_grid_PartialMaterialIssueSearch_cell_0_select']//input[@type='checkbox']
	@FindBy (xpath ="//td[@id='grid_grid_PartialMaterialIssueSearch_cell_0_select']//input[@type='checkbox']")
	private WebElement PartNocheckbox;
	public void clickonPartNocheckbox()
	{  
		PartNocheckbox.click();
	}
	
	//button[@id='btn_Add_MaterialIssue_Popup_Values']
	@FindBy (xpath ="//button[@id='btn_Add_MaterialIssue_Popup_Values']")
	private WebElement MaterialIssueAdd;
	public void clickonMaterialIssueAddbutton()
	{  
		MaterialIssueAdd.click();
	}
	
	//tr[@id='grid_grid_rec_3']//td[10]
	@FindBy (xpath ="//tr[@id='grid_grid_rec_3']//td[10]")
	private WebElement IPCreferanceadd;
	public void clickonIPCreferancefor3rdrow()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(IPCreferanceadd));
	
		s = new Actions (driver);
		s.doubleClick(IPCreferanceadd).perform();
	}
	
	//input[@id='grid_grid_edit_3_10']
	@FindBy (xpath ="//input[@id='grid_grid_edit_3_10']")
	private WebElement EIPCReferance;
	public void EnterIPCReferancefor3rdrow()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(EIPCReferance));
	
		EIPCReferance.sendKeys("IPC Referance No");
	}
	
	//input[@id='grid_grid_edit_3_13']
	@FindBy (xpath ="//input[@id='grid_grid_edit_3_13']")
	private WebElement ReqQTYfor3rdgrid;
	public void EnterReqQTYfor3rdgrid()
	{  
		
		ReqQTYfor3rdgrid.sendKeys("2");
	}
	
	
	
	
	
	
	
	
	
	@FindBy (xpath ="//body[1]/div[1]/div[1]/div[5]/div[10]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement AddrecordfortoolsIn;
	public void ClickonAddrecordfortoolsIn()
	{  
		AddrecordfortoolsIn.click();
	}
	
	//a[@onclick='return View_TPartN()']
	@FindBy (xpath ="//a[@onclick='return View_TPartN()']")
	private WebElement ToolpartNomagnifier;
	public void clickonToolpartNomagnifier()
	{  
		ToolpartNomagnifier.click();
	}
	
	
	//input[@id='PM_PartNo']
	@FindBy (xpath ="//input[@id='PM_PartNo']")
	private WebElement EToolpartNo;
	public void EntertoolpartNo()
	{  
		EToolpartNo.sendKeys("2-887-01-9313S");
	}
	
	//button[@id='btnToolSearch']
	@FindBy (xpath ="//button[@id='btnToolSearch']")
	private WebElement Toolsearchbutton;
	public void clickonToolsearchbutton()
	{  
		Toolsearchbutton.click();
	}
	
	//tr[@id='grid_gridToolPart_rec_5']//input[@type='checkbox']
	@FindBy (xpath ="//td[@class='w2ui-grid-data']//input[@type='checkbox']")
	private WebElement ToolpartNocheckbox;
	public void clickonToolpartNocheckbox()
	{  
		ToolpartNocheckbox.click();
	}
	
	@FindBy (xpath ="//button[normalize-space()='OK']")
	private WebElement Toolpartok;
	public void clickonToolpartok()
	{  
		Toolpartok.click();
	}
	
	//td[@class='w2ui-grid-data w2ui-selected'][4]
	@FindBy (xpath ="//tr[@id='grid_gridToool_rec_2']//td[6]")
	private WebElement calibrationdate;
	public void clickoncalibrationdate()
	{  
		s = new Actions (driver);
		s.doubleClick(calibrationdate).perform();
		s.sendKeys("11-05-2023").perform();
	}
	
	//tr[@id='grid_gridToool_rec_2']//td[7]
	@FindBy (xpath ="//tr[@id='grid_gridToool_rec_2']//td[7]")
	private WebElement ToolNeeddate;
	public void clickonNeeddate()
	{  
		s = new Actions (driver);
		s.doubleClick(ToolNeeddate).perform();
		s.sendKeys("30-05-2023").perform();
	}
	
	//input[@id='txtClosedBy']
	@FindBy (xpath ="//input[@id='txtClosedBy']")
	private WebElement closedby;
	public boolean validateclosedby()
	{  
		return closedby.isEnabled();
	}
	
	//input[@id='txtActualManH']
	@FindBy (xpath ="//input[@id='txtActualManH']")
	private WebElement ActualmanH;
	public boolean validateActualmanH()
	{  
		return ActualmanH.isEnabled();
	}
	
	@FindBy (xpath ="//select[@id='txtDupInspBy']")
	private WebElement DuplicateInspby;
	public boolean validateDuplicateInspby()
	{  
		return DuplicateInspby.isEnabled();
	}
	
	//input[@id='txtDupInspDate']
	@FindBy (xpath ="//input[@id='txtDupInspDate']")
	private WebElement DuplicateInspectiondate;
	public boolean validateDuplicateInspectiondate()
	{  
		return DuplicateInspectiondate.isEnabled();
	}
	
	//input[@id='txtDupInspTime']
	@FindBy (xpath ="//input[@id='txtDupInspTime']")
	private WebElement DuplicateInspectiontime;
	public boolean validateDuplicateInspectiontime()
	{  
		return DuplicateInspectiontime.isEnabled();
	}
	
	//button[@id='btnSave']
	@FindBy (xpath ="//button[@id='btnSave']")
	private WebElement Updatebutton;
	public void clickonupdatebutton()
	{  
		Updatebutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	// For OEM Instruction Attachment for planner role
	
	//a[@id='4829']
	@FindBy (xpath ="//a[@id='4829']")
	private WebElement PlanningAMRORole;
	public void clickonPlanningAMRORole()
	{  
		PlanningAMRORole.click();
	}
		
	//a[@class='nbtn nbtn_primary']
	@FindBy (xpath ="//a[@class='nbtn nbtn_primary']")
	private WebElement AddOEMInstruction;
	public void clickonAddOEMInstruction()
	{  
		AddOEMInstruction.click();
	}
	
	//textarea[@id='txtProcedure']
	@FindBy (xpath ="//textarea[@id='txtProcedure']")
	private WebElement procedure;
	public void Enterprocedure()
	{  
		procedure.sendKeys("Test Procedure");
	}
	
	//input[@id='txtRefDocNo']
	@FindBy (xpath ="//input[@id='txtRefDocNo']")
	private WebElement RefdocumentNo;
	public void EnterRefdocumentNo()
	{  
		RefdocumentNo.sendKeys("12345");
	}
	
	//input[@id='txtDocDate']
	@FindBy (xpath ="//input[@id='txtDocDate']")
	private WebElement Documentdate;
	public void EnterDocumentdate()
	{  
		Documentdate.click();
	}
	
	//input[@id='txtDocRev']
	@FindBy (xpath ="//input[@id='txtDocRev']")
	private WebElement Documentrev;
	public void EnterDocumentrev()
	{  
		Documentrev.sendKeys("Test");
	}
	
	//textarea[@id='txtRemarks']
	@FindBy (xpath ="//textarea[@id='txtRemarks']")
	private WebElement AddOEMRemarks;
	public void EnterOEMRemarks()
	{  
		AddOEMRemarks.sendKeys("Testing Remarks");
	}
	
	//input[@id='postedFile']
	@FindBy (xpath ="//input[@id='postedFile']")
	private WebElement Fileupload;
	public void clickonFileupload()
	{  
		Fileupload.sendKeys("C:\\Users\\Shrirang.ladda\\Downloads\\SAT (1).pdf");
	}
	
	//button[@id='btnOEMSave']
	@FindBy (xpath ="//button[@id='btnOEMSave']")
	private WebElement AddOEMsavebutton;
	public void clickonAddOEMsavebutton()
	{  
		AddOEMsavebutton.click();
	}
	
	//button[@onclick='bind();']
	@FindBy (xpath ="//button[@onclick='bind();']")
	private WebElement AddOEMclosebutton;
	public void clickonAddOEMclosebutton()
	{  
		AddOEMclosebutton.click();
	}
	
	//input[@id='txtClosedDate']
	@FindBy (xpath ="//input[@id='txtClosedDate']")
	private WebElement Closeddate;
	public void clickonCloseddate()
	{  
		Closeddate.click();
	}
	
	//input[@id='txtClosedTime']
	@FindBy (xpath ="//input[@id='txtClosedTime']")
	private WebElement ClosedTime;
	public void EnterclosedTime()
	{  
		ClosedTime.sendKeys("1900");
	}
	
	//button[@id='btnClose']
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[1]/div[5]/div[12]/div[2]/button[2]")
	private WebElement Closebutton;
	public void ClickonClosebuttontocloseNRC()
	{  
		Closebutton.click();
	}
	
	//input[@id='txtPIN']
	@FindBy (xpath ="//input[@id='txtPIN']")
	private WebElement Pinno;
	public void EnterPinno()
	{  
		Pinno.sendKeys("0011");
	}
	
	
	
	
	
}
