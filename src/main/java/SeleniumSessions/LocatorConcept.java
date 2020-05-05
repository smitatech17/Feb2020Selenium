package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Locators - In selenium 8 different types of locators
		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		
//		//driver.get("https://app.hubspot.com/login");
//		//driver.get("http://classic.crmpro.com/");
//		driver.get("https://www.freshworks.com/");
//		
//		Thread.sleep(5000);//to pause your script for 5 sec
		
		//create the webelement and perform the actions on it
		
		//1. id: ---- I
		//By.id is a static method; By is a class and id is a method
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
//		driver.findElement(By.id("loginBtn")).click();

//		WebElement email  = driver.findElement(By.id("username")); // email is WebElement variable/element here
//		WebElement password  = driver.findElement(By.id("password"));
//		WebElement loginButton  = driver.findElement(By.id("loginBtn"));
//		
//		//creating the webelement variable and performing the action as below
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
//		loginButton.click();
//		
//		//webelement variable we can reuse n number of times
//		email.sendKeys("testtttttttt@123");
		
		//2.name: ----II
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//		WebElement email = driver.findElement(By.name("username"));
//		email.sendKeys("test@gmail.com");
		
		//3. className: ----IV
		//class name for field name - form-control private-form__control login-email
		//class name for password field - password - form-control private-form__control login-password m-bottom-3
		//all the classes are separated by space
		//have to use the unique class
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test123");
		
		
		//4.xpath: is a locator, but no an attribute -----III
		//this is the address of the element in DOM (Document Object Model)
		//right click on html tag of the webelement ---> copy --->copy xpath ---> paste on the search bar; you should see 1 of 1 (unique) and replace the * with html tagname and " " with ''
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test123");
//		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
//		WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test123");
//		loginButton.click();
		
		//5. cssSelector: is a locator, but not an attribute -----III
		//right click on html tag of the webelement ---> copy --->copy selector ---> paste on the search bar; you should see 1 of 1 (unique)
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		
		//6.linkText: only for links
		//according to html rules, link should be represented by 'a' html tag and have href = hyperlink reference property; where exactly you want to navigate
		//if you have multiple same links on the page, selenium will come from top and will take action on the first it interact/found
//		driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText: only for links
//		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. tagName: html tag 
		//we use html tag which is unique in nature
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		WebElement signup = driver.findElement(By.linkText("Sign up"));
		
		signup.click();
		
		Thread.sleep(6000);
		
		WebElement firstName = driver.findElement(By.id("uid-firstName-5"));
		WebElement lastName = driver.findElement(By.id("uid-lastName-6"));
		WebElement emailAdd = driver.findElement(By.id("uid-email-7"));
		//WebElement nextButton = driver.findElement(By.xpath("//button[@id='signup-app']/div/div/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/button"));
		
		firstName.sendKeys("Firstname");
		lastName.sendKeys("lastname");
		emailAdd.sendKeys("test@gmail.com");
//		nextButton.click();
		
		
		
		
		
		
		
		
		
	}

}
