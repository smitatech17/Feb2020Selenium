package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScoreCard {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/8531/scorecard/65577/england-vs-sri-lanka-8th-match-carlton-&-united-series-1998-99");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		getWicketTaker(driver,"NV Knight");
//		getWicketTaker(driver,"N Hussain");
//	
//		System.out.println(getScoreCard(driver, "NV Knight"));
//		System.out.println(getScoreCard(driver, "N Hussain"));
		
		System.out.println(getScoreCardBowler(driver, "ST Jayasuriya"));
		System.out.println(getScoreCardBowler(driver, "M Muralitharan"));
	
	}
	
	public static List<String> getScoreCardBowler(WebDriver driver, String playerName) {
		
		System.out.println("Score card for Bowling player : " + playerName);
		
		List<String> bowlingScoreCardList = new ArrayList<String>();
		
		List<WebElement> bowlingScoreList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td[@data-reactid]"));
		
		List<WebElement> bowlingList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td[@class]"));
		
		for(int k=0; k<bowlingScoreList.size(); k++) {
			String text = bowlingScoreList.get(k).getText();
			bowlingScoreCardList.add(text);
			
			for(int l=0; l<bowlingList.size(); l++) {
				String text1 = bowlingList.get(l).getText();
				bowlingScoreCardList.remove(text1);
			}
		
		}
		System.out.println("Bowling score list size : " + bowlingScoreCardList.size());
		
		return bowlingScoreCardList;
		
	}
	
	public static String getWicketTaker(WebDriver driver, String playerName) {
		System.out.println("wicket taker for player : " + playerName);
		String text = driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::div//following-sibling::div/a")).getText();
		System.out.println(text);
		return text;
	}
	
	public static List<String> getScoreCard(WebDriver driver, String playerName) {
		System.out.println("score card for player : " + playerName);
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='NV Knight']//parent::div//following-sibling::div[@class='cell runs']"));
		System.out.println("score list size : " + scoreList.size());
		for(int i=0; i<scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
		
	}
	

}
