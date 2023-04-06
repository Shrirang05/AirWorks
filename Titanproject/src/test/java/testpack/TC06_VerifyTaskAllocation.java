package testpack;

import org.testng.annotations.Test;

import pompack.Createworkorderpage;
import pompack.PccTaskAllocation;
import pompack.PccZoneAllocation;

public class TC06_VerifyTaskAllocation extends Testbaseclass
{
	private Createworkorderpage AM;
	private PccZoneAllocation PC;
	private PccTaskAllocation PT;
	@Test
	public void VerifyZoneAllocationpage() throws InterruptedException
	{
		AM = new Createworkorderpage(driver);
		PC = new PccZoneAllocation(driver);
		PT = new PccTaskAllocation(driver);
		
		AM.clickonamrobutton();
		log.info("click on AMRO button");
		  Thread.sleep(2000);
		PC.clickonPCC();
		log.info("click on PCC button");
		  Thread.sleep(2000);
		PC.clickonBasecheck();
		log.info("click on Base check");
		  Thread.sleep(2000);
		PT.clickonTaskAllocation();
		log.info("click on Task Allocation");
		  Thread.sleep(2000);
		PC.clickonAircraftRegn();
		log.info("click on Aircraft Regn.");
		  Thread.sleep(2000);
		PC.clickonBTTB();
		log.info("click on BTTB");
		  Thread.sleep(2000);
		PC.selectworkorder();
		log.info("select work order");
		  Thread.sleep(2000);
		PC.selectoneworkorder();
		log.info("select one work order");
		  Thread.sleep(2000);
		PT.clickonfindingfromtask();
		log.info("Click on finding from task");
		  Thread.sleep(2000);
		PT.clickonfindingfromtask();
		log.info("Click on finding from task");
		  Thread.sleep(2000);
		PT.clickonATA();
		log.info("Click on ATA");
		  Thread.sleep(2000);
		PT.clickonATAselect();
		log.info("Click on ATA Select");
		  Thread.sleep(2000);
		PT.clickonAWIzone(); 
		log.info("Click on AWI zone");
		Thread.sleep(2000);
		PT.clickonanyAWIzone();
		log.info("select one AWI zone");
		Thread.sleep(2000);
		PT.clickonTradetoAction();
		log.info("Click on Trade to Action");
		Thread.sleep(2000);
		PT.clickonTradetoActionB1();
		log.info("Click on Trade to Action B1");
		Thread.sleep(2000);
		PT.clickonAME1();
		log.info("Click on AME1");
		Thread.sleep(2000);
		PT.clickonparticularAME1();
		log.info("Click on particular AME1");
		Thread.sleep(2000);
		PT.clickonSerchbutton();
		log.info("Click on Search Button");
		  Thread.sleep(2000);
		PT.clickonSelect1grid();
		log.info("Select one grid");
		  Thread.sleep(2000);
		PT.clickonEditbutton();
		log.info("Click on Edit Button");
		  Thread.sleep(2000);
		PT.clickon1stdayinthegrid();
		log.info("Click on 1st day in the grid");
		  Thread.sleep(2000);
		PT.clickonEditbutton();
		log.info("Click on Edit Button");
		 Thread.sleep(2000);
		PT.clickonselect2ndgrid();
		log.info("Click on 2nd grid");
		 Thread.sleep(2000);
		PT.clickonEditbutton();
		log.info("Click on Edit Button");
		 Thread.sleep(2000);
        PT.clickon2nddayinthegrid();
        log.info("Click on 2nd day in the grid");
        Thread.sleep(2000);
        PT.clickonEditbutton();
        log.info("Click on Edit button");
        Thread.sleep(2000);
        PT.clickon3rdgrid();
        log.info("Click on third grid");
        Thread.sleep(2000);
        PT.clickonEditbutton();
        log.info("Click on Edit button");
        Thread.sleep(2000);
        PT.clickon3rddayinthegrid();
        log.info("Click on third day in the grid");
        Thread.sleep(2000);
        PT.clickonEditbutton();
        log.info("Click on Edit button");
        Thread.sleep(2000);
        PT.clickon4thgrid();
        log.info("Click on fourth grid");
        Thread.sleep(2000);
        PT.clickonEditbutton();
        log.info("Click on Edit button");
        Thread.sleep(2000);
        PT.clickon4thdayinthegrid();
        log.info("Click on fourth day in the grid");
        Thread.sleep(2000);
        PT.clickonEditbutton();
        log.info("Click on Edit button");
        Thread.sleep(2000);
        PT.clickon5thgrid();
        log.info("Click on fifth grid");
        Thread.sleep(2000);
        PT.clickonEditbutton();
        log.info("Click on Edit button");
        Thread.sleep(2000);
        PT.clickon5thdayinthegrid();
        log.info("Click on fifth day in the grid");
        Thread.sleep(2000);
        PT.clickonEditbutton();
        log.info("Click on Edit button");
        Thread.sleep(2000);
        PT.clickonAllocateButton();
        log.info("Click on Allocate button");
        Thread.sleep(2000);
        PT.clickonOkButton();
        log.info("Click on ok button");
        Thread.sleep(2000);
        
        
        
        
		
		
		
		
		
		
		
}
}