package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSessionConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();  
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		
		//driver.quit(); //quit the browser
		//System.out.println(driver.getTitle()); //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver.close();
		System.out.println(driver.getTitle()); //NoSuchSessionException: invalid session id
	}

}
