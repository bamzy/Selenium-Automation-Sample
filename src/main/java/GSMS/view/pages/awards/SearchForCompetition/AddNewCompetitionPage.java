package GSMS.view.pages.awards.SearchForCompetition;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

public class AddNewCompetitionPage extends Layout {
	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public AddNewCompetitionPage(WebDriver driver, Browser browser) {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));
	}


	private WebElement getLocator_name_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.4."));

	}

	private WebElement getLocator_subcomittee_date_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.5."));

	}

	private WebElement getLocator_final_meeting_date_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.5."));

	}



	private WebElement getLocator_save_button(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.7."));

	}

	private WebElement getLocator_cancel_button(){

		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/form/div/div/div/div[2]/div/div/fieldset/div[7]/div/div/div/input[3]"));

	}



	public AddNewCompetitionPage enter_competition_name_input(String value) {
		this.getLocator_name_input().clear();
		this.getLocator_name_input().sendKeys(value);
		return this;
	}


	public AddNewCompetitionPage enter_subcommittee_date_input(String value) {
		this.getLocator_subcomittee_date_input().clear();
		this.getLocator_subcomittee_date_input().sendKeys(value);
		return this;
	}

	public AddNewCompetitionPage enter_final_meeting_date_input(String value) {
		this.getLocator_final_meeting_date_input().clear();
		this.getLocator_final_meeting_date_input().sendKeys(value);
		return this;
	}


	public AddNewCompetitionPage select_academic_years_input(String value){

		this.getBy(By.id("ANSWER_TTQ_MENSYS_4__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_4__chosen\"]/ul/li/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_4__chosen\"]/ul/li/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_4__chosen\"]/ul/li/input")).sendKeys(Keys.RETURN);


		return this;

	}


	public void click_save_button(){
		this.getLocator_save_button().click();
		try {
			this.wait_ms(2000);
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
