package testpack;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.NonConfermenceReport;

public class TC09_VerifyAttachementpage extends TestBaseClassPreServer
{
	private NonConfermenceReport NC;
	private List <String> X1;
	
	@Test
	public void VerifyAttachementpage() throws InterruptedException 
	{
		NC = new NonConfermenceReport(driver);
	
		
		
		NC.clickonGAMRObutton();
		log.info("clickonGAMRObutton");
		Thread.sleep(1000);
		NC.clickonQualitybutton();
		log.info("clickonQualityButtton");
		Thread.sleep(1000);
		NC.clickonNonconfermancereport();
		log.info("clickonNonconfermancereport");
		Thread.sleep(1000);
		NC.clickonViewNonconfermancereport();
		log.info("clickonViewNonconfermancereport");
		Thread.sleep(1000);
		NC.clickonAreaofAudit();
		log.info("clickonAreaofAudit");
		Thread.sleep(1000);
		NC.clickonAreaofAuditCAMO();
		log.info("clickonAreaofAuditCAMO");
		Thread.sleep(1000);
		NC.clickonDateofAuditgoingforEdit();
		log.info("clickonDateofAudit");
		Thread.sleep(1000);
		NC.clickonPlaceofAudit();
		log.info("clickonPlaceofAudit");
		Thread.sleep(1000);
		 
		 NC.clickonPlaceofAuditHosur();
    	 log.info("click on Place of Audit Hosur");
		 Thread.sleep(2000);
//		boolean v = NC.palceofAuditvalidation("GURGAON");
//		System.out.println(v);
//		Assert.assertTrue(v);
//		
//		SA.assertTrue(v);
		
		 
		NC.clickonSelectStatus();
		 Thread.sleep(1000);
		NC.clickonDraftStatus();
		 Thread.sleep(1000);
		NC.clickonSearchButton();
		 Thread.sleep(1000);
		NC.clickonSelectfirstgrid();
		 Thread.sleep(1000);
		NC.clickonAttachmentButton();
		Thread.sleep(5000);
		NC.clickonDocumentlevelfileupload();
		Thread.sleep(3000);
		NC.clickonDocumentCategory();
		Thread.sleep(2000);
		NC.clickonDocumentCategoryNCR();
		Thread.sleep(2000);
		NC.clickonchoosefileforDocument();
		Thread.sleep(2000);
		NC.clickonUploadbutton();
		Thread.sleep(2000);
		NC.clickonokbuttonforupload();
		Thread.sleep(2000);
		NC.clickonselectfirstRow();
		Thread.sleep(2000);
		NC.clickonDownloadFile();
		Thread.sleep(2000);
		NC.clickonselectreportfordownloadforAhemdabad();
		Thread.sleep(2000);
		
		NC.clickonDownloadButton();
		Thread.sleep(3000);
//	     X1 = (ArrayList<String>) driver.getWindowHandles();
//		if(X1.size()==2)
//		{
//			driver.switchTo().window(X1.get(1));
//		}
//		driver.close();
		NC.childwindowhandles();
		Thread.sleep(4000);
		NC.clickonclosebutton();
		Thread.sleep(2000);
		NC.clickonBackbuttonAfterAttachement();
		Thread.sleep(2000);
		
		
		
	
		
		
}
}
