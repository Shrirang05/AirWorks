package customerPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerDetails
{
	private WebDriver driver;
	private Actions Act;


	public EditCustomerDetails(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	
@FindBy (xpath ="//a[normalize-space()='View / Edit Customer']")
private WebElement EditCustomer;
public void ClickonEditCustomer()
{
	EditCustomer.click();
}	
	
	
@FindBy (xpath ="//input[@id='txtCustomerCode']")
private WebElement CustomerCode;
public void EnterCustomerCode()
{
	CustomerCode.sendKeys("Testcode12345");
}
	
@FindBy (xpath ="//input[@id='txtCustomerName']")
private WebElement CustomerName;
public void EnterCustomername()
{
	CustomerName.sendKeys("Shrirang Ladda");
}	
	
@FindBy (xpath ="//select[@id='ddlEngagementType']")
private WebElement EngagementType;
public void ClickOnEngagementType()
{
	EngagementType.click();
}

//option[text()='CAMO']
@FindBy (xpath ="//option[text()='CAMO']")
private WebElement CAMOEngagementType;
public void ClickOnCAMOEngagementType()
{
	CAMOEngagementType.click();
}

//input[@id='txtAccountGroup']	
@FindBy (xpath ="//input[@id='txtAccountGroup']")
private WebElement AccountGroup;
public void EnterAccountGroup()
{
	AccountGroup.sendKeys("Test Group");
}	
	
@FindBy (xpath ="//input[@id='txtCustPhone']")
private WebElement PhoneNo;
public void EnterPhoneNo()
{
	PhoneNo.sendKeys("1234567890");
}
	
//input[@id='txtCustEMail']
@FindBy (xpath ="//input[@id='txtCustEMail']")
private WebElement ViewCustomerEmail;
public void EnterViewCustomerEmail()
{
	ViewCustomerEmail.sendKeys("shrirang.ladda@airworks.in");
}

@FindBy (xpath ="//input[@id='txtCustFax']")
private WebElement FaxNo;
public void EnterFaxNo()
{
	FaxNo.sendKeys("123456");
}

//select[@id='ddlCMH_STATUS']
@FindBy (xpath ="//select[@id='ddlCMH_STATUS']")
private WebElement Status;
public void ClickOnStatus()
{
	 Status.click();
}

@FindBy (xpath ="//option[@value='Active']")
private WebElement ActiveStatus;
public void ClickOnActiveStatus()
{
	ActiveStatus.click();
}

@FindBy (xpath ="//button[@id='Search']")
private WebElement SearchButton;
public void ClickOnSearchButton()
{
	SearchButton.click();
}

@FindBy (xpath ="//a[@id='Edit1']")
private WebElement Editpen;
public void ClickOnEditpenfromgrid()
{
	Editpen.click();
}

@FindBy (xpath ="//input[@id='txtCustomerName']")
private WebElement EditCutomerName;
public void EnterEditCutomerName()
{
	EditCutomerName.clear();
	EditCutomerName.sendKeys("Shrirang R Ladda");
}

@FindBy (xpath ="//select[@id='txtEngagementType']")
private WebElement EditEngagementType;
public void EnterEditEngagementType()
{
	EditEngagementType.click();
}

@FindBy (xpath ="//option[text()='MAINTENANCE']")
private WebElement EditoneEngagementType;
public void SelectOneEngagementType()
{
	EditoneEngagementType.click();
}

@FindBy (xpath ="//input[@id='txtAccountGroup']")
private WebElement EditAccountGroup;
public void EditEditAccountGroup()
{
	EditAccountGroup.clear();
	EditAccountGroup.sendKeys("Test Group 2");
}

@FindBy (xpath ="//input[@id='txtCustPhone']")
private WebElement EditphoneNo;
public void EditEditphoneNo()
{
	EditphoneNo.clear();
	EditphoneNo.sendKeys("1231231230");
}

@FindBy (xpath ="//input[@id='txtCustFax']")
private WebElement EditFaxNo;
public void EnterEditFaxNo()
{
	EditFaxNo.clear();
	EditFaxNo.sendKeys("543210");
}

@FindBy (xpath ="//input[@id='txtPan']")
private WebElement EditPanNo;
public void EnterEditPanNo()
{
	EditPanNo.clear();
	EditPanNo.sendKeys("543210");
}

@FindBy (xpath ="//input[@id='txtTan']")
private WebElement EditTanNo;
public void EnterEditTanNo()
{
	EditTanNo.clear();
	EditTanNo.sendKeys("AGSPT1234F");
}

@FindBy (xpath ="//input[@id='txtRemark']")
private WebElement EditRemarks;
public void EnterEditRemarks()
{
	EditRemarks.clear();
	EditRemarks.sendKeys("Edit Test Remarks");
}

@FindBy (xpath ="(//td[contains(text(),'Add Record')])[1]")
private WebElement AddrecordEditAddressdetails;
public void ClickOnAddrecordEditAddressdetails()
{
	AddrecordEditAddressdetails.click();
}










	
	
}
