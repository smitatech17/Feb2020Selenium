package TestNGSessions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners can be applied on the individual class and should be written before the class
//@Listeners(TestNGSessions.MyListenerTest.class)
public class HomeTest extends BaseTest {


	@Test
	public void header() {
		System.out.println("header test");
	}
	

}
