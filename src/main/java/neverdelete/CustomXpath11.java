package neverdelete;

import org.openqa.selenium.By;

public class CustomXpath11 {
    //practice url: naveen automation labs login page
	//@ -should be written only before attributes
	public static void main(String[] args) {
		
		//xpath: address of the element on html DOM
		//XML path
		//1. absolute xpath--also called full xpath
		//html/body/div[2]/div/div/div[3]/div[2]/div/div/div[2]/h4/a
		//2. relative xpath(custom xpath)--starts with 2 / slashes
		
		//1.using single attr:
		//tagname[@attrname='value']
		//input[@id='input-email']
		//input[@name='email']
		
		//input[@name]
		//input[@value='Login'] --1x3
		
		//2. using multiple attrs:
		//tagname[@attr1='value' and attr2='value' and @attr3='value']
		//input[@type='submit' and @value='Login'] --1
		
		//input[@type='submit'] ---3
		//input[@type='text' or @type='email']
		//input[@type and @value='Login']
		//input[@type and @value]
		//input[@type and @value]
		//a[@href]
		
		//3. text():
		//tagname[text()='value']
		//h2[text()='New Customer']
		//a[text()='Desktops']
		
		//4. text() and attributes:
		//tagname[@attr='value' and text()='value']
		//a[@class='dropdown-toggle' and text()='Desktops']
		//a[@class='dropdown-toggle' and text()='Desktops' and @data-toggle='dropdown']
		//a[text()='Desktops' and @class='dropdown-toggle' and @data-toggle='dropdown']
		
		//5. contains() with attr:
		//tagname[contains(@attrname, 'value')]
		//input[contains(@placeholder, 'E-Mail')]
		//input[contains(@placeholder, 'Address')]
		
		//tagname[contains(@attrName1, 'value') and @attr2='value']
		//input[contains(@placeholder, 'Address') and @name='email']
		//input[contains(@placeholder, 'Address') and @name='email' and contains(@id, 'email')]
		//a[contains(@href,'wishlist')]
		
		//dynamic ids:
		//<input id=firstname_123/>
		//<input id=firstname_345/>
		//<input id=firstname_900/>
		//<input id=firstname_987/>
		
		//input[contains(@id,'firstname_')]
		//avoid regular exp in the xpath=>regex
		
		//6. contains() with text():
		//tagname[contains(text(),'value')]
		//p[contains(text(),'Customer service',IT, and CRM software')]
		//a[contains(text(),'Customer')]
		
		//7. contains() with text() and attr:
		//tagname[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Notebooks',) and contains(@href,'category&path')]
		
		//tagname[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']
		
		//8. starts-with():
		//tagname[starts-with(@attr,value)]
		//input[starts-with(@placeholder,'E-Mail')]
		
		//9. starts-with() with text():
		//tagname[starts-with(text(),'value;)]
		//a[starts-with(text(),'Forgotten')]
		
		//dynamic ids:
		//<input id=firstname_123_login/>
		//<input id=firstname_345_login/>
		
		//10. ends-with()?? --is not supported in xpath
		
		//11. index based xpath:
		//capture gp: put everything inside a bracket=> (xpath)
		//no comment for this (//a[text()='Forgotten Password'])[1]
		//  (a[@class='list-group-item'])[13]
		//  (//input[@class='form-control'])[6]
		//  (//input[@class='form-control'])[position()=4]
		//  (//input[@class='form-control'])[4]
		//  (//input[@class='form-control'])[last()]
		
	    //  ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		//  ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-last()+1]
		
		By fgt_pwd = By.xpath("(//a[text()='Forgotten Password'])[1]");
		
		//*
		//*[@id]
		//*[@class='form-control'] ---100 --->6
		//input[@class='form-control'] --20 --->6
		//*[@href]
		
		//label[normalize-space()='No']       ---very imp
		
		//xpaths which contain star--searches the entire DOM for the element until it finds a mathc
		//so takes longertime than the other ones without *
		//better to avoid those as they take long time to find the element
		
		
		
		
		
		
		
		
		
		
		

	}

}
