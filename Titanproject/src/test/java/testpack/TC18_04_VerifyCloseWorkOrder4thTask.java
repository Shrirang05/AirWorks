package testpack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pompack.NRC;
import pompack.ViewCloseWorkOrderAMRO;
import pompack.ViewCloseWorkOrderAMRO2;
import pompack.ViewCloseWorkOrderAMRO3;
import pompack.ViewCloseWorkOrderAMRO4;
import utilpack.RobotClass;

public class TC18_04_VerifyCloseWorkOrder4thTask extends TestBaseClassPreServer
{
	private ViewCloseWorkOrderAMRO VCWAMRO;
	private ViewCloseWorkOrderAMRO2 VCWAMRO2;
	private ViewCloseWorkOrderAMRO3 VCWAMRO3;
	private NRC NR;
	private RobotClass RC;
	private ViewCloseWorkOrderAMRO4 VCWAMRO4;
	
	
	@Test
	public void VerifyViewCloseWorkOrder() throws InterruptedException
	{
		VCWAMRO = new ViewCloseWorkOrderAMRO(driver);
		VCWAMRO2 = new ViewCloseWorkOrderAMRO2(driver);
		VCWAMRO3 = new ViewCloseWorkOrderAMRO3(driver);
		NR = new NRC(driver);
		RC = new RobotClass(driver);
		VCWAMRO4 = new ViewCloseWorkOrderAMRO4(driver);
		
		
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
		Thread.sleep(2000);
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
	
		//Close work order started
	
	VCWAMRO4.clickonTask();
	log.info("click on 3rd Task");
	
	List<String>allpageAddresses = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(allpageAddresses.get(1));
    Thread.sleep(3000);
    
    //Action Taken started
    
//	VCWAMRO.clickonActionTaken();
//	log.info("click on Action Taken");
//	VCWAMRO.clickonEnterActionTaken();
//	log.info("click on Enter Action Taken");
//	VCWAMRO.clickonTechnician();
//	log.info("click on Technician");
//	VCWAMRO.SelectoneTechnician();
//	log.info("Select one Technician");
//	VCWAMRO.deSelectoneTechnician();
//	log.info("de Select one Technician");
//	VCWAMRO.Enterstartdate();
//	log.info("Enter start date");
//	VCWAMRO.Enterstarttime();
//	log.info("Enter start time");
//	VCWAMRO.EnterEnddate();
//	log.info("Enter End date");
//	VCWAMRO.EnterEndtime();
//	log.info("Enter End time");
//	VCWAMRO.EnterActualmanhours();
//	log.info("Enter Actual man hours");
//	VCWAMRO.EnterElapsedmanhours();
//	log.info("Enter Elapsed man hours");
//	VCWAMRO.clickonNextActionReuired();
//	log.info("click on Next Action Reuired");
//	VCWAMRO.clickonFromselectAHName();
//	log.info("click on From select AH Name");
//	VCWAMRO.clickonFromselectoneAHName();
//	log.info("click on From select one AH Name");
//	VCWAMRO.clickonAddbutton();
//	log.info("click on Add button");
//	VCWAMRO.clickonokbutton();
//	log.info("click on ok button");
//	VCWAMRO.clickonclosebutton();
//	log.info("click on close button");
	
    VCWAMRO4.ClickonToolsIndetails();
    
	//Materials Grid started
	
	VCWAMRO.clickonAddRecord();
	log.info("click on Add Record");
	Thread.sleep(1000);
	VCWAMRO.clickonoffpartno();
	log.info("click on off part no");
	VCWAMRO.clickonOffpartnoSearchbutton();
	log.info("click on Off part no Search button");
	Thread.sleep(2000);
	VCWAMRO.clickon1stOffpartno();
	log.info("click on 1st Off part no");
	VCWAMRO.clickonOkbuttonMatrial();
	log.info("click on ok button");
	Thread.sleep(10000);
	VCWAMRO.EnterOffserialNo();
	log.info("Enter Off serial No");
//	VCWAMRO.ClickonONpartNo();
//	log.info("Click on ON part No");
//	VCWAMRO.ClickonONSerialNo();
//	log.info("Click on ON Serial No");
	VCWAMRO.ClickonIPCReferance();
	log.info("Click on IPC Referance");
	VCWAMRO.ClickonPOC();
	log.info("Click on POC");
	VCWAMRO.ClickonReqqty();
	log.info("Click on Req qty");
	VCWAMRO.ClickonBatchRelnote();
	log.info("Click on Batch Rel note");
	VCWAMRO.ClickonUsedqty();
	log.info("Click on Used qty");
	Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");	
	Thread.sleep(2000);
	

	
	js.executeScript("document.querySelector(\"div[id$='grid_gridMatDtls_records']\").scrollLeft=1000");
	Thread.sleep(2000);
	
	
	
	//Mi no started
	
	VCWAMRO4.ClickonMaterialIssueNo();
	log.info("Click on Material Issue No");
	Thread.sleep(2000);
	VCWAMRO4.ClickonMISearchbutton();
	log.info("Click on MI Search button");
	Thread.sleep(2000);
	VCWAMRO4.Selectpartcheckbox();
	log.info("Select part checkbox");
	
	VCWAMRO4.Addbuttonforpart();
	log.info("Add button for part");
	
	//Tools In grids started
	VCWAMRO.ClickonAddRecord2();
	log.info("Click on Add Record 2");
	VCWAMRO.ClickonToolpartNo();
	log.info("Click on Tool part No");
	Thread.sleep(1000);
	VCWAMRO.EnterToolpartNo();
	log.info("Enter Tool part No");
	Thread.sleep(1000);
	VCWAMRO.ClickonSearchbuttonTool();
	log.info("Click on Search button Tool");
	VCWAMRO.SelectoneTool();
	log.info("Select one Tool");
	VCWAMRO.ClickonOkbuttonTool();
	log.info("Click on Ok button Tool");
	VCWAMRO.SelectCalibrationduedate();
	log.info("Select Calibration due date");
	
//	VCWAMRO.ClickonUpdatebutton();
//	log.info("Click on Update button");
//	VCWAMRO.ClickonOKbutton();
//	log.info("Click on OK button");
//		
		
		
		
		
		
		
		
		
				
	}
	
	
	
}
