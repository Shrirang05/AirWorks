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
	 Thread.sleep(2000);
	 ENC.clickonQualitybutton();
	 Thread.sleep(2000);
	 ENC.clickonNonconfermancereport();
	 Thread.sleep(2000);
	 ENC. clickonViewNonconfermancereport();
	 Thread.sleep(2000);
	 ENC.clickonAreaofAudit();
	 ENC.clickonAreaofAuditCAMO();
	 ENC.clickonDateofAuditgoingforEdit();
	 Thread.sleep(2000);
	 ENC.clickonPlaceofAudit();
	 ENC.clickonPlaceofAuditHosur();
	 ENC.clickonSelectStatus();
	 ENC.clickonDraftStatus();
	 ENC.clickonSearchButton();
	 ENC.clickonSelectfirstgrid();
	 ENC.clickonEditbutton();
	 ENC.clickonDateofAuditforEdit();
	 ENC.clickonHosurplaceofaudit();
	 ENC.clickonAHMEDABADplaceofaudit();
	 Thread.sleep(2000);
	 ENC.ClickonNameofAuditeesforEdit();
	 Thread.sleep(2000);
	 ENC.ClickonchangetheNameofAuditeesforEdit();
	 Thread.sleep(2000);
	 
	 ENC.clickonEditScopeofaudit();
	 ENC.PassingtheChangeLeveloffinding();
	 ENC.clickonDateofTargetforEdit();
	 ENC.clickonRootcauseofdiffForEditpage();
	 
	 ENC.ClickonEditNonConformancedetails();
	 Thread.sleep(5000);
	 ENC.ClickonNameofAuditorforEdit();
	 Thread.sleep(5000);
	 ENC.ClickonchangetheNameofAuditorforEdit();
	 Thread.sleep(5000);
	 ENC.clickondateforEditnonconformancedetails();
	
	 
	 
	 Thread.sleep(5000);
	 ENC.ClickonEditPreventiveactiontaken();
	 Thread.sleep(5000);
	 ENC.clickonNameofDeptManagerforEdit();
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
