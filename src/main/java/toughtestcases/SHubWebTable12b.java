package toughtestcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable12b {
    static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		//3 different xpath locators for the users checkbox:
		//a[text()='Joe.Root']/ancestor::tr/td/input
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']    --using this one
		
		
		//moving the below code to a generic fn
//		String xpath = "//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']";
//		WebElement user = driver.findElement(By.xpath(xpath));
//		user.click();
		
		
		//finding elements right to the user--userRole,empName, status 
//		String moreUserInfo = "//a[text()='Joe.Root']/parent::td/following-sibling::td";
		
		//creating a generic again for moreUserInfo and traversing with a loop to print eachinfo
		
		doSelectUser("Joe.Root");
		doSelectUser("John.Smith");
		
		System.out.println(doGetMoreUserInfo("John.Smith"));
		System.out.println(doGetMoreUserInfo("Joe.Root"));
		

	}
   public static void doSelectUser(String username) {//making the name a generic- '"+username+"'
		String xpath = "//a[text()='"+username+"']/ancestor::tr//input[@type='checkbox']";
		WebElement user = driver.findElement(By.xpath(xpath));
		user.click();

   }
   public static List<String> doGetMoreUserInfo(String username) {//making the name a generic- '"+username+"'
	   String moreUserInfo = "//a[text()='"+username+"']/parent::td/following-sibling::td";
	  List<WebElement> userInfoList = driver.findElements(By.xpath(moreUserInfo));
	  List<String> updatedUserInfo = new ArrayList<String>();
	  
	  for(WebElement e:userInfoList) {
		  String userInfoTxt = e.getText();
		  updatedUserInfo.add(userInfoTxt);
	  }
	  return updatedUserInfo;
   }
}
