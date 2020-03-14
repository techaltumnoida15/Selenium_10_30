package myPack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC02 extends BaseClass{
	@Test
	public void testCase01() throws Exception {
		//Enter some string to search
		//driver.findElement(By.id("inputValEnter")).sendKeys("Shirts");
		
		driver.get("http://www.snapdeal.com");
		
		WebElement searchTextBox = driver.findElement(By.id("inputValEnter"));
		searchTextBox.sendKeys("Shirts");
		System.out.println("Search string is entered.");
		
		//Click on Search
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchButton.click();
		System.out.println("Click on Search Button");
		
		//Wait
		Thread.sleep(4000);
		
		//Capture total no. of items
		WebElement totalItems = driver.findElement(By.xpath("//div[@id='searchMessageContainer']/div/span"));
		String totalItemsText = totalItems.getText();
		System.out.println(totalItemsText);
		
		//To switch iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='loginIframe']")));
		
		//To come back to noraml content of page
		driver.switchTo().defaultContent();
	}
}