package WebTest;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils{

    private By _registerSuccessMessage = By.cssSelector("div.result");
    String expected = "Your registration completed";



    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL( "registerresult");
        assertTextMessage( "Registration not successful...", expected, _registerSuccessMessage);
    }
}
