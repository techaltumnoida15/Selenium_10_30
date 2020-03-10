package basePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC04 extends BaseClass{

	@Test
	public void testCase04() throws Exception{
		driver.get("https://www.financialexpress.com/");
		Thread.sleep(2000);
		//Verify that user is on correct page
		
		
		//Select Bank
		//Click dropdown
		WebElement bankDropdown = driver.findElement(By.cssSelector("span[id='select2-bank-name-container']"));
		bankDropdown.click();
		System.out.println("Click on Bank dropdown.");
		
		String bankName = "Abu Dhabi";
		WebElement bankSearchTextBox = driver.findElement(By.cssSelector("input[class='select2-search__field']"));
		bankSearchTextBox.sendKeys(bankName);
		
		//Bank suggestion list
		WebElement bankSearchResult = driver.findElement(By.id("select2-bank-name-results"));
		List<WebElement> bankList = bankSearchResult.findElements(By.tagName("li"));
		System.out.println("Total suggestion after type bank name are = " + bankList.size());
		
		//Select Bank
		for(int i = 0; i<bankList.size(); i++) {
			String bankNameInSuggestionList = bankList.get(i).getText();
			System.out.println("Bank name in suggestion list is = " + bankNameInSuggestionList);
				
			if(bankNameInSuggestionList.equals("No results found")) {
				System.out.println("FAIL - No bank suggestion appear.");
				throw new Exception("FAIL - No bank suggestion appear.");
			}
				
			else if(bankNameInSuggestionList.contains(bankName)) {
				bankList.get(i).click();
				break;
			}
		}
		
		//Select State
		
	}
}
