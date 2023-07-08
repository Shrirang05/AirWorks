package testpack;

import java.io.IOException;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import pompack.ViewCloseWorkOrder;
import utilpack.Utilityclass;

public class TC16_VerifyViewCloseWorkOrderonTestserver extends TestBaseClassPreServer
{

	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	private ViewCloseWorkOrder VCW;
	@Test
	public void ViewCloseWorkOrderonTestserver() throws InterruptedException, IOException
	{
		
		EW = new Editworkorderpage(driver);
		AM = new Createworkorderpage(driver);
		NR = new NRC(driver);
		VCW = new ViewCloseWorkOrder(driver);
		
		AM.clickonamrobutton();
		log.info("click on AMRO button");
		Thread.sleep(1000);
		NR.clickonBasemaintenance();
		log.info("click on Base Maintenance dropdown");
		Thread.sleep(1000);
		VCW.clickonRoutinedropdown();
		log.info("Click on Routine dropdown");
		Thread.sleep(1000);
		VCW.clickonViewCloseworkorderTest();
		log.info("Click on View Close work order");
		Thread.sleep(1000);
		VCW.clickonAircraftRegnTest();
		log.info("click on Aircraft Regn");
		Thread.sleep(1000);
		VCW.clickonAircraftserchest();
		log.info("Enter Aircraft reg into search Box");
		Thread.sleep(1000);
		VCW.clickonAircraftVTTest();
		log.info("click on Aircraft VT");
		Thread.sleep(1000);
		VCW.clickonVisitPackageTest();
		log.info("click on Visit Package");
		Thread.sleep(1000);
		VCW.SelectonevisitpackagesearchTest();
		log.info("Select one visit package search");
		Thread.sleep(1000);
		VCW.SelectonevisitpackageTest();
		log.info("Select one visit package");
		Thread.sleep(1000);
		VCW.clickonStatusTest();
		log.info("click on Status");
		Thread.sleep(1000);
		VCW.clickonOpenStatusTest();
		log.info("click on Closed Status");
		Thread.sleep(1000);
		
		VCW.clickonClosedBy();
		log.info("click on Closed By");
		Thread.sleep(1000);
		VCW.EnterClosedBysearch();
		log.info("Enter closed BY into serachbox");
		Thread.sleep(1000);	
		VCW.SelectClosedByPerson();
		log.info("Select closed by person");
		Thread.sleep(1000);
		VCW.ClickonDuplicateINSP();
		log.info("Click on Duplicate INSP");
		Thread.sleep(1000);
		VCW.ClickonDuplicateINSPasNo();
		log.info("Click on Duplicate INSP as No");
		Thread.sleep(1000);
		VCW.ClickonCriticalTask();
		log.info("Click on Critical Task");
		Thread.sleep(1000);
		VCW.ClickonCriticalTaskNo();
		log.info("Click on Critical Task No");
		Thread.sleep(1000);
		VCW.ClickonLoaction();
		log.info("Click on Loaction");
		Thread.sleep(1000);
		VCW.ClickonLoactionMumbai();
		log.info("Click on Loaction Mumbai");
		Thread.sleep(1000);
		VCW.ClickonSearchButton();
		log.info("Click on Search Button");
		Thread.sleep(1000);
		
		
		
		
		
		
		
		 Utilityclass.getScreenshot(driver, "SS for 11839"); 
	
	}
	
}
