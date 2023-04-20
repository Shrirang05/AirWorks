package testpack;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompack.NonConfermenceReport;
import utilpack.Utilityclass;

public class TC07_VerifyNonConfermanceReport extends Testbaseclass
{
	private NonConfermenceReport NC;
	private SoftAssert SA; 
	
//	Logger log = Logger.getLogger("Titan");
	
	@Test
	public void VerifyNonConfermanceReport() throws InterruptedException, IOException 
	{
		NC = new NonConfermenceReport(driver);
		SA = new SoftAssert();
		
		
		NC.clickonGAMRObutton();
		log.info("click on GAMRO button");
		 Thread.sleep(2000);
		NC.clickonQualitybutton();
		log.info("click on Quality Buttton");
		 Thread.sleep(2000);
		NC.clickonNonconfermancereport();
		log.info("click on Non confermance report");
		 Thread.sleep(2000);
		NC. clickonViewNonconfermancereport();
		log.info("click on View Nonconfermance report");
		 Thread.sleep(2000);
//		NC.clickonAreaofAudit();
//		 Thread.sleep(2000);
//		
//		 
//		NC.clickonAreaofAuditCAMO();
//		 Thread.sleep(2000);
		 
		Utilityclass.getScreenshot(driver, "Landing page of NCR");	 
//		 
//		NC.clickonDateofAudit();
//		 Thread.sleep(2000);
//		NC.clickonPlaceofAudit();
//		 Thread.sleep(2000);
//		 
//		NC.clickonPlaceofAuditGurgaon();
//		Thread.sleep(2000);
//		boolean v = NC.palceofAuditvalidation("GURGAON");
//		System.out.println(v);
//		Assert.assertTrue(v);
//		
//		SA.assertTrue(v);
//		
//		 
//		NC.clickonSelectStatus();
//		 Thread.sleep(2000);
//		NC.clickonDraftStatus();
//		 Thread.sleep(2000);
//		NC.clickonSearchButton();
//		 Thread.sleep(2000);
		NC.clickonCreateNCR();
		log.info("click on Create Non-conformance report");
		 Thread.sleep(2000);
		 
		NC.clickonAreaofAudit();
		log.info("click on Area of Audit");
		 Thread.sleep(2000);
		NC.clickonAreaofAuditCAMO();
		log.info("click on Area of Audit CAMO");
		 Thread.sleep(2000);
		NC.passingChecklistNocoloumn();
		log.info("Passing check list No. coloumn");
		Thread.sleep(2000);
		NC.clickonDateofAuditforAdd();
		log.info("click on date of Audit for Add");
		 Thread.sleep(2000);
		NC.clickonselectpalaceofAudit();
		log.info("click on select place of Audit");
		 Thread.sleep(2000);
		NC.clickonPlaceofAuditHosur();
		log.info("click on place of Audit");
		 Thread.sleep(2000);
		NC.clickonAuditeeName();
		log.info("click on Auditee Name");
		 Thread.sleep(2000);
		NC.clickononeAuditeeName();
		log.info("click on one Auditee Name");
		 Thread.sleep(2000);
		NC.checkonScopeofAudit();
		log.info("click on Scope of Audit");
		 Thread.sleep(2000);
		NC.checkonReferenceDoc();
		log.info("click on Reference Doc");
		 Thread.sleep(2000);
		NC.PassingtheLeveloffinding();
		log.info("Passing the Level of finding");
		 Thread.sleep(2000);
		NC.clickontargetdate();
		log.info("select the target date");
		Thread.sleep(2000);

		NC.ClickonQualityManager();
		log.info("Click on Quality Manager");
		 Thread.sleep(2000);
		NC.ClickononeQualityManager();
		log.info("Click on one Quality Manager");
		 Thread.sleep(2000);
		NC.ClickonRootcauseofthedeficiency();
		log.info("Click on Root cause of the deficiency");
		 Thread.sleep(2000);
		NC.ClickonNonConformancedetails();
		log.info("Click on Non Conformance details");
		 Thread.sleep(2000);
		NC.ClickonNameofAuditor();
		log.info("Click on Name of Auditor");
		 Thread.sleep(2000);
		NC.selectoneNameofAuditor();
		log.info("Click on one Name of Auditor");
		 Thread.sleep(2000);
		NC.clickondatefornonconformancedetails();
		log.info("click on date for non conformance details");
		 
		 Thread.sleep(3000);
		NC.ClickonCorrectiveAction();
		log.info("Click on Corrective Action");
		 Thread.sleep(3000);
		NC.ClickonNameofAuditorforcorrectiveAction();
		log.info("Click on Name of Audit for corrective Action taken");
		 Thread.sleep(3000);
		NC.selectoneNameofAuditor();
		log.info("Click one Name of Auditor");
		 Thread.sleep(3000);
		NC.clickondateforcorrectiveAction();
		log.info("click on date for corrective Action taken");
		
		
		NC.ClickonpreventiveAction();
		log.info("click on preventive Action taken");
		 Thread.sleep(2000);
		NC.Clickonselectdepartmentmanager();
		log.info("Click on select department manager");
		 Thread.sleep(2000);
		NC.Clickononeselectdepartmentmanager();
		log.info("Click on select one department manager");
		 Thread.sleep(2000);
		NC.ClickondateforpreventiveAction(); 
		log.info("Click on date for preventive Action taken");
		 
		
		NC.checkComplianceActionbyAuditor();
		log.info("Click on date for preventive Action taken");
		 Thread.sleep(2000);
		NC.ClickonNameofAuditorforcomplainsAction();
		log.info("Click on Name of Auditor for complains Action");
		 Thread.sleep(2000);
		NC.selectoneNameofAuditor();
		log.info("select one Name of Auditor");
		 Thread.sleep(2000);
		NC.ClickondateforcomplianceAction();
		log.info("Click on date for compliance Action");
		
		
		NC.checkFinalCorrectiveandPreventiveAction();
		log.info("check Final Corrective and Preventive Action");
		 Thread.sleep(2000);
		NC.clickonnameofauditmanager();
		log.info("click on name of audit manager");
		 Thread.sleep(2000);
		NC.clickonnameofoneauditmanager();
		log.info("click on name of one audit manager");
		 Thread.sleep(2000);
		NC.ClickondateforAuditManager();
		log.info("click on date for Audit manager");
		
		 
		NC.clickonFinalAcceptancebyQualityManager();
		log.info("click on Final Acceptance by Quality Manager");
		 Thread.sleep(2000);
		NC.clickonSelectQualityManagerName();
		log.info("click on Select Quality Manager Name");
		 Thread.sleep(2000);
		NC.ClickononeQualityManager();
		log.info("Click on one Quality Manager");
		 Thread.sleep(3000);
		NC.ClickondateforQualityManager();
		log.info("Click on date for Quality Manager");
		 Thread.sleep(3000);
		NC.Clickonsavebutton();
		log.info("Click on save button");
		 Thread.sleep(5000);
		NC.ClickonOksavesuccefully();
		log.info("Click on save succesfull button");
		 Thread.sleep(5000);
		NC.ClickonBacktoview();
		log.info("Click on back to view button");
		 Thread.sleep(5000);
		
		//After going to save ADD NCR details going again to home page and search for that particular added NCR
//		
//		NC.clickonAreaofAudit();
//		NC.clickonAreaofAuditCAMO();
//		NC.clickonPlaceofAudit();
//		NC.clickonPlaceofAuditHosur();
//		NC.clickonSelectStatus();
//		NC.clickonDraftStatus();
//		NC.clickonSearchButton();
//		NC.clickonSelectfirstgrid();
//		NC.clickonEditbutton();
//		NC.clickonHosurplaceofaudit();
//		NC.clickonAHMEDABADplaceofaudit();
//		
//		
//		
		
		
		
		
	}
}
