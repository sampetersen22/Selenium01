package engine;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Utility.driverpage;

public class pageMethods extends driverpage{
	
	@BeforeSuite
	public void beforesuite() {
		startReport();
	}
	
	@BeforeMethod
	public void firstmethod() throws InterruptedException {
		test = reports.createTest("Testcase");
		browsers(); Thread.sleep(5000);
		urlpage(); Thread.sleep(5000);
	}
	
	@AfterMethod
  public void lastmethod() {
	//closepage();
	stopReport();
}
}
