package pages;

import commonpages.PropertyReader;
import org.openqa.selenium.By;
import pagetitleverification.RegisterPageVerification;
import utility.Utils;

public class RegistrationPage extends Utils {
    PropertyReader propertyReader=new PropertyReader();
    RegisterPageVerification registerPageVerification=new RegisterPageVerification();

    By _ClickRegisterLink=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By _SelectGenderFemale=By.id("gender-female");
    By _FirstName =By.id("FirstName");
    By _LastName =By.id("LastName");
    By _Email=By.name("Email");
    By _Password=By.id("Password");
    By _ConfirmPassword=By.id("ConfirmPassword");
    By _registerButton=By.xpath("//*[@id=\"register-button\"]");



    public void clickOnRegisterLink(){
        doClick(_ClickRegisterLink);
    }
    public void verifyRegisterPage(){
        registerPageVerification.registerPageTitleVerification();
    }
    public void doRegister(){

        doClick(_SelectGenderFemale);
        doSendKey(_FirstName,propertyReader.readProperty("firstname"));
        doSendKey(_LastName,propertyReader.readProperty("lastname"));
        doSendKey(_Email,propertyReader.readProperty("email"));
        doSendKey(_Password,propertyReader.readProperty("password"));
        doSendKey(_ConfirmPassword,propertyReader.readProperty("confirmpassword"));
    }
    public void clickOnRegisterButton(){
        doClick(_registerButton);
    }
    public void verifyAfterRegistrationMessage(){
        registerPageVerification.registeredMessageVerification();
    }
}
