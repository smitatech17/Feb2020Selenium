package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelectClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
//		List<WebElement> valuesList = driver.findElements(By.xpath("//select[@id='month']/option"));
//		
//		System.out.println(valuesList.size());
//		
//		for(int i=0; i<valuesList.size(); i++) {
//			if(valuesList.get(i).getText().equals("May")) {
//				valuesList.get(i).click();
//				break;
//		}
//	}
		//using Generic method:
		String monthOptionsXpath = "//select[@id='month']/option";
		String dayOptionsXpath = "//select[@id='day']/option";
		String yearOptionsXpath = "//select[@id='year']/option";
		
		String monthOptionsCSS = "select#month option";
		String dayOptionsCSS = "select#day option";
		String yearOptionsCSS = "select#year option";
		
		doSelectValueFromDropDownWithOutSelect(driver, "css", monthOptionsCSS, "Jul");
		doSelectValueFromDropDownWithOutSelect(driver, "css", dayOptionsCSS, "22");
		doSelectValueFromDropDownWithOutSelect(driver, "css", yearOptionsCSS, "2005");
		
		String dob = "Feb-16-2003";
		
		doSelectValueFromDropDownWithOutSelect(driver, "xpath", monthOptionsXpath, dob.split("-")[0]);
		doSelectValueFromDropDownWithOutSelect(driver, "xpath", dayOptionsXpath, dob.split("-")[1]);
		doSelectValueFromDropDownWithOutSelect(driver, "xpath", yearOptionsXpath, dob.split("-")[2]);
		
		}

	//Generic method:
	public static void doSelectValueFromDropDownWithOutSelect(WebDriver driver, String locator, String locatorValue, String value) {
		
		List<WebElement> valuesList =null;
		
		if(locator.equals("xpath")) {
		valuesList = driver.findElements(By.xpath(locatorValue));
		}
		else if(locator.equals("css")) {
			valuesList = driver.findElements(By.cssSelector(locatorValue));
		}
		
		System.out.println(valuesList.size());
		
		for(int i=0; i<valuesList.size(); i++) {
			if(valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
		}
	}
		
	}
	
		
}
