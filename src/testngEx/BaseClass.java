package testngEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeClass 
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Projejct Path is = " + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriversEXE\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	@AfterClass
	public void closeBroswer() {
		driver.quit();
	}
}
