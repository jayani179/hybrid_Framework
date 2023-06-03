package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;

public class RegistrationSteps {
    RegistrationPage registrationPage=new RegistrationPage();


        @When("^User click on Register Link$")
        public void user_click_on_Register_Link() {
            registrationPage.clickOnRegisterLink();

        }

        @Then("^user verify registration page$")
        public void user_verify_registration_page() {
            registrationPage.verifyRegisterPage();
        }

        @Then("^User enter Registration details$")
        public void user_enter_Registration_details() {
            registrationPage.doRegister();
        }

        @Then("^Click on register button$")
        public void click_on_register_button() {

        }
    @Then("^Verify the message$")
    public void verify_the_message()  {

            registrationPage.verifyAfterRegistrationMessage();
    }
}
