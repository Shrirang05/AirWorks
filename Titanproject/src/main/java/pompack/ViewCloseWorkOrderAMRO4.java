package pompack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewCloseWorkOrderAMRO4
{
	private WebDriver driver;
	private Actions Act;
	private Select SE;
	
	public ViewCloseWorkOrderAMRO4 (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath ="//a[@id='4823']")
	private WebElement AMROclickpretitan;
	public void clickonAMRObuttonpretitan()
	{
		AMROclickpretitan.click();
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
		AircraftRegnsearchbox.sendKeys("2-BTTB");
	}
	
	@FindBy (xpath ="//li[text()='2-BTTB']")
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
	
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement selectworkorderserachbox;
	public void clickonselectworkordercheckbox()
	{
		selectworkorderserachbox.sendKeys("AWO-HSR-000736-0523");
	}
	
	@FindBy (xpath ="//li[text()='AWO-HSR-000736-0523']")
	private WebElement selectoneworkorder;
	public void clickonselectoneworkorder()
	{
		selectoneworkorder.click();
	}
	
	@FindBy (xpath ="//button[@title='STATUS']")
	private WebElement status;
	public void clickonstatus()
	{
		status.click();
	}
	
	@FindBy (xpath ="//input[@value='O']")
	private WebElement pendingopenstatus;
	public void clickonpendingesignstatus()
	{
		pendingopenstatus.click();
	}
	
	//span[@id='select2-ddlEmp-container']
	@FindBy (xpath ="//span[@id='select2-ddlEmp-container']")
	private WebElement IssuedTo;
	public void clickonIssuedTo()
	{
		IssuedTo.click();
	}
	
	//input[@aria-label='Search']
	@FindBy (xpath ="//input[@aria-label='Search']")
	private WebElement Searchbox;
	public void clickonSearchbox()
	{
		Searchbox.sendKeys("Shrirang Rajesh Ladda (TGUR91)");
	}
	
	//li[@id='select2-ddlEmp-result-0kvg-TGUR91']
	@FindBy (xpath ="//li[text()='Shrirang Rajesh Ladda (TGUR91)']")
	private WebElement IssuedToEmployee;
	public void clickonIssuedToEmployee()
	{
		IssuedToEmployee.click();
	}
	
	//span[@id='select2-ddlStation-container']
	@FindBy (xpath ="//span[@id='select2-ddlStation-container']")
	private WebElement Location;
	public void clickonLocation()
	{
		Location.click();
	}
	
	//li[text()='Cochin']
	@FindBy (xpath ="//li[text()='Cochin']")
	private WebElement LocationCochin;
	public void clickonCoachinLocation()
	{
		LocationCochin.click();
	}
		
	//button[@id='Search']
	@FindBy (xpath ="//button[@id='Search']")
	private WebElement Searchbutton;
	public void clickonSearchbutton()
	{
		Searchbutton.click();
	}
	
	//Close Work order started
	
	//4th task
	@FindBy (xpath ="//span[text()='52-670-00/52-670-00-02']")
	private WebElement Task;
	public void clickonTask()
	{
		Task.click();
	}
	
	//button[@class='fa fa-eye nbtn nbtn_primary']
	@FindBy (xpath ="//textarea[@id='txtActionTaken']")
	private WebElement ActionTaken;
	public void clickonActionTaken()
	{
		Act = new Actions (driver);
		Act.click(ActionTaken).perform();
	}
	
	//textarea[@id='gridtxtActionTaken']
	@FindBy (xpath ="//textarea[@id='gridtxtActionTaken']")
	private WebElement EnterActionTaken;
	public void clickonEnterActionTaken()
	{
		EnterActionTaken.sendKeys("Test Action Taken");
	}
	
	//button[@title='Select Techician']
	@FindBy (xpath ="//button[@title='Select Techician']")
	private WebElement Technician;
	public void clickonTechnician()
	{
		Technician.click();
	}
	
	@FindBy (xpath ="//label[@class='checkbox']//input[@value='TGUR91']")
	private WebElement oneTechnician;
	public void SelectoneTechnician()
	{  
		oneTechnician.click();
	}
	
	//button[@title='Shrirang Rajesh Ladda(TGUR91)']
	@FindBy (xpath ="//button[@title='Shrirang Rajesh Ladda(TGUR91)']")
	private WebElement deselectoneTechnician;
	public void deSelectoneTechnician()
	{  
		deselectoneTechnician.click();
	}

	
	@FindBy (xpath ="//input[@class='form-control datepickers'][1]")
	private WebElement startdate;
	public void Enterstartdate()
	{  
		startdate.click();
	}
	
	@FindBy (xpath ="//input[@type='time'][1]")
	private WebElement starttime;
	public void Enterstarttime()
	{  
		starttime.sendKeys("1000");
	}
	
	@FindBy (xpath ="//input[@id='gridEndDate']")
	private WebElement Enddate;
	public void EnterEnddate()
	{  
		Enddate.click();
	}
	
	@FindBy (xpath ="//input[@id='gridEndTime']")
	private WebElement Endtime;
	public void EnterEndtime()
	{  
		Endtime.sendKeys("1100");
	}
	
	@FindBy (xpath ="//input[@id='gridActualManHours']")
	private WebElement Actualmanhours;
	public void EnterActualmanhours()
	{  
		Actualmanhours.sendKeys("01:00");
	}
	
	@FindBy (xpath ="//input[@id='gridElapsedHours']")
	private WebElement Elapsedmanhours;
	public void EnterElapsedmanhours()
	{  
		Elapsedmanhours.sendKeys("01:00");
	}
	
	@FindBy (xpath ="//input[@id='NextActionReq']")
	private WebElement NextActionReuired;
	public void clickonNextActionReuired()
	{  
		NextActionReuired.click();
	}
	
	@FindBy (xpath ="//span[normalize-space()='Select A.H.Name']")
	private WebElement FromselectAHName;
	public void clickonFromselectAHName()
	{  
		FromselectAHName.click();
	}
	
	@FindBy (xpath ="//label[@class='radio']//input[@value='TGUR67']")
	private WebElement FromselectoneAHName;
	public void clickonFromselectoneAHName()
	{  
		 FromselectoneAHName.click();
	}
	
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
	
	@FindBy (xpath ="//button[text()='Close']")
	private WebElement closebutton;
	public void clickonclosebutton()
	{  
		closebutton.click();
	}
	
	// Materials grid started
	
	@FindBy (xpath ="//td[text()='Add Record'][1]")
	private WebElement AddRecord;
	public void clickonAddRecord()
	{  
		AddRecord.click();
	}
	
	//a[@onclick='return View_OffPart()']
	@FindBy (xpath ="//a[@onclick='return View_OffPart()']")
	private WebElement offpartno;
	public void clickonoffpartno()
	{  
		offpartno.click();
	}
	
	//button[@id='btnSearch']
	@FindBy (xpath ="//button[@id='btnSearch']")
	private WebElement OffpartnoSearchbutton;
	public void clickonOffpartnoSearchbutton()
	{  
		OffpartnoSearchbutton.click();
	}
	
	//tr[@id='grid_gridPart_rec_1']//input[@type='checkbox']
	@FindBy (xpath ="//tr[@id='grid_gridPart_rec_1']//input[@type='checkbox']")
	private WebElement FirstOffPartno;
	public void clickon1stOffpartno()
	{  
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//		wait.until(ExpectedConditions.visibilityOf(FirstOffPartno));
		FirstOffPartno.click();
	}
	
	//tr[@id='grid_gridPart_rec_2']//input[@type='checkbox']
//	@FindBy (xpath ="//tr[@id='grid_gridPart_rec_2']//input[@type='checkbox']")
//	private WebElement SecondOffPartno;
//	public void clickon2ndOffpartno()
//	{  
//		SecondOffPartno.click();
//	}
	
	//button[normalize-space()='OK']
	@FindBy (xpath ="//button[normalize-space()='OK']")
	private WebElement OkbuttonMaterial;
	public void clickonOkbuttonMatrial()
	{  
		OkbuttonMaterial.click();
	}
	
	//tr[@id='grid_gridMatDtls_rec_1']//td[4]
	//input[@id='grid_gridMatDtls_edit_1_2']
	@FindBy (xpath ="//tr[@id='grid_gridMatDtls_rec_1']//td[4]")
	private WebElement OffserialNo;
	public void EnterOffserialNo()
	{  
		Act = new Actions(driver);
		Act.doubleClick(OffserialNo).perform();
		Act.sendKeys("Test Off serial No").perform();
	}
	
	//a[@onclick='return View_OnPart()']
//	@FindBy (xpath ="//a[@onclick='return View_OnPart()']")
//	private WebElement ONpartNo;
//	public void ClickonONpartNo()
//	{  
//		ONpartNo.click();
//	}
	
//	"411A4906-2791
	@FindBy (xpath ="//input[@id='grid_gridMatDtls_edit_1_3']")
	private WebElement ONpartNo;
	public void ClickonONpartNo()
	{  
		ONpartNo.sendKeys("\"411A4906-2791");
	}
	
	//input[@id='grid_gridMatDtls_edit_1_4']
	@FindBy (xpath ="//tr[@id='grid_gridMatDtls_rec_1']//td[6]")
	private WebElement ONSerialNo;
	public void ClickonONSerialNo()
	{  
		Act = new Actions(driver);
		Act.doubleClick(ONSerialNo).perform();
		Act.sendKeys("Test ON serial No").perform();
	}
	
	//tr[@id='grid_gridMatDtls_rec_1']//td[8]
	@FindBy (xpath ="//tr[@id='grid_gridMatDtls_rec_1']//td[8]")
	private WebElement IPCReferance;
	public void ClickonIPCReferance()
	{  
		Act = new Actions(driver);
		Act.doubleClick(IPCReferance).perform();
		Act.sendKeys("Test IPC Referance No").perform();
	}
	
	//tr[@id='grid_gridMatDtls_rec_1']//td[9]
	@FindBy (xpath ="//tr[@id='grid_gridMatDtls_rec_1']//td[9]")
	private WebElement POS;
	public void ClickonPOC()
	{  
		Act = new Actions(driver);
		Act.doubleClick(POS).perform();
		Act.sendKeys("Left").perform();
	}
	
	//tr[@id='grid_gridMatDtls_rec_1']//td[10]
	@FindBy (xpath ="//tr[@id='grid_gridMatDtls_rec_1']//td[10]")
	private WebElement Reqqty;
	public void ClickonReqqty()
	{  
		Act = new Actions(driver);
		Act.doubleClick(Reqqty).perform();
		Act.sendKeys("1").perform();
	}
	
	//tr[@id='grid_gridMatDtls_rec_1']//td[13]
	@FindBy (xpath ="//tr[@id='grid_gridMatDtls_rec_1']//td[13]")
	private WebElement BatchRelno;
	public void ClickonBatchRelnote()
	{  
		Act = new Actions(driver);
		Act.doubleClick( BatchRelno).perform();
		Act.sendKeys("Test Batch Rel note").perform();
	}
	
	//tr[@id='grid_gridMatDtls_rec_1']//td[14]
	@FindBy (xpath ="//tr[@id='grid_gridMatDtls_rec_1']//td[14]")
	private WebElement Usedqty;
	public void ClickonUsedqty()
	{  
		Act = new Actions(driver);
		Act.doubleClick(Usedqty).perform();
		Act.sendKeys("1").perform();
	}
	
	//div[normalize-space()='Tools In Details']
	@FindBy (xpath ="//div[normalize-space()='Tools In Details']")
	private WebElement ToolsIndetails;
	public void ClickonToolsIndetails()
	{  
		ToolsIndetails.click();
	}
	
	
	
	
	//MI No started
	
	//div[@id='grid_gridMatDtls_records']
	@FindBy (xpath ="//div[@id='grid_gridMatDtls_records']")
	private WebElement Materialscrollbar;
	public void ClickonMaterialscrollbar()
	{  
		Actions moveToElement = Act.moveToElement( Materialscrollbar );
		for (int i = 0; i < 5; i++) {
		    moveToElement.sendKeys(Keys.RIGHT).build().perform();
		}
		
//		Materialscrollbar.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	//a[@title='Search Material Issue']
	@FindBy (xpath ="//a[@title='Search Material Issue']")
	private WebElement MaterialIssueNo;
	public void ClickonMaterialIssueNo()
	{  
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(MaterialIssueNo));
		MaterialIssueNo.click();
	}
	
	//select[@id='ddl_PMI_MaterialReqNo']
	@FindBy (xpath ="//select[@id='ddl_PMI_MaterialReqNo']")
	private WebElement MaterialReqNo;
	public void ClickonMaterialRequestNo()
	{  
		MaterialReqNo.click();
	}
	
	//option[@value='MMR-197428-2023']
	@FindBy (xpath ="//option[@value='MMR-197428-2023']")
	private WebElement selectMaterialReqNo;
	public void selectoneMaterialRequestNo()
	{  
		selectMaterialReqNo.click();
	}
	
	
	
	
	
	
	@FindBy (xpath ="//button[@id='btn_PartialMaterialIssueSearch']")
	private WebElement MISearchbutton;
	public void ClickonMISearchbutton()
	{  
		MISearchbutton.click();
	}
	
	//td[@id='grid_grid_PartialMaterialIssueSearch_cell_0_select']//input[@type='checkbox']
	@FindBy (xpath ="//td[@id='grid_grid_PartialMaterialIssueSearch_cell_0_select']//input[@type='checkbox']")
	private WebElement PartNocheckbox;
	public void Selectpartcheckbox()
	{  
		PartNocheckbox.click();
	}
	
	//button[@id='btn_Add_MaterialIssue_Popup_Values']
	@FindBy (xpath ="//button[@id='btn_Add_MaterialIssue_Popup_Values']")
	private WebElement Addbuttonforpart;
	public void Addbuttonforpart()
	{  
		Addbuttonforpart.click();
	}
	
	
	//body[1]/div[1]/div[1]/div[5]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]
	@FindBy (xpath ="(//td[contains(text(),'Add Record')])[2]")
	private WebElement AddRecord2;
	public void ClickonAddRecord2()
	{  
		AddRecord2.click();
	}
	
	//a[@onclick='return View_TPartN()']
	@FindBy (xpath ="//a[@onclick='return View_TPartN()']")
	private WebElement ToolpartNo;
	public void ClickonToolpartNo()
	{  
		ToolpartNo.click();
	}
	
//	AT120S/NF-IV84
	//input[@id='PM_PartNo']
	@FindBy (xpath ="//input[@id='PM_PartNo']")
	private WebElement EnterToolpartNo;
	public void EnterToolpartNo()
	{  
		EnterToolpartNo.sendKeys("AT120S/NF-IV84");
	}
	
	//button[@id='btnToolSearch']
	@FindBy (xpath ="//button[@id='btnToolSearch']")
	private WebElement SearchbuttonTool;
	public void ClickonSearchbuttonTool()
	{  
		SearchbuttonTool.click();
	}
	
	//tr[@id='grid_gridToolPart_rec_1']//input[@type='checkbox']
	@FindBy (xpath ="//tr[@id='grid_gridToolPart_rec_1']//input[@type='checkbox']")
	private WebElement oneTool;
	public void SelectoneTool()
	{  
		oneTool.click();
	}
	
	//button[normalize-space()='OK']
	@FindBy (xpath ="//button[normalize-space()='OK']")
	private WebElement OkbuttonTool;
	public void ClickonOkbuttonTool()
	{  
		OkbuttonTool.click();
	}
	
	//tr[@id='grid_gridToolDtls_rec_1']//td[7]
	@FindBy (xpath ="//tr[@id='grid_gridToolDtls_rec_1']//td[7]")
	private WebElement Calibrationduedate;
	public void SelectCalibrationduedate()
	{  
		Act = new Actions (driver);
		Act.doubleClick(Calibrationduedate).perform();
		Act.sendKeys("15-06-2023").perform();
	}
	
	//button[@id='btnUpdate']
	@FindBy (xpath ="//button[@id='btnUpdate']")
	private WebElement Updatebutton;
	public void ClickonUpdatebutton()
	{  
		Updatebutton.click();
	}
	
	//button[normalize-space()='ok']
	@FindBy (xpath ="//button[normalize-space()='ok']")
	private WebElement OKbutton;
	public void ClickonOKbutton()
	{  
		OKbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
