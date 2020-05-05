package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//frame method is the overloaded method, means have to use either of them
		//frame is also a webelement; we can inspect the frame
		//iframe and frame are same
		
		//driver.switchTo().frame("main");// using name or ID
		//driver.switchTo().frame(2); // using index
		driver.switchTo().frame(driver.findElement(By.name("main")));//using webelement of the frame
		
		//frame will be having it's own html(DOM) inside the main DOM so have to switch to frame DOM otherwise we will get NoSuchElementException
		WebElement header = driver.findElement(By.tagName("h2"));
		System.out.println(header.getText());
		
		driver.switchTo().defaultContent(); //switch back to the default/main page
		
		
		
		
		
		

	}

}
