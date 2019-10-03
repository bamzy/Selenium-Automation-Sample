package GSMS.view.pages.awards.AwardTenureReport;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.List;

public class AwardTenureReportSearchResultPage extends AwardTenureReportSearchPage {
	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public AwardTenureReportSearchResultPage(WebDriver driver, Browser browser) {
		super(driver, browser);
	}

	/** -------------------------- Locators ------------------------------------ **/

	/**
	 * Get locator of Data table
	 * @return
	 */
	private WebElement getLocator_tenure_report_table()
	{
		return this.getBy(By.id("DataTables_Table_0"));
	}


	/**
	 * Get locator of Export Button
	 * @return
	 */
	private WebElement getLocator_export_button()
	{
		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/form/div/div/div/div[2]/div/div/fieldset/div[10]/input[4]"));
	}
	/** -------------------------- Methods ------------------------------------- **/

	public boolean search_for_report_row(String emplid, String lastName, String firstName, String awardName, String year, String department, String startDate, String endDate, String amount){
		List<WebElement> tableRows = this.getLocator_tenure_report_table().findElements(By.tagName("tr"));
		for (WebElement row : tableRows ) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			if (columns.size()>=9){
				if (columns.get(0).getText().trim().equalsIgnoreCase(lastName)
						&& columns.get(1).getText().trim().equalsIgnoreCase(firstName)
						&& columns.get(2).getText().trim().equalsIgnoreCase(emplid)
						&& columns.get(3).getText().trim().equalsIgnoreCase(awardName)
						&& columns.get(4).getText().trim().equalsIgnoreCase(year)
						&& columns.get(5).getText().trim().equalsIgnoreCase(department)
						&& columns.get(6).getText().trim().equalsIgnoreCase(startDate)
						&& columns.get(7).getText().trim().equalsIgnoreCase(endDate)
						&& columns.get(8).getText().trim().equalsIgnoreCase(amount)
				)
					return true;
			}
		}
		return false;

	}

	/**
	 * Click on the Export results button
	 * @return
	 */
	public void click_export_button(){
		this.getLocator_export_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



}
