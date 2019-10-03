package GSMS.view.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import GSMS.view.general.Layout;
import view.core.Browser;

/**
 * Encapsulates the HTML elements for the advanced search page
 * 
 * @author Rosie Gao
 *
 */
public class AdvancedSearchPage extends Layout{

	public AdvancedSearchPage(WebDriver driver, Browser browser) throws Exception {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));
	}
	
	/** -------------------------- Locators ------------------------------------ **/
	
	/**
	 * Get locator of Data Source
	 * @return
	 */
	private WebElement getLocator_data_source(){
		return this.getBy(By.name("source"));
	}
	
	/**
	 * Get locator of Family Name
	 * @return
	 */
	private WebElement getLocator_family_name(){
		return this.getBy(By.name("family_name"));
	}
	
	/**
	 * Get locator of First Name
	 * @return
	 */
	private WebElement getLocator_first_name(){
		return this.getBy(By.name("first_name"));
	}
	
	/**
	 * Get locator of Year of Birth
	 * @return
	 */
	private WebElement getLocator_year_of_birth(){
		return this.getBy(By.name("year"));
	}
	
	/**
	 * Get locator of Year of Application
	 * @return
	 */
	private WebElement getLocator_year_of_application(){
		return this.getBy(By.name("app_year"));
	}
	
	/**
	 * Get locator of Place of Birth
	 * @return
	 */
	private WebElement getLocator_place_of_birth(){
		return this.getBy(By.name("birth_location"));
	}
	
	/**
	 * Get locator of Residence Location
	 * @return
	 */
	private WebElement getLocator_residence_location(){
		return this.getBy(By.name("res_location"));
	}
	
	/**
	 * Get locator of Place of Application
	 * @return
	 */
	private WebElement getLocator_place_of_application(){
		return this.getBy(By.name("app_location"));
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
	 * Select data source
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage selectDataSource(String value){
		Select select = new Select(this.getLocator_data_source());
		select.selectByVisibleText(value);
		return this;
	}
	
	/**
	 * Enter family name
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage enterFamilyName(String value){
		this.getLocator_family_name().clear();
		this.getLocator_family_name().sendKeys(value);
		return this;
	}
	
	/**
	 * Enter first name
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage enterFirstName(String value){
		this.getLocator_first_name().clear();
		this.getLocator_first_name().sendKeys(value);
		return this;
	}
	
	/**
	 * Enter year of birth
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage enterYearOfBirth(String value){
		this.getLocator_year_of_birth().clear();
		this.getLocator_year_of_birth().sendKeys(value);
		return this;
	}
	
	/**
	 * Enter year of application
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage enterYearOfApplication(String value){
		this.getLocator_year_of_application().clear();
		this.getLocator_year_of_application().sendKeys(value);
		return this;
	}
	
	/**
	 * Enter Place of Birth
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage enterPlaceOfBirth(String value){
		this.getLocator_place_of_birth().clear();
		this.getLocator_place_of_birth().sendKeys(value);
		return this;
	}
	
	/**
	 * Enter Residence Location
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage enterResidenceLocation(String value){
		this.getLocator_residence_location().clear();
		this.getLocator_residence_location().sendKeys(value);
		return this;
	}
	
	/**
	 * Enter Place of Application
	 * @param value
	 * @return
	 */
	public AdvancedSearchPage enterPlaceOfApplication(String value){
		this.getLocator_place_of_application().clear();
		this.getLocator_place_of_application().sendKeys(value);
		return this;
	}
	
	/**
	 * Click search button
	 * @param value
	 */
	public void performAdvancedSearch(){
		this.getLocator_search_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}