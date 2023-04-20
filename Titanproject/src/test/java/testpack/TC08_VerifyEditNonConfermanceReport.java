package testpack;

import java.io.IOException;

import org.testng.annotations.Test;

import pompack.NonConfermenceReport;
import utilpack.Utilityclass;

public class TC08_VerifyEditNonConfermanceReport extends Testbaseclass
{
	private NonConfermenceReport ENC;
	
@Test
public void VerifyEditNonConfermanceReport() throws InterruptedException, IOException
{
	ENC = new NonConfermenceReport(driver);
	
	 ENC.clickonGAMRObutton();
	 log.info("click on GAMRO button");
	 Thread.sleep(2000);
	 ENC.clickonQualitybutton();
	 log.info("click on Quality button");
	 Thread.sleep(2000);
	 ENC.clickonNonconfermancereport();
	 log.info("click on Non confermance report");
	 Thread.sleep(2000);
	 ENC.clickonViewNonconfermancereport();
	 log.info("click on View Non confermance report");
	 Thread.sleep(2000);
	 ENC.clickonAreaofAudit();
	 log.info("click on Area of Audit");
	 ENC.clickonAreaofAuditCAMO();
	 log.info("click on Area of Audit CAMO");
	 ENC.clickonDateofAuditgoingforEdit();
	 log.info("Select date of Audit going for Edit");
	 Thread.sleep(2000);
	 ENC.clickonPlaceofAudit();
	 log.info("Click on place of audit");
	 ENC.clickonPlaceofAuditHosur();
	 log.info("Select place of audit Hosur");
	 ENC.clickonSelectStatus();
	 log.info("click on select status");
	 ENC.clickonDraftStatus();
	 log.info("Select status as draft");
	 ENC.clickonSearchButton();
	 log.info("Click on search button");
	 ENC.clickonSelectfirstgrid();
	 log.info("Select first grid to go for Edit");
	 
	 ENC.clickonEditbutton();
	 log.info("Click on Edit button");
	 
//	 ENC.clickonDateofAuditforEdit();
//	 ENC.clickonHosurplaceofaudit();
//	 ENC.clickonAHMEDABADplaceofaudit();
//	 Thread.sleep(2000);
	 ENC.ClickonNameofAuditeesforEdit();
	 log.info("Click on Name of Auditees for Edit");
	 Thread.sleep(2000);
	 ENC.ClickonchangetheNameofAuditeesforEdit();
	 log.info("Click on change the name of Auditees for Edit");
	 Thread.sleep(2000);
	 
	 ENC.clickonEditScopeofaudit();
	 log.info("click on Edit Scope of audit");
	 ENC.PassingtheChangeLeveloffinding();
	 log.info("Passing the Change Level of finding");
	 
	 ENC.clickonDateofTargetforEdit();
	 log.info("click on date of target for edit");
	 ENC.clickonRootcauseofdiffForEditpage();
	 log.info("Click on root cause of diff for edit");
	 
	 ENC.ClickonEditNonConformancedetails();
	 log.info("Click on Edit Non conformance details");
	 Thread.sleep(5000);
	 ENC.ClickonNameofAuditorforEdit();
	 log.info("Click on name of Auditor for Edit");
	 Thread.sleep(5000);
	 ENC.ClickonchangetheNameofAuditorforEdit();
	 log.info("Click on change the name of Auditor for edit");
	 Thread.sleep(5000);
	 ENC.clickondateforEditnonconformancedetails();
	 log.info("click on date for Edit non conformance details");
	
	 
	 
	 Thread.sleep(5000);
	 ENC.ClickonEditPreventiveactiontaken();
	 log.info("Click on Edit Preventive action taken");
	 Thread.sleep(5000);
	 ENC.clickonNameofDeptManagerforEdit();
	 log.info("click on Name of Dept Manager for Edit");
	 Thread.sleep(5000);
	 ENC.clickonchangetheNameofDeptManagerforEdit();
	 Thread.sleep(7000);
	 
	 Utilityclass.getScreenshot(driver, "SS half page");
	 
	 ENC.ClickonEditFinalAuditManager();
	 Thread.sleep(5000);
	 ENC.clickonchangethedateforFinalManager();
	 Thread.sleep(5000);
	 
	 ENC.clickonFinalAccepatancebyqualityManager();
	 Thread.sleep(5000);
	 ENC.clickonchangeFinalAccepatanceQualityManager();
	 Thread.sleep(5000);
	 ENC.clickonchangeNameofQualityManager();
	 Thread.sleep(5000);
	 ENC.clickonchangethedateforQualityManager();
	
	 Utilityclass.getScreenshot(driver, "SS Full page");
	 
	 Thread.sleep(5000);
	 ENC.clickonUpdateButton();
	 Thread.sleep(5000);
	 ENC.clickonokButton();
	 Thread.sleep(5000);
	 ENC.clickonBackButton();
	 Thread.sleep(5000);
	 
	 
	 
	
}
}
