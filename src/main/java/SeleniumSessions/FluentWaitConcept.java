package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {

		//Explicit wait:
		//1. WebDriver wait
		//2. FLuent wait:
		//a. timeout  b.polling period  c.ignoring Exception  d.until
		
		//when to use Fluent wait:
		//for handling the Ajax components (without refreshing the entire page, only specific section of the page is being updated - we are sending the Ajax request to get the update)
		
		//Fluent wait is the super class of webdriver wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		
		final By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//input[@value = 'Login']");
		
		//Fluentwait is a class and is referred by wait class and is referencing Interface
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//									.withTimeout(Duration.ofSeconds(15))
//									.pollingEvery(Duration.ofSeconds(3))
//									.ignoring(NoSuchElementException.class);
//		
//		wait.until(new Function<WebDriver, WebElement>(){ //creating anonymous inner class inside until and Function is an Interface and overriding a method of Function Interface
//
//			@Override
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(username);
//			}
//		});
		
		waitForElementWithFluentWait(driver, username).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(loginButton).click();
		
	}
	
	public static WebElement waitForElementFluentWait(WebDriver driver, final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}
	
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>(){ 
			
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		
		return element;
		
		
	}
	
	
	

}
