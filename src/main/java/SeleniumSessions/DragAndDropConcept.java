package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);//for Actions class, we have to pass driver but on Select class, we have to pass an webelement
		//Actions class will be working from element to element only
		
		//action.dragAndDrop(source, target).build().perform();//we have to mention build and perform on action class; build will collect all the actions and perform method will perform the action on the webelement
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
		
		

	}

}
