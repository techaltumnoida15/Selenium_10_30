package testngEx;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openBrowser(String browser) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Projejct Path is = " + projectPath);
		
		if(browser.equalsIgnoreCase("chrome")) {
			//Chrome
			System.out.println("Opening Chrome browser");
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriversEXE\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			//Firefox
			System.out.println("Opening Firefox browser");
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDriversEXE\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else {
			//IE
			System.out.println("Opening IE browser");
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDriversEXE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		//Assignment - 1. Execute tests on Edge browser
		// verbose = 1, see output of tests in console
		// verbose = 2, see output of tests in console
		// verbose = 3, see output of tests in console
		
		driver.manage().window().maximize();
		driver.get("http://www.cheapoair.com");
	}
	
	@AfterMethod
	public void closeBroswer(ITestResult result) throws Exception{
		String projectPath = System.getProperty("user.dir");
		
		
		if(!result.isSuccess()) {
			// Do this - Take Screenshot
			
			File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			
			//Each time screenshot should save with a different name
			//TestCaseName_DD_MM_YYYY-HH-mm-ss.jpeg
			File destScreenshot = new File(projectPath + "\\screenshot\\abc.jpeg");
			
			FileUtils.moveFile(srcScreenshot, destScreenshot);
		}
		driver.quit();
	}
}
