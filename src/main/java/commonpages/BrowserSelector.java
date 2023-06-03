package commonpages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage{

    PropertyReader propertyReader=new PropertyReader();
    String browserName = propertyReader.readProperty("browser");
    String url=propertyReader.readProperty("url");
public void openSelectedBrowser() {

    if (browserName.equals("chrome")){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        
    }
    else {
        System.out.println("Wrong browser name "+browserName);
    }
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
   // driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
   // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get(url);
}
}
