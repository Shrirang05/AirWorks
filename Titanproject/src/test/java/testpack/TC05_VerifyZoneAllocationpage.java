package testpack;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.PccZoneAllocation;

public class TC05_VerifyZoneAllocationpage extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private PccZoneAllocation PC;
	@Test
	public void VerifyZoneAllocationpage() throws InterruptedException, IOException
	{
		AM = new Createworkorderpage(driver);
		PC = new PccZoneAllocation(driver);
		
		
		AM.clickonamrobutton();
		log.info("click on AMRO button");
		Thread.sleep(2000);
		PC.clickonPCC();
		log.info("click on PCC");
		Thread.sleep(2000);
		PC.clickonBasecheck();
		log.info("click on Basecheck");
		Thread.sleep(2000);
		PC.clickonZoneAllocation();
		log.info("click on ZoneAllocation");
		Thread.sleep(2000);
		PC.clickonAircraftRegn();
		log.info("click on AircraftRegn");
		Thread.sleep(2000);
		PC.clickonBTTB();
		log.info("click on BTTM");
		Thread.sleep(2000);
		PC.checktheModel();
		log.info("check the Model");
		Thread.sleep(2000);
		
//		boolean validation = PC.checktheModel();
//		System.out.println(validation);
//		Assert.assertTrue(validation);
//		
		
		PC.selectworkorder();
		log.info("check the Model");
		Thread.sleep(2000);
		PC.selectoneworkorder();
		log.info("select one work order");
		Thread.sleep(2000);
		PC.clickonSearchbutton();
		log.info("click on Search button");
		Thread.sleep(2000);
		PC.clickonFirstrow();
		log.info("click on First row");
		Thread.sleep(2000);
		PC.clickonAMEMagnifier();
		log.info("click on AME Magnifier glass");
		Thread.sleep(2000);
		PC.clickonAME();
		log.info("click on AME");
		Thread.sleep(2000);
		PC.clickononeAME();
		log.info("Select one AME");
		Thread.sleep(2000);
		PC.clickondeselectAME();
		log.info("Deselect AME");
		Thread.sleep(2000);
		
		PC.clickoncloseAME();
		log.info("Click on close AME");
		Thread.sleep(2000);
		PC.clickonTechnicianmagnifier();
		log.info("Click on Technician Magnifier glass");
		Thread.sleep(2000);
		PC. clickonTechnician();
		log.info("Select one Technician");
		Thread.sleep(2000);
		PC.clickononeTechnician();
		log.info("Select on one Technician from the list");
		Thread.sleep(2000);
		PC.clickondeselectTechnician();
		log.info("Click once again to deselect the Technician");
		Thread.sleep(2000);
		PC.clickonTechclosebutton();
		log.info("Click on Tech close button");
		
		PC.clickonAircraftcoordinator();
		log.info("Click on Aircraft co-ordinator");
		
		PC.clickononeAircraftcoordinator();
		log.info("click on one Aircraft co-ordinator");
		Thread.sleep(2000);
		PC.clickonArrivaldate();
		log.info("click on one Arrival date");
		Thread.sleep(2000);
		PC.clickonstartdate();
		log.info("click on start date");
		Thread.sleep(2000);
		PC.clickonTargetdate();
		log.info("click on Target date");
		Thread.sleep(2000);
		PC.clickonAOGcutoffdate();
		log.info("click on AOGcutoff date");
		Thread.sleep(2000);
		PC.passingAOGcutofftime();
		log.info("click on passing AOGcutoff time");
		Thread.sleep(2000);
		PC.clickonRTSdate();
		log.info("click on RTS date");
		Thread.sleep(2000);
		PC. passingRTStime();
		log.info("Passing RTS time");
		Thread.sleep(2000);
		PC.clickonpcccheckspoc();
		log.info("click on pcc check spoc");
		Thread.sleep(2000);
		PC.clickonepcccheckspoc();
		log.info("Select one pcc check spoc");
		Thread.sleep(2000);
		PC.clickonMaintainancecheckspoc();
		log.info("click on Maintainance check spoc");
		Thread.sleep(2000);
		PC.clickonpickonemaintainancecheckspoc();
		log.info("Select one maintainance check spoc");
		Thread.sleep(2000);
		PC.clickonSubmitbutton();
		log.info("click on Submit button");
		Thread.sleep(4000);
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
	}
}
