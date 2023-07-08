package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ViewCloseWorkOrderAMRO3 
{
	private WebDriver driver;
	private Actions Act;
	private Select SE;
	
	public ViewCloseWorkOrderAMRO3 (WebDriver driver)
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
		selectworkorderserachbox.sendKeys("AWO-HSR-000740-0623");
	}
	
	@FindBy (xpath ="//li[text()='AWO-HSR-000740-0623']")
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
	
	//3rd task
	@FindBy (xpath ="//span[text()='52-808-02/52-808-02-01']")
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
	
	
	//button[@onclick='CloseActionTaken_Click();'][normalize-space()='Close']
	@FindBy (xpath ="//button[text()='Close']")
	private WebElement closebutton;
	public void clickonclosebutton()
	{  
		closebutton.click();
	}
	
	//button[@id='hrefupload']
	@FindBy (xpath ="//button[@id='hrefupload']")
	private WebElement Uploaddoc;
	public void clickonUploaddoc()
	{  
		Uploaddoc.click();
	}
	
	//textarea[@id='txtdescription']
	@FindBy (xpath ="//textarea[@id='txtdescription']")
	private WebElement Textdescription;
	public void clickonTextdescription()
	{  
		Textdescription.sendKeys("Test text description 2");
	}
	
	//input[@id='uploadFile']
	@FindBy (xpath ="//input[@id='uploadFile']")
	private WebElement UploadFile;
	public void clickonUploadFile()
	{  
		UploadFile.sendKeys("C:\\Users\\Shrirang.ladda\\Downloads\\SAT (1).pdf");
	}
	
	//button[@id='btnUpload']
	@FindBy (xpath ="//button[@id='btnUpload']")
	private WebElement Uploadbutton;
	public void clickonUploadbutton()
	{  
		Uploadbutton.click();
	}
	
	//button[text()='Cancel'][1]
	@FindBy (xpath ="//button[text()='Cancel'][1]")
	private WebElement cancelbutton;
	public void clickoncancelbutton()
	{  
		cancelbutton.click();
	}
	
	//button[@id='hrefgalary']
	@FindBy (xpath ="//button[@id='hrefgalary']")
	private WebElement gallerybutton;
	public void clickongallerybutton()
	{  
		gallerybutton.click();
	}
	
	//img[@class='hover-shadow cursor']
	@FindBy (xpath ="//img[@class='hover-shadow cursor']")
	private WebElement gallerypdf;
	public void clickongallerypdf()
	{  
		gallerypdf.click();
	}

	@FindBy (xpath ="//div[@id='gallarymodel']//button[@type='button'][normalize-space()='Cancel']")
	private WebElement cancelbuttonofgallery;
	public void clickoncancelbuttonofgallary()
	{  
		cancelbuttonofgallery.click();
	}
	
	//button[@id='hrefdoc']
	@FindBy (xpath ="//button[@id='hrefdoc']")
	private WebElement Relatedphotos;
	public void clickonRelatedphotos()
	{  
		Relatedphotos.click();
	}
		
	//td[@class='w2ui-grid-data']//input[@type='checkbox']
	@FindBy (xpath ="//td[@class='w2ui-grid-data']//input[@type='checkbox']")
	private WebElement Archivemediacheckbox;
	public void clickonArchivemediacheckbox()
	{  
		Archivemediacheckbox.click();
	}
	
	//button[@id='btndownload']
	@FindBy (xpath ="//button[@id='btndownload']")
	private WebElement Archivemediadownload;
	public void clickonArchivemediadownload()
	{  
		Archivemediadownload.click();
	}
	
	
	@FindBy (xpath ="(//td[contains(text(),'Export to Excel')])[1]")
	private WebElement ExporttoExcel;
	public void clickonExporttoExcel()
	{  
		ExporttoExcel.click();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
