package customerTestPack;

import java.io.IOException;

import org.testng.annotations.Test;

import customerPomPack.AddCustomer;
import customerPomPack.CreateAircraft;
import customerPomPack.EditAircraft;
import customerPomPack.EditCustomerDetails;
import customerPomPack.ViewCustomerDetails;
import pompack.Createworkorderpage;
import pompack.Editworkorderpage;

public class TC05_VerifyEditAircraft extends TestBaseClassPreServer2
{
	private Createworkorderpage AM;
	private CreateAircraft CA;
	private EditAircraft EA;
	
	 @Test
	 public void verifyViewCustomer() throws IOException, InterruptedException
	  {
	    	AM = new Createworkorderpage(driver);
	    	CA = new CreateAircraft(driver);
	    	EA = new EditAircraft(driver);
	    	
	    	AM.clickonamrobutton();
	    	log.info("click on AMRO button");
	    	Thread.sleep(1000);
	    	AM.clickonplanningbutton();
	        log.info("click on planning button");
	        Thread.sleep(1000);
	        CA.ClickOnAircraft();
	        log.info("click on planning button");
	        Thread.sleep(1000);
	    	EA.ClickOnEditAircraft();
	    	log.info("Click On Edit Aircraft");
	        Thread.sleep(1000);
	    	EA.EnterAircraftReg();
	    	log.info("Enter Aircraft Reg");
	        Thread.sleep(1000);
	    	EA.EnterManufacturerSerial();
	    	log.info("Enter Manufacturer Serial");
	        Thread.sleep(1000);
	    	EA.ClickOnAircraftModel();
	    	log.info("Click On Aircraft Model");
	        Thread.sleep(1000);
	    	EA.selectAircraftModelForEditing();
	    	log.info("select Aircraft Model For Editing");
	        Thread.sleep(1000);
	    	EA.SelectOwningAgencyForEditing();
	    	log.info("Select Owning Agency For Editing");
	        Thread.sleep(1000);
	    	EA.SelectOwningAgencyTestForEditing();
	    	log.info("Select Owning Agency Test For Editing");
	        Thread.sleep(1000);
	    	EA.ClickOnSelectAircraftOwnership();
	    	log.info("Click On Select Aircraft Ownership");
	        Thread.sleep(1000);
	    	EA.ClickOnSelectCUSTOMERAircraftOwnership();
	    	log.info("Click On Select CUSTOMER Aircraft Ownership");
	        Thread.sleep(1000);
	    	EA.ClickOnSelectEngagementType();
	    	log.info("Click On Select Engagement Type");
	        Thread.sleep(1000);
	    	EA.ClickOnSelectOneEngagementType();
	    	log.info("Click On Select One Engagement Type");
	        Thread.sleep(1000);
	    	EA.ClickOnSearchButton();
	    	log.info("Click On Search Button");
	        Thread.sleep(1000);
	    	EA.ClickOnEditNewAircraft();
	    	log.info("Click On Edit New Aircraft");
	        Thread.sleep(1000);
	    	EA.ClickOnEditAircraftOwnership();
	    	log.info("Click On Edit Aircraft Ownership");
	        Thread.sleep(1000);
	    	EA.ClickOnEditAircraftOwnershipAWOWNED();
	    	log.info("Click On Edit Aircraft Ownership AWOWNED");
	        Thread.sleep(1000);
	    	EA.ClickOnEditEngagementType();
	    	log.info("Click On Edit Engagement Type");
	        Thread.sleep(1000);
	    	EA.ClickOnEditOtherEngagementType();
	    	log.info("Click On Edit Other Engagement Type");
	        Thread.sleep(1000);
	    	EA.ClickOnEditpreferredStock();
	    	log.info("Click On Edit preferred Stock");
	        Thread.sleep(1000);
	    	EA.ClickOnEditpreferredStockStatus();
	    	log.info("Click On Edit preferred Stock Status");
	        Thread.sleep(1000);
	    	EA.ClickOnEditConfiguration();
	    	log.info("Click On Edit Configuration");
	        Thread.sleep(1000);
	    	EA.SelectEngine2Conf();
	    	log.info("Select Engine 2 Conf");
	        Thread.sleep(1000);
	    	EA.ClickOnUnclickConfiguration();
	    	log.info("Click On Unclick Configuration");
	        Thread.sleep(1000);
//	        EA.ClickOnAircraftCondition();
//	        log.info("Click On Aircraft Condition");
//	        Thread.sleep(1000);
//	        EA.ClickOnAircraftConditionUMain();
//	    	log.info("Click On Aircraft Condition UMain");
//	        Thread.sleep(1000);
	    	EA.ClickOnConfigurationClass();
	    	log.info("Click On Configuration Class");
	        Thread.sleep(1000);
	    	EA.ClickOnEditConfigurationClass();
	    	log.info("Click On Edit Configuration Class");
	        Thread.sleep(1000);
	    	EA.ClickOnRegulatoryAuthority();
	    	log.info("Click On Regulatory Authority");
	        Thread.sleep(1000);
	    	EA.ClickOnEditRegulatoryAuthority();
	    	log.info("Click On Edit Regulatory Authority");
	        Thread.sleep(1000);
	    	EA.ClickOnUpdateButton();
	    	log.info("Click On Update Button");
	        Thread.sleep(1000);
	    	
	        
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	  }
}
