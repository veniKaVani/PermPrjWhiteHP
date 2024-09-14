package neverdelete;

public class XpathAxes11b {

	public static void main(String[] args) {
		
		// parent to direct child: /
		// form/div/input

		// parent to direct + indirect child: //
		//select[@id='Form_getForm_Country']//option
		//div[@id='content']//img
		
		//child to parent;
		//input[@id='input-email']/../../../../../../..
		//input[@id='input-email']/parent::div/parent::form
		
		//input[@id='input-email']/ancestor::form
		//input[@id='input-email']/ancestor::form/ancestor::body/ancestor::html
		
		//a[text()='Recurring payments']/ancestor::aside
		
		//a[text()='Recurring payments']/preceding-sibling::a[text()='Downloads']
		
	}

}
