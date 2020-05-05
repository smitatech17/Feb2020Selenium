package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		//Thread.sleep(5000); // static wait; pause the execution for the specified time
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//implicitly wait will be applied immediately after the webdriver is initialized for all the webelements by default; only and only applied for webelements
		//dynamic wait - the moment the element is found, rest of the time will be ignored and proceed to the next element
		//global wait; should be declared immediately after when we create the webdriver or url initialization
		//w1,w2.....wn ------>15 sec
				
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		emailId.sendKeys("naveen@gmail.com");
		password.sendKeys("test@123");
		loginButton.click();
		
		//can override the implicitly waits
		//home page:
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// w1, w2......wn ----->10sec
		
		//search page: //nullify or cancel the implicitly wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//w1....wn ----> 0 sec
		
		
		
		
		
	}

}
