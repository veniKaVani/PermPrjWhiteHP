package neverdelete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept22a {
	/*
     * script----snch--app(slow,server slowness, network)
     *    
     * sync: wait
     * 1. static wait: JAVA Thread.sleep(1000): 10 secs: 2secs
     * 2. dynamic wait: 10 secs: 2secs: 8secs: will be cancelled
     * 2.a: Implicitly wait: global wait for all web elements
     * 2.b: Explicitly Wait: for a specific web element
     *      i: WebDriverWait(C)
     *      ii: FluentWait(C)
     *      
     *      Wait(I): until();-->FluentWait(C):until(){}+other methods-->WebDriverWait(C)      
     */
	/** presence of an element generic fn():
	 * An expectation for checking that an ele is present on the DOM of a page
	 * This does not necessarily mean that the ele is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	/** visibility of an ele fn():
	 * An expectation for checking that an element is present on the DOM of the page
	 * Visibility means that the element is not only displayed but also has a height and width
	 * that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	static WebDriver driver;
	public static void main(String[] args) {
//wait(I): until()-->FluentWait(C):(@overridden)until(){}+other methods-->WebDriverWait(C):no methods
		
	driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/en/30-day-free-trial");
	
	By fullName = By.id("Form_getForm_Name");
	waitForElementPresence(fullName, 10);
	
	By busEmail = By.id("Form_getForm_Email");
	getElement(busEmail);
	//e1:10 secs
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement fullName_ele = wait.until(ExpectedConditions.presenceOfElementLocated(fullName));
//	fullName_ele.sendKeys("testing");
//	
//	//e2:0
//	driver.findElement(By.id("Form_getForm_Email")).sendKeys("test@gmail.com");

	}
    //creating a generic for this 10 sec wait for particular ele to show up:
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
}
