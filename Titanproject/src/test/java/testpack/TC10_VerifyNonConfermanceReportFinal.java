package testpack;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.NonConfermenceReport;
import utilpack.Utilityclass;

public class TC10_VerifyNonConfermanceReportFinal extends Testbaseclass
{
	private NonConfermenceReport NC;
//	Logger log = Logger.getLogger("Titan");
     @Test
     public void VerifyNonConfermanceReportFinal() throws InterruptedException, IOException 
 	{
 		NC = new NonConfermenceReport(driver);
 		
 		NC.clickonGAMRObutton();
 		log.info("click on GAMRO button");
		 Thread.sleep(1000);
		NC.clickonQualitybutton();
		log.info("click on Quality Buttton");
		 Thread.sleep(1000);
		NC.clickonNonconfermancereport();
		log.info("click on Nonconfermance report");
		 Thread.sleep(1000);
		NC. clickonViewNonconfermancereport();
		log.info("click on ViewNonconfermance report");
		 Thread.sleep(1000);
		
		 
		Assert.assertTrue(NC.CheckViewNCRvalidation());
		log.info("Landed on View NCR screen");
		
		 
		NC.clickonAreaofAudit();
		log.info("going to click on the Area of Audit");
		 Thread.sleep(1000);
		NC.clickonAreaofAuditCAMO();
		log.info("Select the Area of Audit CAMO");
		
	  Assert.assertTrue(NC.CheckAreaofAuditCAMOValidation());
	  log.info("Check for CAMO selection");
	  Thread.sleep(1000);
	  
		
		
	  NC.clickonDateofAudit();
		log.info("passing the date of Audit");
		 Thread.sleep(1000);
		NC.clickonPlaceofAudit();
		log.info("Clicking on the place of Audit");
		 Thread.sleep(1000);
		 
		NC.clickonPlaceofAuditNoida();
		log.info("Select the place of Audit Noida");
		Thread.sleep(1000);
//		boolean v = NC.palceofAuditvalidation("GURGAON");
//		System.out.println(v);
//		Assert.assertTrue(v);
		
		
		
		NC.clickonSelectStatus();
		log.info("Select the Status");
		 Thread.sleep(1000);
		NC.clickonDraftStatus();
		log.info("Select the Status as a Draft");
		 Thread.sleep(1000);
		NC.clickonSearchButton();
		log.info("click on Search Button");
		 Thread.sleep(1000);
		NC.clickonCreateNCR();
		log.info("Click on Create NCR button to go for NCR Creation");
		 Thread.sleep(1000);
		 
		 Assert.assertTrue(NC.CheckADDNCRvalidation());
		 log.info("Validate on Add NCR Screen");
		 
		NC.clickonAreaofAudit();
		log.info("Click on Area of Audit for Crete NCR");
		 Thread.sleep(1000);
		NC.clickonAreaofAuditCAMO();
		log.info("Click on Area of Audit CAMO for Crete NCR");
		
//		
//		String expectedText = "CAMO";
//		String ActualText = .get
		
		NC.passingChecklistNocoloumn();
		Thread.sleep(1000);
		log.info("Enter checklist number for NCR");
		
		 Thread.sleep(1000);
		NC.clickonDateofAuditforAdd();
		log.info("Click on Area of Audit CAMO for Crete NCR");
		 Thread.sleep(1000);
		NC.clickonselectpalaceofAudit();
		log.info("Click on Place of Audit");
		 Thread.sleep(1000);
		NC.clickonPlaceofAuditHosur(); 
		log.info("Click on Place of Audit Hosur");
		 Thread.sleep(1000);
		NC.clickonAuditeeName();
		log.info("Click on Auditee Name");
		 Thread.sleep(1000);
		NC.clickononeAuditeeName();
		log.info("Select one Auditee Name");
		 Thread.sleep(1000);
		NC.checkonScopeofAudit();
		log.info("Pass the Scope of Audit");
		 Thread.sleep(1000);
		NC.checkonReferenceDoc();
		log.info("Passing the Reference Document No.");
		 Thread.sleep(1000);
		NC.PassingtheLeveloffinding();
		log.info("Passing the Level Of finding");
		 Thread.sleep(1000);
		NC.clickontargetdate();
		log.info("Passing the Target date of Audit");
		Thread.sleep(1000);

		NC.ClickonQualityManager();
		log.info("Click on Quality Manager");
		 Thread.sleep(1000);
		NC.ClickononeQualityManager();
		log.info("Select one Quality Manager");
		 Thread.sleep(1000);
		NC.ClickonRootcauseofthedeficiency();
		log.info("Passing the Rootcause of the deficiency");
		 Thread.sleep(1000);
		NC.ClickonNonConformancedetails();
		log.info("Paaing the NonConformance details");
		 Thread.sleep(1000);
		NC.ClickonNameofAuditor();
		log.info("Click on NameofAuditor");
		 Thread.sleep(1000);
		NC.selectoneNameofAuditor();
		log.info("Select one NameofAuditor");
		 Thread.sleep(1000);
		NC.clickondatefornonconformancedetails();
		log.info("click on date for nonconformancedetails");
		 Thread.sleep(1000);
		NC.ClickonCorrectiveAction();
		log.info("click on Corrective Action");
		 Thread.sleep(1000);
		NC.ClickonNameofAuditorforcorrectiveAction();
		log.info("click on Name of Auditor for Corrective Action");
		 Thread.sleep(1000);
		NC.selectoneNameofAuditor();
		log.info("Select one Name of Auditor for Corrective Action");
		 Thread.sleep(1000);
		NC.clickondateforcorrectiveAction();
		log.info("Passing the date for Corrective Action");
		
		
		NC.ClickonpreventiveAction();
		log.info("click on preventive Action");
		 Thread.sleep(1000);
		NC.Clickonselectdepartmentmanager();
		log.info("Select Department Manager for preventive Action");
		 Thread.sleep(1000);
		NC.Clickononeselectdepartmentmanager();
		log.info("Select one Department Manager for preventive Action");
		 Thread.sleep(1000);
		NC.ClickondateforpreventiveAction(); 
		log.info("Passing the date for preventive Action");
		 
		Utilityclass.getScreenshot(driver, "SS for Half Add NCR screen"); 
		
		NC.checkComplianceActionbyAuditor();
		log.info("Passing the date for Compliance Action by Auditor");
		 Thread.sleep(1000);
		NC.ClickonNameofAuditorforcomplainsAction();
		log.info("Click on name of Compliance Action Auditor");
		 Thread.sleep(1000);
		NC.selectoneNameofAuditor();
		log.info("Select the name of Compliance Action Auditor");
		 Thread.sleep(1000);
		NC.ClickondateforcomplianceAction();
		log.info("Select the date for Compliance Action Auditor");
		
		
		NC.checkFinalCorrectiveandPreventiveAction();
		log.info("Passing the data for Final Corrective and Preventive Action");
		 Thread.sleep(1000);
		NC.clickonnameofauditmanager();
		log.info("click on name of auditmanager for Corrective and preventive Action");
		 Thread.sleep(1000);
		NC.clickonnameofoneauditmanager();
		log.info("Select one name of audit manager");
		 Thread.sleep(1000);
		NC.ClickondateforAuditManager();
		log.info("Select the date for Audit Manager");
		
		 
		NC.clickonFinalAcceptancebyQualityManager();
		log.info("Passing the data for Final Acceptance by Quality Manager");
		 Thread.sleep(1000);
		NC.clickonSelectQualityManagerName();
		log.info("click on Quality Manager Name");
		 Thread.sleep(1000);
		NC.ClickononeQualityManager();
		log.info("Select one Quality Manager Name");
		 Thread.sleep(1000);
		NC.ClickondateforQualityManager();
		log.info("Select the date for Quality Manager");
		 Thread.sleep(1000);
		 
		 Utilityclass.getScreenshot(driver, "SS for Full Add NCR screen"); 
		 
		NC.Clickonsavebutton();
		log.info("Click on save Button to save the data for NCR screen");
		 Thread.sleep(1000);
		NC.ClickonOksavesuccefully();
		log.info("Click on ok successfull button");
		 Thread.sleep(1000);
		NC.ClickonBacktoview();
		 Thread.sleep(1000);
		 log.info("Click on Back button to go on Landing page for searching the data for Edit");
 		
//		 Start For Edit
		 
		 NC.clickonAreaofAudit();
		 log.info("Click on Area of Audit to go for Edit");
		 Thread.sleep(1000);
		 NC.clickonAreaofAuditCAMO();
		 log.info("Select Area of Audit CAMO");
		 Thread.sleep(1000);
		 NC.clickonDateofAuditgoingforEdit();
		 log.info("Select Date for Audit to go for Edit");
		 Thread.sleep(1000);
		 NC.clickonPlaceofAudit();
		 log.info("click on Place of Audit");
		 Thread.sleep(1000);
         NC.clickonPlaceofAuditHosur();
    	 log.info("click on Place of Audit Hosur");
         Thread.sleep(1000);
		 NC.clickonSelectStatus();
		 log.info("click on Select Status");
		 Thread.sleep(1000);
		 NC.clickonDraftStatus();
		 log.info("Select the Draft Status");
		 Thread.sleep(1000);
		 NC.clickonSearchButton();
		 log.info("Click on search button");
		 Thread.sleep(1000);
		 NC.clickonSelectfirstgrid();
		 log.info("Select the grid and go for Edit");
		 Thread.sleep(1000);
		 NC.clickonEditbutton();
		 log.info("After selcting grid click on Edit button");
		 Thread.sleep(1000);
		 
		//label[text()='EDIT NON CONFORMANCE']
		 Assert.assertTrue(NC.EditNCRvalidation());
		 log.info("Landed on Edit NCR screen");
		 
//		 NC.clickonDateofAuditforEdit();
//		 log.info("click on Date of Audit for Edit");
//		 Thread.sleep(2000);
//		 NC.clickonHosurplaceofaudit();
//		 log.info("click on Hosur place of audit");
//		 Thread.sleep(2000);
//		 NC.clickonAHMEDABADplaceofaudit();
//		 log.info("Select Ahemdabad as a place of audit");
//		 Thread.sleep(2000);
		 
		 NC.ClickonNameofAuditeesforEdit();
		 log.info("Click on Name of Audit for Edit");
		 Thread.sleep(1000);
		 NC.ClickonchangetheNameofAuditeesforEdit();
		 log.info("Click on change the Name of Auditees for Edit");
		 Thread.sleep(1000);
		 
		 NC.clickonEditScopeofaudit();
		 log.info("Click on change the Name of Auditees for Edit");
		 Thread.sleep(1000);
		 NC.PassingtheChangeLeveloffinding();
		 log.info("Passing the Change Level of finding");
		 Thread.sleep(1000);
		 NC.clickonDateofTargetforEdit();
		 log.info("click on Date of Target for Edit");
		 Thread.sleep(1000);
		 NC.clickonRootcauseofdiffForEditpage();
		 log.info("click on Root cause of diff For Edit page");
		 Thread.sleep(1000);
		 
		 NC.ClickonEditNonConformancedetails();
		 log.info("Passing the data on Edit Non Conformance details");
		 Thread.sleep(1000);
		 NC.ClickonNameofAuditorforEdit();
		 log.info("Click on Name of Auditor for Edit on non conformance details");
		 Thread.sleep(1000);
		 NC.ClickonchangetheNameofAuditorforEdit();
		 log.info("Click on change the Name of Auditor for Edit");
		 Thread.sleep(1000);
		 NC.clickondateforEditnonconformancedetails();
		 log.info("click on date for Edit non conformance details");
		 Thread.sleep(1000);
		 NC.ClickonEditPreventiveactiontaken();
		 log.info("Click on Edit Preventive action taken");
		 Thread.sleep(1000);
		 
		 NC.clickonNameofDeptManagerforEdit();
		 log.info("click on Name of Dept Manager for Edit");
		 Thread.sleep(1000);
		 NC.clickonchangetheNameofDeptManagerforEdit();
		 log.info("click on change the Name of Dept Manager for Edit");
		 Thread.sleep(1000);
		 NC.ClickonEditFinalAuditManager();
		 log.info("Click on Edit Final Audit Manager");
		 Thread.sleep(1000);
		 NC.clickonchangethedateforFinalManager();
		 log.info("click on change the date for Final Manager");
		 Thread.sleep(1000);
		 NC.clickonFinalAccepatancebyqualityManager();
		 log.info("click on Final Accepatance by Quality Manager");
		 Thread.sleep(1000);
		 NC.clickonchangeFinalAccepatanceQualityManager();
		 log.info("click on change Final Accepatance Quality Manager");
		 Thread.sleep(1000);
		 NC.clickonchangeNameofQualityManager();
		 log.info("click on change Name of Quality Manager");
		 Thread.sleep(1000);
		 NC.clickonchangethedateforQualityManager();
		 log.info("click on change the date for QualityManager");
		 Thread.sleep(1000);
		 NC.clickonUpdateButton();
		 log.info("click on change the date for QualityManager");
		 Thread.sleep(1000);
		 NC. clickonokButton();
		 log.info("click on ok Button");
		 Thread.sleep(1000);
		 NC.clickonBackButton();
		 log.info("click on Back Button");
		 Thread.sleep(1000);
		 NC.clickonAreaofAudit();
		 log.info("click on Back Button");
		 Thread.sleep(1000);
		 NC.clickonAreaofAuditCAMO();
		 log.info("click on Area of Audit CAMO");
		 Thread.sleep(1000);
		 NC.clickonDateofAuditforEditforHomePage();
		 log.info("click on Date of Audit for Edit for Home Page");
		 Thread.sleep(1000);
		 NC.clickonPlaceofAuditAfterEdit();
		 log.info("click on Place of Audit After Edit");
		 Thread.sleep(1000);
		 NC.clickonPlaceofAuditHosur();
    	 log.info("click on Place of Audit Hosur");
    	 Thread.sleep(1000);
		 NC.clickonSelectStatus();
		 log.info("click on Select Status");
		 Thread.sleep(1000);
		 NC.clickonDraftStatus();
		 log.info("click on Draft Status");
		 Thread.sleep(1000);
		 NC.clickonSearchButton();
		 log.info("click on Search Button");
		 Thread.sleep(1000);
		 NC.clickonSelectfirstgrid();
		 log.info("click on Select first grid");
		 Thread.sleep(1000);
		 
		 Utilityclass.getScreenshot(driver, "SS for Edit NCR screen"); 
		 
//		 Going for Attachment
		    NC.clickonAttachmentButton();
		    log.info("click on Attachment Button");
			Thread.sleep(8000);
		    NC.clickonDocumentlevelfileupload();
		    log.info("click on Document level file upload");
			Thread.sleep(3000);
			NC.clickonDocumentCategory();
			log.info("click on Document Category");
			Thread.sleep(2000);
			NC.clickonDocumentCategoryNCR();
			log.info("click on Document Category NCR");
			Thread.sleep(2000);
			NC.clickonchoosefileforDocument();
			log.info("click on choose file for Document");
			Thread.sleep(2000);
			NC.clickonUploadbutton();
			log.info("click on Upload button");
			Thread.sleep(2000);
			NC.clickonokbuttonforupload();
			log.info("click on ok button for upload");
			Thread.sleep(2000);
			NC.clickonselectfirstRow();
			log.info("click on first Row of grid");
			Thread.sleep(2000);
			NC.clickonDownloadFile();
			log.info("click on Download File");
			Thread.sleep(2000);
			NC.clickonselectreportfordownloadforAhemdabad();
			log.info("click on select report for download for Ahemdabad");
			Thread.sleep(2000);
			NC.clickonDownloadButton();
			log.info("click on Download Button");
			Thread.sleep(5000);
			NC.childwindowhandles();
			log.info("Close the Child Window");
			Thread.sleep(4000);
			NC.clickonclosebutton();
			log.info("Click on close Button ");
			
		 Utilityclass.getScreenshot(driver, "SS for Add Attachement to NCR"); 
			Thread.sleep(4000);
			NC.clickonBackbuttonAfterAttachement();
			log.info("click on Back button After Attachement");
			Thread.sleep(4000);
		// Back to home screen for final Edit and Confirm page
//			 NC.clickonAreaofAudit();
//			 Thread.sleep(2000);
//			 NC.clickonAreaofAuditCAMO();
//			 Thread.sleep(2000);
//			 NC.clickonDateofAuditforEditforHomePage();
//			 Thread.sleep(2000);
//			 NC.clickonPlaceofAuditAfterEdit();
//			 Thread.sleep(2000);
//			 NC.clickonAHMEDABADplaceofaudit();
//			 Thread.sleep(2000);
			
//			 NC.clickonSelectStatus();
//			 Thread.sleep(2000);
//			 NC.clickonDraftStatus();
//			 Thread.sleep(2000);
			 NC.clickonSearchButton();
			 log.info("click on Search Button");
			 Thread.sleep(2000);
			 NC.clickonSelectfirstgrid();
			 log.info("click on first grid");
			 Thread.sleep(2000);
			 NC.clickonEditbutton();
			 log.info("click on Edit Button");
			 Thread.sleep(10000);
		     NC.clickonUpdateAndConfirmButton();
		     log.info("click on Update And Confirm Button");
		     Thread.sleep(2000);
		     NC.clickonokButton();
		     log.info("click on ok Button");
		     Thread.sleep(2000);
		     NC.clickonBackButton();
		     log.info("click on Back Button");
		     Thread.sleep(3000);
		     NC.clickonAreaofAudit();
		     log.info("click on Area of Audit");
			 Thread.sleep(2000);
			 NC.clickonAreaofAuditCAMO();
			 log.info("click on Area of Audit CAMO");
			 Thread.sleep(2000);
			 NC.clickonDateofAuditforEditforHomePage();
			 log.info("click on Date of Audit for Edit for HomePage");
			 Thread.sleep(2000);
			 NC.clickonPlaceofAuditAfterEdit();
			 log.info("click on Place of Audit After Edit");
			 Thread.sleep(2000);
			 NC.clickonPlaceofAuditHosur();
	    	 log.info("click on Place of Audit Hosur");
			 Thread.sleep(2000);
			 NC.clickonSelectStatus();
			 log.info("click on Select Status");
			 Thread.sleep(2000);
			 NC.clickonConfirmbutton();
			 log.info("click on Confirm button");
			 Thread.sleep(2000);
			 NC.clickonSearchButton();
			 log.info("click on Search Button");
			 Thread.sleep(2000);
		     NC.clickonviewNCR();
		     log.info("click on view NCR");
		     Thread.sleep(2000);
		     Utilityclass.getScreenshot(driver, "SS for View NCR Details"); 
		     Thread.sleep(5000);
		     NC.clickonPrintButton();
		     log.info("click on Print Button");
		     Thread.sleep(6000);
		     NC.childwindowhandles();
		     Thread.sleep(3000);
		     log.info("Close the print Button");
		     NC.clickonBackButton();
		     log.info("click on Back Button");
		     Thread.sleep(5000);
		    
		     
			
		
 		
 		
 		
 		
 		
 		
 	}
}
