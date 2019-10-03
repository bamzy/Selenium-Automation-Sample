package GSMS.view.pages.awards.AddNewAward;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.ArrayList;


public class AddNewAwardPage extends Layout {

	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public AddNewAwardPage(WebDriver driver, Browser browser) {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));



	}

	/** -------------------------- Locators ------------------------------------ **/
	/**
	 * Get locator of Short Name text area
	 * @return
	 */
	private WebElement getLocator_short_name_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.3."));
	}

	/**
	 * Get locator of Full Name text are
	 * @return
	 */
	private WebElement getLocator_full_name_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.4."));
	}

	/**
	 * Get locator of Save button
	 * @return
	 */
	private WebElement getLocator_save_button(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.7."));
	}

	/**
	 * Get locator of Cancel button
	 * @return
	 */
	private WebElement getLocator_cancel_button(){

		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/form/div/div/div/div[2]/div/div/fieldset/div[7]/div/div/div/input[3]"));
	}



	/** -------------------------- Methods ------------------------------------- **/

	public AddNewAwardPage select_years_input(String value){
		ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(1));

		this.getBy(By.id("ANSWER_TTQ_MENSYS_5__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);

		return this;

	}

	public AddNewAwardPage enter_short_name_input(String value){
		ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(1));

		this.getLocator_short_name_input().clear();
		this.getLocator_short_name_input().sendKeys(value);
		return this;

	}

	public AddNewAwardPage enter_full_name_input(String value){
		this.getLocator_full_name_input().clear();
		this.getLocator_full_name_input().sendKeys(value);
		return this;

	}




	public AddNewAwardPage select_funding_type_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_6__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}




	public void click_save_button(){
		this.getLocator_save_button().click();
		try {
			this.wait_ms(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void click_cancel_button(){
		this.getLocator_cancel_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
