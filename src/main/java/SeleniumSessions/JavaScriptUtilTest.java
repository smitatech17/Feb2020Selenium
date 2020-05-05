package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptUtilTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		
		By emailId = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@type='submit']");
		By menuLinks = By.cssSelector("ul.nav.navbar-nav.navbar-right");
		By forgotPwdLink = By.linkText("Forgot Password?");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
		
//		String innertext = jsUtil.getPageInnerText();
//		System.out.println(innertext);
//		
//		if(innertext.contains("Import & Export")) {
//			System.out.println("yes, this text is present");
//		}
//		
//		System.out.println(jsUtil.getBrowserInfo());
		
//		jsUtil.refreshBrowserByJS();
		
//		driver.findElement(emailId).sendKeys("batchautomation");
//		driver.findElement(password).sendKeys("Test@12345");
//		jsUtil.clickElementByJS(driver.findElement(login));
		
//		jsUtil.drawBorder(driver.findElement(login));
//		jsUtil.drawBorder(driver.findElement(menuLinks));
		
//		jsUtil.flash(driver.findElement(login));
		
//		jsUtil.generateAlert("login is done");
		
//		jsUtil.scrollPageDown();
		
//		jsUtil.scrollIntoView(driver.findElement(forgotPwdLink));
//		jsUtil.flash(driver.findElement(forgotPwdLink));
		
			
	}

}
