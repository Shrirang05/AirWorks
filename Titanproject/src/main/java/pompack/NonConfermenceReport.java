package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NonConfermenceReport 
{
	private WebDriver driver;
	private Actions Act;
	
	public NonConfermenceReport (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//a[@id='2919']
	@FindBy (xpath ="//a[@id='2919']")
	private WebElement GAMROclick;
	public void clickonGAMRObutton()
	{
		GAMROclick.click();
	}
	
	@FindBy (xpath = "//a[normalize-space()='Quality']")
	private WebElement Quality;
	public void clickonQualitybutton()
	{
		Quality.click();
	}
	
	@FindBy (xpath = "//a[normalize-space()='Non Conformance Report']")
	private WebElement Nonconfermancereport;
	public void clickonNonconfermancereport()
	{
		Nonconfermancereport.click();
	}
	
	//a[normalize-space()='View Non-Conformance Report']
    @FindBy (xpath = "//a[normalize-space()='View Non-Conformance Report']")
	private WebElement ViewNonconfermancereport;
	public void clickonViewNonconfermancereport()
	{
		ViewNonconfermancereport.click();
	}
	
	//span[normalize-space()='Select Area Of Audit']
	@FindBy (xpath = "//span[normalize-space()='Select Area Of Audit']")
	private WebElement AreaofAudit;
	public void clickonAreaofAudit()
	{
		AreaofAudit.click();
	}
	
	//input[@value='387']
	@FindBy (xpath = "//input[@value='387']")
	private WebElement AreaofAuditCAMO;
	public void clickonAreaofAuditCAMO()
	{
		AreaofAuditCAMO.click();
	}
	
	//input[@id='txtAuditFromdate']
	@FindBy (xpath = "//input[@id='txtAuditFromdate']")
	private WebElement DateofAudit;
	public void clickonDateofAudit()
	{
		DateofAudit.sendKeys("02022023");
	}
	
	//button[@title='Select Place Of Audit']
	@FindBy (xpath = "//button[@title='Select Place Of Audit']")
	private WebElement PlaceofAudit;
	public void clickonPlaceofAudit()
	{
		PlaceofAudit.click();
	}
	
	//input[@value='13']
	@FindBy (xpath = "//input[@value='4']")
	private WebElement PlaceofAuditgurgaon;
	public void clickonPlaceofAuditgurgaon()
	{
		PlaceofAuditgurgaon.click();
	}
	
	//button[@title='Select Status']
	@FindBy (xpath = "//button[@title='Select Status']")
	private WebElement SelectStatus;
	public void clickonSelectStatus()
	{
		SelectStatus.click();
	}
	
	//label[normalize-space()='Draft']
	@FindBy (xpath = "//label[normalize-space()='Draft']")
	private WebElement DraftStatus;
	public void clickonDraftStatus()
	{
		DraftStatus.click();
	}
	
	//button[@id='btnNCRSearch']
	@FindBy (xpath = "//button[@id='btnNCRSearch']")
	private WebElement SearchButton;
	public void clickonSearchButton()
	{
		SearchButton.click();
	}
	
	//button[@id='CreateNdt']
	@FindBy (xpath = "//button[@id='CreateNdt']")
	private WebElement CreateNCR;
	public void clickonCreateNCR()
	{
		 CreateNCR.click();
	}
	
	//input[@id='txtAuditdate']
	@FindBy (xpath = "//input[@id='txtAuditdate']")
	private WebElement DateofAuditforAdd;
	public void clickonDateofAuditforAdd()
	{
		DateofAuditforAdd.sendKeys("02022023");
	}
	
	
    @FindBy (xpath = "//button[@title='Select Place Of Audit']")
	private WebElement selectpalaceofAudit;
	public void clickonselectpalaceofAudit()
	{
		selectpalaceofAudit.click();
	}
	
	@FindBy (xpath = "//input[@value='13']")
	private WebElement PlaceofAuditHosur;
	public void clickonPlaceofAuditHosur()
	{
		PlaceofAuditHosur.click();
	}
	
	//span[normalize-space()='Select Auditee Name']
	//div[@class='btn-group open']//button[@title='Select Auditor Name']
	@FindBy (xpath = "//span[normalize-space()='Select Auditee Name']")
	private WebElement AuditeeName;
	public void clickonAuditeeName()
	{
		AuditeeName.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01527']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01527']")
	private WebElement oneAuditeeName;
	public void clickononeAuditeeName()
	{
		oneAuditeeName.click();
	}
	
	//input[@id='txtAuditScope']
	@FindBy (xpath = "//input[@id='txtAuditScope']")
	private WebElement ScopeofAudit;
	public void checkonScopeofAudit()
	{
		 ScopeofAudit.sendKeys("Planning");
	}
	
	//input[@id='txtRefDocno']
	@FindBy (xpath = "//input[@id='txtRefDocno']")
	private WebElement ReferenceDoc;
	public void checkonReferenceDoc()
	{
		ReferenceDoc.sendKeys("EPM/SP/06");
	}
	
	@FindBy (xpath = "//input[@id='txtLvl']")
	private WebElement Leveloffinding;
	public void PassingtheLeveloffinding()
	{
		Leveloffinding.sendKeys("II");
	}
	
	//input[@id='txtTargetdate']
	@FindBy (xpath = "//input[@id='txtTargetdate']")
	private WebElement Targetdate;
	public void clickontargetdate()
	{
		Targetdate.sendKeys("20022023");
	}
	
	
	
	
	//span[normalize-space()='Select Quality Manager']
	@FindBy (xpath = "//span[normalize-space()='Select Quality Manager']")
	private WebElement QualityManager;
	public void ClickonQualityManager()
	{
		QualityManager.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01520']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01520']")
	private WebElement SelectQualityManager;
	public void ClickononeQualityManager()
	{
		SelectQualityManager.click();
	}
	
	//textarea[@id='txtRootCause']
	@FindBy (xpath = "//textarea[@id='txtRootCause']")
	private WebElement Rootcauseofthedeficiency;
	public void ClickonRootcauseofthedeficiency()
	{
		Rootcauseofthedeficiency.sendKeys("root1");
	}
	
	@FindBy (xpath = "//textarea[@id='txtNonConformance']")
	private WebElement NonConformancedetails;
	public void ClickonNonConformancedetails()
	{
		NonConformancedetails.sendKeys("Test1");
	}
	//div[3]//div[2]//span[2]//div[1]//button[1]//span[1]
	//div[@class='btn-group open']//button[@title='Select Auditor Name']
	@FindBy (xpath = "//body[1]/div[1]/div[1]/div[5]/div[3]/div[2]/span[2]/div[1]/button[1]")
	private WebElement NameofAuditor;
	public void ClickonNameofAuditor()
	{
		NameofAuditor.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01520']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01527']")
	private WebElement oneNameofAuditor;
	public void selectoneNameofAuditor()
	{
		oneNameofAuditor.click();
	}
	
	//input[@id='txtNCdetailsdate']
	@FindBy (xpath = "//input[@id='txtNCdetailsdate']")
	private WebElement datefornonconformancedetails;
	public void clickondatefornonconformancedetails()
	{
		datefornonconformancedetails.sendKeys("15");
	}
	
	
	//textarea[@id='txtCATdetails']
	//textarea[@id='txtCATdetails']
	@FindBy (xpath = "//textarea[@id='txtCATdetails']")
	private WebElement CorrectiveAction;
	public void ClickonCorrectiveAction()
	{
		CorrectiveAction.sendKeys("Test2");
	}
	
	@FindBy (xpath = "//body[1]/div[1]/div[1]/div[5]/div[4]/div[2]/span[2]/div[1]/button[1]")
	private WebElement NameofAuditorforcorrectiveAction;
	public void ClickonNameofAuditorforcorrectiveAction()
	{
		NameofAuditorforcorrectiveAction.click();
	}
	
	@FindBy (xpath = "//input[@id='txtCATAuNmdate']")
	private WebElement dateforcorrectiveAction;
	public void clickondateforcorrectiveAction()
	{
		dateforcorrectiveAction.sendKeys("15");
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01520']
	
	//textarea[@id='txtPATdetails']
	@FindBy (xpath = "//textarea[@id='txtPATdetails']")
	private WebElement preventiveAction;
	public void ClickonpreventiveAction()
	{
		preventiveAction.sendKeys("Test3");
	}
	
	//button[@title='Select Department Manager']
	@FindBy (xpath = "//button[@title='Select Department Manager']")
	private WebElement selectdepartmentmanager;
	public void Clickonselectdepartmentmanager()
	{
		selectdepartmentmanager.click();
	}
	
	//input[@value='G01453']
	@FindBy (xpath = "//input[@value='G01453']")
	private WebElement onedepartmentmanager;
	public void Clickononeselectdepartmentmanager()
	{
		onedepartmentmanager.click();
	}
	
	//input[@id='txtPATdetDate']
	@FindBy (xpath = "//input[@id='txtPATdetDate']")
	private WebElement dateforpreventiveAction;
	public void ClickondateforpreventiveAction()
	{
		dateforpreventiveAction.sendKeys("15");
	}

	//textarea[@id='txtcomplianceActionRemark']
	@FindBy (xpath = "//textarea[@id='txtcomplianceActionRemark']")
	private WebElement ComplianceActionbyAuditor;
	public void checkComplianceActionbyAuditor()
	{
		ComplianceActionbyAuditor.sendKeys("Test4");
	}
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[6]/div[2]/span[2]/div[1]/button[1]")
	private WebElement NameofAuditorforcomplainsAction;
	public void ClickonNameofAuditorforcomplainsAction()
	{
		NameofAuditorforcomplainsAction.click();
	}
	
	@FindBy (xpath = "//input[@id='txtcomplianceActionRemarkdate']")
	private WebElement dateforcomplianceAction;
	public void ClickondateforcomplianceAction()
	{
		dateforcomplianceAction.sendKeys("15");
	}
	
	//textarea[@id='txtFCPAA']
	@FindBy (xpath = "//textarea[@id='txtFCPAA']")
	private WebElement  FinalCorrectiveandPreventiveAction;
	public void checkFinalCorrectiveandPreventiveAction()
	{
		FinalCorrectiveandPreventiveAction.sendKeys("Test5");
	}
	
	//span[normalize-space()='Select Audit Manager Name']
	@FindBy (xpath = "//span[normalize-space()='Select Audit Manager Name']")
	private WebElement  nameofauditmanager;
	public void clickonnameofauditmanager()
	{
		nameofauditmanager.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01524']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01524']")
	private WebElement  nameofoneauditmanager;
	public void clickonnameofoneauditmanager()
	{
		nameofoneauditmanager.click();
	}
	
	@FindBy (xpath = "//input[@id='txtFCPAAdate']")
	private WebElement dateforAuditManager;
	public void ClickondateforAuditManager()
	{
		dateforAuditManager.sendKeys("15");
	}
	
	//textarea[@id='txtFAQM']
	@FindBy (xpath = "//textarea[@id='txtFAQM']")
	private WebElement FinalAcceptancebyQualityManager;
	public void clickonFinalAcceptancebyQualityManager()
	{
		FinalAcceptancebyQualityManager.sendKeys("Test6");
	}
	
	//span[normalize-space()='Select Quality Manager Name']
	@FindBy (xpath = "//span[normalize-space()='Select Quality Manager Name']")
	private WebElement SelectQualityManagerName;
	public void clickonSelectQualityManagerName()
	{
		SelectQualityManagerName.click();
	}
	
	//input[@id='txtFAQMdate']
	@FindBy (xpath = "//input[@id='txtFAQMdate']")
	private WebElement dateforQualityManager;
	public void ClickondateforQualityManager()
	{
		dateforQualityManager.sendKeys("15");
	}
	
	//button[@id='bSave']
	@FindBy (xpath = "//button[@id='bSave']")
	private WebElement Savebutton;
	public void Clickonsavebutton()
	{
		Savebutton.click();
	}
	
	//button[normalize-space()='ok']
	@FindBy (xpath = "//button[normalize-space()='ok']")
	private WebElement Oksavesuccefully;
	public void ClickonOksavesuccefully()
	{
		Oksavesuccefully.click();
	}
	
	//button[@id='BackToSearch']
	@FindBy (xpath = "//button[@id='BackToSearch']")
	private WebElement Backtoview;
	public void ClickonBacktoview()
	{
		Backtoview.click();
	}
	
	
	
	@FindBy (xpath = "(//span[@class='multiselect-selected-text'])[2]")
	private WebElement PlaceofAuditlocation;
	
	
	
	public boolean palceofAuditvalidation(String ActualText)
    {

    	
    	String ExpectedText = PlaceofAuditlocation.getText();
    	
    	return ExpectedText.equals(ActualText);
    	 		
    }
	
	//button[normalize-space()='ok']
	
	
	//After going to save ADD NCR details going again to home page and search for that particular added NCR
	
	//input[@value='13']
	
	@FindBy (xpath = "//td[@id='grid_NCRgrid_cell_0_number']")
	private WebElement Selectfirstgrid;
	public void clickonSelectfirstgrid()
	{
		Selectfirstgrid.click();
	}
	
	//td[contains(text(),'Edit')]
	@FindBy (xpath = "//td[contains(text(),'Edit')]")
	private WebElement Editbutton;
	public void clickonEditbutton()
	{
		 Editbutton.click();
	}
	
	//button[@title='HOSUR']
	@FindBy (xpath = "//button[@title='HOSUR']")
	private WebElement Hosurplaceofaudit;
	public void clickonHosurplaceofaudit()
	{
		Hosurplaceofaudit.click();
	}
	
	//input[@value='3']
	@FindBy (xpath = "//input[@value='3']")
	private WebElement  AHMEDABADplaceofaudit;
	public void clickonAHMEDABADplaceofaudit()
	{
		AHMEDABADplaceofaudit.click();
	}
	
	
	
	
}
