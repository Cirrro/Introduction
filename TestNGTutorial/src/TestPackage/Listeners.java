package TestPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestlisterner is an iterface which implements Testng interface
public class Listeners implements ITestListener {

	
@Override
public void onTestStart(ITestResult result) {
	
	
}
	
@Override
public void onTestSuccess(ITestResult result) {   //only execute this when test is pass or success, same as the rest
	
	System.out.println("I successfully executed Listeners Pass code");
	
}
	
@Override
public void onTestFailure(ITestResult result) {
	
	//screenshot code
	//response if AAPI is failed
	System.out.println("I failed executed Listeners Pass code" + result.getName());
}

@Override
public void onTestSkipped(ITestResult result) {
	
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	
}

@Override
public void onStart(ITestContext context) {
	
	
}



	
}
