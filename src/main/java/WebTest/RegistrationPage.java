package WebTest;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private String firstName = "Rajesh";
    private String lastName = "Khanna";
    private static String timestamp = createTimeStamp();

    public void verifyUserIsOnRegisterPage() {

        assertURL("register");
    }

    public void user_enters_all_registration_details() {

        sendText(_firstName, firstName);
        sendText(_lastName, lastName);
        sendText(_email, "test123" + timestamp + "@test.com");
        sendText(_password, "testing");
        sendText(_confirmPassword, "testing");


    }

    public void user_clicks_on_register_button() {

        clickOnElement(_registerButton);
    }
}








