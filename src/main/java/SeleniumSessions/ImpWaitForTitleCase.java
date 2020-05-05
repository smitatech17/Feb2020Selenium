package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitForTitleCase {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle()); //title is not the webelement, it is the browser property because implicitly wait is only for webelement, will not work for the title
		//to solve this problem, we have explicit wait with conditions
		
		
		
		
		

	}

}
