package GSMS.view.pages.common;

import GSMS.view.general.Layout;
import org.openqa.selenium.WebDriver;
import view.core.Browser;

public class ApplicationLoginPage extends Layout {

    /**
     * Main constructor: Passing data to view class to save
     *
     * @param driver
     * @param browser
     */
    public ApplicationLoginPage(WebDriver driver, Browser browser) {
        super(driver, browser);
    }
}
