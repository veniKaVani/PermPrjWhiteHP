package neverdelete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectors14 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.cssSelector("input[id!!!!='username']")).sendKeys("test");//invalid/illegal selector exception
		
		//driver.findElement(By.cssSelector(cssSelector);
		
		//id
		//#id
		//tagname#id
		//#username
		//input#username
		
		//class
		//.class
		//tagname.class
		//.login-email
		
		//class + id:
		//.class#id
		//#id.class
		//input.login-email#username
		//input#username.login-email
		
		//.c1.c2.c3.c4.....cn
		//tagname.c1.c2.c3....cn
		//.form-control.private-form_control.login-email
		//input.formcontrol.private-form_control.login-email
		//input.form-control.private-form_control.login-email#username
		//input.form-control#username.private-form_control.login-email
		
		//for other attributes nothing is defined like for id - hash and for class a dot
		
		//css with attributes:
		//tagname[attr='value'] - css--attr can be class or 
		//tagname[@attr='value'] - xpath
		
		//multiple square brackets for multiple attris in css selector:
		//input[id='input-email'][type='text'][name='email']
		
		//input[placeholder*='Address']  -- contains
		//input[placeholder^='E-Mail']  -- starts with
		//input[placeholder$='Address'] -- ends with
		
		//text in css: Not available
		
		//parent to child:
		//form#hs-login > div ----> direct child --8
		//form#hs-login div -----> direct + indirect child --22
		
		//select#Form_getForm_Country > option
		//select#Form_getForm_Country option
		
		//child to parent: not allowed - backward traversing not allowed in css
		//child to ancestor: not allowed - backward traversing not allowed in css
		//preceding sibling: not allowed - backward traversing not allowed in css
		
		//sibling in css:
		//label[for='input-email']+input#input-email -- immediate following sibling
		
		//option[value='Algeria']+option ----immediate following sibling -- 1
		//option[value='Algeria'] ~ option -- -- all following sibling --more
		
		//comma in css: is and ==> keep collecting and collecting
		//input#username,input#password,button#loginBtn,input#remember
		
//		int mand_fields_count =
//				driver.findElements
//				(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
//		
//		if(mand_fields_count == 4) {
//			System.out.println("all imp mandatory fields are present on the page");
//		}
		
		//not keyword in css: usage to exclude one of them out of many options
		// div.form-group > input.form-control:not(#input-email)
		
//		select#Form_getForm_Country > option:first-child
//		select#Form_getForm_Country > option:last-child
//		select#Form_getForm_Country > option:nth-child(4)
//		select#Form_getForm_Country > option:nth-last-child(2)
//		select#Form_getForm_Country > option:nth-child(even)
//		select#Form_getForm_Country > option:nth-child(odd)
//		select#Form_getForm_Country > option:nth-child(n+4)
//		select#Form_getForm_Country > option:nth-of-type(5n)
		
		//odd and even in xpath:
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 1] --odd
		//(//select[@id='Form_getForm_Country']/option)[position() mod 2 = 0] --even
		
		//cascaded classes in css:
		//tagname.c1.c2.c3...cn
		driver.findElement(By.cssSelector("input.form-control.private-form_control.login-email"));
		
		//                      xpath                  vs                      css:
		
		//1.performance         good                                           good
		//2.syntax              complex                                        simple
		//3.backward:            yes                                            no
		//4.sibling:             yes                                            yes--only following
		//5.text:                yes                                             no
		//6.ancestor/parent:     yes                                             no
		//7. ends-with           no                                              yes
		//8.index:               yes                                             yes+1
		//9. not:                yes                                             yes
		//10. comma:             no                                              yes
		//11. SVG:               yes                                             no
		//12. shadowDOM:         no                                              yes
		//13.Pseudo              no                                              yes
		//14. last:              yes                                             yes
		//15.first:              no                                              yes
		
		
		
		
		
		

	}

}
