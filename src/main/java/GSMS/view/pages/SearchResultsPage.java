package GSMS.view.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import GSMS.view.general.Layout;
import view.core.Browser;

/**
 * Encapsulates the HTML elements for the search results page
 * 
 * @author Rosie Gao
 *
 */
public class SearchResultsPage extends Layout{

	public SearchResultsPage(WebDriver driver, Browser browser) throws Exception {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));
	}
	
	/** -------------------------- Locators ------------------------------------ **/
	
	/**
	 * Get locator of modify search button
	 * @return
	 */
	private WebElement getLocator_modify_search_button(){
		return this.getByAbsoluteXPath("//html/body/div[2]/div/a");
	}
	
	/**
	 * Get locator of family name sorting /<th/>
	 * @return
	 */
	private WebElement getLocator_family_name_sorting(){
		return this.getByAbsoluteXPath("//table[@id='results-table']/thead/tr[2]/th[1]");
	}
	
	/**
	 * Get locator of first name sorting /<th/>
	 * @return
	 */
	private WebElement getLocator_first_name_sorting(){
		return this.getByAbsoluteXPath("//table[@id='results-table']/thead/tr[2]/th[2]");
	}
	
	/**
	 * Get locator of year of birth sorting /<th/>
	 * @return
	 */
	private WebElement getLocator_year_of_birth_sorting(){
		return this.getByAbsoluteXPath("//table[@id='results-table']/thead/tr[2]/th[3]");
	}
	
	/**
	 * Get locator of data source sorting /<th/>
	 * @return
	 */
	private WebElement getLocator_data_source_sorting(){
		return this.getByAbsoluteXPath("//table[@id='results-table']/thead/tr[2]/th[5]");
	}
	
	/**
	 * Get locator of place of application sorting /<th/>
	 * @return
	 */
	private WebElement getLocator_place_of_application_sorting(){
		return this.getByAbsoluteXPath("//table[@id='results-table']/thead/tr[2]/th[4]");
	}
	
	/**
	 * Get locator of family name of a specific row in the table
	 * @return
	 */
	private WebElement getLocator_family_name(int index){
		return this.getByAbsoluteXPath(String.format("//table[@id='results-table']/tbody/tr[%d]/td[1]/a", index+1));
	}
	
	/**
	 * Get locator of first name of a specific row in the table
	 * @return
	 */
	private WebElement getLocator_first_name(int index){
		return this.getByAbsoluteXPath(String.format("//table[@id='results-table']/tbody/tr[%d]/td[2]/a", index+1));
	}
	
	/**
	 * Get locator of year of birth of a specific row in the table
	 * @return
	 */
	private WebElement getLocator_year_of_birth(int index){
		return this.getByAbsoluteXPath(String.format("//table[@id='results-table']/tbody/tr[%d]/td[3]", index+1));
	}
	
	/**
	 * Get locator of data source of a specific row in the table
	 * @return
	 */
	private WebElement getLocator_data_source(int index){
		return this.getByAbsoluteXPath(String.format("//table[@id='results-table']/tbody/tr[%d]/td[5]", index+1));
	}
	
	/**
	 * Get locator of place of application of a specific row in the table
	 * @return
	 */
	private WebElement getLocator_place_of_application(int index){
		return this.getByAbsoluteXPath(String.format("//table[@id='results-table']/tbody/tr[%d]/td[4]", index+1));
	}
	
	/**
	 * Get locator of document link
	 * @return
	 */
	private WebElement getLocator_document(String value){
		return this.getBy(By.linkText(value));
	}
	
	/** -------------------------- Methods ------------------------------------- **/
	
	/**
	 * Click modify search button
	 */
	public void clickModifySearch(){
		this.getLocator_modify_search_button().click();
	}
	
	/**
	 * Select to show /<amount/> entries in the results table 
	 * @param amount
	 */
	public void selectEntriesAmount(String amount){
		Select select = new Select(this.getBy(By.name("results-table_length")));
		select.selectByVisibleText(amount);
	}
	
	/**
	 * Family Name: activate to sort column descending
	 */
	public void descSortingFamilyName(){
		while(!this.getLocator_family_name_sorting().getAttribute("class").contains("sorting_desc")){
			this.getLocator_family_name_sorting().click();
		}
	}
	
	/**
	 * Family Name: activate to sort column ascending
	 */
	public void ascSortingFamilyName(){
		while(!this.getLocator_family_name_sorting().getAttribute("class").contains("sorting_asc")){
			this.getLocator_family_name_sorting().click();
		}
	}
	
	/**
	 * First Name: activate to sort column descending
	 */
	public void descSortingFirstName(){
		while(!this.getLocator_first_name_sorting().getAttribute("class").contains("sorting_desc")){
			this.getLocator_first_name_sorting().click();
		}
	}
	
	/**
	 * First Name: activate to sort column ascending
	 */
	public void ascSortingFirstName(){
		while(!this.getLocator_first_name_sorting().getAttribute("class").contains("sorting_asc")){
			this.getLocator_first_name_sorting().click();
		}
	}
	
	/**
	 * Year of Birth: activate to sort column descending
	 */
	public void descSortingYearOfBirth(){
		while(!this.getLocator_year_of_birth_sorting().getAttribute("class").contains("sorting_desc")){
			this.getLocator_year_of_birth_sorting().click();
		}
	}
	
	/**
	 * Year of Birth: activate to sort column ascending
	 */
	public void ascSortingYearOfBirth(){
		while(!this.getLocator_year_of_birth_sorting().getAttribute("class").contains("sorting_asc")){
			this.getLocator_year_of_birth_sorting().click();
		}
	}
	
	/**
	 * Data Source: activate to sort column descending
	 */
	public void descSortingDataSource(){
		while(!this.getLocator_data_source_sorting().getAttribute("class").contains("sorting_desc")){
			this.getLocator_data_source_sorting().click();
		}
	}
	
	/**
	 * Data Source: activate to sort column ascending
	 */
	public void ascSortingDataSource(){
		while(!this.getLocator_data_source_sorting().getAttribute("class").contains("sorting_asc")){
			this.getLocator_data_source_sorting().click();
		}
	}
	
	/**
	 * Place of Application: activate to sort column descending
	 */
	public void descSortingPlaceOfApplication(){
		while(!this.getLocator_place_of_application_sorting().getAttribute("class").contains("sorting_desc")){
			this.getLocator_place_of_application_sorting().click();
		}
	}
	
	/**
	 * Place of Application: activate to sort column ascending
	 */
	public void ascSortingPlaceOfApplication(){
		while(!this.getLocator_place_of_application_sorting().getAttribute("class").contains("sorting_asc")){
			this.getLocator_place_of_application_sorting().click();
		}
	}
	
	/**
	 * Get the family name of a specific row in the table
	 * @param index
	 * @return
	 */
	public String getFamilyName(int index){
		return this.getLocator_family_name(index).getText().trim();
	}
	
	/**
	 * Get the first name of a specific row in the table
	 * @param index
	 * @return
	 */
	public String getFirstName(int index){
		return this.getLocator_first_name(index).getText().trim();
	}
	
	/**
	 * Get the year of birth of a specific row in the table
	 * @param index
	 * @return
	 */
	public String getYearOfBirth(int index){
		return this.getLocator_year_of_birth(index).getText().trim();
	}
	
	/**
	 * Get the data source of a specific row in the table
	 * @param index
	 * @return
	 */
	public String getDataSource(int index){
		return this.getLocator_data_source(index).getText().trim();
	}
	
	/**
	 * Get the place of application of a specific row in the table
	 * @param index
	 * @return
	 */
	public String getPlaceofApplication(int index){
		return this.getLocator_place_of_application(index).getText().trim();
	}
	
	/**
	 * Click family name to go to the details view
	 * @param index
	 * @return
	 */
	public void clickFamilyName(int index){
		this.getLocator_family_name(index).click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Check if the search has matched records 
	 * @return
	 */
	public boolean hasNoMatchedRecords(){
		return this.getBy(By.id("no_records_td")).isDisplayed();
	}
	
	/**
	 * Click a document
	 * @return
	 */
	public void clickDocument(String value){
		this.getLocator_document(value).click();
	}
}