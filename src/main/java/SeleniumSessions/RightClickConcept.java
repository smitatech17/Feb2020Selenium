package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		
//		Actions action = new Actions(driver);
//		
//		//In Selenium/html right click is called context click; technical name of right click is context click
//		action.contextClick(rightClickMe).build().perform();
//		
		List<WebElement> optionsList = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span"));
		
//		System.out.println("total rightClick options are :" + optionsList.size());
//		
//		for(int i=0;i<optionsList.size(); i++) {
//			String text = optionsList.get(i).getText();
//			System.out.println(i + "------>" + text);
//			
//			if(text.equals("Copy")) {
//				optionsList.get(i).click();
//				break;
//			}
//		
//		}
		
		//doRightClick(driver, rightClickMe, optionsList, "Quit");
		List<String> rightClickOptionsList = getRightClickOptions(driver, rightClickMe, optionsList);
		System.out.println("total right click options are : " + rightClickOptionsList.size());
		System.out.println(rightClickOptionsList);
	
	}

	
	//Generic method:
	public static void doRightClick(WebDriver driver, WebElement rightClickElement, List<WebElement> optionsList, String value) {
		
				Actions action = new Actions(driver);
		
		action.contextClick(rightClickElement).build().perform();
		
		System.out.println("total rightClick options are :" + optionsList.size());
		
		for(int i=0;i<optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			System.out.println(i + "------>" + text);
			
			if(text.equals(value)) {
				optionsList.get(i).click();
				break;
		
	}
	
		}
}
	
	public static List<String> getRightClickOptions(WebDriver driver, WebElement rightClickElement, List<WebElement> optionsList) {
		
		List<String> ar = new ArrayList<String>();
		
		Actions action = new Actions(driver);

		action.contextClick(rightClickElement).build().perform();

		for(int i=0;i<optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			ar.add(text);
	
	}
		return ar;
		
}
}
