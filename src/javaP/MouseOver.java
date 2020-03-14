package javaP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class MouseOver extends BaseClass{

	@Test
	public void mouseOverTest() throws Exception{

		driver.get("http://www.naukri.com");
		
		//Find that element where you want to mouse over
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(jobs);
		act.build().perform();
	}
}
