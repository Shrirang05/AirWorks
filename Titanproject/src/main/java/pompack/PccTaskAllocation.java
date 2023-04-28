package pompack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PccTaskAllocation 
{
	private WebDriver driver;
	private Actions Act;
	

	public PccTaskAllocation(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = "//a[normalize-space()='Task Allocation']")
	private WebElement TaskAllocation;
	public void clickonTaskAllocation()
	{
		TaskAllocation.click();
	}
	
	//span[normalize-space()='Select Finding From Task']
	@FindBy (xpath = "//span[normalize-space()='Select Finding From Task']")
	private WebElement findingfromtask;
	public void clickonfindingfromtask()
	{
		findingfromtask.click();
	}
	
	//button[@title='ATA']
	@FindBy (xpath = "//button[@title='ATA']")
	private WebElement ATA;
	public void clickonATA()
	{
		ATA.click();
	}
	
	//input[@value='53']
	@FindBy (xpath = "//input[@value='53']")
	private WebElement ATAselect;
	public void clickonATAselect()
	{
		 ATAselect.click();
	}
	
	
	//button[@title='AWI Zone']
	@FindBy (xpath = "//button[@title='AWI Zone']")
	private WebElement AWIzone;
	public void clickonAWIzone()
	{
		AWIzone.click();
	}
	
	//label[@class='radio']//input[@value='2721']
	@FindBy (xpath = "//label[@class='radio']//input[@value='2721']")
	private WebElement FirstAWIzone;
	public void clickonanyAWIzone()
	{
		FirstAWIzone.click();
	}
	
	//button[@title='Trade to Action']
	@FindBy (xpath = "//button[@title='Trade to Action']")
	private WebElement TradetoAction;
	public void clickonTradetoAction()
	{
		TradetoAction.click();
	}
	
	//label[@class='radio']//input[@value='100']
	@FindBy (xpath = "//label[@class='radio']//input[@value='100']")
	private WebElement TradetoActionB1;
	public void clickonTradetoActionB1()
	{
		TradetoActionB1.click();
	}
	
	//div[@class='col-sm-2']//button[@title='AME 1']
	@FindBy (xpath = "//div[@class='col-sm-2']//button[@title='AME 1']")
	private WebElement AME1;
	public void clickonAME1()
	{
		AME1.click();
	}
	
	//li[@class='active']//input[@value='G00210']
	@FindBy (xpath = "//ul[@class='multiselect-container dropdown-menu show']//input[@value='G00210']")
	private WebElement selectAME1;
	public void clickonparticularAME1()
	{
		selectAME1.click();
	}
	
	//button[@id='Search']
	@FindBy (xpath = "//button[@id='Search']")
	private WebElement Serchbutton;
	public void clickonSerchbutton()
	{
		Serchbutton.click();
	}
	
	//tr[@id='grid_grid_rec_3']//td[1]
	@FindBy (xpath = "//tr[@id='grid_grid_rec_1']//td[2]")
	private WebElement Select1grid;
	public void clickonSelect1grid()
	{
		Select1grid.click();
	}
	
	//td[contains(text(),'Default Inputs')]
	@FindBy (xpath = "//td[contains(text(),'Default Inputs')]")
	private WebElement DefaultInputs;
	public void clickonDefaultInputs()
	{
		DefaultInputs.click();
	}
	
	//button[@title='None selected']
	@FindBy (xpath = "//button[@title='None selected']")
	private WebElement AWIZoneselect;
	public void clickonAWIZoneselect()
	{
		AWIZoneselect.click();
	}
	
	//label[@class='checkbox']//input[@value='2723']
	@FindBy (xpath = "//label[@class='checkbox']//input[@value='2723']")
	private WebElement AWIZonecabin;
	public void clickonAWIZonecabin()
	{
		AWIZonecabin.click();
	}
	
	//label[@class='checkbox']//input[@value='2724']
	@FindBy (xpath = "//label[@class='checkbox']//input[@value='2724']")
	private WebElement AWIZoneEmpennage;
	public void clickonAWIZoneEmpennage()
	{
		AWIZoneEmpennage.click();
	}
	
	//span[normalize-space()='CABIN + PAX DOORS, Empennage']
	@FindBy (xpath = "//span[normalize-space()='CABIN + PAX DOORS, Empennage']")
	private WebElement DeselectAWIZone;
	public void clickonDeselectAWIZone()
	{
		DeselectAWIZone.click();
	}
	
	//button[@title='Select Trade to Action']
	@FindBy (xpath = "//button[@title='Select Trade to Action']")
	private WebElement SelecttradetoAction;
	public void clickonSelecttradetoAction()
	{
		SelecttradetoAction.click();
	}
	
	//label[@class='checkbox']//input[@value='104']
	@FindBy (xpath = "//label[@class='checkbox']//input[@value='104']")
	private WebElement SelectNDTtradetoAction;
	public void clickonSelectNDTtradetoAction()
	{
		SelectNDTtradetoAction.click();
	}
	
	//button[@title='NDT']
	@FindBy (xpath = "//button[@title='NDT']")
	private WebElement DeSelectNDTtradetoAction;
	public void clickonDeSelectNDTtradetoAction()
	{
		DeSelectNDTtradetoAction.click();
	}
	
	//button[@id='btn_default_ok']
	@FindBy (xpath = "//button[@id='btn_default_ok']")
	private WebElement Applybutton;
	public void clickonApplybutton()
	{
		Applybutton.click();
	}
	
	
	
	
	
	
	
	
	//td[contains(text(),'Edit')]
	@FindBy (xpath = "//td[contains(text(),'Edit')]")
	private WebElement Editbutton;
	public void clickonEditbutton()
	{
		 Editbutton.click();
	}
	//input[@id='grid_grid_edit_3_7']
	@FindBy (xpath = "//input[@id='grid_grid_edit_1_7']")
	private WebElement gofor1stday;
	public void clickon1stdayinthegrid()
	{
		gofor1stday.sendKeys("1");
	}
	
	
	//tbody/tr[@id='grid_grid_rec_2']/td[3]/div[1]
	@FindBy (xpath = "//tr[@id='grid_grid_rec_2']//td[2]")
	private WebElement select2ndgrid;
	public void clickonselect2ndgrid()
	{
		 select2ndgrid.click();
	}
	
	@FindBy (xpath = "//input[@id='grid_grid_edit_2_7']")
	private WebElement gofor2ndday;
	public void clickon2nddayinthegrid()
	{
		gofor2ndday.sendKeys("2");
	}
	
	//td[@id='grid_grid_cell_2_number']
	@FindBy (xpath = "//tr[@id='grid_grid_rec_3']//td[2]")
	private WebElement select3rdgrid;
	public void clickon3rdgrid()
	{
		select3rdgrid.click();
	}
	
	//input[@id='grid_grid_edit_3_7']
	@FindBy (xpath = "//input[@id='grid_grid_edit_3_7']")
	private WebElement gofor3rdday;
	public void clickon3rddayinthegrid()
	{
		gofor3rdday.sendKeys("3");
	}
	
	//tr[@id='grid_grid_rec_4']
	@FindBy (xpath = "//tr[@id='grid_grid_rec_4']//td[2]")
	private WebElement select4thgrid;
	public void clickon4thgrid()
	{
		select4thgrid.click();
	}
	
	@FindBy (xpath = "//input[@id='grid_grid_edit_4_7']")
	private WebElement gofor4thday;
	public void clickon4thdayinthegrid()
	{
		gofor4thday.sendKeys("1");
	}
	
	//tbody/tr[@id='grid_grid_rec_5']/td[2]/div[1]
	@FindBy (xpath = "//tr[@id='grid_grid_rec_5']//td[2]")
	private WebElement select5thgrid;
	public void clickon5thgrid()
	{
		select5thgrid.click();
	}
	
	@FindBy (xpath = "//input[@id='grid_grid_edit_5_7']")
	private WebElement gofor5thday;
	public void clickon5thdayinthegrid()
	{
		gofor5thday.sendKeys("3");
	}
	
	//button[@id='btnsubmit']
	@FindBy (id="btnsubmit")
	private WebElement AllocateButton;
	public void clickonAllocateButton()
	{
		
		System.out.println(AllocateButton.isDisplayed());
		AllocateButton.click();
	}
	
	//button[normalize-space()='ok']
	@FindBy (xpath = "//button[normalize-space()='ok']")
	private WebElement OkButton;
	public void clickonOkButton()
	{
		OkButton.click();
	}
	
	
	
	
	
	
	
	
	  @FindBy (xpath = "//i[@class='fa fa-bars']")
	    private WebElement Menubuttonforscrolling;
	    public void clickonMenubuttonforscrollingthepage() throws InterruptedException
	    {
	    	Menubuttonforscrolling.click();
	    	Thread.sleep(1000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,1000)");
	    }
	
	
	
}
