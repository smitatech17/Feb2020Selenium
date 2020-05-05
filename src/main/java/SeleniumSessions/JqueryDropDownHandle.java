package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//1. single value selection
		//selectChoicevalues(driver, "choice 2");
		
		//2. Multiple value selections:
		//selectChoicevalues(driver, "choice 2", "choice 3", "choice 6 2 3", "choice 7");
			
		//3. Select all the values:
		selectChoicevalues(driver, "ALL");
		
		}
	
	public static void selectChoicevalues(WebDriver driver, String... value) { //dot operator, the property of dot operator will act as an array
		
	List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
	
	if(! value[0].equalsIgnoreCase("ALL")) {
	
	for(int i=0; i<choiceList.size(); i++) {
		String text = choiceList.get(i).getText();
		System.out.println(text);
		
		for(int k=0; k<value.length; k++) {
			if(text.equals(value[k])) {
				choiceList.get(i).click();
				break;
		}
	}
		
	}
	
	}
	//select all the values:
	else {
		try {
		for(int all=0; all<choiceList.size(); all++) {
			choiceList.get(all).click();
		}
	}
	catch(Exception e) {
		
	}
	}
	}
}
