package testngEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC03 extends BaseClass {

	@Test
	public void test01() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement departCal = driver.findElement(By.cssSelector("input[id='cal0']"));
		departCal.click();
		System.out.println("Click on Calendar.");

		String a = "//div[@class='calendar__single-month active']/div[3]/div[";
		int i = 1;
		String b = "]/a";

		String xp = a + i + b;
		System.out.println("xp is = " + xp);

		for (i = 1; i <= 42; i++) {
			xp = a + i + b;
			try {
				String dateInCal = driver.findElement(By.xpath(xp)).getText();
				System.out.println(dateInCal);

				if (dateInCal.equals("18")) {
					System.out.println("inside if");
					// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(xp)));

					driver.findElement(By.xpath(xp)).click();
					break;
				}
			} catch (Exception ex) {
				System.out.println("No date found for xpath = " + xp);
			}
		}
	}
}
