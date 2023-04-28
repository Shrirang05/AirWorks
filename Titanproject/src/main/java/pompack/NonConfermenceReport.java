package pompack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class NonConfermenceReport 
{
	private WebDriver driver;
	private Actions s;
	private Select Act;
	
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
	
	//label[text()='VIEW NON CONFORMANCE DETAILS']
	@FindBy (xpath = "//label[text()='VIEW NON CONFORMANCE DETAILS']")
	private WebElement viewNCRvalidation;
	public boolean CheckViewNCRvalidation()
	{
		return viewNCRvalidation.isDisplayed();
		
	}
	
	
	
	
	
	
	
	//span[@id='select2-ddlAreaOfAudit-container']
	//span[normalize-space()='Select Area Of Audit']
	@FindBy (xpath = "//span[@id='select2-ddlAreaOfAudit-container']")
	private WebElement AreaofAudit;
	public void clickonAreaofAudit()
	{
		 AreaofAudit.click();
//		 Act = new Select(AreaofAudit);
//		 Act.selectByVisibleText("CAMO");
	}
	
	
	
	//input[@value='387']
	@FindBy (xpath = "//li[text()='CAMO']")
	private WebElement AreaofAuditCAMO;
	public void clickonAreaofAuditCAMO()
	{
		AreaofAuditCAMO.click();
	}
	
	//span[text()='CAMO']
	@FindBy (xpath = "//span[text()='CAMO']")
	private WebElement AreaofAuditCAMOValidation;
	public boolean CheckAreaofAuditCAMOValidation()
	{
		return AreaofAuditCAMOValidation.isDisplayed();
	}
	
	//input[@id='txtChecklistNo']
	@FindBy (xpath = "//input[@id='txtChecklistNo']")
	private WebElement ChecklistNocoloumn;
	public void passingChecklistNocoloumn()
	{
		ChecklistNocoloumn.sendKeys("15");
	}
	
	
	
	
	
	//input[@id='txtAuditFromdate']
	@FindBy (xpath = "//input[@id='txtAuditFromdate']")
	private WebElement DateofAudit;
	public void clickonDateofAudit()
	{
		DateofAudit.sendKeys("05022023");
	}
	
	//button[@title='Select Place Of Audit']
	@FindBy (xpath = "//span[@id='select2-ddlPlaceOfAudit-container']")
	private WebElement PlaceofAudit;
	public void clickonPlaceofAudit()
	{
		PlaceofAudit.click();
	}
	
	//input[@value='30']
	@FindBy (xpath = "//li[text()='NOIDA']")
	private WebElement PlaceofAuditNoida;
	public void clickonPlaceofAuditNoida()
	{
		PlaceofAuditNoida.click();
	}
	
	@FindBy (xpath = "//li[text()='GURGAON']")
	private WebElement PlaceofAuditGurgaon;
	public void clickonPlaceofAuditGurgaon()
	{
		 PlaceofAuditGurgaon.click();
	}
	
	//button[@title='Select Status']
	@FindBy (xpath = "//span[@id='select2-ddlStatus-container']")
	private WebElement SelectStatus;
	public void clickonSelectStatus()
	{
		SelectStatus.click();
	}
	
	//label[normalize-space()='Draft']
	@FindBy (xpath = "//li[text()='Draft']")
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
	
	//label[text()='ADD NON CONFORMANCE DETAILS']
	@FindBy (xpath = "//label[text()='ADD NON CONFORMANCE DETAILS']")
	private WebElement ADDNCRvalidation;
	public boolean CheckADDNCRvalidation()
	{
		return ADDNCRvalidation.isDisplayed();
		
	}
	
	
	
	
	
	//input[@id='txtAuditdate']
	@FindBy (xpath = "//input[@id='txtAuditdate']")
	private WebElement DateofAuditforAdd;
	public void clickonDateofAuditforAdd()
	{
		DateofAuditforAdd.sendKeys("03022023");
	}
	
	
    @FindBy (xpath = "//span[@id='select2-ddlPlaceOfAudit-container']")
	private WebElement selectpalaceofAudit;
	public void clickonselectpalaceofAudit()
	{
		selectpalaceofAudit.click();
	}
	//li[text()='HOSUR']
	//li[@id='select2-ddlPlaceOfAudit-result-d5is-41']
	@FindBy (xpath = "//li[text()='HOSUR']")
	private WebElement PlaceofAuditHosur;
	public void clickonPlaceofAuditHosur()
	{
		PlaceofAuditHosur.click();
	}
	
	//span[normalize-space()='Select Auditee Name']
	//div[@class='btn-group open']//button[@title='Select Auditor Name']
	@FindBy (xpath = "//span[@id='select2-ddlAuditeeNm-container']")
	private WebElement AuditeeName;
	public void clickonAuditeeName()
	{
		AuditeeName.click();
	}
	//li[text()='AMBRISH KUMAR TIWARI (G01527)']
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01527']
	@FindBy (xpath = "//li[text()='AMBRISH KUMAR TIWARI (G01527)']")
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
	@FindBy (xpath = "//span[@id='select2-ddlQuaMgr-container']")
	private WebElement QualityManager;
	public void ClickonQualityManager()
	{
		QualityManager.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01520']
	@FindBy (xpath = "//li[text()='ANKUSH KUMAR (G01520)']")
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
	@FindBy (xpath = "//span[@id='select2-ddlNCAuditor-container']")
	private WebElement NameofAuditor;
	public void ClickonNameofAuditor()
	{
		NameofAuditor.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01520']
	@FindBy (xpath = "//li[text()='AMBRISH KUMAR TIWARI (G01527)']")
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
		datefornonconformancedetails.sendKeys("05022023");
	}
	
	
	//textarea[@id='txtCATdetails']
	//textarea[@id='txtCATdetails']
	@FindBy (xpath = "//textarea[@id='txtCATdetails']")
	private WebElement CorrectiveAction;
	public void ClickonCorrectiveAction()
	{
		CorrectiveAction.sendKeys("Test2");
	}
	
	@FindBy (xpath = "//span[@id='select2-ddlCATAuditor-container']")
	private WebElement NameofAuditorforcorrectiveAction;
	public void ClickonNameofAuditorforcorrectiveAction()
	{
		NameofAuditorforcorrectiveAction.click();
	}
	
	@FindBy (xpath = "//input[@id='txtCATAuNmdate']")
	private WebElement dateforcorrectiveAction;
	public void clickondateforcorrectiveAction()
	{
		dateforcorrectiveAction.sendKeys("06022023");
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
	@FindBy (xpath = "//span[@id='select2-ddlPATDeptMgr-container']")
	private WebElement selectdepartmentmanager;
	public void Clickonselectdepartmentmanager()
	{
		selectdepartmentmanager.click();
	}
	
	//input[@value='G01453']
	@FindBy (xpath = "//li[text()='AASHISH SHASHIKANT NAKHAWA(G01453)']")
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
		dateforpreventiveAction.sendKeys("07022023");
	}

	//textarea[@id='txtcomplianceActionRemark']
	@FindBy (xpath = "//textarea[@id='txtcomplianceActionRemark']")
	private WebElement ComplianceActionbyAuditor;
	public void checkComplianceActionbyAuditor()
	{
		ComplianceActionbyAuditor.sendKeys("Test4");
	}
	
	@FindBy (xpath = "//span[@id='select2-ddlVCAAuditor-container']")
	private WebElement NameofAuditorforcomplainsAction;
	public void ClickonNameofAuditorforcomplainsAction()
	{
		NameofAuditorforcomplainsAction.click();
	}
	
	@FindBy (xpath = "//input[@id='txtcomplianceActionRemarkdate']")
	private WebElement dateforcomplianceAction;
	public void ClickondateforcomplianceAction()
	{
		dateforcomplianceAction.sendKeys("08022023");
	}
	
	//textarea[@id='txtFCPAA']
	@FindBy (xpath = "//textarea[@id='txtFCPAA']")
	private WebElement  FinalCorrectiveandPreventiveAction;
	public void checkFinalCorrectiveandPreventiveAction()
	{
		FinalCorrectiveandPreventiveAction.sendKeys("Test5");
	}
	
	//span[normalize-space()='Select Audit Manager Name']
	@FindBy (xpath = "//span[@id='select2-ddlCPAAuditor-container']")
	private WebElement  nameofauditmanager;
	public void clickonnameofauditmanager()
	{
		nameofauditmanager.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G01524']
	@FindBy (xpath = "//li[text()='BIDYA BHUSHAN (G01524)']")
	private WebElement  nameofoneauditmanager;
	public void clickonnameofoneauditmanager()
	{
		nameofoneauditmanager.click();
	}
	
	@FindBy (xpath = "//input[@id='txtFCPAAdate']")
	private WebElement dateforAuditManager;
	public void ClickondateforAuditManager()
	{
		dateforAuditManager.sendKeys("09022023");
	}
	
	//textarea[@id='txtFAQM']
	@FindBy (xpath = "//textarea[@id='txtFAQM']")
	private WebElement FinalAcceptancebyQualityManager;
	public void clickonFinalAcceptancebyQualityManager()
	{
		FinalAcceptancebyQualityManager.sendKeys("Test6");
	}
	
	//span[normalize-space()='Select Quality Manager Name']
	@FindBy (xpath = "//span[@id='select2-ddlFAQMgr-container']")
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
		dateforQualityManager.sendKeys("10022023");
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
	

	
	//Going for Edit
	//After going to save ADD NCR details going again to home page and search for that particular added NCR
	
	//span[@id='select2-ddlAreaOfAudit-container']
	@FindBy (xpath = "//span[@id='select2-ddlAreaOfAudit-container']")
	private WebElement CheckforareaofAudit;
	public boolean validateAreaofauditCAMO (String ActualText )
	{
        String ExpectedText = CheckforareaofAudit.getText();
    	
    	return ExpectedText.equals(ActualText);
	}
	
	
	
	//input[@value='13']
	//input[@id='txtAuditFromdate']
	@FindBy (xpath = "//input[@id='txtAuditFromdate']")
	private WebElement DateofAuditgoingforEdit;
	public void clickonDateofAuditgoingforEdit()
	{
		DateofAudit.sendKeys("03022023");
	}
	//td[@id='grid_NCRgrid_cell_0_number']
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
	
	//label[text()='EDIT NON CONFORMANCE']
	@FindBy (xpath = "//label[text()='EDIT NON CONFORMANCE']")
	private WebElement EditNCRvalidation;
	public boolean EditNCRvalidation()
	{
		return EditNCRvalidation.isDisplayed();
		
	}
	//input[@id='txtChecklistNo']
	
	@FindBy (xpath = "//input[@id='txtChecklistNo']")
	private WebElement checkEditchecklistNo;
	public boolean validateEditchecklistNo()
	{
		return checkEditchecklistNo.isEnabled();
		
	}
	
	
	@FindBy (xpath = "//input[@id='txtAuditdate']")
	private WebElement DateofAuditforEdit;
	public void clickonDateofAuditforEdit()
	{
		DateofAuditforEdit.sendKeys("05022023");
	}
	
	
	
	//button[@title='HOSUR']
	@FindBy (xpath = "//span[@id='select2-ddlPlaceOfAudit-container']")
	private WebElement Hosurplaceofaudit;
	public void clickonHosurplaceofaudit()
	{
		Hosurplaceofaudit.click();
	}
	
	//input[@value='3']
	@FindBy (xpath = "//li[text()='AHMEDABAD']")
	private WebElement  AHMEDABADplaceofaudit;
	public void clickonAHMEDABADplaceofaudit()
	{
		AHMEDABADplaceofaudit.click();
	}
	
	//span[@id='select2-ddlAuditeeNm-container']
	@FindBy (xpath ="//span[@id='select2-ddlAuditeeNm-container']")
	private WebElement NameofAuditeesforEdit;
	public void ClickonNameofAuditeesforEdit()
	{
		NameofAuditeesforEdit.click();
	}
	
	@FindBy (xpath = "//li[text()='GANESH  KACHAN(G00817)']")
	private WebElement changetheNameofAuditeesforEdit;
	public void ClickonchangetheNameofAuditeesforEdit()
	{
		changetheNameofAuditeesforEdit.click();
	}
	
	//input[@id='txtAuditScope']
	@FindBy (xpath = "//input[@id='txtAuditScope']")
	private WebElement EditScopeofaudit;
	public void clickonEditScopeofaudit()
	{
		EditScopeofaudit.clear();
		EditScopeofaudit.sendKeys("Engineering Planning");
	}


	@FindBy (xpath = "//input[@id='txtLvl']")
	private WebElement ChangeLeveloffinding;
	public void PassingtheChangeLeveloffinding()
	{
		Leveloffinding.clear();
		Leveloffinding.sendKeys("III");
	}
	
	
	@FindBy (xpath = "//input[@id='txtTargetdate']")
	private WebElement DateofTargetforEdit;
	public void clickonDateofTargetforEdit()
	{
		DateofTargetforEdit.sendKeys("22022023");
	}
	
	//textarea[@id='txtRootCause']
	@FindBy (xpath = "//textarea[@id='txtRootCause']")
	private WebElement RootcauseofdiffForEditpage;
	public void clickonRootcauseofdiffForEditpage()
	{
		RootcauseofdiffForEditpage.clear();
		RootcauseofdiffForEditpage.sendKeys("Root Cause1");
	}
	
	@FindBy (xpath = "//textarea[@id='txtNonConformance']")
	private WebElement EditNonConformancedetails;
	public void ClickonEditNonConformancedetails()
	{
		EditNonConformancedetails.clear();
		EditNonConformancedetails.sendKeys("FirstTest");
	}
	
	//body[1]/div[1]/div[1]/div[5]/div[3]/div[2]/span[2]/div[1]/button[1]
	@FindBy (xpath ="//span[@id='select2-ddlNCAuditor-container']")
	private WebElement NameofAuditorforEdit;
	public void ClickonNameofAuditorforEdit()
	{
		NameofAuditorforEdit.click();
	}
	
	//ul[@class='multiselect-container dropdown-menu show']//input[@value='G00817']
	@FindBy (xpath = "//li[text()='GANESH  KACHAN(G00817)']")
	private WebElement changetheNameofAuditorforEdit;
	public void ClickonchangetheNameofAuditorforEdit()
	{
		changetheNameofAuditorforEdit.click();
	}
	
	
	@FindBy (xpath = "//input[@id='txtNCdetailsdate']")
	private WebElement dateforEditnonconformancedetails;
	public void clickondateforEditnonconformancedetails()
	{
		dateforEditnonconformancedetails.sendKeys("07022023");
	}
	
	//textarea[@id='txtPATdetails']
	@FindBy (xpath = "//textarea[@id='txtPATdetails']")
	private WebElement EditPreventiveactiontaken;
	public void ClickonEditPreventiveactiontaken()
	{
		 EditPreventiveactiontaken.clear();
		 EditPreventiveactiontaken.sendKeys("Details of Preventive Action taken");
	}
	
	
	
	//span[normalize-space()='AASHISH SHASHIKANT NAKHAWA(G01453)']
    @FindBy (xpath = "//span[@id='select2-ddlPATDeptMgr-container']")
	private WebElement NameofDeptManagerforEdit ;
	public void clickonNameofDeptManagerforEdit()
	{
		NameofDeptManagerforEdit.click();
	}
	
	//input[@value='G01641']
	@FindBy (xpath = "//li[text()='ABHIJEET DEVIDAS MADAKE(G01641)']")
	private WebElement changetheNameofDeptManagerforEdit ;
	public void clickonchangetheNameofDeptManagerforEdit()
	{
		changetheNameofDeptManagerforEdit.click();
	}
	
	//textarea[@id='txtFCPAA']
	@FindBy (xpath = "//textarea[@id='txtFCPAA']")
	private WebElement EditFinalAuditManager;
	public void ClickonEditFinalAuditManager()
	{
		EditFinalAuditManager.clear();
		EditFinalAuditManager.sendKeys("Corrective & Preventive Action by Audit Manager");
	}
	
	//input[@id='txtFCPAAdate']
	@FindBy (xpath = "//input[@id='txtFCPAAdate']")
	private WebElement changethedateforFinalManager;
	public void clickonchangethedateforFinalManager()
	{
		changethedateforFinalManager.sendKeys("09022023");
	}
	
	//textarea[@id='txtFAQM']
	@FindBy (xpath = "//textarea[@id='txtFAQM']")
	private WebElement FinalAccepatancebyqualityManager;
	public void clickonFinalAccepatancebyqualityManager()
	{
		FinalAccepatancebyqualityManager.clear();
		FinalAccepatancebyqualityManager.sendKeys("Final Acceptance by Quality Manager");
	}
	
	//span[@id='select2-ddlFAQMgr-container']
	@FindBy (xpath = "//span[@id='select2-ddlFAQMgr-container']")
	private WebElement changeFinalAccepatanceQualityManager;
	public void clickonchangeFinalAccepatanceQualityManager()
	{
		changeFinalAccepatanceQualityManager.click();
	}
	
	//li[text()='SHIVANI SANJAY TIKHE(G001378)']
	@FindBy (xpath = "//li[text()='SHIVANI SANJAY TIKHE(G001378)']")
	private WebElement changeNameofQualityManager;
	public void clickonchangeNameofQualityManager()
	{
		changeNameofQualityManager.click();
	}
	
	@FindBy (xpath = "//input[@id='txtFAQMdate']")
	private WebElement changethedateforQualityManager;
	public void clickonchangethedateforQualityManager()
	{
		changethedateforQualityManager.sendKeys("15022023");
	}
	
	
	
	
	//button[@id='bUpdate']
	@FindBy (xpath = "//button[@id='bUpdate']")
	private WebElement UpdateButton;
	public void clickonUpdateButton()
	{
		UpdateButton.click();
	}
	
	//button[@id='bUpConfirm']
	@FindBy (xpath = "//button[@id='bUpConfirm']")
	private WebElement UpdateAndConfirmButton;
	public void clickonUpdateAndConfirmButton()
	{
		UpdateAndConfirmButton.click();
	}
	
	
	
	//button[normalize-space()='ok']
	@FindBy (xpath = "//button[normalize-space()='ok']")
	private WebElement okButton;
	public void clickonokButton()
	{
		okButton.click();
	}
	
	//button[@id='BackToSearch']
	@FindBy (xpath = "//button[@id='BackToSearch']")
	private WebElement BackButton;
	public void clickonBackButton()
	{
		BackButton.click();
	}
	
	@FindBy (xpath = "//input[@id='txtAuditFromdate']")
	private WebElement DateofAuditforEditforHomePage;
	public void clickonDateofAuditforEditforHomePage()
	{
		DateofAuditforEditforHomePage.sendKeys("03022023");
	}
	
	//button[@title='Select Place Of Audit']
	@FindBy (xpath = "//span[@id='select2-ddlPlaceOfAudit-container']")
	private WebElement PlaceofAuditAfterEdit;
	public void clickonPlaceofAuditAfterEdit()
	{
		PlaceofAuditAfterEdit.click();
	}
	
	//input[@value='3']
	
	
	
	
//	After completion of Edit page going again to view page for Adding Attachment to NCR 
	
	//td[contains(text(),'Attachment')]
	 @FindBy (xpath = "//td[contains(text(),'Attachment')]")
		private WebElement AttachmentButton ;
		public void clickonAttachmentButton()
		{
			AttachmentButton.click();
		}
	
		//td[contains(text(),'Document Level File Upload')]
		@FindBy (xpath = "//td[contains(text(),'Document Level File Upload')]")
		private WebElement Documentlevelfileupload ;
		public void clickonDocumentlevelfileupload()
		{
			Documentlevelfileupload.click();
		}
		
		//span[@id='select2-ddl_DocumentCategory-container']
		@FindBy (xpath = "//span[@id='select2-ddl_DocumentCategory-container']")
		private WebElement DocumentCategory ;
		public void clickonDocumentCategory()
		{
			DocumentCategory.click();
//			Select s = new Select(DocumentCategory);
//			s.selectByIndex(0);
		}
		
		
		@FindBy (xpath = "//li[text()='Non Conformance Report']")
		private WebElement DocumentCategoryNCR ;
		public void clickonDocumentCategoryNCR()
		{
			DocumentCategoryNCR.click();
//			Select s = new Select(DocumentCategoryNCR);
//			s.selectByIndex(0);
		}
		
		//input[@id='doclevelfileUploadCtrl']
		@FindBy (xpath = "//input[@id='doclevelfileUploadCtrl']")
		private WebElement choosefileforDocument;
		public void clickonchoosefileforDocument()
		{
			choosefileforDocument.sendKeys("C:\\Users\\Shrirang.ladda\\Downloads\\SAT (1).pdf");
		}
		
		//button[@id='btnupload_doclevelmanualatt']
		@FindBy (xpath = "//button[@id='btnupload_doclevelmanualatt']")
		private WebElement Uploadbutton;
		public void clickonUploadbutton()
		{
			 Uploadbutton.click();
		}
	
		//button[normalize-space()='ok']
		@FindBy (xpath = "//button[normalize-space()='ok']")
		private WebElement okbuttonforupload;
		public void clickonokbuttonforupload()
		{
			 okbuttonforupload.click();
		}
		
		//td[contains(text(),'Download Files')]
		@FindBy (xpath = "//input[@class='w2ui-grid-select-check']")
		private WebElement selectfirstRow;
		public void clickonselectfirstRow()
		{
			selectfirstRow.click();
		}
		
		//td[contains(text(),'Download Files')]
		@FindBy (xpath = "//td[contains(text(),'Download Files')]")
		private WebElement DownloadFile;
		public void clickonDownloadFile()
		{
			 DownloadFile.click();
		}
		
		//div[@id='tempselectlistdiv']//input[@id='chk_7']
		@FindBy (xpath = "//div[@id='tempselectlistdiv']//input[@id='chk_58']")
		private WebElement selectreportfordownload;
		public void clickonselectreportfordownload()
		{
			selectreportfordownload.click();
		}
		
		//div[@id='tempselectlistdiv']//input[@id='chk_26']
		@FindBy (xpath = "//input[@class='filea']")
		private List<WebElement> selectreportfordownloadforAhemdabad;
		public void clickonselectreportfordownloadforAhemdabad()
		{
			selectreportfordownloadforAhemdabad.get(selectreportfordownloadforAhemdabad.size()-1).click();
		}
		
		
		
		
		
		
		
		//button[@id='btndownloadfilelist']
		@FindBy (xpath = "//button[@id='btndownloadfilelist']")
		private WebElement DownloadButton;
		public void clickonDownloadButton()
		{
			DownloadButton.click();
		}
		
		public void childwindowhandles()
		{
			Set<String>Cpage = driver.getWindowHandles();
			ArrayList<String>win = new ArrayList<String>(Cpage);
			driver.switchTo().window(win.get(1));
			driver.close();
			driver.switchTo().window(win.get(0));
		}
	 
		
		
		
		//button[@id='btnclosedownloadfilelist']
		@FindBy (xpath = "//button[@id='btnclosedownloadfilelist']")
		private WebElement closebutton;
		public void clickonclosebutton()
		{
			closebutton.click();
		}
		
		//button[@id='btngoback']
		@FindBy (xpath = "//button[@id='btngoback']")
		private WebElement Backbutton;
		public void clickonBackbuttonAfterAttachement()
		{
			Backbutton.click();
		}
		
//		//span[normalize-space()='CAMO']
//		@FindBy (xpath = "//button[@id='btngoback']")
//		private WebElement AfterAttachementclickon;
//		public void clickonAfterAttachement()
//		{
//			Backbutton.click();
//		}
//		
		//input[@value='Confirm']
		@FindBy (xpath = "//li[text()='Confirm']")
		private WebElement ConfirmButton;
		public void clickonConfirmbutton()
		{
			ConfirmButton.click();
		}
		
		
		
		//a[@id='View1']
		@FindBy (xpath = "//a[@id='View1']")
		private WebElement viewNCR;
		public void clickonviewNCR()
		{
			viewNCR.click();
		}
		
		//button[@id='btnprint']
		@FindBy (xpath = "//button[@id='btnprint']")
		private WebElement PrintButton;
		public void clickonPrintButton()
		{
			PrintButton.click();
		}
		
		
		
}
