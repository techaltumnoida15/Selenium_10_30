package org.techAltum.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC03 extends BaseClass{

	@Test
	public void testCase03() throws Exception{
		driver.get("http://www.cheapoair.com");
		
		WebElement departCity = driver.findElement(By.cssSelector("input[class='form-control pr-4']"));
		departCity.sendKeys("LAS");
		
		Thread.sleep(4000);
		
		//Handle suggestion List
		
		List<WebElement> suggestionList = driver.findElement(By.cssSelector("div[class^='suggestion-box__content'] ul")).findElements(By.tagName("li"));
		
		System.out.println(suggestionList.size());
		
		for(int i = 0; i<suggestionList.size(); i++) {
			String suggestedCity = suggestionList.get(i).getText();
			System.out.println(suggestedCity);
			
			if(suggestedCity.contains("Nevada, United States")) {
				suggestionList.get(i).click();
				break;
			}
		}
	}
}
