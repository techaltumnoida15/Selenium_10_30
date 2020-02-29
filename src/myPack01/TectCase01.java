package myPack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TectCase01 extends BaseClass{
	@Test
	public void loginTest() throws Exception{
		driver.get("http://www.makemytrip.com");
		//Check if user is on correct page
		String pageTitle = driver.getTitle();
		
		if(pageTitle.contains("MakeMyTrip")) {
			System.out.println("User is on correct page.");
			
			//1. Click on Login
			driver.findElement(By.xpath("//li[@data-cy='account']")).click();
			System.out.println("Click on Login.");
			
			//Wait
			Thread.sleep(2000);
			
			//Click on MyBiz account
			driver.findElement(By.xpath("//li[@data-acctype='myBiz']")).click();
			System.out.println("Click on MyBiz Account.");
			
			//Check which tab is selected
			String personalTabClassVal = driver.findElement(By.xpath("//li[@data-acctype='personal']")).getAttribute("class");
			System.out.println(personalTabClassVal);
			
			if(personalTabClassVal.equals("active")) {
				System.out.println("Personal Tab is selected.");
			}
			else {
				System.out.println("Personal Tab is NOT selected.");
			}
			//Enter mobile number
			
			
			//Click on Next
			//Verify login
		}
		else {
			System.out.println("User is not on correct page.");
		}
		
		
	}
}
