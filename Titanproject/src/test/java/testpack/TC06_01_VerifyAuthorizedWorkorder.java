package testpack;

import org.testng.annotations.Test;

import pompack.AuthorizeWorkOrder;
import pompack.Createworkorderpage;
import pompack.PccTaskAllocation;
import pompack.PccZoneAllocation;

public class TC06_01_VerifyAuthorizedWorkorder extends Testbaseclass
{
	private Createworkorderpage AM;
	private PccZoneAllocation PC;
	private PccTaskAllocation PT;
	private AuthorizeWorkOrder AW;
	
	@Test
	
	public void VerifyAuthorizedWorkorder() throws InterruptedException
	{
		AM = new Createworkorderpage(driver);
		PC = new PccZoneAllocation(driver);
		PT = new PccTaskAllocation(driver);
		AW = new AuthorizeWorkOrder(driver);
		
		AM.clickonamrobutton();
	    log.info("Click on AMRO button");
		Thread.sleep(2000);
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
        AW.clickonCochinstation();
        log.info("Select coachin as station");
        AW.clickonSearchbutton();
        log.info("Click on search button");
        Thread.sleep(2000);
        
		
		
		
		
}
}
