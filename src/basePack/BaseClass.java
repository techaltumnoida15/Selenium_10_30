package basePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	protected WebDriver driver;
	
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
}
