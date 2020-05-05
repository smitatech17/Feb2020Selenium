package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//By locators --- page objects
	static By emailId = By.id("username");//By is a class and By.id is the method
	static By password = By.id("password");
	static By loginButton = By.id("loginBtn");
	static By signUpLink = By.linkText("Sign Up");
	static By homePageHeader = By.cssSelector("h1.private-page__title");
	
	
	public static void main(String args[]) throws InterruptedException {
		
		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
//		elementUtil.getElement(emailId).sendKeys("test@gmail.com");
//		elementUtil.getElement(password).sendKeys("test1234");
//		elementUtil.getElement(loginButton).click();
		
		elementUtil.doSendKeys(emailId, "naveenanimation30@gmail.com");
		elementUtil.doSendKeys(password, "Test@1234");
		elementUtil.doClick(loginButton);
		
		Thread.sleep(6000);
		
		String header = elementUtil.doGetText(homePageHeader);
		System.out.println("home page headr is : " + header);
		
		if(header.contains("Sales Dashboard")) {
			System.out.println("user has logged in successfully....");
		}
		else {
			System.out.println("could not logged in");
		}
		
		System.out.println(br.doGetTitle());
		
		
		
		
	}
	
	
	
	
	
	
}
