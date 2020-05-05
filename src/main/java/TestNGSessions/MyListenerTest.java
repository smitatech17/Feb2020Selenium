package TestNGSessions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

	//listeners are parallel mechanism provided by TestNG
	//listeners will keep checking the status of the test execution and put in the collection and all the reports like Allure, Extent... will use this TestNG listeners to fetch the data and generate the report
	//listeners in TestNG are available in the form of Interface
	

public class MyListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case started --->" + result.getName());		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case is successful ---> " + result.getName());		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failed ---> " + result.getName());	
		System.out.println("taking screenshot...");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case is skipped ---> " + result.getName());	
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {}
	
	@Override
	public void onStart(ITestContext arg0) {}
	
	@Override
	public void onFinish(ITestContext arg0) {}

	
}
