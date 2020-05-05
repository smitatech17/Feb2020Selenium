package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
//		//explicitly wait is always defined with webdriverwait; create the object of Webdriverwait class
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
//		wait.until(ExpectedConditions.titleContains("HubSpot"));
//		System.out.println(driver.getTitle());
		
		getElementWithExplicitWait(driver, 10, By.id("username")).sendKeys("test@gmail.com");
		
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
//		
//		
//		WebElement emailId = driver.findElement(By.id("username"));
//		emailId.sendKeys("test");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("test@123");
		
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		loginButton.click();
		
	
	}
	
	public static WebElement getElementWithExplicitWait(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		return element;
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
