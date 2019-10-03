package GSMS.view.pages.awards.AddNewAward;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;


public class AddNewAwardHubPage extends AddNewAwardPage {

	/**
	 * Main constructor: Passing data to view class to save
	 *
	 * @param driver
	 * @param browser
	 */
	public AddNewAwardHubPage(WebDriver driver, Browser browser) {
		super(driver, browser);




	}

	/** -------------------------- Locators ------------------------------------ **/
	/**
	 * Get locator of Approval Date text area
	 * @return
	 */
	private WebElement getLocator_approval_date_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.4."));
	}



	private WebElement getLocator_start_date_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.24."));
	}

	private WebElement getLocator_end_date_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.25."));
	}

	private WebElement getLocator_display_end_date_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.26."));
	}

	private WebElement getLocator_application_deadline_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.27."));
	}

	private WebElement getLocator_nomination_deadline_input(){
		return this.getBy(By.id("ANSWER.TTQ.MENSYS.28."));
	}

	private WebElement getLocator_update_button(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.55."));
	}

	private WebElement getLocator_award_or_honor_code_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.13."));
	}

	private WebElement getLocator_max_awards_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.36."));
	}

	private WebElement getLocator_min_awards_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.37."));
	}

	private WebElement getLocator_default_or_max_value_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.38."));
	}

	private WebElement getLocator_min_amount_input(){

		return this.getBy(By.id("ANSWER.TTQ.MENSYS.39."));
	}

	private WebElement getLocator_close_button(){

		return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/form/div/div/div/div[2]/div/div/fieldset/div[5]/div[3]/input[4]"));
	}

	/** -------------------------- Methods ------------------------------------- **/


	public AddNewAwardHubPage enter_approval_date_input(String value){
		this.getLocator_approval_date_input().clear();
		this.getLocator_approval_date_input().sendKeys(value);
		return this;

	}

	public AddNewAwardHubPage enter_start_date_input(String value){
		this.getLocator_start_date_input().clear();
		this.getLocator_start_date_input().sendKeys(value);
		return this;

	}

	public AddNewAwardHubPage enter_end_date_input(String value){
		this.getLocator_end_date_input().clear();
		this.getLocator_end_date_input().sendKeys(value);
		return this;

	}


	public AddNewAwardHubPage enter_display_end_date_input(String value){
		this.getLocator_display_end_date_input().clear();
		this.getLocator_display_end_date_input().sendKeys(value);
		return this;

	}

	public AddNewAwardHubPage enter_application_deadline_input(String value){
		this.getLocator_application_deadline_input().clear();
		this.getLocator_application_deadline_input().sendKeys(value);
		return this;

	}

	public AddNewAwardHubPage enter_nomination_deadline_input(String value){
		this.getLocator_nomination_deadline_input().clear();
		this.getLocator_nomination_deadline_input().sendKeys(value);
		return this;

	}







	public AddNewAwardHubPage enter_award_or_honour_code_input(String value){
		this.getLocator_award_or_honor_code_input().clear();
		this.getLocator_award_or_honor_code_input().sendKeys(value);
		return this;

	}

	public AddNewAwardHubPage enter_max_awards_input(String value){
		this.getLocator_max_awards_input().clear();
		this.getLocator_max_awards_input().sendKeys(value);
		return this;

	}


	public AddNewAwardHubPage enter_min_awards_input(String value){
		this.getLocator_min_awards_input().clear();
		this.getLocator_min_awards_input().sendKeys(value);
		return this;

	}


	public AddNewAwardHubPage enter_default_or_max_value_input(String value){
		this.getLocator_default_or_max_value_input().clear();
		this.getLocator_default_or_max_value_input().sendKeys(value);
		return this;

	}

	public AddNewAwardHubPage enter_min_amount_input(String value){
		this.getLocator_min_amount_input().clear();
		this.getLocator_min_amount_input().sendKeys(value);
		return this;

	}




	public AddNewAwardHubPage select_award_type_input(String value){
//		shortWait(2000);
		this.getBy(By.id("ANSWER_TTQ_MENSYS_5__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_5__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;
	}

	public AddNewAwardHubPage select_award_category_input(String value){
//		shortWait(2000);
		this.getBy(By.id("ANSWER_TTQ_MENSYS_6__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_6__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_program_input(String value){
//		shortWait(2000);
		this.getBy(By.id("ANSWER_TTQ_MENSYS_8__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_8__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_citizenship_status_input(String value){
//		shortWait(2000);
		this.getBy(By.id("ANSWER_TTQ_MENSYS_7__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_7__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_topup_award_input(String value){
//		shortWait(2000);
		this.getBy(By.id("ANSWER_TTQ_MENSYS_12__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_12__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_12__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_12__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_12__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}


	public AddNewAwardHubPage select_payment_frequency_input(String value){
//		shortWait(2000);
		this.getBy(By.id("ANSWER_TTQ_MENSYS_15__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_15__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_15__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_15__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_15__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}
	private void shortWait(int duration){
		try {
			this.wait_ms(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public AddNewAwardHubPage select_course_or_thesis_based_input(String value){
//		shortWait(2000);
		this.getBy(By.id("ANSWER_TTQ_MENSYS_16__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_16__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_16__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_16__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_16__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_administrative_authority_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_17__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_17__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_17__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_17__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_17__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_period_slot_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_23__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_23__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_23__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_23__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_23__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_status_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_32__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_32__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_32__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_32__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_32__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}


	public AddNewAwardHubPage select_advisor_one_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_33__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_33__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_33__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_33__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_33__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_advisor_two_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_34__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_34__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_34__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_34__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_34__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_workflow_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_35__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_35__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_35__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_35__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_35__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_fund_group_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_40__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_40__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_40__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_40__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_40__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}

	public AddNewAwardHubPage select_eligibility_group_input(String value){
		this.getBy(By.id("ANSWER_TTQ_MENSYS_41__chosen")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_41__chosen\"]/div/div/input")).click();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_41__chosen\"]/div/div/input")).clear();
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_41__chosen\"]/div/div/input")).sendKeys(value);
		this.getBy(By.xpath("//*[@id=\"ANSWER_TTQ_MENSYS_41__chosen\"]/div/div/input")).sendKeys(Keys.RETURN);
		return this;

	}





	public void click_update_button(){
		this.getLocator_update_button().click();
		try {
			this.wait_ms(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void click_close_button(){
		this.getLocator_close_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
