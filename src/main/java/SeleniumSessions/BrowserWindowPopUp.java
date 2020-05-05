package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		//switch from one browser window Id to next browser window ID; window ID is always unique
		//Iterator concept
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator(); // the moment we use the iterator, the iterator points just above the set object
		
		String parentWindowID = it.next(); // to move the iterator to the next
		System.out.println("parent window id is : " + parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("child window id is : " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is : " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title is : " + driver.getTitle());
		
		

	}

}
