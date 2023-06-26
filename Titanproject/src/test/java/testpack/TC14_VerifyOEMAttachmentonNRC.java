package testpack;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import pompack.NRC;
import pompack.UpdateNRC;

public class TC14_VerifyOEMAttachmentonNRC extends TestBaseClassPreServer
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
	
	UNR.clickonPlanningAMRORole();
	log.info("click on Planning AMRO button");
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
	 log.info("child window handles");
	 Thread.sleep(1000);
	
	UNR.clickonAddOEMInstruction();
	log.info("click on Add OEM Instruction");
	Thread.sleep(1000);
	
	UNR.Enterprocedure();
	log.info("Enter procedure");
	Thread.sleep(1000);
	
	UNR.EnterRefdocumentNo();
	log.info("Enter Ref document No");
	Thread.sleep(1000);
	
	UNR.EnterDocumentdate();
	log.info("Enter Document date");
	
	UNR.EnterDocumentrev();
	log.info("Enter Document rev");
	Thread.sleep(1000);
	
	UNR.EnterOEMRemarks();
	log.info("Enter OEM Remarks");
	Thread.sleep(1000);
	
	UNR.clickonFileupload();
	log.info("click on File upload");
	Thread.sleep(1000);
	
	UNR.clickonAddOEMsavebutton();
	log.info("click on Add OEM save button");
	Thread.sleep(1000);
	
	UNR.clickonokbutton();
	log.info("click on ok button");	
	Thread.sleep(1000);
	
	UNR.clickonAddOEMclosebutton();
	log.info("click on Add OEM close button");	
	Thread.sleep(1000);
	
	UNR.clickonCloseddate();
	log.info("Enter Closed date");	
	Thread.sleep(1000);
	
	UNR.EnterclosedTime();
	log.info("Enter Closed Time");	
	Thread.sleep(1000);
	
	
	UNR.clickonupdatebutton();
    log.info("Click on update button");
 	Thread.sleep(3000);
   	
 	UNR.clickonokbutton();
	log.info("click on ok button");	
	Thread.sleep(1000);

	UNR.ClickonClosebuttontocloseNRC();
	log.info("click on close button");	
	Thread.sleep(1000);
	
	Alert Alt = driver.switchTo().alert();
	Alt.accept();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	}	
	
}
