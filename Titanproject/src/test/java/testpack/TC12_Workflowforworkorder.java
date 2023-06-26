package testpack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompack.AuthorizeWorkOrder;
import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.PccTaskAllocation;
import pompack.PccZoneAllocation;
import utilpack.Utilityclass;

public class TC12_Workflowforworkorder extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private PccZoneAllocation PC;
	private PccTaskAllocation PT;
	private AuthorizeWorkOrder AW;
	
	private SoftAssert SA; 
	
	
	@Test
	public void verifyWorkflowforworkorder() throws InterruptedException, IOException
	{
		AM = new Createworkorderpage(driver);
		EW = new Editworkorderpage(driver);
		PC = new PccZoneAllocation(driver);
		PT = new PccTaskAllocation(driver);
		AW = new AuthorizeWorkOrder(driver);
		SA = new SoftAssert();
		
		
		
		AM.clickonamrobutton();
        log.info("click on AMRO button");
        Thread.sleep(1000);
    
    	
        AM.clickonplanningbutton();
        log.info("click on planning button");
        Thread.sleep(1000);
     
        AM.clickonworkorder();
        log.info("click on work order");
        Thread.sleep(1000);
        
        AM.clickoncreateworkorder();
        log.info("click on create work order");
        Thread.sleep(1000);
        
        AM.validateclickoncreateworkorder();
       Assert.assertTrue (AM.validateclickoncreateworkorder());
       log.info("validate create work order page opens");
       Thread.sleep(1000);
     
        
        AM.clickonnumberingtype();
        log.info("Select numbering type");
        Thread.sleep(1000);
       
        AM.SelectoWPOHSR();
        log.info("Select WPOHSR as a numbering type");
        Thread.sleep(1000);
        
//        String expectedtext = "WPO-HSR";
//        String Actualtext = "WPO-HSR-";
//        SA.assertEquals(Actualtext, expectedtext, "Validate Failed");
//        log.info("Validate Numbering type");
        
//       Assert.assertTrue (AM.validateSelectoWPOHSR());
//       log.info("validate WPO-HSR-");
//       Thread.sleep(1000);
        
        AM.clickonAircraftReg();
        log.info("Click on Aircraft Reg");
        Thread.sleep(1000);
        
   
        AM.clickonEngine();
        log.info("Click on Engine");
        Thread.sleep(1000);
       
        
        AM.selectonEngine();
        log.info("Select one Engine");
        Thread.sleep(1000);
        
        AM.selectTypeofcheck();
        log.info("click on Type of check");
        Thread.sleep(1000);
        
        
        AM.clickoneTypeofcheck();
        log.info("Select one Type of check");
        Thread.sleep(1000);
        
        AM.passingtheCustomerworkorderno();
        log.info("Passing the customer work order no.");
        Thread.sleep(1000);
        
        AM.clickonplannedstartdate();
        log.info("Click on planned start date");
        Thread.sleep(1000);
       

       
        AM.clickonplannedEnddate();
        log.info("click on planned End date");
        Thread.sleep(1000);
      
        AM.clickonActualstartdate();
        log.info("click on Actual start date");
        Thread.sleep(1000);
       
        AM.clickonplanningcheckspoc();
        log.info("click on planning check spoc");
        Thread.sleep(1000);
        
        AM. ButtonofAkhilesKSpoc();
        log.info("select akhilesk as Spoc person");
        Thread.sleep(1000);
        
        AM.selectthestation();
        log.info("select station");
        Thread.sleep(1000);
        
        AM. Hosurstation();
        log.info("select hosur as a station");
        
        AM.SelectFormat();
        log.info("select format");
        
        AM.SelectBaseMaintainance();
        log.info("Select Base maintainance");

        AM.passingtheseries();
        log.info("Passing the series");
        
        
        
        AM.SelectMaintainancedata();
        log.info("select maintainance data");
       
        AM.SelecttheTasktype();
        log.info("select Task type");
        
        
        AM.SelecttheADsTasktype();
        log.info("select the ADs as a Task type");
       
        AM.SelecttheAWRTasktype();
        log.info("select the AWR as a Task type");
     
        AM.SelecttheADDTasktype();
        log.info("select the ADD as a Task type");
       
        AM.SelecttheNRCTasktype();
        log.info("select the NRC as a Task type");
       
        AM.SelecttheRoutineTaskcard();
        log.info("select the Routine as a Task type");
//        Thread.sleep(1000);
        AM.SelecttheMDfromdate();
        log.info("select the Maintainance start date");
//        Thread.sleep(1000);
//        AM.SelecttheMaintainancestartdate();
              
       
        AM.SelecttheMaintainanceEnddate();
        log.info("select the Maintainance End date");
//        Thread.sleep(1000);
        AM.passingtheMaintainanceData();
        log.info("Sending the Maintainance data");
       Thread.sleep(1000);
     
        AM.passingtheMaintainancestatus();
        log.info("passing the maintainance status");
        Thread.sleep(1000);
//        AM.passingtheMaintainancestatus();
//        log.info("passing the maintainance status");
       
//     
        AM.clickonAddButton();
        log.info("Click on Add button");
        
        AM.clickonCloseButton();
        log.info("Click on Close button");
        
        AM.clickonMagnifierglass();
        log.info("Click on magnifier glass");

        AM.clickonBaseAircraftmodel();
        log.info("Click on BaseAircraft model");
        
        AM.selectBaseAircraftmodel();
        log.info("Click on BaseAircraft model");
       
        AM.clickonSearchButton();
        log.info("Click on Search Button");
        
        Thread.sleep(7000);
       
//        AM.clickonFirstcheckbox();
//        log.info("Click on First check box");
       
        AM.clickonSecondcheckbox();
        log.info("Click on Second check box");
       
        AM.clickonThirdcheckbox();
        log.info("Click on Third check box");
       
        AM.clickonFourthcheckbox();
        log.info("Click on Fourth check box");
       
        AM.clickonFifthcheckbox();
        log.info("Click on Fifth check box");
       Thread.sleep(1000);
        AM.clickonokButton();
        log.info("Click on ok Button");
        Thread.sleep(1000);
        
//        Utilityclass.getScreenshot(driver, "SS for create work order page"); 
//        AM.clickoncloseButton();
//        log.info("Click on close Button");
//        Thread.sleep(2000);
        
        AM.clickonworkorderbutton();
        log.info("Click on workorder Button");
        Thread.sleep(1000);
        
//        Utilityclass.getScreenshot(driver, "Work order No. Auto SS"); 
        
        AM.clickonworkorderfetching();
        System.out.println("Work order no. printed");
        
//        Utilityclass.getScreenshot(driver, "SS for Work order No."); 
        
        EW.clickonAcceptworkorder();
        Thread.sleep(1000);
      
       
        PT.clickonMenubuttonforscrollingthepage();
          Thread.sleep(1000);
          
     //Edit work order started
          
          EW.clickonEditworkorder();
          log.info("click on Edit work order");
          Thread.sleep(1000);
          
          EW.ValidateclickonEditworkorder();
          Assert.assertTrue (EW.ValidateclickonEditworkorder());
          log.info("validate Select work order page opens");
        
//          EW.clickonworkorderselection();
        
          EW.Passingworkorderno();
          log.info("Passing Workorder No.");
          Thread.sleep(1000);
          AM.clickonAircraftReg();
          log.info("Click on Aircraft Reg.");
          Thread.sleep(1000);
          EW.Passingtypeofcheck();
          log.info("Passing type of check");
          
          Thread.sleep(1000);
          EW.selectcustomerforRegAircraft();
          log.info("select customer for Reg Aircraft");
          Thread.sleep(1000);
          EW.selectcustomerBBAM();
          log.info("select customer BBAM");
          Thread.sleep(1000);
          AM.selectthestation();
          log.info("select the station");
          EW.selectthestation();
          log.info("select the one station");
          Thread.sleep(1000);
          
          EW.clickonsearchbutton();
          log.info("Click on Search Button");
          Thread.sleep(1000);
          EW.clickonworkordertoedit();
          log.info("click on work order to edit");
          Thread.sleep(2000);
          
          List<String>allpageAddresses = new ArrayList<String>(driver.getWindowHandles());
          driver.switchTo().window(allpageAddresses.get(1));
          Thread.sleep(3000);
          
          EW.ValidateclickonUpdateworkorder();
          Assert.assertTrue (EW.ValidateclickonUpdateworkorder());
          log.info("validate Update work order page opens");
          
          
          AM.clickonEngine();
          log.info("click on Engine");
          Thread.sleep(1000);
          EW.clickonanotherEngine();
          log.info("click on Another Engine");
          Thread.sleep(1000);
          AM.selectTypeofcheck();
          log.info("select type of check");
          Thread.sleep(1000);
          EW.clickoneTypeofcheck();
          log.info("click one Type of check");
          Thread.sleep(1000);
          EW.passingtheCustomerworkordernoforEdit();
          log.info("passing the Customer work order no for Edit");
          Thread.sleep(1000);
          EW.clickonplannedstartdate();
          log.info("click on planned start date");
          Thread.sleep(1000);
          EW.clickonplannedEnddate();
          log.info("click on planned End date");
          Thread.sleep(1000);
          EW.clickonActualstartdate();
          log.info("click on Actual start date");
          Thread.sleep(1000);
          
          EW.Buttonofspoc();
          log.info("click on button of spoc person");
          Thread.sleep(1000);
          EW.ButtonofAnilSpoc();
          log.info("Select Anil as spoc person");
          Thread.sleep(1000);
          
          
          
          AM.selectthestation();
          log.info("Select the station");
          Thread.sleep(1000);
          EW.Cochinstation();
          log.info("Select the Coachin as station");
          Thread.sleep(1000);
          AM.SelectFormat();
          log.info("Select the Format");
          Thread.sleep(1000);
          AM.SelectBaseMaintainance();
          log.info("Select Base maintainance");
          Thread.sleep(1000);
          EW.passingtheseriesforedit();
          log.info("Passing the series for Edit");
          Thread.sleep(1000);
          EW.clickonupdateworkorder();
          log.info("click on update work order");
          Thread.sleep(1000);
          EW.clickonAcceptworkorder();
          log.info("click on Accept work order");
          Thread.sleep(1000);

          EW.clickonConfirmworkorderbutton();
          log.info("click on Confirm work order");
          Thread.sleep(1000);
          EW.clickonAcceptworkorder();
          Thread.sleep(1000);
          
          Utilityclass.getScreenshot(driver, "Updated Work order Auto SS"); 
          
          AM.clickonMenubutton();
          Thread.sleep(1000);
          
        //zone Allocation started
        
        PC.clickonPCC();
  		log.info("click on PCC");
  		Thread.sleep(1000);
  		PC.clickonBasecheck();
  		log.info("click on Basecheck");
  		Thread.sleep(1000);
  		PC.clickonZoneAllocation();
  		log.info("click on ZoneAllocation");
  		Thread.sleep(1000);
  		PC.clickonAircraftRegn();
  		log.info("click on AircraftRegn");
  		Thread.sleep(1000);
  		PC.clickonBTTB();
  		log.info("click on BTTM");
  		Thread.sleep(1000);
  		PC.checktheModel();
  		log.info("check the Model");
  		Thread.sleep(1000);
  		
//  		boolean validation = PC.checktheModel();
//  		System.out.println(validation);
//  		Assert.assertTrue(validation);
//  		
  		
  		PC.selectworkorder();
  		log.info("check the Model");
  		Thread.sleep(1000);
  		PC.selectoneworkorder();
  		log.info("select one work order");
  		Thread.sleep(1000);
  		PC.clickonSearchbutton();
  		log.info("click on Search button");
  		Thread.sleep(1000);
  		PC.clickonFirstrow();
  		log.info("click on First row");
  		Thread.sleep(1000);
  		PC.clickonAMEMagnifier();
  		log.info("click on AME Magnifier glass");
  		Thread.sleep(1000);
  		PC.clickonAME();
  		log.info("click on AME");
  		Thread.sleep(1000);
  		PC.clickononeAME();
  		log.info("Select one AME");
  		Thread.sleep(1000);
  		PC.clickondeselectAME();
  		log.info("Deselect AME");
  		Thread.sleep(1000);
  		
  		PC.clickoncloseAME();
  		log.info("Click on close AME");
  		Thread.sleep(1000);
  		PC.clickonTechnicianmagnifier();
  		log.info("Click on Technician Magnifier glass");
  		Thread.sleep(1000);
  		PC. clickonTechnician();
  		log.info("Select one Technician");
  		Thread.sleep(1000);
  		PC.clickononeTechnician();
  		log.info("Select on one Technician from the list");
  		Thread.sleep(1000);
  		PC.clickondeselectTechnician();
  		log.info("Click once again to deselect the Technician");
  		Thread.sleep(1000);
  		PC.clickonTechclosebutton();
  		log.info("Click on Tech close button");
  		
  		PC.clickonAircraftcoordinator();
  		log.info("Click on Aircraft co-ordinator");
  		
  		PC.clickononeAircraftcoordinator();
  		log.info("click on one Aircraft co-ordinator");
  		Thread.sleep(1000);
  		PC.clickonArrivaldate();
  		log.info("click on one Arrival date");
  		Thread.sleep(1000);
  		PC.clickonstartdate();
  		log.info("click on start date");
  		Thread.sleep(1000);
  		PC.clickonTargetdate();
  		log.info("click on Target date");
  		Thread.sleep(1000);
  		PC.clickonAOGcutoffdate();
  		log.info("click on AOGcutoff date");
  		Thread.sleep(1000);
  		PC.passingAOGcutofftime();
  		log.info("click on passing AOGcutoff time");
  		Thread.sleep(1000);
  		PC.clickonRTSdate();
  		log.info("click on RTS date");
  		Thread.sleep(1000);
  		PC. passingRTStime();
  		log.info("Passing RTS time");
  		Thread.sleep(1000);
  		PC.clickonpcccheckspoc();
  		log.info("click on pcc check spoc");
  		Thread.sleep(1000);
  		PC.clickonepcccheckspoc();
  		log.info("Select one pcc check spoc");
  		Thread.sleep(1000);
  		PC.clickonMaintainancecheckspoc();
  		log.info("click on Maintainance check spoc");
  		Thread.sleep(1000);
  		PC.clickonpickonemaintainancecheckspoc();
  		log.info("Select one maintainance check spoc");
  		Thread.sleep(1000);
  		
  		Utilityclass.getScreenshot(driver, "Zone Allocation Auto SS"); 

  		PC.clickonSubmitbutton();
  		log.info("click on Submit button");
  		Thread.sleep(2000);
  		
//  		Utilityclass.getScreenshot(driver, "Zone Allocation Auto SS"); 
 		
  		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(3000);
  		
  		 AM.clickonMenubutton();
         Thread.sleep(2000);
         
         //task Allocation started
         
         PT.clickonTaskAllocation();
 		log.info("click on Task Allocation");
 		  Thread.sleep(1000);
 		PC.clickonAircraftRegn();
 		log.info("click on Aircraft Regn.");
 		  Thread.sleep(1000);
 		PC.clickonBTTB();
 		log.info("click on BTTB");
 		  Thread.sleep(1000);
 		PC.selectworkorder();
 		log.info("select work order");
 		  Thread.sleep(1000);
 		PC.selectoneworkorder();
 		log.info("select one work order");
 		  Thread.sleep(1000);
// 		PT.clickonfindingfromtask();
// 		log.info("Click on finding from task");
// 		  Thread.sleep(1000);
// 		PT.clickonfindingfromtask();
// 		log.info("Click on finding from task");
// 		  Thread.sleep(1000);
// 		PT.clickonATA();
// 		log.info("Click on ATA");
// 		  Thread.sleep(1000);
// 		PT.clickonATAselect();
// 		log.info("Click on ATA Select");
// 		  Thread.sleep(1000);
// 		PT.clickonAWIzone(); 
// 		log.info("Click on AWI zone");
// 		Thread.sleep(1000);
// 		PT.clickonanyAWIzone();
// 		log.info("select one AWI zone");
 		Thread.sleep(1000);
 		PT.clickonTradetoAction();
 		log.info("Click on Trade to Action");
 		Thread.sleep(1000);
 		PT.clickonTradetoActionB1();
 		log.info("Click on Trade to Action B1");
 		Thread.sleep(1000);
// 		PT.clickonAME1();
// 		log.info("Click on AME1");
// 		Thread.sleep(1000);
// 		PT.clickonparticularAME1();
// 		log.info("Click on particular AME1");
 		
 		PT.clickonSerchbutton();
 		log.info("Click on Search Button");
 		  Thread.sleep(1000);
 		PT.clickonSelect1grid();
 		log.info("Select one grid");
 		  Thread.sleep(1000);
 		PT.clickonEditbutton();
 		log.info("Click on Edit Button");
 		  Thread.sleep(1000);
 		PT.clickon1stdayinthegrid();
 		log.info("Click on 1st day in the grid");
 		  Thread.sleep(1000);
 		PT.clickonEditbutton();
 		log.info("Click on Edit Button");
 		 Thread.sleep(1000);
 		PT.clickonselect2ndgrid();
 		log.info("Click on 2nd grid");
 		 Thread.sleep(1000);
 		PT.clickonEditbutton();
 		log.info("Click on Edit Button");
 		 Thread.sleep(1000);
         PT.clickon2nddayinthegrid();
         log.info("Click on 2nd day in the grid");
         Thread.sleep(1000);
         PT.clickonEditbutton();
         log.info("Click on Edit button");
         Thread.sleep(1000);
         PT.clickon3rdgrid();
         log.info("Click on third grid");
         Thread.sleep(1000);
         PT.clickonEditbutton();
         log.info("Click on Edit button");
         Thread.sleep(1000);
         PT.clickon3rddayinthegrid();
         log.info("Click on third day in the grid");
         Thread.sleep(1000);
         PT.clickonEditbutton();
         log.info("Click on Edit button");
         Thread.sleep(1000);
         PT.clickon4thgrid();
         log.info("Click on fourth grid");
         Thread.sleep(1000);
         PT.clickonEditbutton();
         log.info("Click on Edit button");
         Thread.sleep(1000);
         PT.clickon4thdayinthegrid();
         log.info("Click on fourth day in the grid");
         Thread.sleep(1000);
         PT.clickonEditbutton();
         log.info("Click on Edit button");
         Thread.sleep(1000);
//         PT.clickon5thgrid();
//         log.info("Click on fifth grid");
//         Thread.sleep(1000);
//         PT.clickonEditbutton();
//         log.info("Click on Edit button");
//         Thread.sleep(1000);
//         PT.clickon5thdayinthegrid();
//         log.info("Click on fifth day in the grid");
//         Thread.sleep(2000);
//         PT.clickonEditbutton();
//         log.info("Click on Edit button");
        
         PT.clickonAllocateButton();
         log.info("Click on Allocate button");
         Thread.sleep(1000);
         
         Utilityclass.getScreenshot(driver, "Task Allocation Auto SS"); 
         
         PT.clickonOkButton();
         log.info("Click on ok button");
         Thread.sleep(1000);
         
         PT.clickonMenubuttonforscrollingthepage();
         Thread.sleep(1000);
         
         //Authorize work order started
         
         AM.clickonplanningbutton();
         log.info("Click on planning button");
         Thread.sleep(1000);
         AM.clickonworkorder();
         log.info("Click on Work order");
         Thread.sleep(1000);
         AW.clickonAuthorizedworkorder();
         log.info("Click on Authorized work order");
         Thread.sleep(1000);
         AW.Passingworkorderno();
         log.info("passing work order no.");
         Thread.sleep(1000);
         AW.clickonAircraftReg();
         log.info("Click on Aircraft Reg.");
         AW.selectTypeofcheck();
         log.info("Select Type of check");
         AW.selectcustomerforRegAircraft();
         log.info("Select customer for Reg. Aircraft");
         AW.selectcustomerBBAM();
         log.info("Select customer for Reg. Aircraft as BBAM");
         AW.Selectstation();
         log.info("Select the station");
         Thread.sleep(1000);
         AW.clickonCochinstation();
         log.info("Select coachin as station");
         Thread.sleep(1000);
         AW.Selectstation();
         log.info("De select station");
         AW.clickonSearchbutton();
         log.info("Click on search button");
         
         Thread.sleep(2000);
         AW.clickonNumberingtypecolumn();
         log.info("Click on numbering type coloumn");
         Thread.sleep(1000);
         AW.clickonSelectNumberingtype();
         log.info("Select Numbering type as AWO-HSR");
         
         AW.clickoncheckbox();
         log.info("Click on Checkbox");
         
         AW.clickonAuthorizebutton();
     	log.info("Click on Authorize button");
     	  Thread.sleep(1000);
     	AW.clickonproceedbutton();
     	log.info("Click on proceed button");
     	  Thread.sleep(10000);
     	  
     	 Utilityclass.getScreenshot(driver, "Authorize Work order Auto SS"); 
     	 
        EW.clickonAcceptworkorder();
        log.info("Click on ok button");
        Thread.sleep(10000);
     	
        Utilityclass.getScreenshot(driver, "Authorize Work order Auto SS 2"); 
         
         
//         
//     	AW.clickonAuthorizebutton();
//     	log.info("Click on Authorize button");
//     	
//     	AW.clickonproceedbutton();
//     	log.info("Click on proceed button");
//         
//         
//        EW.clickonAcceptworkorder();
//        log.info("Accept the Authorized work order");
//          
//         
          
          

          
          
          
          
          
          
        
	}
	
	
}
