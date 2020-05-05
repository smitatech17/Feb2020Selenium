package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//TestNG class is always used to create test cases
	//pre-cond --> Test + Asserts --->post steps
	//BeforeAnnotations ---> @Test ---> AfterAnnotations
	
	/**
	 * before suite method
before test method
before class method

before method
test 1
after method

before method
test 2
after method

after class method
after test method
after suite method

BS
BT
BC

BM t1 AM
BM t2 AM

AC
AT
AS
	 */
	
	//1
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("prepare test data");
	}
	
	//2
	@BeforeTest
	public void beforeTest() {
		System.out.println("create DB connection");
	}
	
	//3
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch browser and URL");
	}
	
	//4 7
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login to app");
	}
	
	//5 8
	@Test
	public void test1() {
		System.out.println("check user details");
	}
	
	//9
	@Test
	public void test2() {
		System.out.println("check user is created or not");
	}
	
	//6
	@AfterMethod
	public void afterMethod() {
		System.out.println("logout");
	}
	
	//10
	@AfterClass
	public void afterClass() {
		System.out.println("close the browser");
	}
	
	//11
	@AfterTest
	public void afterTest() {
		System.out.println("disconnect the DB");
	}
	
	//12
	@AfterSuite
	public void afterSuite() {
		System.out.println("delete the test data");
	}
	
	
	
	

}
