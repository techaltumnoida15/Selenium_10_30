package testngEx;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC02 extends BaseClass{

	@Test
	public void test02() {
		//driver.get("http://www.google.com");
		
		String pageTitle = driver.getCurrentUrl();
		//System.out.println("Page title is = " + pageTitle);
		Reporter.log("Page title is = " + pageTitle);
		
		//driver.findElement(By.id("qbc")).click();
		
		Assert.assertTrue(false);
		
		//Assertions
		
		int i = 2; 
		int j = 3;
		
		Assert.assertEquals(i, j);
		
//		if(i == j) {
//			System.out.println("Equal");
//		}
//		else {
//			System.out.println("Not Equal");
//		}
	}
}
