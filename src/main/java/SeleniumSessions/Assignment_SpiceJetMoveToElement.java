package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_SpiceJetMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		WebElement loginClick = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		Actions action = new Actions(driver);
		action.moveToElement(loginClick).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"menu-list-login\"]/li[1]/ul/li[1]/a")).click();
		
		
		
	}
}
