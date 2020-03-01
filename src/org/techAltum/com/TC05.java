package org.techAltum.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC05 extends BaseClass{

	@Test
	public void testCase05() throws Exception{
		driver.get("http://www.cheapoair.com");
		
		//Radio Buttons
		WebElement oneWay = driver.findElement(By.id("onewayTrip"));
		//Check box, Radio button
		if(oneWay.isSelected()) {
			System.out.println("Oneway is selected");
		}
		else {
			System.out.println("One way is not selected.");
		}
		
		//========================
		WebElement flightTab = driver.findElement(By.id("flights"));
		String isFlightTabSelected = flightTab.getAttribute("aria-selected");
		
		//Assert.assertTrue(isFlightTabSelected.equals("true"));
		
		if(isFlightTabSelected.equals("true")) {
			System.out.println("Flight Tab is selected");
		}
		else {
			System.out.println("Flight Tab is not selected");
		}
		
		//======================
		WebElement traveler_Coach = driver.findElement(By.id("travellerButton"));
		traveler_Coach.click();
		
		WebElement travelClass = driver.findElement(By.cssSelector("select[class='form-control select-class']"));
		
		Select select = new Select(travelClass);
		select.selectByIndex(1);
	}	
}








