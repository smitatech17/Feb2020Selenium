package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions { // will be like a generic class, so not the main method

	WebDriver driver;
	
	//writing the description - /** and enter
	/**
	 * This method is used to launch the browser/initialize the driver on the basis of given browser
	 * @param browser
	 */
	public WebDriver launchBrowser(String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Please pass the correct browser -----------> " + browser);
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}
	/**
	 * 
	 * @param url
	 */
	public void launchUrl(String url) {
		driver.get(url);
		
	}
	
	/**
	 * 
	 * @return
	 */
	public String doGetTitle() {
		return driver.getTitle();
	}
	
	/**
	 * 
	 */
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
