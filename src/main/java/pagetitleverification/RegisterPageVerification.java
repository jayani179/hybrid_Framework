package pagetitleverification;

import org.testng.Assert;
import utility.Constants;
import utility.Utils;


public class RegisterPageVerification extends Utils {
    public void registerPageTitleVerification(){
        String title=driver.getTitle();
        Assert.assertEquals(title,Constants.REGISTER_TITLE);
    }

    public void registeredMessageVerification(){
       Assert.assertEquals(driver.getTitle(),Constants.REGISTER_TITLE);
    }

}
