package pompack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpomclass 
{
	private WebDriver driver;
	private Select P;
	
	public Loginpomclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//*[@id='i0116']")
	private WebElement Username;
	
	public void sendusername()
	{
		Username.sendKeys("shrirang.ladda@airworks.in");
	}
	
	@FindBy(xpath="//input[@id='idSIButton9']")
	private WebElement Nextbutton;
	
	public void clickonnextbutton()
	{
		Nextbutton.click();
	}
	
	@FindBy(xpath= "//input[@id='i0118']")
	private WebElement Password;
	
	public void sendpassword()
	{
		Password.sendKeys("Tester@AWI^2023");
	}
	
	@FindBy(xpath="//input[@id='idSIButton9']")
	private WebElement signin;
	
	public void MSsignin()
	{
		signin.click();
	}
	
	@FindBy (xpath= "//input[@id='idSIButton9']")
	private WebElement yesbutton;
	
	public void clickonyesbutton()
	{
		yesbutton.click();
	}
	
	
	
	@FindBy (xpath = "//a[@id='navbarDropdown']")
	private WebElement Signoutbutton;
	
	@FindBy (xpath = "//a[@onclick='_LogOut()']")
	private WebElement Logoutbutton;
	
	
	public void clickonsignoutbutton()
	{
		Signoutbutton.click();
//	    P = new Select (Signoutbutton);
//		P.selectByVisibleText(" Log Out");
		Logoutbutton.click();
		
	}
	
	@FindBy (xpath= "//span[normalize-space()='Sign in']")
	private WebElement signinbutton;
	
	public void clickonsigninbutton()
	{
		signinbutton.click();
	}
	
	public boolean logoutValid()
	{
		return signin.isDisplayed();
	}
	
	@FindBy (xpath ="//a[@id='4823']")
	private WebElement AMROclick;
	public void clickonamrobutton()
	{
		AMROclick.click();
	}
	
	@FindBy (xpath = "//a[normalize-space()='Planning']//span[@class='fa fa-chevron-down']")
	private WebElement planning;
	public void clickonplanningbutton()
	{
		planning.click();
	}
	
	@FindBy (xpath = "//a[normalize-space()='Work Order']")
	private WebElement workorder;
	public void clickonworkorder()
	{
		workorder.click();
	}
}
	
	
	
	

