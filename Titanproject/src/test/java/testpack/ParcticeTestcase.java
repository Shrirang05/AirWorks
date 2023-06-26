package testpack;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import pompack.ViewCloseWorkOrder;
import pompack.ViewCloseWorkOrderAMRO;
import pompack.ViewCloseWorkOrderAMRO2;
import utilpack.RobotClass;

public class ParcticeTestcase extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	private ViewCloseWorkOrder VCW;
	private ViewCloseWorkOrderAMRO VCWAMRO;
	private ViewCloseWorkOrderAMRO2 VCWAMRO2;
	private RobotClass RC;
	
	@Test
    public void VerifyViewCloseWorkOrder() throws InterruptedException, AWTException 
	
	{
		EW = new Editworkorderpage(driver);
		AM = new Createworkorderpage(driver);
		NR = new NRC(driver);
		VCW = new ViewCloseWorkOrder(driver);
		VCWAMRO = new ViewCloseWorkOrderAMRO(driver);
		VCWAMRO2 = new ViewCloseWorkOrderAMRO2(driver);
	    RC = new RobotClass(driver);
		

		VCWAMRO.clickonAMRObuttonpretitan();
		log.info("click on AMRO button pretitan");
		NR.clickonBasemaintenance();
		log.info("click on Base maintenance");
		VCWAMRO.clickonRoutinedropdown();
		log.info("click on Routine dropdown");
		VCWAMRO.clickonViewCloseworkorder();
		log.info("click on View Close Work order");
		VCWAMRO.clickonAircraftReg();
		log.info("click on Aircraft Reg");
		VCWAMRO.clickonAircraftRegsearchbox();
		log.info("click on Aircraft Reg search box");
		VCWAMRO.clickononeAircraftRegn();
		log.info("click on one Aircraft Regn");
		VCWAMRO.clickonselectworkorder();
		log.info("click on select work order");
		VCWAMRO.clickonselectworkordercheckbox();
		log.info("click on select work order checkbox");
		VCWAMRO.clickonselectoneworkorder();
		log.info("Select one work order");
		VCWAMRO.clickonstatus();
		log.info("click on status");
		VCWAMRO.clickonpendingesignstatus();
		log.info("click on pending esign status");
		VCWAMRO.clickonIssuedTo();
		log.info("click on Issued To");
		VCWAMRO.clickonSearchbox();
		log.info("click on Search box");
		VCWAMRO.clickonIssuedToEmployee();
		log.info("click on Issued To Employee");
		VCWAMRO.clickonLocation();
		log.info("click on Location");
		VCWAMRO.clickonCoachinLocation();
		log.info("click on Coachin Location");
		VCWAMRO.clickonSearchbutton();
		log.info("click on Search button");
		
		VCWAMRO2.clickonTask();
		log.info("click on Task");
		
		List<String>allpageAddresses = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(allpageAddresses.get(1));
	    Thread.sleep(3000);
	    
	    VCWAMRO.clickonAddRecord();
		log.info("click on Add Record");
		Thread.sleep(1000);
	   
		VCWAMRO2.ClickonImportfromExcel();
		log.info("Click on Import From Excel");
		Thread.sleep(3000);
		
		RC.ImportFromExcel("TestMaterial");
		log.info("Import From Excel");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
