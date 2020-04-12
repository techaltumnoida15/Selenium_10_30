package testngEx;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC02 extends BaseClass{

	@Test
	public void test02() {
		//driver.get("http://www.google.com");
		
		String pageTitle = driver.getCurrentUrl();
		//System.out.println("Page title is = " + pageTitle);
		Reporter.log("Page title is = " + pageTitle);
	}
}
