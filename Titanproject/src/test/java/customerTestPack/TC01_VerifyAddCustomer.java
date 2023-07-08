package customerTestPack;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import customerPomPack.AddCustomer;
import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import testpack.TestBaseClassPreServer;


public class TC01_VerifyAddCustomer extends TestBaseClassPreServer2
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private AddCustomer AC;
	
	 @Test
	 public void verifyAddCustomer() throws IOException, InterruptedException
	  {
	    	AM = new Createworkorderpage(driver);
	    	AC = new AddCustomer(driver);
	    	
	    	
	    	AM.clickonamrobutton();
	    	log.info("click on AMRO button");
	    	Thread.sleep(1000);
	    	AM.clickonplanningbutton();
	        log.info("click on planning button");
	        Thread.sleep(1000);
	        AC.ClickOnCustomers();
	        log.info("Click On Customers");
	        Thread.sleep(1000);
	        AC.ClickOnAddCustomers();
	        log.info("Click On Add Customers");
	        Thread.sleep(1000);
	    	AC.EnterCustomerCode();
	    	log.info("Enter Customer Code");
	    	Thread.sleep(1000);
	        AC.EnterCustomerName();
	        log.info("Enter Customer Name");
	        Thread.sleep(1000);
	        AC.ClickonEngagementType();
	        log.info("Click on Engagement Type");
	        Thread.sleep(1000);
	        AC.ClickonCAMOEngagementType();
	        log.info("Click on CAMO Engagement Type");
	        Thread.sleep(1000);
	        AC.ClickonAccountGroup();
	        log.info("ClickonAccountGroup");
	        Thread.sleep(1000);
	        AC.ClickonPhoneNo();
	        log.info("ClickonPhoneNo");
	        Thread.sleep(1000);
	        AC.EnterPanNo();
	        log.info("EnterPanNo");
	        Thread.sleep(1000);
	        AC.EnterTanNo();
	        log.info("EnterTanNo");
	        Thread.sleep(1000);
	        AC.EnterEmail();
	        log.info("EnterEmail");
	        Thread.sleep(1000);
	        AC.EnterFax();
	        log.info("EnterFax");
	        Thread.sleep(1000);
	        AC.EnterRemark();
	        log.info("EnterRemark");
	        Thread.sleep(1000);
	        AC.ClickonAddRecordAddressDetails();
	        log.info("ClickonAddRecordAddressDetails");
	        Thread.sleep(1000);
	        AC.EnterAddress1();
	        log.info("EnterAddress1");
	        Thread.sleep(1000);
	        AC.EnterAddress2();
	        log.info("EnterAddress2");
	        Thread.sleep(1000);
	        AC.EnterAddress3();
	        log.info("EnterAddress3");
	        Thread.sleep(1000);
	        AC.ClickonCountry();
	        log.info("ClickonCountry");
	        Thread.sleep(1000);
	        AC.SelectIndiaCountry();
	        log.info("SelectIndiaCountry");
	        Thread.sleep(1000);
	        AC.ClickOnState();
	        log.info("ClickOnState");
	        Thread.sleep(1000);
	        AC.ClickOnMaharshtraState();
	        log.info("ClickOnMaharshtraState");
	        Thread.sleep(1000);
	        AC.ClickOnCity();
	        log.info("ClickOnCity");
	        Thread.sleep(1000);
	        AC.ClickOnPuneCity();
	        log.info("ClickOnPuneCity");
	        Thread.sleep(1000);
	        AC.ClickOnZipCode();
	        log.info("ClickOnZipCode");
	        Thread.sleep(1000);
	        AC.EnterGSTNO();
	        log.info("EnterGSTNO");
	        Thread.sleep(1000);
	        AC.ClickonSavebutton();
	        log.info("ClickonSavebutton");
	        Thread.sleep(1000);
	        AC.ClickonAddRecordContactPersonDetails();
	        log.info("ClickonAddRecordContactPersonDetails");
	        Thread.sleep(1000);
	        AC.EnterContactPersonName();
	        log.info("EnterContactPersonName");
	        Thread.sleep(1000);
	        AC.EnterContactPersonDesignstion();
	        log.info("EnterContactPersonDesignstion");
	        Thread.sleep(1000);
	        AC.EnterContactPersonDepartment();
	        log.info("EnterContactPersonDepartment");
	        Thread.sleep(1000);
	        AC.EnterContactPersonPhoneNo();
	        log.info("EnterContactPersonPhoneNo");
	        Thread.sleep(1000);
	        AC.EnterContactPersonEmail();
	        log.info("EnterContactPersonEmail");
	        Thread.sleep(1000);
	        AC.EnterContactPersonFax();
	        log.info("EnterContactPersonFax");
	        Thread.sleep(1000);
	        AC.EnterContactPersonZipCode();
	        log.info("EnterContactPersonZipCode");
	        Thread.sleep(1000);
	        AC.EnterContactPersonDefault();
	        log.info("EnterContactPersonDefault");
	        Thread.sleep(2000);
//	        AC.ClickonSavebutton();
//	        log.info("ClickonSavebutton");
	        Thread.sleep(2000);
	        AC.ClickOnSaveAddCustomer();
	        log.info("Click On Save Add Customer");
	        Alert Alt = driver.switchTo().alert();
			Alt.accept();
			Thread.sleep(2000);
	        
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
}
}
