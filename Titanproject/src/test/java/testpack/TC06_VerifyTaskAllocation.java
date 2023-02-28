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
		  Thread.sleep(2000);
		PC.clickonPCC();
		  Thread.sleep(2000);
		PC.clickonBasecheck();
		  Thread.sleep(2000);
		PT.clickonTaskAllocation();
		  Thread.sleep(2000);
		PC.clickonAircraftRegn();
		  Thread.sleep(2000);
		PC.clickonBTTB();
		  Thread.sleep(2000);
		PC.selectworkorder();
		  Thread.sleep(2000);
		PC.selectoneworkorder();
		  Thread.sleep(2000);
		PT.clickonfindingfromtask();
		  Thread.sleep(2000);
		PT.clickonfindingfromtask();
		  Thread.sleep(2000);
		PT.clickonATA();
		  Thread.sleep(2000);
		PT.clickonATAselect();
		  Thread.sleep(2000);
		PT.clickonSerchbutton();
		  Thread.sleep(2000);
		PT.clickonSelect1grid();
		  Thread.sleep(2000);
		PT.clickonEditbutton();
		  Thread.sleep(2000);
		PT.clickon1stdayinthegrid();
		  Thread.sleep(2000);
		
		
		
		
		
		
}
}