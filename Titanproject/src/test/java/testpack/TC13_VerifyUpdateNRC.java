package testpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import pompack.UpdateNRC;

public class TC13_VerifyUpdateNRC extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private NRC NR;
	private UpdateNRC UNR;
	@Test
	public void VerifyUpdateNRC() throws InterruptedException
	{
		
	NR = new NRC(driver);
	AM = new Createworkorderpage(driver);
	EW = new Editworkorderpage(driver);
	UNR = new UpdateNRC(driver);
	
	AM.clickonamrobutton();
	log.info("click on AMRO button");
	Thread.sleep(1000);
	NR.clickonBasemaintenance();
	log.info("click on Base Maintenance dropdown");
	NR.clickonNonRoutinebutton();
	log.info("click on Non Routine card dropdown");
	UNR.clickonViewCloseNRC();
	log.info("click on view close NRC");
	NR.clickonAircraftRegn();
	log.info("click on Aircraft Regn");
	NR.clickonselectAircraftRegn();
	log.info("click on select Aircraft Regn");
	UNR.clickonvisitpackage();
	log.info("click on visit package");
	UNR.clickonselectvisitpackage();
	log.info("select one visit package");
	UNR.clickonSearchbutton();
	log.info("click on serach button");
	UNR.clickonSelectNRCNo();
	log.info("click on NRC No.");
	Thread.sleep(2000);
	
    UNR.childwindowhandles();
    Thread.sleep(1000);
    

   	
    UNR.checkforvisitpackage();
    Assert.assertFalse(UNR.checkforvisitpackage());
    log.info("validate Aircraft Regn");
   	
    UNR.checkforATA();
    Assert.assertFalse(UNR.checkforATA());
    log.info("validate ATA");
    
    UNR.checkforsubATA();
    Assert.assertFalse(UNR.checkforsubATA());
    log.info("validate sub ATA");
    
    UNR.checkforUpdateDate();
    Assert.assertFalse(UNR.checkforUpdateDate());
    log.info("validate for update date");
    
    UNR.checkforUpdateTime();
    Assert.assertFalse(UNR.checkforUpdateTime());
    log.info("validate for update time");
    
    UNR.checkforAuthNo();
    Assert.assertFalse(UNR.checkforAuthNo());
    log.info("validate for Auth No");
    
    UNR.checkforAuthorityofcertification();
    Assert.assertFalse(UNR.checkforAuthorityofcertification());
    log.info("validate for Authority of certification");
    
    
    
	UNR.clickonFindingfromtask();
    log.info("Click on Finding from task");
  	Thread.sleep(1000);
      
     UNR.clickonAddtaskasfindingfromtask();
     log.info("Click on Add task from finding task");
  	 Thread.sleep(1000);
      
     	
	UNR.clickonTradetoactionupdateNRC();
	log.info("click on Trade to action Update NRC");
	Thread.sleep(1000);
	
	UNR.clickonB2trade();
	log.info("click on B2 Trade to action Update NRC");
	Thread.sleep(1000);
      
	UNR.clickonEstimatedmanhoursforupdate();
    log.info("Enter Estimeted man hours for update");
 	Thread.sleep(1000);
 	
 	UNR.clickonEditcallout();
 	log.info("Click on Edit call out");
 	Thread.sleep(1000);
 	
 	UNR.EnterEditcallouts();
 	log.info("Enter Edit call out");
 	Thread.sleep(1000);
 	
 	UNR.clickonEditcalloutsstartdate();
	log.info("Click on Edit call out start date");
 	Thread.sleep(1000);
 	
 	UNR.clickonEditcalloutsstarttime();
 	log.info("Click on Edit call out start time");
 	Thread.sleep(1000);
 	
 	UNR.clickonUpdatebuttonforeditcallout();
 	log.info("Click on Update button for edit call out");
 	Thread.sleep(1000);
 		
 	
 	UNR.clickonAddImage();
 	log.info("Click on Add Image");
 	Thread.sleep(1000);
 	
 	UNR.Enterdiscription();
 	log.info("Enter discription");
 	Thread.sleep(1000);
 	
 	UNR.clickonuploadfile();
 	log.info("click on upload file");
 	Thread.sleep(1000);
 	
 	UNR.clickonuploadfilebutton();
 	log.info("Click on upload file button");
 	Thread.sleep(3000);
 	
 	
     UNR.clickonAddactiontaken();
     log.info("Click on Add action taken");
  	 Thread.sleep(1000);
     UNR.EnterActiontaken();
     log.info("Enter Action Taken");
  	 Thread.sleep(1000);
  	 UNR.ClickonTechnician();
     log.info("Click on Technician");
   	 Thread.sleep(1000);
     UNR.SelectoneTechnician();
     log.info("Select one Technician");
  	 Thread.sleep(1000);
     UNR.Enterstartdate();
     log.info("Enter start date");
  	Thread.sleep(1000); 
      UNR.Enterstarttime();
      log.info("Enter start time");
  	Thread.sleep(1000);      
     UNR.EnterEnddate();
      log.info("Enter End date");
  	Thread.sleep(1000);      
      UNR.EnterEndtime();
      log.info("Enter End time");
  	Thread.sleep(1000);
      UNR.EnterActualmanhours();
      log.info("Enter actual man hours");
  	Thread.sleep(1000);     
      UNR.EnterElapsedmanhours();
      log.info("Enter Elapsed man hours");
  	Thread.sleep(1000);
      UNR.clickonNextActionReuired();
      log.info("Click on Next Action required");
  	Thread.sleep(1000);      
      UNR.clickonFromselectAHName();
      log.info("Click on From select AH Name");
  	Thread.sleep(1000);     
    UNR.clickonFromselectoneAHName();
    log.info("Click on From select one AH Name");
  	Thread.sleep(1000);     
    UNR.clickonAddbutton();
    log.info("Click on Add button");
  	Thread.sleep(1000);
	UNR.clickonokbutton();
	log.info("Click on ok button");
  	Thread.sleep(1000);
  	UNR.clickonclosebutton();
  	log.info("Click on close button");
  	Thread.sleep(1000);
  	
  	UNR.AddImageactiontaken();
  	log.info("Add Image action taken");
  	UNR.EnterdiscriptioninactiontakenImage();
  	log.info("Enter discription in action taken Image");
  	UNR.fileuploadforActiontakenImage();
  	log.info("file upload for Action taken Image");
  	Thread.sleep(3000);
  	UNR.clickonuploadfilebutton();
  	log.info("Click on upload file button");
  	Thread.sleep(3000);
  	
  	
  	
  	
//  	Add call out started
  	
  	
  	UNR.clickonAddcallout();
  	log.info("Click on Add call out");
  	Thread.sleep(1000);
  	UNR.Entercallouts();
  	log.info("Enter call outs"); 
  	Thread.sleep(1000);
  	UNR.validateAHNo();
  	Assert.assertFalse(UNR.validateAHNo());
  	log.info("validate AH No.");
  	Thread.sleep(1000);
	UNR.Addcalloutdate();
	log.info("Add call out date");
	Thread.sleep(1000);
	UNR.Addcalloutdefecttime();
	log.info("Add call out defect time");
	UNR.AddbuttonforAddcallout();
	log.info("Add button for Add call out");
	
	
	//Edit call out 2 started
  	
  	UNR.clickonEditcallout2();
  	log.info("Click on call out 2");
  	
  	UNR.EnterEditcallouts();
 	log.info("Enter Edit call out");
 	Thread.sleep(1000);
 	
 	UNR.clickonEditcalloutsstartdate();
	log.info("Click on Edit call out start date");
 	Thread.sleep(1000);
 	
 	UNR.clickonEditcalloutsstarttime();
 	log.info("Click on Edit call out start time");
 	Thread.sleep(1000);
 	
 	UNR.clickonUpdatebuttonforeditcallout();
 	log.info("Click on Update button for edit call out");
 	Thread.sleep(1000);
 	

 	UNR.clickonAddImage();
 	log.info("Click on Add Image");
 	Thread.sleep(1000);
 	
 	UNR.Enterdiscription();
 	log.info("Enter discription");
 	Thread.sleep(1000);
 	
 	UNR.clickonuploadfile();
 	log.info("click on upload file");
 	Thread.sleep(1000);
 	
 	UNR.clickonuploadfilebutton();
 	log.info("Click on upload file button");
 	Thread.sleep(3000);
 	
  	//Action taken 2 started

 	UNR.clickonAddactiontaken2();
 	 log.info("Click on Add action taken 2");
 	Thread.sleep(1000);
 	 UNR.EnterActiontaken();
     log.info("Enter Action Taken");
  	 Thread.sleep(1000);
  	 UNR.ClickonTechnician();
     log.info("Click on Technician");
   	 Thread.sleep(1000);
     UNR.SelectoneTechnician();
     log.info("Select one Technician");
  	 Thread.sleep(1000);
     UNR.Enterstartdate();
     log.info("Enter start date");
  	Thread.sleep(1000); 
      UNR.Enterstarttime();
      log.info("Enter start time");
  	Thread.sleep(1000);      
     UNR.EnterEnddate();
      log.info("Enter End date");
  	Thread.sleep(1000);      
      UNR.EnterEndtime();
      log.info("Enter End time");
  	Thread.sleep(1000);
      UNR.EnterActualmanhours();
      log.info("Enter actual man hours");
  	Thread.sleep(1000);     
      UNR.EnterElapsedmanhours();
      log.info("Enter Elapsed man hours");
  	Thread.sleep(1000);
      UNR.clickonNextActionReuired();
      log.info("Click on Next Action required");
  	Thread.sleep(1000);      
      UNR.clickonFromselectAHName();
      log.info("Click on From select AH Name");
  	Thread.sleep(1000);     
    UNR.clickonFromselectoneAHName();
    log.info("Click on From select one AH Name");
  	Thread.sleep(1000);     
    UNR.clickonAddbutton();
    log.info("Click on Add button");
  	Thread.sleep(1000);
	UNR.clickonokbutton();
	log.info("Click on ok button");
  	Thread.sleep(1000);
  	UNR.clickonclosebutton();
  	log.info("Click on close button");
  	Thread.sleep(1000);
  	
 	UNR.AddImageactiontaken();
  	log.info("Add Image action taken");
  	UNR.EnterdiscriptioninactiontakenImage();
  	log.info("Enter discription in action taken Image");
  	UNR.fileuploadforActiontakenImage();
  	log.info("file upload for Action taken Image");
  	Thread.sleep(3000);
  	UNR.clickonuploadfilebutton();
  	log.info("Click on upload file button");
  	Thread.sleep(3000);
  	
  	//started Material Add
  	
  	UNR.clickonAddRecord2();
  	log.info("Click on Add record 2");
  	Thread.sleep(1000);

  	UNR.clickonoffpartNomagnifier();
  	log.info("click on off part No magnifier");
  	Thread.sleep(1000);
  	UNR.clickonsearchbutton();
  	log.info("click on search button");
  	Thread.sleep(1000);
  	
  	UNR.clickonPartmastercheckbox();
  	log.info("click on Part master checkbox");
  	Thread.sleep(1000);
  	UNR.clickonoffpartokbutton();
  	log.info("click on off part ok button");
  	Thread.sleep(3000);
  	UNR.clickonoffserialNo();
  	log.info("click on off serial No");
  	Thread.sleep(3000);
  	UNR.EnteroffserialNo();
  	log.info("Enter off serial No");
  	Thread.sleep(3000);
  	UNR.clickonOnpartNo();
  	log.info("click on On part No");
  	Thread.sleep(2000);
  	UNR.clickonsearchbutton();
  	log.info("click on search button");
  	Thread.sleep(2000);
  	UNR.clickonPartmastercheckbox();
  	log.info("click on part master checkbox");
  	Thread.sleep(2000);
  	UNR.clickonoffpartokbutton();
  	log.info("click on ON part ok button");
  	Thread.sleep(3000);
	UNR.clickonAlternatepartno();
	log.info("click on Alternate part no");
  	Thread.sleep(2000);
  	UNR.EnteralternatepartNo();
  	log.info("Enter Alternate part no");
  	Thread.sleep(2000);
  	
	UNR.Enteronserialno();
	log.info("Enter on serial no");
	Thread.sleep(2000);
    UNR.EnterIPCReferance();
    log.info("Enter IPC Referance");
  	Thread.sleep(2000);
  	
    
    UNR.EnterPOS();
    log.info("Enter POS");
  	Thread.sleep(2000);
  	
  	UNR.EnterRequiredQTY();
  	log.info("Enter Required QTY");
   	Thread.sleep(2000);
   	
  	
    UNR.EnterNeeddate();
    log.info("Enter Need date");
  	Thread.sleep(2000);
  	
    UNR.EnterBatchorreleasenote();
    log.info("Enter Batch note");
  	Thread.sleep(2000);
  	
    UNR.EnterUsedqty();
    log.info("Enter Used qty");
  	Thread.sleep(2000);
  	
  	UNR.clickonMaterialissuemagnifier();
  	log.info("Click on Material Issue Magnifier");
  	Thread.sleep(2000);
  	
  	UNR.clickonmaterialIssuesearchbutton();
	log.info("Click on Material Issue Search Button");
  	Thread.sleep(2000);
  	
  	UNR.clickonPartNocheckbox();
  	log.info("Click on Part No checkbox");
  	Thread.sleep(2000);
  	
  	UNR.clickonMaterialIssueAddbutton();
	log.info("Click on Material Issue Add button");
  	Thread.sleep(2000);
  	
  	UNR.clickonIPCreferancefor3rdrow();
  	log.info("Click on IPC Referance for 3rd row");
  	Thread.sleep(2000);
  	
  	UNR.EnterIPCReferancefor3rdrow();
  	log.info("Enter IPC Referance for 3rd row");
  	Thread.sleep(2000);
  	
  	UNR.EnterReqQTYfor3rdgrid();
  	log.info("Enter Req QTY for 3rd grid");
  	Thread.sleep(2000);
  	
  	
  	
  	
  	
    UNR.clickonToolpartNomagnifier();
    log.info("Click on Tool part No magnifier");
  	Thread.sleep(2000);
    
  	UNR.EntertoolpartNo();
  	log.info("Enter Tool part No");
  	Thread.sleep(2000);
  	
  	UNR.clickonToolsearchbutton();
  	log.info("click on search button");
  	Thread.sleep(1000);
  	
  	
  	UNR.clickonToolpartNocheckbox();
  	log.info("Click on Tool part No checkbox");
   	Thread.sleep(2000);
    
    UNR.clickonToolpartok();
    log.info("Click on Tool part ok");
   	Thread.sleep(2000);
    
    UNR.clickoncalibrationdate();
    log.info("Enter calibration date");
   	Thread.sleep(2000);
	
    UNR.clickonNeeddate();
    log.info("Enter Need date");
   	Thread.sleep(2000);
	
   	UNR.validateclosedby();
   	Assert.assertFalse(UNR.validateclosedby());
    log.info("validate close by");
   	
   	UNR.validateActualmanH();
   	Assert.assertFalse(UNR.validateActualmanH());
    log.info("validate Actual man Hours");
   	
   	UNR.validateDuplicateInspby();
	Assert.assertFalse(UNR.validateDuplicateInspby());
    log.info("validate duplicate Insp by");
   	
   	UNR.validateDuplicateInspectiondate();
   	Assert.assertFalse(UNR.validateDuplicateInspectiondate());
    log.info("validate duplicate Insp date");
   	
   	UNR.validateDuplicateInspectiontime();
   	Assert.assertFalse(UNR.validateDuplicateInspectiontime());
    log.info("validate Duplicate Inspection time");
   	
   	UNR.clickonupdatebutton();
    log.info("Click on update button");
 	Thread.sleep(3000);
   	
 	UNR.clickonokbutton();
	log.info("click on ok button");	
	Thread.sleep(1000);
	
   	
}

}
