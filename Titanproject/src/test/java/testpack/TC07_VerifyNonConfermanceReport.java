package testpack;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompack.NonConfermenceReport;

public class TC07_VerifyNonConfermanceReport extends Testbaseclass
{
	private NonConfermenceReport NC;
	private SoftAssert SA; 
	
	@Test
	public void VerifyZoneAllocationpage() throws InterruptedException 
	{
		NC = new NonConfermenceReport(driver);
		SA = new SoftAssert();
		
		NC.clickonGAMRObutton();
		 Thread.sleep(2000);
		NC.clickonQualitybutton();
		 Thread.sleep(2000);
		NC.clickonNonconfermancereport();
		 Thread.sleep(2000);
		NC. clickonViewNonconfermancereport();
		 Thread.sleep(2000);
		NC.clickonAreaofAudit();
		 Thread.sleep(2000);
		NC.clickonAreaofAuditCAMO();
		 Thread.sleep(2000);
		NC.clickonDateofAudit();
		 Thread.sleep(2000);
		NC.clickonPlaceofAudit();
		 Thread.sleep(2000);
		 
		NC.clickonPlaceofAuditgurgaon();
		Thread.sleep(2000);
		boolean v = NC.palceofAuditvalidation("GURGAON");
		System.out.println(v);
		Assert.assertTrue(v);
		
		SA.assertTrue(v);
		
		 
		NC.clickonSelectStatus();
		 Thread.sleep(2000);
		NC.clickonDraftStatus();
		 Thread.sleep(2000);
		NC.clickonSearchButton();
		 Thread.sleep(2000);
		NC.clickonCreateNCR();
		 Thread.sleep(2000);
		 
		NC.clickonAreaofAudit();
		 Thread.sleep(2000);
		NC.clickonAreaofAuditCAMO();
		 Thread.sleep(2000);
		NC.clickonDateofAuditforAdd();
		 Thread.sleep(2000);
		NC.clickonselectpalaceofAudit();
		 Thread.sleep(2000);
		NC.clickonPlaceofAuditHosur();    
		 Thread.sleep(2000);
		NC.clickonAuditeeName();
		 Thread.sleep(2000);
		NC.clickononeAuditeeName();
		 Thread.sleep(2000);
		NC.checkonScopeofAudit();
		 Thread.sleep(2000);
		NC.checkonReferenceDoc();
		 Thread.sleep(2000);
		NC.PassingtheLeveloffinding();
		 Thread.sleep(2000);
		NC.clickontargetdate();
		Thread.sleep(2000);

		NC.ClickonQualityManager();
		 Thread.sleep(2000);
		NC.ClickononeQualityManager();
		 Thread.sleep(2000);
		NC.ClickonRootcauseofthedeficiency();
		 Thread.sleep(2000);
		NC.ClickonNonConformancedetails();
		 Thread.sleep(2000);
		NC.ClickonNameofAuditor();
		 Thread.sleep(2000);
		NC.selectoneNameofAuditor();
		 Thread.sleep(2000);
		NC.clickondatefornonconformancedetails();
		 
		 Thread.sleep(3000);
		NC.ClickonCorrectiveAction();
		 Thread.sleep(3000);
		NC.ClickonNameofAuditorforcorrectiveAction();
		 Thread.sleep(3000);
		NC.selectoneNameofAuditor();
		 Thread.sleep(3000);
		NC.clickondateforcorrectiveAction();
		
		
		NC.ClickonpreventiveAction();
		 Thread.sleep(2000);
		NC.Clickonselectdepartmentmanager();
		 Thread.sleep(2000);
		NC.Clickononeselectdepartmentmanager();
		 Thread.sleep(2000);
		NC.ClickondateforpreventiveAction(); 
		 
		
		NC.checkComplianceActionbyAuditor();
		 Thread.sleep(2000);
		NC.ClickonNameofAuditorforcomplainsAction();
		 Thread.sleep(2000);
		NC.selectoneNameofAuditor();
		 Thread.sleep(2000);
		NC.ClickondateforcomplianceAction();
		
		
		NC.checkFinalCorrectiveandPreventiveAction();
		 Thread.sleep(2000);
		NC.clickonnameofauditmanager();
		 Thread.sleep(2000);
		NC.clickonnameofoneauditmanager();
		 Thread.sleep(2000);
		NC.ClickondateforAuditManager();
		
		 
		NC.clickonFinalAcceptancebyQualityManager();
		 Thread.sleep(2000);
		NC.clickonSelectQualityManagerName();
		 Thread.sleep(2000);
		NC.ClickononeQualityManager();
		 Thread.sleep(3000);
		NC.ClickondateforQualityManager();
		 Thread.sleep(3000);
		NC.Clickonsavebutton();
		 Thread.sleep(5000);
		NC.ClickonOksavesuccefully();
		 Thread.sleep(5000);
		NC.ClickonBacktoview();
		
		//After going to save ADD NCR details going again to home page and search for that particular added NCR
		
		NC.clickonAreaofAudit();
		NC.clickonAreaofAuditCAMO();
		NC.clickonPlaceofAudit();
		NC.clickonPlaceofAuditHosur();
		NC.clickonSelectStatus();
		NC.clickonDraftStatus();
		NC.clickonSearchButton();
		NC.clickonSelectfirstgrid();
		NC.clickonEditbutton();
		NC.clickonHosurplaceofaudit();
		NC.clickonAHMEDABADplaceofaudit();
		
		
		
		
		
		
		
	}
}
