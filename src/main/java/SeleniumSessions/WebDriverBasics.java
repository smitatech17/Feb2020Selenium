package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smi_s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver - Interface and ChromeDriver - Class is already available in Selenium;
		
		WebDriver driver = new ChromeDriver(); //launch chrome; Top casting
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
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
		
		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		
		if(url.contains("google")) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Incorrect url");
		}
		
		//System.out.println(driver.getPageSource());
		
		//quit the browser:
		driver.quit();
		
		

	}

}
