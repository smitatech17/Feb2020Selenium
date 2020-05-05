package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGWithSeleniumCase1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().deleteAllCookies();
	}
	
	@Test(priority = 1)
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority = 2)
	public void urlCheck() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}
	
	@Test(priority = 3)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
