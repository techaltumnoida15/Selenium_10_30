package basePack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC05 extends BaseClass{
//http://seletesting.blogspot.com/2014/03/how-to-check-broken-links-on-web-page.html
	@Test
	public void testCase05() throws Exception{
		driver.get("https://www.financialexpress.com/");
		Thread.sleep(2000);
		//Verify that user is on correct page
		
		//Fetch URL from TOP News section
		WebElement topNewsSection = driver.findElement(By.xpath("//div[@class='tnlistbox']"));
		List<WebElement> topNewsSectionList = topNewsSection.findElements(By.tagName("div"));
		System.out.println("Total DIVs are = " + topNewsSectionList.size());
		
		if(topNewsSectionList.size() == 0) {
			System.out.println("FAIL - No news displayed in Top News section.");
			throw new Exception("FAIL - No news displayed in Top News section.");
		}
		else {
			String a = "//div[@class='tnlistbox']/div[";
			int i = 1;
			String b = "]/h2/a";

			String xp = a + i + b;
			List<String> allURLs = new ArrayList<String>();
			
			for(i = 1; i<topNewsSectionList.size(); i++) {
				xp = a + i + b;
				String newsURL = driver.findElement(By.xpath(xp)).getAttribute("href");
				System.out.println(newsURL);
				allURLs.add(newsURL);
			}
			System.out.println("Total URL in list are = " + allURLs.size());
			//System.out.println(allURLs);
		}
		
		//Click on news - one by one and validate its result
		for(int j = 0; j<topNewsSectionList.size(); j++) {
			topNewsSectionList.get(j).click();
			Thread.sleep(1000);
			//System.out.println("Click on news link = " + (j+1));
		}
	}
}
