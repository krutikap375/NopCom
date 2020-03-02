package WebTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestUnit extends BaseTest {
    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    Bookpage bookpage = new Bookpage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuest checkoutAsGuest = new CheckoutAsGuest();

    @Test

    public void verifyGuestUserShouldBeAbleToCheckoutSuccessfully() {


        //verifyUserShouldBeOnHomePage
        homepage.verifyUserShouldBeOnHomePage();
        //clickOnBooksCategory
        homepage.clickOnBooksCategory();
        //verifyUserShouldBeOnBookPage
        bookpage.verifyUserShouldBeOnBookPage();
        //clickOnAddToCart
        bookpage.clickOnAddToCart();
        //clickOnShoppingCart
        bookpage.clickOnShoppingCart();
        //verifyUserShouldBeOnShoppingCartPage
        shoppingCartPage.verifyUserShouldBeOnShoppingCartPage();
        //clickOnTickBox
      shoppingCartPage.clickOnTickBox();
        //clickOnCheckout
        shoppingCartPage.clickOnCheckout();
        //clickOnCheckoutAsGuest
        checkoutAsGuest.clickOnCheckoutAsGuest();
        //verifyUserShouldBeOnCheckoutPage
        //verifyUserShouldBeAbleToCompleteCompulsoryFields
        //clickOnContinue
        //clickOnContinueShippingMethod
        //clickOnCreditCard
        //verifyUserShouldBeAbleToCompleteCompulsoryFieldsForCreditCard
        //clickOnContinue
        //ClickOnConfirm
        //VerifyUserShouldBeAbleToSeeThankYouMessage

    }

    @Test

    public void user_should_able_to_register_successfully() {
        // click on register button
        homepage.clickOnRegisterButton();
        //fill in registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.user_enters_all_registration_details();
        //user clicks on register button
        registrationPage.user_clicks_on_register_button();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        // homepage.verifyPrintPriceOfProduct();









    }
}






