package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;

public class TCCreateWorkOrderOnTestServer extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	    
	    @Test
	    public void CreateWorkOrder() throws InterruptedException 
	    {
	    	AM = new Createworkorderpage(driver);
	    	
	    	AM.clickonAMROButtonTest();
	    	log.info("click on AMRO button");
	        Thread.sleep(1000);
	    	
	    	AM.clickonPlanningButtonTest();
	    	log.info("click on Planning Button Test");
	        Thread.sleep(1000);
	    	
	    	AM.clickonWorkOrderdropdownTest();
	    	log.info("click on Work Order dropdown Test");
	        Thread.sleep(1000);
	    	
	    	AM.clickonCreateWorkOrderTest();
	    	log.info("clickonCreateWorkOrderTest");
	        Thread.sleep(1000);
	    	
	    	AM.clickonNumberingTypeTest();
	    	log.info("click on Numbering Type Test");
	        Thread.sleep(1000);
	        
	    	AM.clickonselectNumberingTypeTest();
	    	log.info("click on select Numbering Type Test");
	        Thread.sleep(1000);
	    	
	        AM.clickonAircraftRegntest();
	        log.info("click on Aircraft Regn");
	        Thread.sleep(1000);
	        
	        AM.clickononeAircraftRegntest();
	        log.info("Select one Aircraft Regn");
	        Thread.sleep(1000);
	        
//	       Assert.assertFalse(AM.validateAircraftModel());
	    	
	    	
	        AM.clickonEnginetest();
	        log.info("click on Engine test");
	        Thread.sleep(1000);
	        
	        AM.clickononeengine();
	        log.info("click on one Engine test");
	        Thread.sleep(1000);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
}
