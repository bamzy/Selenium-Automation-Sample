package GSMS.view.general;

import org.openqa.selenium.*;

import GSMS.controllers.env;
import view.core.Browser;
import view.core.View;

public class Layout extends View {
	
	/**
	 * Main constructor: Passing data to view class to save
	 * 
	 * @param driver
	 * @param browser
	 */
	public Layout(WebDriver driver, Browser browser){
		super(driver, browser);
		this.setXPathRoot(""); 
	}
	
	/**
	 * First implementation of the parent abstract method
	 * Ignores index and returns XPath of the content if requested
	 * throws and exception otherwise
	 */
	protected String container (String name, int index) {
		if (name.contentEquals("container")){
			return "//html/body/div[2]/div";
		}
		return "";
	}
	
	public void NavigateToURL(String URL){
		this.getDriver().get(env.get("baseUrl")+URL);
		try {
			this.wait_ms(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**  ------------------------ Locators -------------------------------------**/

	
	/** ------------------------- Methods ------------------------------- **/
	
	public void NavigateToSimpleSearch(){
		this.NavigateToURL("/index.php");
	}
	public void NavigateToLoginPage(){
		this.NavigateToURL("/urd/sits.urd/run/SIW_LGN");
	}

	public void NavigateToAdvancedSearch(){
		this.NavigateToURL("/advanced.php");
	}
}