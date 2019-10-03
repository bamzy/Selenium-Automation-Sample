package GSMS.view.pages.awards.SearchForAnAward;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.List;

public class SearchForAwardResultPage extends SearchForAwardPage {
	public SearchForAwardResultPage(WebDriver driver, Browser browser) {
		super(driver, browser);
	}

	/** -------------------------- Locators ------------------------------------ **/

	/**
	 * Get locator of Data table
	 * @return
	 */
	private WebElement getLocator_award_result_table()
	{
		return this.getBy(By.id("DataTables_Table_0"));
	}


	public boolean search_for_award_row(String ID,
										 String name,
										 String year,
										 String sponsor,
										 String speedCode,
										 String comboCode,
										 String nomDeadline,
										 String pending,
										 String fundingType){
		List<WebElement> tableRows = this.getLocator_award_result_table().findElements(By.tagName("tr"));
		for (WebElement row : tableRows ) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			if (columns.size()>=10){
				if (columns.get(0).getText().trim().equalsIgnoreCase(ID)
						&& columns.get(1).getText().trim().equalsIgnoreCase(name)
						&& columns.get(2).getText().trim().equalsIgnoreCase(year)
						&& columns.get(3).getText().trim().equalsIgnoreCase(sponsor)
						&& columns.get(4).getText().trim().equalsIgnoreCase(speedCode)
						&& columns.get(5).getText().trim().equalsIgnoreCase(comboCode)
						&& columns.get(6).getText().trim().equalsIgnoreCase(nomDeadline)
						&& columns.get(7).getText().trim().equalsIgnoreCase(pending)
						&& columns.get(8).getText().trim().equalsIgnoreCase(fundingType)
				)
					return true;
			}
		}
		return false;

	}
}
