package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {

	//test will be executed in an alphabetical order in TestNG
	//test will be executed on the basis of priority order
	//priorities can be common like multiple test with same priority number and will be executed in an alphabetical order
	//priorities can have 0 and negative numbers too
	//testNG will execute non-priority base test cases first and then prioritized test cases
	
		@Test(priority=2)
		public void atest() {
			System.out.println("A test");
		}
		
		@Test
		public void btest() {
			System.out.println("B test");
		}
		
		@Test(priority = 1)
		public void ctest() {
			System.out.println("C test");
		}
		
		@Test
		public void dtest() {
			System.out.println("D test");
		}
				
		
	}


