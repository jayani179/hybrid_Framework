import commonpages.BasePage;
import commonpages.BrowserSelector;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.Utils;

public class Hooks extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){
        browserSelector.openSelectedBrowser();

    }
    @After
    public void closeBrowser(){
        driver.quit();

    }

}
