package TestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void doThis() {
		// TODO Auto-generated method stub
		System.out.println("I am here");

	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Run me first");
		
	}
	@AfterMethod
	public void afterRun()
	{
		System.out.println("Run me Last");
		
	}
	
	
	

}
