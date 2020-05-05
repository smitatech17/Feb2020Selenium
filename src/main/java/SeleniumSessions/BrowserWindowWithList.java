package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		//switch from one browser window Id to next browser window ID; window ID is always unique
		//Iterator concept
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);//convert set to list; pass the handles in the constructor of the Arraylist and will give you the list; the set will be converted to the list and will maintain the 0,1..index
		
		String parentWindowID = handlesList.get(0);
		System.out.println(parentWindowID);
		String childWindowID = handlesList.get(1);
		System.out.println(childWindowID);
		
	}

}
