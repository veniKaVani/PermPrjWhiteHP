package toughtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoDelhiVsUpWomens12c {
     static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");
		driver.manage().window().maximize();
		
		//starting point --Dinesh Vrinda xpath:
		
		//xpath: of wicketTaker of Dinesh Vrinda
		//span[text()='Dinesh Vrinda']/ancestor::td/following-sibling::td/span/span
		
		String xpath = "//span[text()='Dinesh Vrinda']/ancestor::td/following-sibling::td/span/span";
		
		String wkt_takerName = driver.findElement(By.xpath("xpath")).getText();
				
		
		System.out.println(wkt_takerName);
		
		
		

	}

}
