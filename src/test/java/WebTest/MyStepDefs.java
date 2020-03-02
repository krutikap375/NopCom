package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Given("user is on register page")
    public void user_is_on_register_page() {
        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
    }

    @When("user enters all registration details")
    public void user_enters_all_registration_details() {
        registrationPage.user_enters_all_registration_details();
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        registrationPage.user_clicks_on_register_button();
    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

}
