package testpack;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.PccZoneAllocation;

public class TC05_VerifyZoneAllocationpage extends Testbaseclass
{
	private Createworkorderpage AM;
	private PccZoneAllocation PC;
	@Test
	public void VerifyZoneAllocationpage() throws InterruptedException
	{
		AM = new Createworkorderpage(driver);
		PC = new PccZoneAllocation(driver);
		
		
		AM.clickonamrobutton();
		Thread.sleep(2000);
		PC.clickonPCC();
		Thread.sleep(2000);
		PC.clickonBasecheck();
		Thread.sleep(2000);
		PC.clickonZoneAllocation();
		Thread.sleep(2000);
		PC.clickonAircraftRegn();
		Thread.sleep(2000);
		PC.clickonBTTB();
		Thread.sleep(2000);
		PC.checktheModel();
		Thread.sleep(2000);
		
//		boolean validation = PC.checktheModel();
//		System.out.println(validation);
//		Assert.assertTrue(validation);
//		
		
		PC.selectworkorder();
		Thread.sleep(2000);
		PC.selectoneworkorder();
		Thread.sleep(2000);
		PC.clickonSearchbutton();
		Thread.sleep(2000);
		PC.clickonFirstrow();
		Thread.sleep(2000);
		PC.clickonAMEMagnifier();
		Thread.sleep(2000);
		PC.clickonAME();
		Thread.sleep(2000);
		PC.clickononeAME();
		Thread.sleep(2000);
		PC.clickondeselectAME();
		Thread.sleep(2000);
		
		PC.clickoncloseAME();
		Thread.sleep(2000);
		PC.clickonTechnicianmagnifier();
		Thread.sleep(2000);
		PC. clickonTechnician();
		Thread.sleep(2000);
		PC.clickononeTechnician();
		Thread.sleep(2000);
		PC.clickondeselectTechnician();
		Thread.sleep(2000);
		PC.clickonTechclosebutton();
		
		PC.clickonAircraftcoordinator();
		
		PC.clickononeAircraftcoordinator();
		Thread.sleep(2000);
		PC.clickonArrivaldate();
		Thread.sleep(2000);
		PC.clickonstartdate();
		Thread.sleep(2000);
		PC.clickonTargetdate();
		Thread.sleep(2000);
		PC.clickonAOGcutoffdate();
		Thread.sleep(2000);
		PC.passingAOGcutofftime();
		Thread.sleep(2000);
		PC.clickonRTSdate();
		Thread.sleep(2000);
		PC. passingRTStime();
		Thread.sleep(2000);
		PC. clickonpcccheckspoc();
		Thread.sleep(2000);
		PC.clickonepcccheckspoc();
		Thread.sleep(2000);
		PC.clickonMaintainancecheckspoc();
		Thread.sleep(2000);
		PC.clickonpickonemaintainancecheckspoc();
		Thread.sleep(2000);
		PC.clickonSubmitbutton();
		Thread.sleep(4000);
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(3000);
		
	}
}
