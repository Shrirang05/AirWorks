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
	 public void verifyEditCustomer() throws IOException, InterruptedException
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
	    	
	    	//Address details adding started for 2nd record for Edit Address details
	    	
	    	ECD.ClickOnAddrecordEditAddressdetails();
	    	log.info("Click On Add Record Edit Address details");
	    	Thread.sleep(1000);
	    	ECD.EnterAddress1();
	    	log.info("Enter Address 1");
	    	Thread.sleep(1000);
	    	ECD.EnterAddress2();
	    	log.info("Enter Address 2");
	    	Thread.sleep(1000);
	    	ECD.EnterAddress3();
	    	log.info("Enter Address 3");
	    	Thread.sleep(1000);
	    	ECD.ClickonCountry();
	    	log.info("Click On Country");
	    	Thread.sleep(1000);
	    	ECD.ClickonIndiaCountry();
	    	log.info("Click On India Country");
	    	Thread.sleep(1000);
	    	ECD.ClickonState();
	    	log.info("Click On State");
	    	Thread.sleep(1000);
	    	ECD.ClickonMaharashtraState();
	    	log.info("Click On Maharashtra State");
	    	Thread.sleep(1000);
	    	ECD.ClickOnCity();
	    	log.info("Click On City");
	    	Thread.sleep(1000);
	    	ECD.ClickOnPuneCity();
	    	log.info("Click On Pune City");
	    	Thread.sleep(1000);
	    	ECD.EnterZipCode();
	    	log.info("Enter Zip Code");
	    	Thread.sleep(1000);
	    	ECD.ClickOnDefault();
	    	log.info("Click On Default");
	    	Thread.sleep(1000);
	    	ECD.ClickOnDefaultNo();
	    	log.info("Click On Default No");
	    	Thread.sleep(1000);
	    	ECD.EnterGSTNo();
	    	log.info("Enter GST No");
	    	Thread.sleep(1000);
	    	ECD.ClickOnSaveButton();
	    	log.info("Click On Save Button");
	    	Thread.sleep(1000);
	    	
	    	//Address details adding started for 2nd record for contact person
	    	
	    	ECD.ClickOnAddRecordContactPerson2();
	    	log.info("Click On Add Record Contact Person 2");
	    	Thread.sleep(1000);
	    	ECD.EnterNameOfContactPerson();
	    	log.info("Enter Name Of Contact Person");
	    	Thread.sleep(1000);
	    	ECD.EnterDesignation();
	    	log.info("Enter Designation");
	    	Thread.sleep(1000);
	    	ECD.EnterDepartment();
	    	log.info("Enter Department");
	    	Thread.sleep(1000);
	    	ECD.EnterPhoneNoForContactperson();
	    	log.info("Enter Phone No For Contact Person");
	    	Thread.sleep(1000);
	    	ECD.EnterEmailForContactperson();
	    	log.info("Enter Email For Contact Person");
	    	Thread.sleep(1000);
	    	ECD.EnterFaxForContactperson();
	    	log.info("Enter Fax For Contact Person");
	    	Thread.sleep(1000);
	    	ECD.EnterZipCodeForContactperson();
	    	log.info("Enter Zip Code For Contact Person");
	    	Thread.sleep(1000);
	    	ECD.EnterDefaultForContactperson();
	    	log.info("Enter Default For Contact Person");
	    	Thread.sleep(1000);
	    	ECD.ClickOnSaveContactPersonDetails();
	    	log.info("Click On Save Contact Person Details");
	    	Thread.sleep(1000);
	    	ECD.ClickOnUpdateCustomerDetails();
	    	log.info("Click On Update Customer Details");
	    	Thread.sleep(1000);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
}
}
