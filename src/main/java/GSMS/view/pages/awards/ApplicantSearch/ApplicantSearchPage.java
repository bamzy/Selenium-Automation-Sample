package GSMS.view.pages.awards.ApplicantSearch;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import view.core.Browser;

import java.util.ArrayList;


public class ApplicantSearchPage extends Layout {

	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public ApplicantSearchPage(WebDriver driver, Browser browser) {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));

	}

	/** -------------------------- Locators ------------------------------------ **/
	/**
	 * Get locator of Las Name text area
	 * @return
	 */
	private WebElement getLocator_last_name_input(){



		return this.getBy(By.id("ANSWER.TTQ.MENSYS.2."));

	}

	/**
	 * Get locator of First Name text are
	 * @return
	 */
	private WebElement getLocator_first_name_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.3."));
	}



	/**
	 * Get locator of EMPLID text area
	 * @return
	 */
	private WebElement getLocator_emplid_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.4."));
	}


	/**
	 * Get locator of Department text area
	 * @return
	 */
	private WebElement getLocator_department_input(){

		return this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/ul/li/input"));
	}


	/**
	 * Get locator of Citizenship text area
	 * @return
	 */
	private WebElement getLocator_citizenship_input(){

		return this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/ul/li/input"));
	}


	/**
	 * Get locator of Program Name text area
	 * @return
	 */
	private WebElement getLocator_program_input(){

		return this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/ul/li/input"));
	}

	/**
	 * Get locator of Course vs Thesis text area
	 * @return
	 */
	private WebElement getLocator_course_or_thesis_input(){

		return this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/ul/li/input"));
	}
	/**
	 * Get locator of Search button
	 * @return
	 */
	private WebElement getLocator_search_button(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.9."));
	}

	/**
	 * Get locator of Close button
	 * @return
	 */
	private WebElement getLocator_close_tab_button(){

		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/form/div/div[2]/div/div/fieldset/div[8]/input[3]"));
	}


	/** -------------------------- Methods ------------------------------------- **/

	public ApplicantSearchPage select_years_input(String value){
		ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(1));



		this.getBy(By.id("ANSWER_TTQ_MENSYS_3__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_3__chosen\"]/ul/li/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_3__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_3__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);


		return this;

	}

	public ApplicantSearchPage enter_last_name_input(String value){
		this.getLocator_last_name_input().clear();
		this.getLocator_last_name_input().sendKeys(value);
		return this;

	}

	public ApplicantSearchPage enter_first_name_input(String value){
		this.getLocator_first_name_input().clear();
		this.getLocator_first_name_input().sendKeys(value);
		return this;

	}

	public ApplicantSearchPage enter_emplid_input(String value){
		this.getLocator_emplid_input().clear();
		this.getLocator_emplid_input().sendKeys(value);
		return this;

	}


	public ApplicantSearchPage select_department_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_5__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public ApplicantSearchPage select_citizenship_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_6__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);
		return this;
	}

	public ApplicantSearchPage select_program_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_7__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);
		return this;
	}

	public ApplicantSearchPage select_course_or_thesis_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_8__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);
		return this;
	}


	public void click_search_button(){
		this.getLocator_search_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void click_close_button(){
		this.getLocator_close_tab_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
