package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass                   // will execute before any methods (test case)
	public void beforeclas()
	{
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WeblogincarLoan(String urlname, String key)
	{
		
		//selenium
		System.out.println("Weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod					//will execute before any test methods (test case) //can be use for deleting cookie or cache before execution
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod					//will execute after any test methods (test case)
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass                     // will execute after all methods (test case)
	public void afterclas()
	{
		System.out.println("after executing all methods in the class");
	}
	
	
	@Test (groups = {"Smoke"})
	public void MobileLoginCarLoan()
	{
		
		//Appium
		System.out.println("Mobilelogincar");
		
	}
	
	@BeforeSuite                    // will execute before any suite or test suite, high priority
	public void BFSuite()
	{
		
		System.out.println("I am no. 1");
	}
	
	@Test(enabled = false)           // will skip the test case or method from execution // usually use when there a bug on particular part of the softer that going to execute
	public void MobilesigninCarLoan()		//can be true and false  
	{
		
		//Appium
		System.out.println("Mobile signin");
		
	}
	
	@Test(dataProvider="getData")				//(timeOut=4000) - wait before failing execution    //usually use when example sa browser loads longer that it should
	public void MobilesignoutCarLoan(String username, String password)    
	{
		
		//Appium
		System.out.println("Mobile signout");
		System.out.println(username);
		System.out.println(password);
		
	}
	 
	@Test (dependsOnMethods = {"WeblogincarLoan", "MobilesignoutCarLoan"})  // this will execute first before the method below
	public void LoginAPIcarLoann()											// can depend on multiple methods
	{
		//Rest API automation
		System.out.println("APIlogincar");         // will execute after depends on the depended method
		
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit history = row
		//2nd - username password - no credit history
		//3rd - fraudelent credit history
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] ="firstsetusername";
		data[0][1] ="firstpassword";
		// columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] ="2ndsetusername";
		data[1][1] ="secondpassword";
		
		//3rd set
		data[2][0] ="3rdsetusername";
		data[2][1] ="3rdpassword";
		return data; //return type to object
		
	}
	
}
