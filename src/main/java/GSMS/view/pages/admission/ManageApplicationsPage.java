package GSMS.view.pages.admission;

import GSMS.view.general.Layout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import view.core.Browser;

import java.util.ArrayList;

public class ManageApplicationsPage extends Layout {

    /**
     * Main constructor: Passing data to view class to save
     *
     * @param driver
     * @param browser
     */
    public ManageApplicationsPage(WebDriver driver, Browser browser) {
        super(driver, browser);
        this.setXPathRoot(super.container("container", -1));
    }
    /** -------------------------- Locators ------------------------------------ **/
    /**
     * Get locator of Applicant Search for the GA
     * @return
     */
    private WebElement getLocator_applicant_search(){

        return this.getBy(By.linkText("Applicant Search"));
    }


    /**
     * Get locator of Admission Desk for different years
     * @return
     */
    private WebElement getLocator_admission_desk_2019_2020_link(){

        return this.getBy(By.linkText("Admission Desk 2019-2020"));
    }

    private WebElement getLocator_admission_desk_2018_2019_link(){

        return this.getBy(By.linkText("Admission Desk 2018-2019"));
    }

    private WebElement getLocator_admission_desk_2017_2018_link(){

        return this.getBy(By.linkText("Admission Desk 2017-2018"));
    }

    private WebElement getLocator_admission_desk_2016_2017_link(){

        return this.getBy(By.linkText("Admission Desk 2016-2017"));
    }
    /**
     * Get locator of FGSR Admission Desk
     * @return
     */
    private WebElement getLocator_FGSR_admission_desk_link(){

        return this.getBy(By.linkText("FGSR Admission Desk"));
    }

    /**
     * Get locator of LOGOUT Link at the top of the page
     * @return
     */
    private WebElement getLocator_logout_link(){

        return this.getBy(By.linkText("LOGOUT"));
    }
    /**
     * Get locator of AWARDS Link at the top of the page
     * @return
     */
    private WebElement getLocator_awards_link(){

        return this.getBy(By.linkText("AWARDS"));
    }
    /**
     * Get locator of MANAGE APPLICATIONS Link at the top of the page
     * @return
     */
    private WebElement getLocator_manage_applications_link(){

        return this.getBy(By.linkText("MANAGE APPLICATIONS"));
    }
    /**
     * Get locator of MESSAGES Link at the top of the page
     * @return
     */
    private WebElement getLocator_messages_link(){

        return this.getBy(By.linkText("MESSAGES"));
    }

    private WebElement getLocator_page_title(){

        return this.getBy(By.id("sitsportalpagetitle"));
    }



    /** -------------------------- Methods ------------------------------------- **/

    public void click_LogoutLink(){
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(0));

        this.getLocator_logout_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_ManageApplicationsTab(){
        this.getLocator_manage_applications_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_AwardsTab(){
        this.getLocator_awards_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_ApplicantSearchLink(){
        this.getLocator_applicant_search().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_AdmissionDesk2018_2019_Link(){
        this.getLocator_admission_desk_2018_2019_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_AdmissionDesk2019_2020_Link(){
        this.getLocator_admission_desk_2019_2020_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_AdmissionDesk2017_2018_Link(){
        this.getLocator_admission_desk_2017_2018_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_AdmissionDesk2016_2017_Link(){
        this.getLocator_admission_desk_2016_2017_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click_FGSR_AdmissionDesk_Link(){
        this.getLocator_FGSR_admission_desk_link().click();
        try {
            this.wait_ms(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String get_page_title(){
        return this.getLocator_page_title().getText();
    }

    public void closeTabs() {

        String originalHandle = this.getDriver().getWindowHandle();
        for (String handle :  this.getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                this.getDriver().switchTo().window(handle);
                this.getDriver().close();
            }
        }

        this.getDriver().switchTo().window(originalHandle);
    }
}
