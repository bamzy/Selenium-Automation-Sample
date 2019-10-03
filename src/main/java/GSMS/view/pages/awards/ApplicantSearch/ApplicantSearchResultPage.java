package GSMS.view.pages.awards.ApplicantSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import view.core.Browser;

import java.util.List;

public class ApplicantSearchResultPage extends ApplicantSearchPage{

    /**
     * Main constructor: Passing data to view class to save
     *
     * @param driver
     * @param browser
     */
    public ApplicantSearchResultPage(WebDriver driver, Browser browser) {
        super(driver, browser);
    }

    /** -------------------------- Locators ------------------------------------ **/

    /**
     * Get locator of Data table
     * @return
     */
    private WebElement getLocator_tenure_report_table()
    {
        return this.getBy(By.id("DataTables_Table_0"));
    }


    /**
     * Get locator of Export Button
     * @return
     */
    private WebElement getLocator_export_button()
    {
        return this.getBy(By.xpath("//*[@id=\"sitspagecontent\"]/form/div/div/div/div[2]/div/div/fieldset/div[10]/input[4]"));
    }
    /** -------------------------- Methods ------------------------------------- **/

    public boolean search_for_applicant_result_row(String lastName, String firstName,String emplid, String department, String citizenship,String fulltimeorParttime, String program, String courseVSthesis){
        List<WebElement> tableRows = this.getLocator_tenure_report_table().findElements(By.tagName("tr"));
        for (WebElement row : tableRows ) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            if (columns.size()>=9){
                if (columns.get(0).getText().trim().equalsIgnoreCase(lastName)
                        && columns.get(1).getText().trim().equalsIgnoreCase(firstName)
                        && columns.get(2).getText().trim().equalsIgnoreCase(emplid)
                        && columns.get(3).getText().trim().equalsIgnoreCase(department)
                        && columns.get(4).getText().trim().equalsIgnoreCase(citizenship)
                        && columns.get(5).getText().trim().equalsIgnoreCase(fulltimeorParttime)
                        && columns.get(6).getText().trim().equalsIgnoreCase(program)
                        && columns.get(7).getText().trim().equalsIgnoreCase(courseVSthesis)

                )
                    return true;
            }
        }
        return false;

    }



}
