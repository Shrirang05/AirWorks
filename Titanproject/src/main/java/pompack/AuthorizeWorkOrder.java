package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizeWorkOrder 
{
	private WebDriver driver;
	private Actions Act;
	
	public  AuthorizeWorkOrder (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//a[normalize-space()='Authorize Work Order']
	@FindBy (xpath = "//a[text()='Authorize Work Order']")
	private WebElement Authorizedworkorder;
	public void clickonAuthorizedworkorder()
	{
		 Authorizedworkorder.click();
	}
	
	
	//input[@id='txtWoNo']
	@FindBy (xpath = "//input[@id='txtWoNo']")
	private WebElement workorderno;
	public void Passingworkorderno()
	{
		workorderno.sendKeys("WPO-HSR-000215-0423");
	}
	
	//span[normalize-space()='Select Aircraft Regn']
	@FindBy (xpath ="//button[@title='Select Aircraft Regn']")
	private WebElement AircraftReg;
	
	@FindBy (xpath ="//input[@value='21']")
	private WebElement BTTB;
	
	//label[normalize-space()='2-BTTB']
	public void clickonAircraftReg()
	{
		AircraftReg.click(); 
		BTTB.click();
		
	}
	
	//input[@id='txtTypeCheck']
	@FindBy (xpath = "//input[@id='txtTypeCheck']")
	private WebElement Typeofcheck;
	public void selectTypeofcheck()
	{
		Typeofcheck.sendKeys("2C CHECK");
	}
	
	
	@FindBy (xpath = "//span[normalize-space()='Select Customer']")
	private WebElement selectcustomer;
	public void selectcustomerforRegAircraft()
	{
		selectcustomer.click();
	}
	
	@FindBy (xpath = "//label[normalize-space()='BBAM AVIATION SERVICES']")
	private WebElement BBAMservices;
	public void selectcustomerBBAM()
	{
		BBAMservices.click();
	}
	
	//select[@id='ddlStation']
	@FindBy (xpath = "//select[@id='ddlStation']")
	private WebElement SelectStation;
	public void Selectstation()
	{
		SelectStation.click();
	}
	
	@FindBy (xpath = "//option[@value='291']")
	private WebElement SelectStationCoachin;
	public void clickonCochinstation()
	{
		SelectStationCoachin.click();
	}
	
	//button[@id='Search']
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/div[1]/button[1]")
	private WebElement Searchbutton;
	public void clickonSearchbutton()
	{
		Searchbutton.click();
	}
	
	//tr[@id='grid_gridSearchResult_rec_1']//td[4]
	@FindBy (xpath = "//tr[@id='grid_gridSearchResult_rec_1']//td[4]")
	private WebElement Numberingtypecolumn;
	public void clickonNumberingtypecolumn()
	{  
		Act= new Actions (driver);
		Act.moveToElement(Numberingtypecolumn).doubleClick().build().perform();
	}
	
	//td[normalize-space()='AWO-HSR-']
	@FindBy (xpath = "//td[normalize-space()='AWO-HSR-']")
	private WebElement SelectNumberingtype;
	public void clickonSelectNumberingtype()
	{  
		SelectNumberingtype.click();
	}
	
	//button[@id='btnAuthorized']
	@FindBy (xpath = "//button[@id='btnAuthorized']")
	private WebElement Authorizebutton;
	public void clickonAuthorizebutton()
	{  
		Authorizebutton.click();
	}
	
	//td[@class='w2ui-grid-data']//input[@type='checkbox']
	@FindBy (xpath = "//td[@class='w2ui-grid-data']//input[@type='checkbox']")
	private WebElement CheckboxforAuthorize;
	public void clickoncheckbox()
	{  
		CheckboxforAuthorize.click();
	}
	
	//button[normalize-space()='Proceed']
	@FindBy (xpath = "//button[normalize-space()='Proceed']")
	private WebElement proceedbutton;
	public void clickonproceedbutton()
	{  
		 proceedbutton.click();
	}
	
	
	
	
	
	
	
	
}
