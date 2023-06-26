package testpack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import pompack.ViewCloseWorkOrder;
import pompack.ViewCloseWorkOrderAMRO;

public class TC18_VerifyViewCloseWorkorderPreServerAMRO extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	private ViewCloseWorkOrder VCW;
	private ViewCloseWorkOrderAMRO VCWAMRO;
	@Test
	public void VerifyViewCloseWorkOrder() throws InterruptedException, IOException
	{
		
		EW = new Editworkorderpage(driver);
		AM = new Createworkorderpage(driver);
		NR = new NRC(driver);
		VCW = new ViewCloseWorkOrder(driver);
		VCWAMRO = new ViewCloseWorkOrderAMRO(driver);
		
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
		
		//Close work order started
		
		VCWAMRO.clickonTask();
		log.info("click on Task");
		
		List<String>allpageAddresses = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allpageAddresses.get(1));
        Thread.sleep(3000);
        
        
//		VCWAMRO.clickonActionTaken();
//		log.info("click on Action Taken");
//		
//		VCWAMRO.clickonEnterActionTaken();
//		log.info("click on Enter Action Taken");
//		VCWAMRO.clickonTechnician();
//		log.info("click on Technician");
//		VCWAMRO.SelectoneTechnician();
//		log.info("Select one Technician");
//		VCWAMRO.deSelectoneTechnician();
//		log.info("de Select one Technician");
//		
//		VCWAMRO.Enterstartdate();
//		log.info("Enter start date");
//		VCWAMRO.Enterstarttime();
//		log.info("Enter start time");
//		VCWAMRO.EnterEnddate();
//		log.info("Enter End date");
//		VCWAMRO.EnterEndtime();
//		log.info("Enter End time");
//		VCWAMRO.EnterActualmanhours();
//		log.info("Enter Actual man hours");
//		VCWAMRO.EnterElapsedmanhours();
//		log.info("Enter Elapsed man hours");
//		VCWAMRO.clickonNextActionReuired();
//		log.info("click on Next Action Reuired");
//		VCWAMRO.clickonFromselectAHName();
//		log.info("click on From select AH Name");
//		VCWAMRO.clickonFromselectoneAHName();
//		log.info("click on From select one AH Name");
//		VCWAMRO.clickonAddbutton();
//		log.info("click on Add button");
//		VCWAMRO.clickonokbutton();
//		log.info("click on ok button");
//		VCWAMRO.clickonclosebutton();
//		log.info("click on close button");
        
        
        
//		VCWAMRO.clickonUploaddoc();
//		log.info("click on Upload doc");
//		Thread.sleep(2000);
//		VCWAMRO.clickonTextdescription();
//		log.info("click on Text description");
//		Thread.sleep(2000);
//		VCWAMRO.clickonUploadFile();
//		log.info("click on Upload File");
//		Thread.sleep(2000);
//		VCWAMRO.clickonUploadbutton();
//		log.info("click on Upload button");
//		Thread.sleep(2000);
//		VCWAMRO.clickonokbutton();
//		log.info("click on ok button");
//		Thread.sleep(2000);
//		VCWAMRO.clickoncancelbutton();
//		log.info("click on cancel button");
//		Thread.sleep(2000);
		
		VCWAMRO.clickonAddRecord();
		log.info("click on Add Record");
		Thread.sleep(1000);
		VCWAMRO.clickonoffpartno();
		log.info("click on off part no");
		VCWAMRO.clickonOffpartnoSearchbutton();
		log.info("click on Off part no Search button");
		VCWAMRO.clickon1stOffpartno();
		log.info("click on 1st Off part no");
		VCWAMRO.clickonOkbuttonMatrial();
		log.info("click on ok button");
		Thread.sleep(10000);
		VCWAMRO.EnterOffserialNo();
		log.info("Enter Off serial No");
//		VCWAMRO.ClickonONpartNo();
//		log.info("Click on ON part No");
//		VCWAMRO.ClickonONSerialNo();
//		log.info("Click on ON Serial No");
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
		VCWAMRO.ClickonAddRecord2();
		log.info("Click on Add Record 2");
		VCWAMRO.ClickonToolpartNo();
		log.info("Click on Tool part No");
		VCWAMRO.EnterToolpartNo();
		log.info("Enter Tool part No");
		VCWAMRO.ClickonSearchbuttonTool();
		log.info("Click on Search button Tool");
		VCWAMRO.SelectoneTool();
		log.info("Select one Tool");
		VCWAMRO.ClickonOkbuttonTool();
		log.info("Click on Ok button Tool");
		VCWAMRO.SelectCalibrationduedate();
		log.info("Select Calibration due date");
		
		VCWAMRO.ClickonUpdatebutton();
		log.info("Click on Update button");
		
		VCWAMRO.ClickonOKbutton();
		log.info("Click on OK button");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
