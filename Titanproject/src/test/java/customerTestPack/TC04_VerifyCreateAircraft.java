package customerTestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import customerPomPack.AddCustomer;
import customerPomPack.CreateAircraft;
import customerPomPack.EditCustomerDetails;
import customerPomPack.ViewCustomerDetails;
import pompack.Createworkorderpage;
import pompack.Editworkorderpage;

public class TC04_VerifyCreateAircraft extends TestBaseClassPreServer2
{
	private Createworkorderpage AM;
	private CreateAircraft CA;
	
	 @Test
	 public void verifyViewCustomer() throws IOException, InterruptedException
	  {
	    	AM = new Createworkorderpage(driver);
	    	CA = new CreateAircraft(driver);
	    	
	    	AM.clickonamrobutton();
	    	log.info("click on AMRO button");
	    	Thread.sleep(1000);
	    	AM.clickonplanningbutton();
	        log.info("click on planning button");
	        Thread.sleep(1000);
	        CA.ClickOnAircraft();
	        log.info("Click On Aircraft");
	        Thread.sleep(1000);    
	        CA.ClickCreateAircraft();
	        log.info("Click Create Aircraft");
	        Thread.sleep(1000);
	        CA.EnterAircraftReg();
	        log.info("Enter Aircraft Reg");
	        Thread.sleep(1000);
	        CA.EnterManufacturerSerial();
	        log.info("Enter Manufacturer Serial");
	        Thread.sleep(1000);
	        CA.ClickOnAircraftModel();
	        log.info("Click On Aircraft Model");
	        Thread.sleep(1000);
	        CA.SelectoneAircraftModel();
	        log.info("Select one Aircraft Model");
	        Thread.sleep(1000);
	        CA.EnterDateOfManufacture();
	        log.info("Enter Date Of Manufacture");
	        Thread.sleep(1000);
	        CA.EnterRegCertificate();
	        log.info("Enter Reg Certificate");
	        Thread.sleep(1000);
	        CA.EnterIssueDate();
	        log.info("Enter Issue Date");
	        Thread.sleep(1000);
	        CA.ClickOnAircraftOwnership();
	        log.info("Click On Aircraft Ownership");
	        Thread.sleep(1000);
	        CA.SelectOneAircraftOwnership();
	        log.info("Select One Aircraft Ownership");
	        Thread.sleep(1000);
	        CA.ClickOnOwningAgency();
	        log.info("Click On Owning Agency");
	        Thread.sleep(1000);
	        CA.ClickOnOwningAgencyTest();
	        log.info("Click On Owning Agency Test");
	        Thread.sleep(1000);
	        CA.ClickOnEngagementType();
	        log.info("Click On Engagement Type");
	        Thread.sleep(1000);
	        CA.ClickOnOneEngagementType();
	        log.info("Click On One Engagement Type");
	        Thread.sleep(1000);
	        CA.ClickOnPreferredStockStatus();
	        log.info("Click On Preferred Stock Status");
	        Thread.sleep(1000);
	        CA.SelectOnePreferredStockStatus();
	        log.info("Select One Preferred Stock Status");
	        Thread.sleep(1000);
	        CA.ClickOnConfiguration();
	        log.info("Click On Configuration");
	        Thread.sleep(1000);
	        CA.SelectConfigurationEngine1();
	        log.info("Select Configuration Engine 1");
	        Thread.sleep(1000);
	        
	        
	        String actualText = CA.ValidatePlannerCode();
	        String expectedText = "1234";
//	        Assert.assertEquals(expectedText, actualText, "Successfully Verify Planner Code");
	        Assert.assertEquals(actualText, expectedText, "Fail To Verify Planner Code");
	    	
	        
	    	CA.ClickOnDefaultMainBase();
	    	log.info("Click On Default Main Base");
	        Thread.sleep(1000);
	    	CA.SelectHosurDefaultMainBase();
	    	log.info("Select Hosur Default Main Base");
	        Thread.sleep(1000);
	    	CA.EnterInductionDate();
	    	log.info("Enter Induction Date");
	        Thread.sleep(1000);
	    	CA.EnterOperationalDate();
	    	log.info("Enter Operational Date");
	        Thread.sleep(1000);
	    	CA.ClickOnAircraftCondition();
	    	log.info("Click On Aircraft Condition");
	        Thread.sleep(1000);
	    	CA.ClickOnConditionFromDate();
	    	log.info("Click On Condition From Date");
	        Thread.sleep(1000);
	    	CA.ClickOnConfigurationClass();
	    	log.info("Click On Configuration Class");
	        Thread.sleep(1000);
	    	CA.ClickOnFixedWingConfigurationClass();
	    	log.info("Click On Fixed Wing Configuration Class");
	        Thread.sleep(1000);
	    	CA.ClickOnRegulatoryAuthority();
	    	log.info("Click On Regulatory Authority");
	        Thread.sleep(1000);
	    	CA.SelectOneRegulatoryAuthority();
	    	log.info("Select One Regulatory Authority");
	        Thread.sleep(1000);
	    	CA.ClickOnSaveButton();
	    	log.info("Click On Save Button");
	        Thread.sleep(2000);
	        CA.ClickonokButton();
	        log.info("Click on ok Button");
	        Thread.sleep(1000);
	    	
	    	
	    	
	    	
	    	
	    	
}
}
