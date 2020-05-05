package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		//headless: no browser
		//not visible
		//testing is happening behind the scene
		//fast
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		//co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");//launch url
		
		String title = driver.getTitle();//get the page title
		System.out.println("page title is : " + title);
		
		//validation point: actual vs expected result:
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		

	}

}
