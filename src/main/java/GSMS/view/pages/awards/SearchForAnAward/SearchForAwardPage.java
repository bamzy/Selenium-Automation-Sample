package GSMS.view.pages.awards.SearchForAnAward;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.ArrayList;

public class SearchForAwardPage extends Layout {

	public SearchForAwardPage(WebDriver driver, Browser browser) {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));

	}

	/** -------------------------- Locators ------------------------------------ **/

	/**
	 * Get locator of Years text area
	 * @return
	 */
	private WebElement getLocator_award_id_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.2."));
	}


	/**
	 * Get locator of Award Name text area
	 * @return
	 */
	private WebElement getLocator_award_name_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.3."));
	}

	/**
	 * Get locator of Speedcode text area
	 * @return
	 */
	private WebElement getLocator_speed_code_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.5."));
	}

	/**
	 * Get locator of Combo Code text area
	 * @return
	 */
	private WebElement getLocator_combo_code_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.6."));

	}


	/**
	 * Get locator of Search button
	 * @return
	 */
	private WebElement getLocator_search_button(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.10."));
	}


	/**
	 * Get locator of Back button
	 * @return
	 */
	private WebElement getLocator_back_button(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.12."));
	}




	/** -------------------------- Methods ------------------------------------- **/

	public SearchForAwardPage select_years_input(String value){

		this.getBy(By.id("ANSWER_TTQ_MENSYS_4__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_4__chosen\"]/ul/li/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_4__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_4__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);


		return this;

	}


	public SearchForAwardPage select_category_input(String value){

		this.getBy(By.id("ANSWER_TTQ_MENSYS_7__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/ul/li/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);


		return this;

	}


	public SearchForAwardPage select_pending_input(String value){

		this.getBy(By.id("ANSWER_TTQ_MENSYS_8__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/ul/li/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);


		return this;

	}


	public SearchForAwardPage select_funding_type_input(String value){

		this.getBy(By.id("ANSWER_TTQ_MENSYS_9__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_9__chosen\"]/ul/li/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_9__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_9__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);


		return this;

	}
	public void click_search_button() {
		this.getLocator_search_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}

	public SearchForAwardPage enter_award_id_input(String value){
		this.getLocator_award_id_input().clear();
		this.getLocator_award_id_input().sendKeys(value);
		return this;

	}

	public SearchForAwardPage enter_award_name_input(String value){
		this.getLocator_award_name_input().clear();
		this.getLocator_award_name_input().sendKeys(value);
		return this;

	}

	public SearchForAwardPage enter_speedcode_input(String value){
		this.getLocator_speed_code_input().clear();
		this.getLocator_speed_code_input().sendKeys(value);
		return this;

	}


	public SearchForAwardPage enter_combo_code_input(String value){
		this.getLocator_combo_code_input().clear();
		this.getLocator_combo_code_input().sendKeys(value);
		return this;

	}

	public void clickAddButton() {
		
	}
	
	public void clickBackButton() {
		
	}
}
