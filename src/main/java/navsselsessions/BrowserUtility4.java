package navsselsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import navselxceptions.BrowserException;
/**
 * this method used to initialize the browser on the basis of given browsername
 * @author binduk
 */

public class BrowserUtility4 {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name provided: "+browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
		case "edge":
			driver = new EdgeDriver();
		case "firefox":
			driver = new FirefoxDriver();
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Plz pass the right browser");
			throw new BrowserException("BROWSER NOT FOUND");
		}
		return driver;
		
		
	}
	//http://google.com
	//https://google.com
	public void launchUrl(String url) {
		if(url == null) {
			throw new BrowserException("URL IS NULL");
		}
		
		if(url.indexOf("http")==0) {
			driver.get(url);
		}else {
			throw new BrowserException("HTTP IS MISSING IN URL");
		}
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
    public String getUrl() {
    	return driver.getCurrentUrl();
    }
    public void closeBrowser() {
    	driver.close();
    }
    public void quitBrowser() {
    	driver.quit();
    }
}
