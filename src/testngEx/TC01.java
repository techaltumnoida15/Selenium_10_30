package testngEx;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC01 extends BaseClass{
	
	@Test(enabled =  false)
	//@Test
	public void test01() {
		//driver.get("http://www.google.com");
		
		String pageTitle = driver.getTitle();
		//System.out.println("Page title is = " + pageTitle);
		
		Reporter.log("Page title is = " + pageTitle);
		
	}

}
