package GSMS.view.pages.awards;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.List;

public class AwardPortalPage extends Layout {
    /**
     * Main constructor: Passing data to view class to save
     *
     * @param driver
     * @param browser
     */
    public AwardPortalPage(WebDriver driver, Browser browser) {
        super(driver, browser);
        this.setXPathRoot(super.container("container", -1));
    }

    /** -------------------------- Locators ------------------------------------ **/
    /**
     * Get locator of Applicant Search for the GA
     * @return
     */
    private WebElement getLocator_upcoming_awards_table(){

        return this.getBy(By.id("DataTables_Table_1"));
    }

    /**
     * Get locator of Search for an Award
     * @return
     */
    private WebElement getLocator_search_for_an_awards_link(){

        return this.getBy(By.linkText("Search for an Award"));
    }

    /**
     * Get locator of Add New Award
     * @return
     */
    private WebElement getLocator_add_new_awards_link(){

        return this.getBy(By.linkText("Add New Award"));
    }

    /**
     * Get locator of Manage Financial Accounts link
     * @return
     */
    private WebElement getLocator_manage_financial_accounts_link(){

        return this.getBy(By.linkText("Manage Financial Accounts"));
    }


    /**
     * Get locator of Search for A Competition link
     * @return
     */
    private WebElement getLocator_search_for_a_competition_link(){

        return this.getBy(By.linkText("Search for a Competition"));
    }


    /**
     * Get locator of Award Tenure Report link
     * @return
     */
    private WebElement getLocator_award_tenure_report_link(){

        return this.getBy(By.linkText("Award Tenure Report"));
    }


    /**
     * Get locator of Interruptions Report link
     * @return
     */
    private WebElement getLocator_interruptions_report_link(){

        return this.getBy(By.linkText("Interruptions Report"));
    }

    /**
     * Get locator of Applicant Search link
     * @return
     */
    private WebElement getLocator_applicant_search_link(){

        return this.getBy(By.linkText("Applicant Search"));
    }

    /** -------------------------- Methods ------------------------------------- **/

    public boolean search_by_award_id(String id){
        List<WebElement> tableRows = this.getLocator_upcoming_awards_table().findElements(By.tagName("tr"));
        for (WebElement row : tableRows ) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            if (columns.size()>2){
                if (columns.get(1).getText().equalsIgnoreCase(id))
                    return true;
            }
        }
        return false;

    }

    /**
     * Click on the Search for an Award link
     * @return
     */
    public void click_Search_for_an_award_link(){
        this.getLocator_search_for_an_awards_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Click on the Add New Award link
     * @return
     */
    public void click_Add_new_Award_link(){
        this.getLocator_add_new_awards_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Click on the Manage Financial Accounts link
     * @return
     */
    public void click_Manage_financial_accounts_link(){
        this.getLocator_manage_financial_accounts_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Click on the Search for a Competition link
     * @return
     */
    public void click_Search_for_a_competition_link(){
        this.getLocator_manage_financial_accounts_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Click on the Award Tenure Report link
     * @return
     */
    public void click_Award_tenure_report_link(){
        this.getLocator_award_tenure_report_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Click on the Interruptions Report link
     * @return
     */
    public void click_Interruptions_report_link(){
        this.getLocator_interruptions_report_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Click on the Applicant Search link
     * @return
     */
    public void click_Applicant_search_link(){
        this.getLocator_applicant_search_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
