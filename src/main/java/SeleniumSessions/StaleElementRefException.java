package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefException {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("naveen"); 
		
		driver.navigate().refresh(); //the moment we refresh the page, the DOM changes
		
		//userName.sendKeys("seleniumUser");//we will get the StaleElementReferenceException
		
		//to solve the StaleElementReferenceException, we have to update the webelement of the new DOM
		
		userName = driver.findElement(By.name("username"));
		userName.sendKeys("seleniumUser");
		
		
	}

}
