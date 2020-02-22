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

public class TC02 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		String browserName = "chrome";
		
		//Open Browser
		String projectPath = System.getProperty("user.dir");
		System.out.println("Projejct Path is = " + projectPath);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriversEXE\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Feb_16\\browserDriversEXE\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			//Firefox Browser
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDriversEXE\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else {
			//IE Browser
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDriversEXE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		
		driver.get("http://www.snapdeal.com");
	}
	
	@Test
	public void testCase01() throws Exception {
		//Enter some string to search
		//driver.findElement(By.id("inputValEnter")).sendKeys("Shirts");
		
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
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
