package GSMS.view.pages.awards.SearchForCompetition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.List;

public class SearchForCompetitionResultPage extends SearchForCompetitionPage {

	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public SearchForCompetitionResultPage(WebDriver driver, Browser browser) {
		super(driver, browser);
	}

	/** -------------------------- Locators ------------------------------------ **/
	/**
	 * Get locator of Years text area
	 * @return
	 */

	private WebElement getLocator_competition_result_table()
	{
		return this.getBy(By.id("DataTables_Table_0"));
	}

	public boolean search_for_competition_row(String year,
											  String competitionName,
											  String awards,
											  String status,
											  String subCommitteeRankingDeadline,
											  String adjudicationMeetingDate){
		List<WebElement> tableRows = this.getLocator_competition_result_table().findElements(By.tagName("tr"));
		for (WebElement row : tableRows ) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			if (columns.size()>=5){
				if (columns.get(0).getText().trim().equalsIgnoreCase(year)
						&& columns.get(1).getText().trim().equalsIgnoreCase(competitionName)
						&& columns.get(2).getText().trim().equalsIgnoreCase(awards)
						&& columns.get(3).getText().trim().equalsIgnoreCase(status)
						&& columns.get(4).getText().trim().equalsIgnoreCase(subCommitteeRankingDeadline)
						&& columns.get(5).getText().trim().equalsIgnoreCase(adjudicationMeetingDate)

				)
					return true;
			}
		}
		return false;

	}

}
