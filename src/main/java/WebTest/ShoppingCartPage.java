package WebTest;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils  {
    private By _clickOnTickBox = By.id("termsofservice");
    private By _clickOnCheckout = By.xpath("//button[@id=\"checkout\"]");

    public static void verifyUserShouldBeOnShoppingCartPage() {

        assertURL("cart");
    }

   public void clickOnTickBox() {

    clickOnElement(_clickOnTickBox);

   }

    public void clickOnCheckout() {

        clickOnElement(_clickOnCheckout);
    }
}
