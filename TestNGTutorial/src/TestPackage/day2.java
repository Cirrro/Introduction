package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = {"Smoke"}) // use for selecting specific test cases for execution example: for smoke testing
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest						// will execute first before any test belong in the same folder //can be use for cleaning before execution
	public void preprequiste()
	{
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last"); // will execute last before any test belong in the same folder
	}
}
