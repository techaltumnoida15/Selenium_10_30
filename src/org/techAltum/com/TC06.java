package org.techAltum.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC06 extends BaseClass{

	@Test
	public void testCase04() throws Exception{
		driver.get("http://www.naukri.com");
		
		WebElement searchJobTextBox = driver.findElement(By.id("qsbClick"));
		searchJobTextBox.click();
		
		WebElement skills = driver.findElement(By.name("qp"));
		skills.sendKeys("Java");
		
		WebElement location = driver.findElement(By.name("ql"));
		location.sendKeys("Noida");
		
		//Press TAB key
		location.sendKeys(Keys.TAB);
		
		//Select Value - Exp
		WebElement experience = driver.findElement(By.cssSelector("input[class='sdTxt w85']"));
		/*
		Select select = new Select(experience);
		select.selectByIndex(3);
		*/
		
		experience.sendKeys(Keys.ARROW_DOWN);
		experience.sendKeys(Keys.ARROW_DOWN);
		experience.sendKeys(Keys.ARROW_DOWN);
		experience.sendKeys(Keys.ARROW_DOWN);
		experience.sendKeys(Keys.ARROW_DOWN);
		
		//Page refresh
		driver.navigate().refresh();
		
		//Back
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().deleteCookie(arg0);
	}	
}
