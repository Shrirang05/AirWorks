package testpack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;

public class TC04_Editworkordersheet extends TestBaseClassPreServer
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	@Test
	public void VerifyEditworkorder() throws InterruptedException, IOException
	{
		
		AM = new Createworkorderpage(driver);
		EW = new Editworkorderpage(driver);
		
		
		AM.clickonamrobutton();
		log.info("click on AMRO button");
		Thread.sleep(2000);
        AM.clickonplanningbutton();
        log.info("click on planning button");
        Thread.sleep(2000);
        AM.clickonworkorder();
        log.info("click on work order");
        Thread.sleep(2000);
        EW.clickonEditworkorder();
        log.info("click on Edit work order");
        Thread.sleep(2000);
        
        EW.ValidateclickonEditworkorder();
        Assert.assertTrue (EW.ValidateclickonEditworkorder());
        log.info("validate Select work order page opens");
      
//        EW.clickonworkorderselection();
      
        EW.Passingworkorderno();
        log.info("Passing Workorder No.");
        Thread.sleep(2000);
        AM.clickonAircraftReg();
        log.info("Click on Aircraft Reg.");
        Thread.sleep(2000);
        EW.Passingtypeofcheck();
        log.info("Passing type of check");
        
        Thread.sleep(2000);
        EW.selectcustomerforRegAircraft();
        log.info("select customer for Reg Aircraft");
        Thread.sleep(2000);
        EW.selectcustomerBBAM();
        log.info("select customer BBAM");
        Thread.sleep(2000);
        AM.selectthestation();
        log.info("select the station");
        EW.selectthestation();
        log.info("select the one station");
        Thread.sleep(2000);
        
        
       
        Thread.sleep(2000);
        EW.clickonsearchbutton();
        log.info("Click on Search Button");
        Thread.sleep(2000);
        EW.clickonworkordertoedit();
        log.info("click on work order to edit");
        Thread.sleep(3000);
        
        List<String>allpageAddresses = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allpageAddresses.get(1));
        Thread.sleep(3000);
        
        EW.ValidateclickonUpdateworkorder();
        Assert.assertTrue (EW.ValidateclickonUpdateworkorder());
        log.info("validate Update work order page opens");
        
        
        AM.clickonEngine();
        log.info("click on Engine");
        Thread.sleep(2000);
        EW.clickonanotherEngine();
        log.info("click on Another Engine");
        Thread.sleep(2000);
        AM.selectTypeofcheck();
        log.info("select type of check");
        Thread.sleep(2000);
        EW.clickoneTypeofcheck();
        log.info("click one Type of check");
        Thread.sleep(2000);
        EW.passingtheCustomerworkordernoforEdit();
        log.info("passing the Customer work order no");
        Thread.sleep(2000);
        EW.clickonplannedstartdate();
        log.info("click on planned start date");
        Thread.sleep(2000);
        EW.clickonplannedEnddate();
        log.info("click on planned End date");
        Thread.sleep(2000);
        EW.clickonActualstartdate();
        log.info("click on Actual start date");
        Thread.sleep(2000);
        
        EW.Buttonofspoc();
        log.info("click on button of spoc person");
        Thread.sleep(2000);
        EW.ButtonofAnilSpoc();
        log.info("Select Anil as spoc person");
        Thread.sleep(2000);
        
        
        
        AM.selectthestation();
        log.info("Select the station");
        Thread.sleep(2000);
        EW.Cochinstation();
        log.info("Select the Coachin as station");
        Thread.sleep(2000);
        AM.SelectFormat();
        log.info("Select the Format");
        Thread.sleep(2000);
        AM.SelectBaseMaintainance();
        log.info("Select Base maintainance");
        Thread.sleep(2000);
        EW.passingtheseriesforedit();
        log.info("Passing the series");
        Thread.sleep(2000);
        
//        AM.SelectMaintainancedata();
//        System.out.println("sct main dt");
//       
//        AM.SelecttheTasktype();
//        
//        
//        AM.SelecttheADsTasktype();
//       
//        AM.SelecttheAWRTasktype();
//     
//        AM.SelecttheADDTasktype();
//       
//        AM.SelecttheNRCTasktype();
//       
////        AM.SelecttheRoutineTaskcard();
////        Thread.sleep(3000);
//        AM.SelecttheMDfromdate();
//        Thread.sleep(3000);
//        
//        AM.SelecttheMaintainanceEnddate();
//        Thread.sleep(3000);
//        AM.passingtheMaintainanceData();
//       System.out.println("Maintain data send");
//       Thread.sleep(3000);
//     
////        AM.passingtheMaintainancestatus();
////        Thread.sleep(3000);
//       Thread.sleep(3000);
//        AM.clickonAddButton();
//        System.out.println("click on Add button ");
//        Thread.sleep(3000);
//        AM.clickonCloseButton();
//        System.out.println("close the maintain popup");
//        Thread.sleep(3000);
//        
        
        
        
       
        EW.clickonupdateworkorder();
        log.info("click on update work order");
        Thread.sleep(4000);
        EW.clickonAcceptworkorder();
        log.info("click on Accept work order");
        Thread.sleep(2000);

        EW.clickonConfirmworkorderbutton();
        log.info("click on Confirm work order");
        Thread.sleep(2000);
        
        
		
	}

}
