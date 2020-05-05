package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\smi_s\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\smi_s\\Downloads\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("browser is not found---" + browser);
		}
		
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		
	}

}
