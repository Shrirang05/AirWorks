package testpack;

import java.io.IOException;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import pompack.ViewCloseWorkOrder;
import utilpack.Utilityclass;

public class TC15_VerifyViewCloseWorkOrderPreServer extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	private ViewCloseWorkOrder VCW;
	@Test
	public void VerifyViewCloseWorkOrder() throws InterruptedException, IOException
	{
		
		EW = new Editworkorderpage(driver);
		AM = new Createworkorderpage(driver);
		NR = new NRC(driver);
		VCW = new ViewCloseWorkOrder(driver);
		
		
		VCW.clickonGAMRObuttonpretitan();
		log.info("click on GAMRO button");
		Thread.sleep(1000);
		NR.clickonBasemaintenance();
		log.info("click on Base Maintenance dropdown");
		Thread.sleep(1000);
		VCW.clickonRoutinedropdown();
		log.info("Click on Routine dropdown");
		Thread.sleep(1000);
	    VCW.clickonViewCloseworkorder();
	    log.info("Click on View/close work order");
	    Thread.sleep(1000);
	    VCW.clickonAircraftReg();
	    log.info("Click on AircraftReg");
	    Thread.sleep(1000);
	   VCW.clickonAircraftRegsearchbox();
	   log.info("click on Aircraft Reg search box");
	   Thread.sleep(1000);
	   VCW.clickononeAircraftRegn();
	   log.info("click on one Aircraft Regn");
	   Thread.sleep(1000);
	   VCW.clickonselectworkorder();
	   log.info("click on select work order");
	   Thread.sleep(1000);
	   VCW.clickonselectworkordercheckbox();
	   log.info("click on select work order check box");
	   Thread.sleep(1000);
	   VCW.clickonselectoneworkorder();
	   log.info("click on select one work order");
	   Thread.sleep(1000);
	      
	   VCW.clickonstatus();
	   log.info("Click on status");
	   Thread.sleep(1000);
	   VCW.clickonpendingesignstatus();
	   log.info("Click on pending esign status");
	   Thread.sleep(1000);
	   VCW.clickonATA();
	   log.info("Click on ATA");
	   Thread.sleep(1000);
	   VCW.clickonATA25();
	   log.info("Click on ATA 25");
	   Thread.sleep(1000);
	   
	   VCW.clickonLocation();
	   log.info("click on Location");
	   Thread.sleep(1000);
	   
	   VCW.clickonLocationsearchbox();
	   log.info("click on Location search box");
	   Thread.sleep(1000);
	   
	   VCW.clickonselectLocation();
	   log.info("click on select Location");
	   Thread.sleep(1000);
	      
	   VCW.ClickonSearchButton();
		log.info("Click on Search Button");
		Thread.sleep(5000);
	   
		 Utilityclass.getScreenshot(driver, "SS for 11839 on pre-titan"); 
	
	
	}
}
