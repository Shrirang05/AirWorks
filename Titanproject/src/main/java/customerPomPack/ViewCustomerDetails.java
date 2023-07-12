package customerPomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCustomerDetails 
{
	private WebDriver driver;
	private Actions Act;


	public ViewCustomerDetails(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath ="//a[normalize-space()='View / Edit Customer']")
	private WebElement ViewCustomer;
	public void ClickOnViewCustomer()
	{
		ViewCustomer.click();
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
		CustomerName.sendKeys("Shrirang R Ladda");
	}	
		
	@FindBy (xpath ="//select[@id='ddlEngagementType']")
	private WebElement EngagementType;
	public void ClickOnEngagementType()
	{
		EngagementType.click();
	}

	//option[text()='CAMO']
	@FindBy (xpath ="//option[text()='MAINTENANCE']")
	private WebElement MAINTENANCEEngagementType;
	public void ClickOnMAINTENANCEEngagementType()
	{
		MAINTENANCEEngagementType.click();
	}

	//input[@id='txtAccountGroup']	
	@FindBy (xpath ="//input[@id='txtAccountGroup']")
	private WebElement AccountGroup;
	public void EnterAccountGroup()
	{
		AccountGroup.sendKeys("Test Group 2");
	}	
		
	@FindBy (xpath ="//input[@id='txtCustPhone']")
	private WebElement PhoneNo;
	public void EnterPhoneNo()
	{
		PhoneNo.sendKeys("1231231230");
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
		FaxNo.sendKeys("543210");
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
	
	@FindBy (xpath ="//tr[@id='grid_gridAddress_rec_1']//td[@class='w2ui-grid-data'][2]")
	private WebElement VerifyCustomerCode;
	public String VerifyCustomerCode()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






