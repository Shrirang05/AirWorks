package testpack;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pompack.NRC;
import pompack.ViewCloseWorkOrderAMRO;
import pompack.ViewCloseWorkOrderAMRO2;
import pompack.ViewCloseWorkOrderAMRO3;
import utilpack.RobotClass;

public class TC18_03_VerifyCloseWorkOrder3rdTask  extends TestBaseClassPreServer
{
	private ViewCloseWorkOrderAMRO VCWAMRO;
	private ViewCloseWorkOrderAMRO2 VCWAMRO2;
	private ViewCloseWorkOrderAMRO3 VCWAMRO3;
	private NRC NR;
	private RobotClass RC;
	
	
	@Test
	public void VerifyViewCloseWorkOrder() throws InterruptedException, AWTException
	{
		VCWAMRO = new ViewCloseWorkOrderAMRO(driver);
		VCWAMRO2 = new ViewCloseWorkOrderAMRO2(driver);
		VCWAMRO3 = new ViewCloseWorkOrderAMRO3(driver);
		NR = new NRC(driver);
		RC = new RobotClass(driver);
		
		VCWAMRO.clickonAMRObuttonpretitan();
		log.info("click on AMRO button pretitan");
		NR.clickonBasemaintenance();
		log.info("click on Base maintenance");
		VCWAMRO.clickonRoutinedropdown();
		log.info("click on Routine dropdown");
		VCWAMRO.clickonViewCloseworkorder();
		log.info("click on View Close Work order");
		VCWAMRO.clickonAircraftReg();
		log.info("click on Aircraft Reg");
		VCWAMRO.clickonAircraftRegsearchbox();
		log.info("click on Aircraft Reg search box");
		VCWAMRO.clickononeAircraftRegn();
		log.info("click on one Aircraft Regn");
		VCWAMRO.clickonselectworkorder();
		log.info("click on select work order");
		VCWAMRO.clickonselectworkordercheckbox();
		log.info("click on select work order checkbox");
		VCWAMRO.clickonselectoneworkorder();
		log.info("Select one work order");
		VCWAMRO.clickonstatus();
		log.info("click on status");
		VCWAMRO.clickonpendingesignstatus();
		log.info("click on pending esign status");
		VCWAMRO.clickonIssuedTo();
		log.info("click on Issued To");
		VCWAMRO.clickonSearchbox();
		log.info("click on Search box");
		VCWAMRO.clickonIssuedToEmployee();
		log.info("click on Issued To Employee");
		VCWAMRO.clickonLocation();
		log.info("click on Location");
		VCWAMRO.clickonCoachinLocation();
		log.info("click on Coachin Location");
		VCWAMRO.clickonSearchbutton();
		log.info("click on Search button");
	
		//Close work order started
	
	VCWAMRO3.clickonTask();
	log.info("click on 3rd Task");
	
	List<String>allpageAddresses = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(allpageAddresses.get(1));
    Thread.sleep(3000);
    
    //Action Taken started
    
	VCWAMRO.clickonActionTaken();
	log.info("click on Action Taken");
	VCWAMRO.clickonEnterActionTaken();
	log.info("click on Enter Action Taken");
	VCWAMRO.clickonTechnician();
	log.info("click on Technician");
	VCWAMRO.SelectoneTechnician();
	log.info("Select one Technician");
	VCWAMRO.deSelectoneTechnician();
	log.info("de Select one Technician");
	VCWAMRO.Enterstartdate();
	log.info("Enter start date");
	VCWAMRO.Enterstarttime();
	log.info("Enter start time");
	VCWAMRO.EnterEnddate();
	log.info("Enter End date");
	VCWAMRO.EnterEndtime();
	log.info("Enter End time");
	VCWAMRO.EnterActualmanhours();
	log.info("Enter Actual man hours");
	VCWAMRO.EnterElapsedmanhours();
	log.info("Enter Elapsed man hours");
	VCWAMRO.clickonNextActionReuired();
	log.info("click on Next Action Reuired");
	VCWAMRO.clickonFromselectAHName();
	log.info("click on From select AH Name");
	VCWAMRO.clickonFromselectoneAHName();
	log.info("click on From select one AH Name");
	VCWAMRO.clickonAddbutton();
	log.info("click on Add button");
	VCWAMRO.clickonokbutton();
	log.info("click on ok button");
	VCWAMRO.clickonclosebutton();
	log.info("click on close button");
    
    //Upload doc started
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
    
	VCWAMRO.clickonUploaddoc();
	log.info("click on Upload doc");
	Thread.sleep(2000);
	VCWAMRO.clickonTextdescription();
	log.info("click on Text description");
	Thread.sleep(2000);
	VCWAMRO.clickonUploadFile();
	log.info("click on Upload File");
	Thread.sleep(2000);
	VCWAMRO.clickonUploadbutton();
	log.info("click on Upload button");
	Thread.sleep(2000);
	VCWAMRO.clickonokbutton();
	log.info("click on ok button");
	Thread.sleep(2000);
	VCWAMRO.clickoncancelbutton();
	log.info("click on cancel button");
	Thread.sleep(2000);
		
	VCWAMRO3.clickongallerybutton();
	log.info("click on gallery button");
	Thread.sleep(2000);

	
	VCWAMRO3.clickongallerypdf();
	log.info("click on gallery pdf");
	Thread.sleep(2000);
	
	List<String>allpageAddresses2 = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(allpageAddresses2.get(2));
    Thread.sleep(3000);
    
    driver.close();
	Thread.sleep(3000);
	
	List<String>allpageAddresses3 = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(allpageAddresses3.get(1));
    Thread.sleep(3000);
    
	
	VCWAMRO3.clickoncancelbuttonofgallary();
	log.info("click on cancel button of gallary");
	Thread.sleep(1000);
	
	VCWAMRO3.clickonRelatedphotos();
	log.info("click on Related photos");
	
	List<String>allpageAddresses4 = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(allpageAddresses4.get(2));
    Thread.sleep(3000);
    
    VCWAMRO3.clickonArchivemediacheckbox();
    log.info("click on Archive media chechbox");
    Thread.sleep(2000);
    
    VCWAMRO3.clickonArchivemediadownload();
    log.info("click on Archive media download");
    Thread.sleep(2000);
    
    driver.close();
    
    List<String>allpageAddresses5 = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(allpageAddresses5.get(1));
    Thread.sleep(3000);
    
    VCWAMRO.clickonAddRecord();
	log.info("click on Add Record");
	Thread.sleep(1000);
   
    
    VCWAMRO2.ClickonImportfromExcel();
	log.info("Click on Import From Excel");
	Thread.sleep(1000);
	
	RC.ImportFromExcel("TestMaterial");
	log.info("Import From Excel");
	Thread.sleep(1000);
	
    VCWAMRO3.clickonExporttoExcel();
    log.info("Export to Excel");
	Thread.sleep(1000);
    
    
    
    
    
    
    
    
    
    
    
    
    
	
		
		
		
	}
	
	
}
