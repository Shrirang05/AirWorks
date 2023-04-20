package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;

public class TC11_VerifyCreateNRC extends Testbaseclass
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	@Test
	public void VerifycreateNRC() throws InterruptedException
	{
        NR = new NRC(driver);
		AM = new Createworkorderpage(driver);
		EW = new Editworkorderpage(driver);
		
		AM.clickonamrobutton();
		log.info("click on AMRO button");
		Thread.sleep(2000);
		NR.clickonBasemaintenance();
		log.info("click on AMRO button");
		NR.clickonNonRoutinebutton();
		log.info("click on Non Routine card Button");
		NR.clickonNRCbutton();
		log.info("click on NRC button");
		Thread.sleep(4000);
//		EW.selectcustomerforRegAircraft();
//	    log.info("select customer for Reg Aircraft");
//	    Thread.sleep(2000);
//	    EW.selectcustomerBBAM();
//	    log.info("select customer BBAM");
	    NR.clickonAircraftRegn();
	    log.info("Click on Aircraft Regn no.");
		Thread.sleep(4000);
	    NR.clickonselectAircraftRegn();
	    log.info("Select one Aircraft Regn no.");
		Thread.sleep(4000);
	    
	    
	    NR.validatepassingAircraftModel();
	    Assert.assertTrue (NR.validatepassingAircraftModel());
        log.info("Validate Aircraft Model is Boeing 737-800");
    	Thread.sleep(2000);
        NR.validateCustomerName();
        Assert.assertTrue (NR.validateCustomerName());
        log.info("Validate Customer Name BBAM Aviation services");
    	Thread.sleep(2000);
	    
	    
	    
		
		
		
		
	}
	
	
	
}
