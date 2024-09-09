package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
		
		//annotations tells that is a testcase
	
		@Test //1st testcase
		public void Demo()
		{
			System.out.println("Hello");
			Assert.assertTrue(false); // for fail execution example
			
		}
		
		@AfterSuite                 // will execute after any suite or test suite, high priority in last
		public void AFSuite()
		{
			System.out.println("I am the no 1 from last");
		}
		
		@Test //2nd testcase
		public void SecondTest()
		{
			System.out.println("Bye");
		}
		
		
	/*	<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="Loan Department">                              - test suite 
		  <test name="Personal Loan">
		    <classes>                                               - class for test cases
		      <class name="TestPackage.day1">                       - class name 
		      <methods>
		      <include name="Demo"/>                                - method use for only executing the mention test case and ignore all that left
		      </methods>
		      </class>
		      <class name="TestPackage.day2"/>
		      <class name="TestPackage.day4"/>
		    </classes>
		  </test> <!-- Test -->
		  
		  <test name="Car Loan">
		  	<classes>
		  
		  	 <class name="TestPackage.day3">
		   	<methods>
		   	<exclude name="MobileLoginCarLoan"/>                    - method use for excluding for executing the mention test case
		   	<exclude name="Mobile.*"/> 								- method use for excluding all test cases start with word "Mobile"
		   	</methods>
		   	</class>
		   
		  	</classes>>
		 
		  </test>
		</suite> <!-- Suite -->
	
		
		
		<suite name="Loan Department">
  		<test name="Personal Loan">
   		<packages>													- will execute all test suite 
   		<package name = "TestPackage"/>
   		</packages>
  		</test>
		</suite> <!-- Suite -->
		
		
		
		
		*/
		

}
