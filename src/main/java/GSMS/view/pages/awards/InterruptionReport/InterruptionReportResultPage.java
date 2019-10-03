package GSMS.view.pages.awards.InterruptionReport;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.List;

public class InterruptionReportResultPage extends Layout {
	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public InterruptionReportResultPage(WebDriver driver, Browser browser) {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));
	}

	/** -------------------------- Locators ------------------------------------ **/
	/**
	 * Get locator of Export button
	 * @return
	 */
	private WebElement getLocator_export_button(){

		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/div[3]/input[1]"));
	}

	/**
	 * Get locator of Close button
	 * @return
	 */
	private WebElement getLocator_close_button(){

		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/div[3]/input[2]"));
	}


	private WebElement getLocator_interruption_report_table(){

		return this.getBy(By.xpath("DataTables_Table_0"));
	}


	/** -------------------------- Methods ------------------------------------- **/
	/**
	 * Click on the Export button
	 * @return
	 */
	public void click_Export_button(){
		this.getLocator_export_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Click on the Close button
	 * @return
	 */
	public void click_Close_button(){
		this.getLocator_close_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public boolean search_for_interruption(String emplID,String SISTID, String awardID){
		List<WebElement> tableRows = this.getLocator_interruption_report_table().findElements(By.tagName("tr"));
		for (WebElement row : tableRows ) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			if (columns.size()>=7){
				if (columns.get(0).getText().equalsIgnoreCase(emplID)
					&& columns.get(1).getText().equalsIgnoreCase(SISTID)
					&& columns.get(6).getText().equalsIgnoreCase(awardID))
					return true;
			}
		}
		return false;

	}


}
