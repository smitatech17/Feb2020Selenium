package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {
		
		//select html tag based drop downs
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(month);
		select.selectByVisibleText("Mar");
		select.selectByIndex(8);
		select.selectByValue("5");
		
//		select.deselectAll();
		
		System.out.println(select.isMultiple());
		
//		List<WebElement> monthList = select.getOptions();//return the list of webelements and tells us how many options are there in the dropdown
//		System.out.println("total values in month drop down : "+ monthList.size());
//		for(int i=0; i<monthList.size(); i++) {
//			System.out.println(monthList.get(i).getText());
//		}
	
//		Select select1 = new Select(day);
//		select1.selectByVisibleText("16");
//		select1.selectByIndex(8);
//		select1.selectByValue("5");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1990");
//		select2.selectByIndex(8);
//		select2.selectByValue("2006");
		
		//Method Overloading:
//		selectDropDown(day,"5");
//		selectDropDown(month, "Jun");
//		selectDropDown(year, "1980");
		
		selectDropDown(month,5);
		selectDropDown(day,16);
		selectDropDown(year,50);
		
		getDropDownValues(month);
		getDropDownValues(day);
		getDropDownValues(year);
		
	}
	
	public static void getDropDownValues(WebElement element) {
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		
		System.out.println("total values in drop down : "+ optionsList.size());
		for(int i=0; i<optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
		}
	}
	
	public static void selectDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
}
