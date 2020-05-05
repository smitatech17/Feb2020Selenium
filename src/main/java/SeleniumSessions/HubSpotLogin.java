package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//best practice is never mix implicitly and explicitly wait together and avoid using implicitly wait and if you are using it, since it's global wait, nullify it after few steps
		//prefer explicitly/custom wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
		By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		By signUp = By.linkText("Sign up");
		
		driver.get("https://app.hubspot.com/login");
		
//		elementUtil.clickWhenReady(signUp, 6);
		
		String title = elementUtil.waitForTitleToBePresent("HubSpot Login", 10);
		System.out.println(title);
		
		
		elementUtil.waitForElementToBePresent(emailId, 15).sendKeys("naveen@gmail.com");
		elementUtil.doSendKeys(password, "test@123");
		
		//elementUtil.doClick(loginButton);
		elementUtil.waitForElementToBePresent(loginButton, 5).click();
	}

}
