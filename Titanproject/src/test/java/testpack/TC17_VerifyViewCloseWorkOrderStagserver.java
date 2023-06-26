package testpack;

import java.io.IOException;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import pompack.ViewCloseWorkOrder;
import utilpack.Utilityclass;

public class TC17_VerifyViewCloseWorkOrderStagserver extends TestBaseClassStagServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	private ViewCloseWorkOrder VCW;
	@Test
	
	public void ViewCloseWorkOrder() throws InterruptedException, IOException
	{
		EW = new Editworkorderpage(driver);
		AM = new Createworkorderpage(driver);
		NR = new NRC(driver);
		VCW = new ViewCloseWorkOrder(driver);
		
		
		VCW.clickonGAMRObutton();
		log.info("click on GAMRO button");
		Thread.sleep(1000);
		NR.clickonBasemaintenance();
		log.info("click on Base Maintenance dropdown");
		Thread.sleep(1000);
		VCW.clickonRoutinedropdown();
		log.info("click on Routine dropdown");
		Thread.sleep(1000);
		VCW.clickonViewcloseworkorderstag();
		log.info("click on View close work order stag");
		Thread.sleep(1000);
		VCW.clickonAircraftRegnStag();
		log.info("click on Aircraft Regn Stag");
		Thread.sleep(1000);
		VCW.clickonSearchTextStag();
		log.info("click on Search Text Stag");
		Thread.sleep(1000);
		VCW.SelectonAircraftRegnStag();
		log.info("Select on Aircraft Regn Stag");
		Thread.sleep(1000);
		VCW.clickonSelectworkorderstag();
		log.info("click on Select work order stag");
		Thread.sleep(1000);
		VCW.clickonWorkorderSearchTextStag();
		log.info("click on Work order Search Text Stag");
		Thread.sleep(1000);
		VCW.SelectoneworkorderStag();
		log.info("Select one work order Stag");
		Thread.sleep(1000);
        VCW.SelectworkorderstatusStag();
        log.info("Select work order status Stag");
		Thread.sleep(1000);
        VCW.SelectworkorderstatusopenStag();
        log.info("Select work order status open Stag");
		Thread.sleep(1000);
        VCW.ClickonSearchButton();
		log.info("Click on Search Button");
		Thread.sleep(1000);
		
		
		 Utilityclass.getScreenshot(driver, "SS for 11839 on Staging Server"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
