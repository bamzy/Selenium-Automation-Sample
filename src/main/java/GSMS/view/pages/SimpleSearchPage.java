package GSMS.view.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GSMS.view.general.Layout;
import view.core.Browser;

/**
 * Encapsulates the HTML elements for the simple search page
 * 
 * @author Rosie Gao
 *
 */
public class SimpleSearchPage extends Layout{

	public SimpleSearchPage(WebDriver driver, Browser browser) throws Exception {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));
	}
	
	/** -------------------------- Locators ------------------------------------ **/
	
	/**
	 * Get locator of search field
	 * @return
	 */
	private WebElement getLocator_search_field(){
		return this.getBy(By.name("search"));
	}
	
	/**
	 * Get locator of search button
	 * @return
	 */
	private WebElement getLocator_search_button(){
		return this.getByAbsoluteXPath("//button[@type='submit']");
	}
	
	/** -------------------------- Methods ------------------------------------- **/
	
	/**
	 * Enter a name and click search button
	 * @param value
	 */
	public void performSimpleSearch(String value){
		this.getLocator_search_field().clear();
		this.getLocator_search_field().sendKeys(value);
		this.getLocator_search_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}