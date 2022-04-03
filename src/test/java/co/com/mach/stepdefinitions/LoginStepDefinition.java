package co.com.mach.stepdefinitions;

import co.com.mach.SetupClass;
import co.com.mach.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginStepDefinition extends SetupClass {

    private final String MESSAGE_SUCCESS_ALERT = "Welcome to your account. Here you can manage all of your personal information and orders.";
    LoginPage loginPage;

    @Given("that a customer has an active account")
    public void thatACustomerHasAnActiveAccount() {
        try {
            loginPage.openTheBrowserWithDefaultUrl(BASE_URL);
            loginPage.enterLoginSection();
        } catch (Exception e) {
            Assertions.fail("Could not access the address");
        }
    }

    @When("he enters with valid credentials")
    public void heEntersWithValidCredentials() {
        try {

           loginPage.loginUsers("prueba@prueba.com","prueba");
           Assertions.assertEquals(MESSAGE_SUCCESS_ALERT,
                   loginPage.getSUCCESS_MESSAGE_LOGIN().getText());

        } catch (Exception e) {
            Assertions.fail("Authentication failed.");
        }
    }

    @Then("the should be able to enter the platform successfully")
    public void theShouldBeAbleToEnterThePlatformSuccessfully() {
        try {
            loginPage.goToHomePage();
            loginPage.clickButtonLogout();

        } catch (Exception e) {
            Assertions.fail("Item not found");
        }
    }
}


