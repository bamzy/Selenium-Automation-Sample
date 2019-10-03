package GSMS.view.pages.common;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import view.core.Browser;

public class ApplicantLoginPage extends Layout {

	public ApplicantLoginPage(WebDriver driver, Browser browser) {
		super(driver, browser);
		this.setXPathRoot(super.container("container", -1));
	}


	/** -------------------------- Locators ------------------------------------ **/

	/**
	 * Get locator of User Name
	 * @return
	 */
	private WebElement getLocator_user_name(){
		return this.getBy(By.id("MUA_CODE.DUMMY.MENSYS"));
	}

	/**
	 * Get locator of Password
	 * @return
	 */
	private WebElement getLocator_password(){
		return this.getBy(By.id("PASSWORD.DUMMY.MENSYS"));
	}


	/**
	 * Get locator of Password
	 * @return
	 */
	private WebElement getLocator_login_button(){
		return this.getBy(By.name("BP101.DUMMY_B.MENSYS.1"));
	}

	/** -------------------------- Methods ------------------------------------- **/


	public ApplicantLoginPage enterUserName(String value){
		this.getLocator_user_name().clear();
		this.getLocator_user_name().sendKeys(value);
		return this;
	}


	public ApplicantLoginPage enterPassword(String value){
		this.getLocator_password().clear();
		this.getLocator_password().sendKeys(value);
		return this;
	}


	public void clickLoginButton(){
		this.getLocator_login_button().click();
		try {
			this.wait_ms(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void performLogin(String username, String password){
		this.enterUserName(username);
		this.enterPassword(password);
		this.clickLoginButton();
	}

}
