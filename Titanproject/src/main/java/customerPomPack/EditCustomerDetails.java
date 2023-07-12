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
	CustomerCode.sendKeys("Code000");
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

    //Address details adding started for 2nd record for Edit Address details

@FindBy (xpath ="(//td[contains(text(),'Add Record')])[1]")
private WebElement AddrecordEditAddressdetails;
public void ClickOnAddrecordEditAddressdetails()
{
	AddrecordEditAddressdetails.click();
}

//input[@id='txtAddress1']
@FindBy (xpath ="//input[@id='txtAddress1']")
private WebElement Address1;
public void EnterAddress1()
{
	Address1.sendKeys("Edit Address 1");
}

//input[@id='txtAddress2']
@FindBy (xpath ="//input[@id='txtAddress2']")
private WebElement Address2;
public void EnterAddress2()
{
	Address2.sendKeys("Edit Address 2");
}

//input[@id='txtAddress3']
@FindBy (xpath ="//input[@id='txtAddress3']")
private WebElement Address3;
public void EnterAddress3()
{
	Address3.sendKeys("Edit Address 3");
}

//select[@id='ddlCountry']
@FindBy (xpath ="//select[@id='ddlCountry']")
private WebElement Country;
public void ClickonCountry()
{
	Country.click();
}

@FindBy (xpath ="//option[text()='India']")
private WebElement IndiaCountry;
public void ClickonIndiaCountry()
{
	IndiaCountry.click();
}

@FindBy (xpath ="//select[@id='ddlState']")
private WebElement State;
public void ClickonState()
{
	State.click();
}

@FindBy (xpath ="//option[text()='Maharashtra']")
private WebElement MaharashtraState;
public void ClickonMaharashtraState()
{
	MaharashtraState.click();
}

@FindBy (xpath ="//select[@id='ddlCity']")
private WebElement City;
public void ClickOnCity()
{
	City.click();
}

@FindBy (xpath ="//option[text()='Pune']")
private WebElement PuneCity;
public void ClickOnPuneCity()
{
	PuneCity.click();
}

//input[@id='txtZipCode']
@FindBy (xpath ="//input[@id='txtZipCode']")
private WebElement ZipCode;
public void EnterZipCode()
{
	ZipCode.sendKeys("123456");
}

//select[@id='ddlDefault']
@FindBy (xpath ="//select[@id='ddlDefault']")
private WebElement Default;
public void ClickOnDefault()
{
	Default.click();
}

@FindBy (xpath ="//option[text()='No']")
private WebElement DefaultNo;
public void ClickOnDefaultNo()
{
	DefaultNo.click();
}

//input[@id='txtGST']
@FindBy (xpath ="//input[@id='txtGST']")
private WebElement GSTNo;
public void EnterGSTNo()
{
	GSTNo.sendKeys("123123");
}

//button[@id='btnAddressSave']
@FindBy (xpath ="//button[@id='btnAddressSave']")
private WebElement SaveButton;
public void ClickOnSaveButton()
{
	SaveButton.click();
}

//Address details adding started for 2nd record for contact person

@FindBy (xpath ="(//td[contains(text(),'Add Record')])[2]")
private WebElement AddRecordContactPerson;
public void ClickOnAddRecordContactPerson2()
{
	AddRecordContactPerson.click();
}

//input[@id='txtNameCP']
@FindBy (xpath ="//input[@id='txtNameCP']")
private WebElement NameOfContactPerson;
public void EnterNameOfContactPerson()
{
	NameOfContactPerson.sendKeys("Shrirang R ladda");
}

@FindBy (xpath ="//input[@id='txtDesignationCP']")
private WebElement Designation;
public void EnterDesignation()
{
	Designation.sendKeys("Quality Engineers");
}

@FindBy (xpath ="//input[@id='txtDepartmentCP']")
private WebElement Department;
public void EnterDepartment()
{
	Department.sendKeys("IT");
}

@FindBy (xpath ="//input[@id='txtPhoneNoCP']")
private WebElement PhoneNoForContactperson;
public void EnterPhoneNoForContactperson()
{
	PhoneNoForContactperson.sendKeys("8378922780");
}

//input[@id='txtEMailCP']
@FindBy (xpath ="//input[@id='txtEMailCP']")
private WebElement EmailForContactperson;
public void EnterEmailForContactperson()
{
	EmailForContactperson.sendKeys("shrirangladda5@gmail.com");
}

@FindBy (xpath ="//input[@id='txtFaxCP']")
private WebElement FaxForContactperson;
public void EnterFaxForContactperson()
{
	FaxForContactperson.sendKeys("123456");
}

@FindBy (xpath ="//input[@id='txtZipCodeCP']")
private WebElement ZipCodeForContactperson;
public void EnterZipCodeForContactperson()
{
	ZipCodeForContactperson.sendKeys("422605");
}

//input[@id='txtDefaultCP']
@FindBy (xpath ="//input[@id='txtDefaultCP']")
private WebElement DefaultForContactperson;
public void EnterDefaultForContactperson()
{
	DefaultForContactperson.sendKeys("Tested");
}

//button[@id='btnCPSave']
@FindBy (xpath ="//button[@id='btnCPSave']")
private WebElement SaveContactPersonDetails;
public void ClickOnSaveContactPersonDetails()
{
	SaveContactPersonDetails.click();
}

//button[@onclick='Update()']
@FindBy (xpath ="//button[@onclick='Update()']")
private WebElement UpdateCustomerDetails;
public void ClickOnUpdateCustomerDetails()
{
	UpdateCustomerDetails.click();
}








	
	
}
