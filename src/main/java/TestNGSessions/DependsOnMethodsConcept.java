package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void login() {
		System.out.println("login");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "login")//test method depends on another method; TestNG will not execute (skip) if the depends on Methods fail
	public void home() {
		System.out.println("home");
	}
	
	@Test(dependsOnMethods = "login", priority = 1)
	public void search() {
		System.out.println("search");
	}
}
