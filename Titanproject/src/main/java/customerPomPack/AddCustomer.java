package customerPomPack;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomer 
{
private WebDriver driver;
private Actions Act;


public AddCustomer(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

JavascriptExecutor js = (JavascriptExecutor) driver;

//a[normalize-space()='Customers']
@FindBy (xpath ="//a[normalize-space()='Customers']")
private WebElement Customers;
public void ClickOnCustomers()
{
	Customers.click();
}

@FindBy (xpath ="//a[text()='Add  Customer']")
private WebElement AddCustomers;
public void ClickOnAddCustomers()
{
	AddCustomers.click();
}

@FindBy (xpath ="//input[@id='txtCustomerCode']")
private WebElement CustomerCode;
public void EnterCustomerCode()
{
	CustomerCode.sendKeys("Testcode12345");
}

@FindBy (xpath ="//input[@id='txtCustomerName']")
private WebElement CustomerName;
public void EnterCustomerName()
{
	CustomerName.sendKeys("Shrirang Ladda");
}

@FindBy (xpath ="//select[@id='txtEngagementType']")
private WebElement EngagementType;
public void ClickonEngagementType()
{
	EngagementType.click();
}

//option[text()='CAMO']
@FindBy (xpath ="//option[text()='CAMO']")
private WebElement CAMOEngagementType;
public void ClickonCAMOEngagementType()
{
	CAMOEngagementType.click();
}

//input[@id='txtAccountGroup']
@FindBy (xpath ="//input[@id='txtAccountGroup']")
private WebElement AccountGroup;
public void ClickonAccountGroup()
{
	AccountGroup.sendKeys("Test Group");
}

@FindBy (xpath ="//input[@id='txtCustPhone']")
private WebElement PhoneNo;
public void ClickonPhoneNo()
{
	PhoneNo.sendKeys("1234567890");
}

//input[@id='txtPANNo']
@FindBy (xpath ="//input[@id='txtPANNo']")
private WebElement PANNo;
public void EnterPanNo()
{
	PANNo.sendKeys("AGSPT1234F");
}

@FindBy (xpath ="//input[@id='txtTANNo']")
private WebElement TANNo;
public void EnterTanNo()
{
	TANNo.sendKeys("AGSPT0000F");
}

//input[@id='txtCustEMail']
@FindBy (xpath ="//input[@id='txtCustEMail']")
private WebElement Email;
public void EnterEmail()
{
	Email.sendKeys("shrirang.ladda@airworks.in");
}

@FindBy (xpath ="//input[@id='txtCustFax']")
private WebElement Fax;
public void EnterFax()
{
	Fax.sendKeys("123456");
}

@FindBy (xpath ="//input[@id='txtRemark']")
private WebElement Remark;
public void EnterRemark()
{
	Remark.sendKeys("Test Remarks");
}

@FindBy (xpath ="(//td[contains(text(),'Add Record')])[1]")
private WebElement AddRecordAddressDetails;
public void ClickonAddRecordAddressDetails()
{
	AddRecordAddressDetails.click();
}

//input[@id='txtAddress1']
@FindBy (xpath ="//input[@id='txtAddress1']")
private WebElement Address1;
public void EnterAddress1()
{
	Address1.sendKeys("Test Address 1");
}

@FindBy (xpath ="//input[@id='txtAddress2']")
private WebElement Address2;
public void EnterAddress2()
{
	Address2.sendKeys("Test Address 2");
}

@FindBy (xpath ="//input[@id='txtAddress3']")
private WebElement Address3;
public void EnterAddress3()
{
	Address3.sendKeys("Test Address 3");
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
public void SelectIndiaCountry()
{
	IndiaCountry.click();
}

@FindBy (xpath ="//select[@id='ddlState']")
private WebElement State;
public void ClickOnState()
{
	State.click();
}

@FindBy (xpath ="//option[text()='Maharashtra']")
private WebElement MaharshtraState;
public void ClickOnMaharshtraState()
{
	MaharshtraState.click();
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

@FindBy (xpath ="//input[@id='txtZipCode']")
private WebElement ZipCode;
public void ClickOnZipCode()
{
	ZipCode.sendKeys("123456");
}

@FindBy (xpath ="//input[@id='txtGST']")
private WebElement GSTNO;
public void EnterGSTNO()
{
	GSTNO.sendKeys("123GST123AD");
}

//button[@id='btnAddressSave']
@FindBy (xpath ="//button[@id='btnAddressSave']")
private WebElement Savebutton;
public void ClickonSavebutton()
{
	Savebutton.click();
}

@FindBy (xpath ="(//td[contains(text(),'Add Record')])[2]")
private WebElement AddRecordContactPersonDetails;
public void ClickonAddRecordContactPersonDetails()
{
	AddRecordContactPersonDetails.click();
}


@FindBy (xpath ="//input[@id='txtNameCP']")
private WebElement ContactPersonName;
public void EnterContactPersonName()
{
	ContactPersonName.sendKeys("Shrirang Ladda");
}


@FindBy (xpath ="//input[@id='txtDesignationCP']")
private WebElement ContactPersonDesignstion;
public void EnterContactPersonDesignstion()
{
	ContactPersonDesignstion.sendKeys("Tester");
}

@FindBy (xpath ="//input[@id='txtDepartmentCP']")
private WebElement ContactPersonDepartment;
public void EnterContactPersonDepartment()
{
	ContactPersonDepartment.sendKeys("IT");
}

@FindBy (xpath ="//input[@id='txtPhoneNoCP']")
private WebElement ContactPersonPhoneNo;
public void EnterContactPersonPhoneNo()
{
	ContactPersonPhoneNo.sendKeys("1234567890");
}

//input[@id='txtEMailCP']
@FindBy (xpath ="//input[@id='txtEMailCP']")
private WebElement ContactPersonEmail;
public void EnterContactPersonEmail()
{
	ContactPersonEmail.sendKeys("shrirang.ladda@airworks.in");
}

@FindBy (xpath ="//input[@id='txtFaxCP']")
private WebElement ContactPersonFax;
public void EnterContactPersonFax()
{
	ContactPersonFax.sendKeys("123456");
}

//input[@id='txtZipCodeCP']
@FindBy (xpath ="//input[@id='txtZipCodeCP']")
private WebElement ContactPersonZipCode;
public void EnterContactPersonZipCode()
{
	 ContactPersonZipCode.sendKeys("123456");
}

@FindBy (xpath ="//input[@id='txtDefaultCP']")
private WebElement Default;
public void EnterContactPersonDefault()
{
	Default.sendKeys("Test Default");
}


@FindBy (xpath ="(//button[@id='btnCPSave'])[1]")
private WebElement SavebuttonContactperson;
public void ClickOnSaveButton()
{   
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(SavebuttonContactperson));
	
	Act = new Actions(driver);
	Act.click(SavebuttonContactperson);
	
//	js.executeScript("arguments[0].scrollIntoView(true);", SavebuttonContactperson);
//	SavebuttonContactperson.click();
	

	
//	js.executeScript("arguments[0].click();", SavebuttonContactperson);
//	SavebuttonContactperson.click();
}

//div[@class='col-sm-2']//button[@type='submit'][normalize-space()='Save']
@FindBy (xpath ="//div[@class='col-sm-2']//button[@type='submit'][normalize-space()='Save']")
private WebElement SaveAddCustomer;
public void ClickOnSaveAddCustomer()
{
	SaveAddCustomer.click();
}




















}
