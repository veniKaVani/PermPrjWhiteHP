package navsseltests;

import navsselsessions.BrowserUtility4;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		
		BrowserUtility4 brUtil = new BrowserUtility4();
		brUtil.launchBrowser(browserName);
		
		brUtil.launchUrl("https://www.amazon.com");
	}

}
