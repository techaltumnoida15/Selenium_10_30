package javaP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import basePack.BaseClass;

public class HandleMultipleBrowserWins extends BaseClass{

	@Test
	public void handleMultipleBrowserWindows() throws Exception{
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("Total open wins are = " + windowHandles.size());
		System.out.println(windowHandles);
		
		List<String> myL = new ArrayList<String>();
		Iterator<String> Itr = windowHandles.iterator();
		
		for(int i = 0; i<windowHandles.size(); i++) {
			myL.add(Itr.next());
		}
		
		driver.switchTo().window(myL.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		Thread.sleep(5000);
	}
}
