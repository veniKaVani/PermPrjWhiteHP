package neverdelete;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with; 

public class RelativeLocatorsConcept19a {

	public static void main(String[] args) throws InterruptedException {
		//selenium 4.x:
//                   above of ele		
//                     |		
//left of ele<------- ele ------> right of ele
//                     |
//  near of ele      below of ele	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("Brantford, Canada"));
		scrollIntoView(ele, driver);
		Thread.sleep(2000);
		
		String leftRank = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
        System.out.println(leftRank);	
	
	}
	
	public static void scrollIntoView(WebElement ele, WebDriver driver) {
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeAsyncScript("arguments[0].scrollIntoView(true);", ele);
	}

}
