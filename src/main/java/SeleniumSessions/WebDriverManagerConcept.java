package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); //check which chrome browser version we have/check best compatible version which we have, will automatically download the respective .exe file
		
		WebDriver driver = new ChromeDriver(); //launch chrome; Top casting
		//driver.get("http://www.google.com");//launch url
		
		driver.navigate().to("https://www.rediff.com");
		
		String title = driver.getTitle();//get the page title
		System.out.println("page title is : " + title);
		
		
		
		
		
	}

}
