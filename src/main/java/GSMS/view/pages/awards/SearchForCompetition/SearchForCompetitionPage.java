package GSMS.view.pages.awards.SearchForCompetition;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.List;

public class SearchForCompetitionPage extends Layout {

	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public SearchForCompetitionPage(WebDriver driver, Browser browser) {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));
	}


	private WebElement getLocator_competition_name_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.3."));

	}

	private WebElement getLocator_award_name_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.4."));

	}

	private WebElement getLocator_search_button(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.7."));

	}

	private WebElement getLocator_add_button(){

		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/form/div/div/div/div[2]/div/div/fieldset/div[7]/input[3]"));

	}

	private WebElement getLocator_back_button(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.9."));

	}


	public SearchForCompetitionPage enter_competition_name_input(String value) {
		this.getLocator_competition_name_input().clear();
		this.getLocator_competition_name_input().sendKeys(value);
		return this;

	}


	public SearchForCompetitionPage enter_award_name_input(String value) {
		this.getLocator_award_name_input().clear();
		this.getLocator_award_name_input().sendKeys(value);
		return this;

	}


	public SearchForCompetitionPage select_year_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_2__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_2__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_2__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);
		return this;

	}


	public SearchForCompetitionPage select_committee_member_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_5__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public SearchForCompetitionPage select_status_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_6__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);
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
	
	public void click_add_button() {
		this.getLocator_add_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void click_back_button() {
		this.getLocator_back_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
