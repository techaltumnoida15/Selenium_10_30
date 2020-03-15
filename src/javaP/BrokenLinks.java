package javaP;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class BrokenLinks extends BaseClass{

	@Test
	public void handleMultipleBrowserWindows() throws Exception{
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		//Count total links on page
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total lionks are = " + totalLinks.size());
		
		List<WebElement> myL = new ArrayList<WebElement>();
		
		for(int i = 0; i<totalLinks.size(); i++) {
			String linkText = totalLinks.get(i).getText();
			//System.out.println("Text in link " + i + " is " + linkText);
			
			if(!linkText.isEmpty() && !(linkText == null)) {
				myL.add(totalLinks.get(i));
			}
		}
		
		for(int j = 0; j<myL.size(); j++) {
			String text = myL.get(j).getText();	
			System.out.println("Text in link " + j + " is " + text);
		}
	}
}
