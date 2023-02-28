package testpack;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.Editworkorderpage;

public class TC04_Editworkordersheet extends Testbaseclass
{
	private Createworkorderpage AM;
	private Editworkorderpage EW;
	@Test
	public void VerifyEditworkorder() throws InterruptedException
	{
		
		AM = new Createworkorderpage(driver);
		EW = new Editworkorderpage(driver);
		
		
		Thread.sleep(2000);
		AM.clickonamrobutton();
		Thread.sleep(2000);
        AM.clickonplanningbutton();
        Thread.sleep(2000);
        AM.clickonworkorder();
        Thread.sleep(2000);
        EW.clickonEditworkorder();
        Thread.sleep(2000);
        EW.Passingworkorderno();
        Thread.sleep(2000);
        AM.clickonAircraftReg();
        Thread.sleep(2000);
        EW.Passingtypeofcheck();
        
        Thread.sleep(2000);
        EW.selectcustomerforRegAircraft();
        Thread.sleep(2000);
        EW.selectcustomerBBAM();
        Thread.sleep(2000);
        AM.selectthestation();
        EW.selectthestation();
        Thread.sleep(2000);
        
        
       
        Thread.sleep(2000);
        EW.clickonsearchbutton();
        Thread.sleep(2000);
        EW.clickonworkordertoedit();
        Thread.sleep(3000);
        
        List<String>allpageAddresses = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allpageAddresses.get(1));
        Thread.sleep(3000);
        
        AM.clickonEngine();
        Thread.sleep(2000);
        EW.clickonanotherEngine();
        Thread.sleep(2000);
        AM.selectTypeofcheck();
        Thread.sleep(2000);
        EW.clickoneTypeofcheck();
        Thread.sleep(2000);
        AM.passingtheCustomerworkorderno();
        Thread.sleep(2000);
        EW.clickonplannedstartdate();
        Thread.sleep(2000);
        EW.clickonplannedEnddate();
        Thread.sleep(2000);
        EW.clickonActualstartdate();
        Thread.sleep(2000);
        
        EW.Buttonofspoc();
        Thread.sleep(2000);
        EW.ButtonofAnilSpoc();
        Thread.sleep(2000);
        
        
        
        AM.selectthestation();
        Thread.sleep(2000);
        EW.Cochinstation();
        Thread.sleep(2000);
        AM.SelectFormat();
        Thread.sleep(2000);
        AM.SelectBaseMaintainance();
        Thread.sleep(2000);
        AM.passingtheseries();
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
        Thread.sleep(4000);
        EW.clickonAcceptworkorder();
        Thread.sleep(2000);

        EW.clickonConfirmworkorderbutton();
        Thread.sleep(2000);
        
        
		
	}

}
