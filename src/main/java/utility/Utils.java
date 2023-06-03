package utility;

import commonpages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utils extends BasePage {
    public WebElement getElement(By locator){
        WebElement element =driver.findElement(locator);
        return element;
    }
    public void  doClick(By locator){
        getElement(locator).click();
    }
    public void doSendKey(By locator, String value){
        getElement(locator).sendKeys(value);
    }
}
