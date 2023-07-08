package customerTestPack;

import java.io.IOException;

import org.testng.annotations.Test;

import customerPomPack.AddCustomer;
import customerPomPack.EditCustomerDetails;
import pompack.Createworkorderpage;
import pompack.Editworkorderpage;

public class TC02_VerifyEditCustomer extends TestBaseClassPreServer2
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private AddCustomer AC;
	private EditCustomerDetails ECD;
	
	 @Test
	 public void verifyAddCustomer() throws IOException, InterruptedException
	  {
	    	AM = new Createworkorderpage(driver);
	    	AC = new AddCustomer(driver);
	    	ECD = new EditCustomerDetails(driver);
	    	
	    	AM.clickonamrobutton();
	    	log.info("click on AMRO button");
	    	Thread.sleep(1000);
	    	AM.clickonplanningbutton();
	        log.info("click on planning button");
	        Thread.sleep(1000);
	        AC.ClickOnCustomers();
	        log.info("Click On Customers");
	        Thread.sleep(1000);
	        ECD.ClickonEditCustomer();
	        log.info("Click On Edit Customers");
	        Thread.sleep(1000);
	    	ECD.EnterCustomerCode();
	    	log.info("Enter Customer Code");
	    	Thread.sleep(1000);
	    	ECD.EnterCustomername();
	    	log.info("Enter Customer name");
	    	Thread.sleep(1000);
	    	ECD.ClickOnEngagementType();
	    	log.info("Click On Engagement Type");
	    	Thread.sleep(1000);
	    	ECD.ClickOnCAMOEngagementType();
	    	log.info("Click On CAMO Engagement Type");
	    	Thread.sleep(1000);
	    	ECD.EnterAccountGroup();
	    	log.info("Enter Account Group");
	    	Thread.sleep(1000);
	    	ECD.EnterPhoneNo();
	    	log.info("Enter Phone No");
	    	Thread.sleep(1000);
	    	ECD.EnterViewCustomerEmail();
	    	log.info("Enter View Customer Email");
	    	Thread.sleep(1000);
	    	ECD.EnterFaxNo();
	    	log.info("Enter Fax No");
	    	Thread.sleep(1000);
	    	ECD.ClickOnStatus();
	    	log.info("Click On Status");
	    	Thread.sleep(1000);
	    	ECD.ClickOnActiveStatus();
	    	log.info("Click On Active Status");
	    	Thread.sleep(1000);
	    	ECD.ClickOnSearchButton();
	    	log.info("Click On Search Button");
	    	Thread.sleep(1000);
	    	
	    	// Edit Customer Details started
	    	
	    	ECD.ClickOnEditpenfromgrid();
	    	log.info("Click On Edit pen from grid");
	    	Thread.sleep(1000);
	    	ECD.EnterEditCutomerName();
	    	log.info("Enter Edit Cutomer Name");
	    	Thread.sleep(1000);
	    	ECD.EnterEditEngagementType();
	    	log.info("Enter Edit Engagement Type");
	    	Thread.sleep(1000);
	    	ECD.SelectOneEngagementType();
	    	log.info("Select One Engagement Type");
	    	Thread.sleep(1000);
	    	ECD.EditEditAccountGroup();
	    	log.info("Edit Account Group");
	    	Thread.sleep(1000);
	    	ECD.EditEditphoneNo();
	    	log.info("Edit phone No");
	    	Thread.sleep(1000);
	    	ECD.EnterEditFaxNo();
	    	log.info("Enter Edit Fax No");
	    	Thread.sleep(1000);
	    	ECD.EnterEditPanNo();
	    	log.info("Enter Edit Pan No");
	    	Thread.sleep(1000);
	    	ECD.EnterEditTanNo();
	    	log.info("Enter Edit Tan No");
	    	Thread.sleep(1000);
	    	ECD.EnterEditRemarks();
	    	log.info("Enter Edit Remarks");
	    	Thread.sleep(1000);
	    	ECD.ClickOnAddrecordEditAddressdetails();
	    	log.info("Click On Add record Edit Address details");
	    	Thread.sleep(1000);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
}
}
