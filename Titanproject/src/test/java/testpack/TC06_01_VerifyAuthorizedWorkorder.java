package testpack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pompack.AuthorizeWorkOrder;
import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.PccTaskAllocation;
import pompack.PccZoneAllocation;

public class TC06_01_VerifyAuthorizedWorkorder extends Testbaseclass
{
	private Createworkorderpage AM;
	private PccZoneAllocation PC;
	private PccTaskAllocation PT;
	private AuthorizeWorkOrder AW;
	private Editworkorderpage EW;
	
	@Test
	
	public void VerifyAuthorizedWorkorder() throws InterruptedException
	{
		AM = new Createworkorderpage(driver);
		PC = new PccZoneAllocation(driver);
		PT = new PccTaskAllocation(driver);
		AW = new AuthorizeWorkOrder(driver);
		EW = new Editworkorderpage(driver);
		
		AM.clickonamrobutton();
	    log.info("Click on AMRO button");
		Thread.sleep(4000);
        AM.clickonplanningbutton();
        log.info("Click on planning button");
        Thread.sleep(2000);
        AM.clickonworkorder();
        log.info("Click on Work order");
        Thread.sleep(2000);
        AW.clickonAuthorizedworkorder();
        log.info("Click on Authorized work order");
        Thread.sleep(2000);
        AW.Passingworkorderno();
        log.info("passing work order no.");
        Thread.sleep(2000);
        AW.clickonAircraftReg();
        log.info("Click on Aircraft Reg.");
        AW.selectTypeofcheck();
        log.info("Select Type of check");
        AW.selectcustomerforRegAircraft();
        log.info("Select customer for Reg. Aircraft");
        AW.selectcustomerBBAM();
        log.info("Select customer for Reg. Aircraft as BBAM");
        AW.Selectstation();
        log.info("Select the station");
        Thread.sleep(2000);
        AW.clickonCochinstation();
        log.info("Select coachin as station");
        Thread.sleep(2000);
        AW.Selectstation();
        log.info("De select station");
        AW.clickonSearchbutton();
        log.info("Click on search button");
        
        Thread.sleep(5000);
        AW.clickonNumberingtypecolumn();
        log.info("Click on numbering type coloumn");
        Thread.sleep(2000);
        AW.clickonSelectNumberingtype();
        log.info("Select Numbering type as AWO-HSR");
       
        AW.clickoncheckbox();
        log.info("Click on Checkbox");
        Thread.sleep(2000);
        
    	AW.clickonAuthorizebutton();
    	log.info("Click on Authorize button");
    	  Thread.sleep(2000);
    	AW.clickonproceedbutton();
    	log.info("Click on proceedbutton");
    	  Thread.sleep(2000);
    	
       EW.clickonAcceptworkorder();
       log.info("Click on ok button");
       Thread.sleep(2000);
    	
    	 
    	
		
		
		
		
}
}
