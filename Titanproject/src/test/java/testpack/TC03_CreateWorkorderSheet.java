package testpack;

import java.io.IOException;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import utilpack.Utilityclass;

public class TC03_CreateWorkorderSheet extends Testbaseclass
{
private Createworkorderpage AM;
    
    @Test
    public void verifyAMRObutton() throws IOException, InterruptedException
    {
    	AM = new Createworkorderpage(driver);
    	AM.clickonamrobutton();
    
    	
        AM.clickonplanningbutton();
     
        AM.clickonworkorder();
        
        
        AM.clickoncreateworkorder();
      
        
        AM.clickonnumberingtype();
       
        AM.SelectoWPOHSR();
        
        AM.clickonAircraftReg();
      
        
   
        AM.clickonEngine();
       
        
        AM.selectonEngine();
       
        
        AM.selectTypeofcheck();
        
        
        AM.clickoneTypeofcheck();
        
        AM.passingtheCustomerworkorderno();
        
        
        AM.clickonplannedstartdate();
        System.out.println("startdate");
       
//        AM.clickondate()
       System.out.println("clickondate");
       
        AM.clickonplannedEnddate();
       System.out.println("end date");
      
        AM.clickonActualstartdate();
        System.out.println("act start date");
       
        AM.clickonplanningcheckspoc();
        System.out.println("planning check spoc");
        
        AM. ButtonofAkhilesKSpoc();
       System.out.println("akhilesk Spoc");
        
        AM.selectthestation();
       System.out.println("select station");
        
        AM. Hosurstation();
       System.out.println("hosu station");
        
        AM.SelectFormat();
        System.out.println("select frmt");
        
        AM.SelectBaseMaintainance();
        System.out.println(" base main select");

        AM.passingtheseries();
        
        AM.SelectMaintainancedata();
        System.out.println("sct main dt");
       
        AM.SelecttheTasktype();
        
        
        AM.SelecttheADsTasktype();
       
        AM.SelecttheAWRTasktype();
     
        AM.SelecttheADDTasktype();
       
        AM.SelecttheNRCTasktype();
       
        AM.SelecttheRoutineTaskcard();
        Thread.sleep(3000);
        AM.SelecttheMDfromdate();
        Thread.sleep(3000);
//        AM.SelecttheMaintainancestartdate();
              
       
        AM.SelecttheMaintainanceEnddate();
        Thread.sleep(3000);
        AM.passingtheMaintainanceData();
       System.out.println("Maintain data send");
       Thread.sleep(3000);
     
        AM.passingtheMaintainancestatus();
        Thread.sleep(3000);
        AM.passingtheMaintainancestatus();
       
//     
        AM.clickonAddButton();
        
        AM.clickonCloseButton();
        
        AM.clickonMagnifierglass();

        AM.clickonBaseAircraftmodel();
        
        AM.selectBaseAircraftmodel();
       
        AM.clickonSearchButton();
       
        AM.clickonFirstcheckbox();
       
        AM.clickonSecondcheckbox();
       
        AM.clickonThirdcheckbox();
       
        AM.clickonFourthcheckbox();
       
        AM.clickonFifthcheckbox();
       Thread.sleep(2000);
        AM.clickonokButton();
        Thread.sleep(2000);
        System.out.println("2nd last");
        AM.clickoncloseButton();
        Thread.sleep(5000);
        
        AM.clickonworkorderbutton();
        Thread.sleep(4000);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    
    	
    	Utilityclass.getScreenshot(driver, "Into the AMRO");
    }
}
