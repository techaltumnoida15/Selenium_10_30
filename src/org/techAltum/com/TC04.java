package org.techAltum.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC04 extends BaseClass{

	@Test
	public void testCase04() throws Exception{
		driver.get("http://www.naukri.com");
		
		//Verify that user is on correct page
		String expected_Title = "Naukri.com";
		//String expected_Title = "Hi";
		String actual_Title = driver.getTitle();
		
		/*
		if(actual_Title.coselect[class='form-control select-class']ntains(expected_Title)) {
			System.out.println("User is on  correct page");
		}
		else {
			System.out.println("User is not on  correct page");
		}
		*/
		
		//Assertions - TestNG/JUnit
		Assert.assertTrue(actual_Title.contains(expected_Title), "User is not on correct page.");
		System.out.println("User is on correct page");
		
		//Mouse Over - More
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(more);
		act.build().perform();
		Thread.sleep(1000);
		
		//Click - FAQ
		WebElement faq = driver.findElement(By.xpath("//a[@title='FAQ']"));
		faq.click();
		
	}	
}
