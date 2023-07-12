package customerTestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import customerPomPack.AddCustomer;
import customerPomPack.EditCustomerDetails;
import customerPomPack.ViewCustomerDetails;
import pompack.Createworkorderpage;
import pompack.Editworkorderpage;

public class TC03_VerifyViewCustomer extends TestBaseClassPreServer2
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	private AddCustomer AC;
	private EditCustomerDetails ECD;
	private ViewCustomerDetails VCD;
	
	 @Test
	 public void verifyViewCustomer() throws IOException, InterruptedException
	  {
	    	AM = new Createworkorderpage(driver);
	    	AC = new AddCustomer(driver);
	    	ECD = new EditCustomerDetails(driver);
	    	VCD = new ViewCustomerDetails(driver);
	    	
	    	AM.clickonamrobutton();
	    	log.info("click on AMRO button");
	    	Thread.sleep(1000);
	    	AM.clickonplanningbutton();
	        log.info("click on planning button");
	        Thread.sleep(1000);
	        AC.ClickOnCustomers();
	        log.info("Click On Customers");
	        Thread.sleep(1000);
	        VCD.ClickOnViewCustomer();
	        log.info("Click On View Customers");
	        Thread.sleep(1000);
	    	VCD.EnterCustomerCode();
	    	log.info("Enter Customer Code");
	    	Thread.sleep(1000);
	    	VCD.EnterCustomername();
	    	log.info("Enter Customer name");
	    	Thread.sleep(1000);
	    	VCD.ClickOnEngagementType();
	    	log.info("Click On Engagement Type");
	    	Thread.sleep(1000);
	    	VCD.ClickOnMAINTENANCEEngagementType();
	    	log.info("Click On CAMO Engagement Type");
	    	Thread.sleep(1000);
	    	VCD.EnterAccountGroup();
	    	log.info("Enter Account Group");
	    	Thread.sleep(1000);
	    	VCD.EnterPhoneNo();
	    	log.info("Enter Phone No");
	    	Thread.sleep(1000);
	    	VCD.EnterViewCustomerEmail();
	    	log.info("Enter View Customer Email");
	    	Thread.sleep(1000);
	    	VCD.EnterFaxNo();
	    	log.info("Enter Fax No");
	    	Thread.sleep(1000);
	    	VCD.ClickOnStatus();
	    	log.info("Click On Status");
	    	Thread.sleep(1000);
	    	VCD.ClickOnActiveStatus();
	    	log.info("Click On Active Status");
	    	Thread.sleep(1000);
	    	VCD.ClickOnSearchButton();
	    	log.info("Click On Search Button");
	    	Thread.sleep(1000);
	    	
//	    	String actualTitle = VCD.getPageTitle();
//	        String expectedTitle = "Expected Title";
//
//	        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected value.");
		    
	    	
	    	
}
}