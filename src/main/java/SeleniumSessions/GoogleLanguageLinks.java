package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> linksList = driver.findElements(By.xpath("//div[@id='SivCob']/a"));
		System.out.println(linksList.size());
		
		for(int i=0; i<linksList.size(); i++) {
			String text = linksList.get(i).getText();
			System.out.println(text);
			linksList.get(i).click();//StaleElementReferenceExeption // after clicking on one of the link; the DOM of the page changes so we have to get the webelement again
			linksList = driver.findElements(By.xpath("//div[@id='SivCob']/a"));
			
			
		}

	}

}
