package testpack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;
import utilpack.Utilityclass;

public class TC03_CreateWorkorderSheet extends TestBaseClassPreServer
{
private Createworkorderpage AM;
private Editworkorderpage EW;
    
    @Test
    public void verifyCreateworkorder() throws IOException, InterruptedException
    {
    	AM = new Createworkorderpage(driver);
    	AM.clickonamrobutton();
        log.info("click on AMRO button");
        Thread.sleep(1000);
    	
        AM.clickonplanningbutton();
        log.info("click on planning button");
        Thread.sleep(1000);
     
        AM.clickonworkorder();
        log.info("click on work order");
        Thread.sleep(1000);
        
        AM.clickoncreateworkorder();
        log.info("click on create work order");
        Thread.sleep(1000);
        
        AM.validateclickoncreateworkorder();
       Assert.assertTrue (AM.validateclickoncreateworkorder());
       log.info("validate create work order page opens");
       Thread.sleep(1000);
     
        
        AM.clickonnumberingtype();
        log.info("Select numbering type");
        Thread.sleep(1000);
       
        AM.SelectoWPOHSR();
        log.info("Select WPOHSR as a numbering type");
        Thread.sleep(1000);
        
       Assert.assertTrue (AM.validateSelectoWPOHSR());
       log.info("validate WPO-HSR-");
       Thread.sleep(1000);
        
        AM.clickonAircraftReg();
        log.info("Click on Aircraft Reg");
        Thread.sleep(1000);
        
   
        AM.clickonEngine();
        log.info("Click on Engine");
        Thread.sleep(1000);
       
        
        AM.selectonEngine();
        log.info("Select one Engine");
        Thread.sleep(1000);
        
        AM.selectTypeofcheck();
        log.info("click on Type of check");
        Thread.sleep(1000);
        
        
        AM.clickoneTypeofcheck();
        log.info("Select one Type of check");
        Thread.sleep(1000);
        
        AM.passingtheCustomerworkorderno();
        log.info("Passing the customer work order no.");
        Thread.sleep(1000);
        
        AM.clickonplannedstartdate();
        log.info("Click on planned start date");
        Thread.sleep(1000);
       
//        AM.clickondate()
       
        AM.clickonplannedEnddate();
        log.info("click on planned End date");
        Thread.sleep(1000);
      
        AM.clickonActualstartdate();
        log.info("click on Actual start date");
        Thread.sleep(1000);
       
        AM.clickonplanningcheckspoc();
        log.info("click on planning check spoc");
        Thread.sleep(1000);
        
        AM. ButtonofAkhilesKSpoc();
        log.info("select akhilesk as Spoc person");
        Thread.sleep(1000);
        
        AM.selectthestation();
        log.info("select station");
        Thread.sleep(1000);
        
        AM. Hosurstation();
        log.info("select hosur as a station");
        
        AM.SelectFormat();
        log.info("select format");
        
        AM.SelectBaseMaintainance();
        log.info("Select Base maintainance");

        AM.passingtheseries();
        log.info("Passing the series");
        
        
        
        AM.SelectMaintainancedata();
        log.info("select maintainance data");
       
        AM.SelecttheTasktype();
        log.info("select Task type");
        
        
        AM.SelecttheADsTasktype();
        log.info("select the ADs as a Task type");
       
        AM.SelecttheAWRTasktype();
        log.info("select the AWR as a Task type");
     
        AM.SelecttheADDTasktype();
        log.info("select the ADD as a Task type");
       
        AM.SelecttheNRCTasktype();
        log.info("select the NRC as a Task type");
       
        AM.SelecttheRoutineTaskcard();
        log.info("select the Routine as a Task type");
        Thread.sleep(1000);
        AM.SelecttheMDfromdate();
        log.info("select the Maintainance start date");
        Thread.sleep(1000);

              
       
        AM.SelecttheMaintainanceEnddate();
        log.info("select the Maintainance End date");
        Thread.sleep(1000);
        AM.passingtheMaintainanceData();
        log.info("Sending the Maintainance data");
       Thread.sleep(1000);
     
        AM.passingtheMaintainancestatus();
        log.info("passing the maintainance status");
        Thread.sleep(1000);
        
      AM.clickonAddButton();
        log.info("Click on Add button");
        
        AM.clickonCloseButton();
        log.info("Click on Close button");
        
        AM.clickonMagnifierglass();
        log.info("Click on magnifier glass");

        AM.clickonBaseAircraftmodel();
        log.info("Click on BaseAircraft model");
        
        AM.selectBaseAircraftmodel();
        log.info("Click on BaseAircraft model");
       
        AM.clickonSearchButton();
        log.info("Click on Search Button");
        
        Thread.sleep(6000);
       
        AM.clickonFirstcheckbox();
        log.info("Click on First check box");
       
        AM.clickonSecondcheckbox();
        log.info("Click on Second check box");
       
        AM.clickonThirdcheckbox();
        log.info("Click on Third check box");
       
        AM.clickonFourthcheckbox();
        log.info("Click on Fourth check box");
       
        AM.clickonFifthcheckbox();
        log.info("Click on Fifth check box");
       Thread.sleep(1000);
        AM.clickonokButton();
        log.info("Click on ok Button");
        Thread.sleep(1000);
        
        Utilityclass.getScreenshot(driver, "SS for create work order page"); 
       
        
        AM.clickonworkorderbutton();
        log.info("Click on workorder Button");
        Thread.sleep(2000);
        
        Utilityclass.getScreenshot(driver, "SS for Work order No."); 
        
        AM.clickonworkorderfetching();
        System.out.println("Work order no. printed");
        
        
        
        
        
        
        
        
        
        
        
        
//       Utilityclass.getScreenshot(driver, "Into the AMRO");
    }
}
