package testpack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import utilpack.Utilityclass;

public class TC11_VerifyCreateNRC extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	@Test
	public void VerifycreateNRC() throws InterruptedException, IOException
	{
        NR = new NRC(driver);
		AM = new Createworkorderpage(driver);
		EW = new Editworkorderpage(driver);
		
		AM.clickonamrobutton();
		log.info("click on AMRO button");
		Thread.sleep(1000);
		NR.clickonBasemaintenance();
		log.info("click on Base Maintenance dropdown");
		NR.clickonNonRoutinebutton();
		log.info("click on Non Routine card dropdown");
		NR.clickonNRCbutton();
		log.info("click on create NRC button");
		Thread.sleep(1000);
//		EW.selectcustomerforRegAircraft();
//	    log.info("select customer for Reg Aircraft");
//	    Thread.sleep(2000);
//	    EW.selectcustomerBBAM();
//	    log.info("select customer BBAM");
	    NR.clickonAircraftRegn();
	    log.info("Click on Aircraft Regn no.");
		Thread.sleep(1000);
	    NR.clickonselectAircraftRegn();
	    log.info("Select one Aircraft Regn no.");
		Thread.sleep(1000);
	    
	    
	    NR.validatepassingAircraftModel();
	    
	    String ExpectedText = "BOEING 737-800";
		String ActualText = NR.validatepassingAircraftModel();
	    Assert.assertEquals(ActualText,ExpectedText);
	    
	    
//	    Assert.assertTrue (NR.validatepassingAircraftModel());
        log.info("Validate Aircraft Model is Boeing 737-800");
    	Thread.sleep(1000);
       
    	NR.validateCustomerName();
        Assert.assertTrue(NR.validateCustomerName());
        log.info("Validate Customer Name BBAM Aviation services");
    	Thread.sleep(1000);
	    
    	NR.validateAuthorityofCertification();
    	Assert.assertFalse(NR.validateAuthorityofCertification());
    	log.info("Validate Authority of Certification");
    	
    	
    	
    	NR.clickonvisitpackages();
    	log.info("Click on visit packages");
    	Thread.sleep(1000);
    	
//    	NR.selectoneworkorder();
//    	log.info("Select one work order");
//    	Thread.sleep(1000);
   	
    	NR.selectvisitpackage();
    	log.info("select visit package");
    	Thread.sleep(1000);
    	
    	NR.clickonfindingfromtask();
    	log.info("Click on finding from task");
    	Thread.sleep(1000);
    	
    	NR.clickonselecttask();
    	log.info("Select the task from finding");
    	Thread.sleep(1000);
    	
    	NR.clickonATA();
    	log.info("Click on ATA");
    	Thread.sleep(1000);
    	
    	NR.clickononeATA();
    	log.info("Select one ATA");
    	Thread.sleep(1000);
    	
    	NR.clickonsubATA();
    	log.info("Click on subATA");
    	Thread.sleep(1000);
    	
    	NR.clickononesubATA();
    	log.info("Click on one subATA");
    	Thread.sleep(1000);
    	
    	NR.clickonZoneorTrade();
    	log.info("Click on Zone or Trade");
    	Thread.sleep(1000);
    	
    	NR.Selectonezone();
    	log.info("Select one zone");
    	Thread.sleep(1000);
    	
    	NR.SelectNRCdate();
    	log.info("Select NRC date");
    	Thread.sleep(2000);
    	
    	NR.SelectNRCtime();
    	log.info("Select NRC time");
    	Thread.sleep(1000);
    	
    	NR.clickonTradetoaction();
    	log.info("Click on trade to action");
    	Thread.sleep(1000);
    	
    	NR.selectoneTradetoaction();
    	log.info("Select one Trade to action");
    	Thread.sleep(1000);
    	
    	NR.clickonduplicateinsprequired();
    	log.info("Click on duplicate insp required");
    	Thread.sleep(1000);
    	
    	NR.clickonduplicateinsprequiredNo();
    	log.info("click on duplicate insp required No");
    	Thread.sleep(1000);
    	
//    	NR.clickonEstimatedmanhours();
//    	log.info("click on Estimated man hours");
    	
    	NR.Enterdefectordamage();
    	log.info("Enter defect or damage");
    	Thread.sleep(1000);
    	NR.ClickonAddrecordbutton();
    	log.info("Click on Add record button");
    	Thread.sleep(1000);
    	NR.ClickonOffpartMagnifierglass();
    	log.info("Click on Off part Magnifier glass");
    	Thread.sleep(1000);
    	NR.ClickonSearchbutton();
    	log.info("Click on Search button");
    	Thread.sleep(2000);
    	NR.Selectfirstpartcheckbox();
    	log.info("Select first part checkbox");
    	Thread.sleep(2000);
    	Thread.sleep(1000);
//    	NR.Selectsecondpartcheckbox();
//    	log.info("Select second part checkbox");
//    	Thread.sleep(1000);
    	NR.Clickonokbutton();
    	log.info("Click on ok button");
    	Thread.sleep(1000);
    	
    	NR.ClickonOffserialNo();
    	log.info("Click on Off serial No");
    	Thread.sleep(3000);
    	NR.ClickonOffserialNocoloumn();
    	log.info("Click on Off serial No coloumn");
    	Thread.sleep(3000);
    	
    	NR.ClickonOnpartNomagnifierglass();
    	log.info("Click on On part No magnifier glass");
    	Thread.sleep(1000);
    	
    	
    	NR.ClickonSearchbutton();
    	log.info("Click on Search button");
    	Thread.sleep(1000);
    	NR.Selectfirstpartcheckbox();
    	log.info("Select first part checkbox");
    	Thread.sleep(1000);
//    	NR.Selectsecondpartcheckbox();
//    	log.info("Select second part checkbox");
//    	Thread.sleep(1000);
    	NR.Clickonokbutton();
    	log.info("Click on ok button");
    	Thread.sleep(2000);
//    	NR.ClickonOnpartNomagnifierglass();
//    	log.info("Click on On part No. magnifier glass");
//    	Thread.sleep(1000);
    	
    	NR.ClickonOnparttype();
    	log.info("Click on On part type");
    	Thread.sleep(1000);
    	
    	NR.selectOnparttypeExpandable();
    	log.info("Click on On part type as Expandable");
    	Thread.sleep(1000);
    	
    	NR.EnterAlternatepartNo();
    	log.info("Enter Alternate part No");
    	Thread.sleep(1000);
    	
    	NR.EnterONserialNo();
    	log.info("Enter ON serial No");
    	Thread.sleep(1000);
    	
    	
    	
    	NR.ClickonIPCREference();
    	log.info("Click on IPC REference");
    	Thread.sleep(2000);
   	
    	NR.ClickonIPCREferencegrid();
    	log.info("Click on IPC REference grid");
    	Thread.sleep(2000);
    	
    	NR.ClickonIPCREferencegridtext();
    	log.info("Click on IPC REference grid text");
    	Thread.sleep(2000);
    	
    	NR.ClickonReqQty();
    	log.info("Click on Req Qty");
    	Thread.sleep(2000);
    	
    	NR.EnterMaterialNeeddate();
    	log.info("Enter Material Need date");
    	Thread.sleep(2000);
    	
    	NR.EnterBatchorRelNote();
    	log.info("Enter Batch or Rel Note");
    	
    	NR.EnterusedQuantity();
    	log.info("Enter used Qty");
    	Thread.sleep(2000);
    	
    	NR.EnterusedQuantitycoloumn();
    	log.info("Enter used Qty coloumn");
    	Thread.sleep(2000);
    	
        NR.EnterEstimetedmanhours();
        log.info("Enter Estimated man hours");
        Thread.sleep(2000);
        
		NR.clickonAddrecordsToolIn();
		log.info("Click on Add records Tool In");
		Thread.sleep(2000);
		  
		NR.ClickonToolpartNomagnifierglass();
		log.info("Click on Toolpart No. magnifier glass");
		Thread.sleep(2000);
		
		NR.EnterpartNo();
		log.info("Enter Part No");
		Thread.sleep(2000);
		
		NR.ClickonToolSearchbutton();
    	log.info("Click on Tool Search button");
    	Thread.sleep(1000);
		
    	NR.Clickoncheckboxfortool();
    	log.info("Click on checkbox of tool");
    	Thread.sleep(1000);
    	
    	NR.Clickonokbutton();
    	log.info("Click on ok button");
    	Thread.sleep(2000);
    	
    	NR.ClickonToolpartgrid();
    	log.info("Click on Tool part grid");
    	
    	NR.ClickonToolserialNo();
    	log.info("Click on Tool serial No");
    	Thread.sleep(2000);
    	
    	NR.EnterCalibrationdate();
    	log.info("Enter calibration date");
    	Thread.sleep(2000);
    	
    	NR.EnterNeeddate();
    	log.info("Enter Need date");
    	Thread.sleep(2000);
    	
    	Utilityclass.getScreenshot(driver, "SS for Create NRC 1"); 
    	
    	NR.ClickonCreatebutton();
    	log.info("Click on Create Button");
    	Thread.sleep(10000);
    	
    	NR.ClickonProceedbutton();
    	log.info("Click on Proceed button");
    	Thread.sleep(10000);
    	
//    	NR.checkforAircraftregdis();
//    	Assert.assertFalse();
    	
        Utilityclass.getScreenshot(driver, "SS for Create NRC 2"); 
        
//        NR.clickonfindingfromtask();
//        log.info("Click on Finding from task");
//    	Thread.sleep(2000);
//        
//        NR.clickonAddtaskasfindingfromtask();
//        log.info("Click on Add task from finding task");
//    	Thread.sleep(2000);
//        
//        NR.clickonEstimatedmanhoursforupdate();
//        log.info("Enter Estimeted man hours for update");
//    	Thread.sleep(2000);
//        
//        NR.clickonAddactiontaken();
//        log.info("Click on Add action taken");
//    	Thread.sleep(2000);
//        
//        NR.EnterActiontaken();
//        log.info("Enter Action Taken");
//    	Thread.sleep(2000);
//    	
//        NR.ClickonTechnician();
//        log.info("Click on Technician");
//    	Thread.sleep(2000);
//        
//        NR.SelectoneTechnician();
//        log.info("Select one Technician");
//    	Thread.sleep(2000);
//        
//        NR.Enterstartdate();
//        log.info("Enter start date");
//    	Thread.sleep(2000);
//        
//        NR.Enterstarttime();
//        log.info("Enter start time");
//    	Thread.sleep(2000);
//        
//        NR.EnterEnddate();
//        log.info("Enter End date");
//    	Thread.sleep(2000);
//        
//        NR.EnterEndtime();
//        log.info("Enter End time");
//    	Thread.sleep(2000);
//        
//        NR.EnterActualmanhours();
//        log.info("Enter actual man hours");
//    	Thread.sleep(2000);
//        
//        NR.EnterElapsedmanhours();
//        log.info("Enter Elapsed man hours");
//    	Thread.sleep(2000);
//        
//        NR.clickonNextActionReuired();
//        log.info("Click on Next Action required");
//    	Thread.sleep(2000);
//        
//        NR.clickonFromselectAHName();
//        log.info("Click on From select AH Name");
//    	Thread.sleep(2000);
//        
//        NR.clickonFromselectoneAHName();
//        log.info("Click on From select one AH Name");
//    	Thread.sleep(2000);
//        
//        NR.clickonAddbutton();
//        log.info("Click on Add button");
//    	Thread.sleep(2000);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}
	
	
	
}
