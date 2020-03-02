package WebTest;

import org.openqa.selenium.By;

public class Bookpage extends Utils{

    private By _clickOnAddToCart = By.xpath("//input[contains(@onclick, 'addproducttocart/catalog/38/1/1')]");
    private By _clickOnShoppingCart = By.className("cart-label");

    public static void verifyUserShouldBeOnBookPage() {

        assertURL("books");
    }

    public void clickOnAddToCart() {

        clickOnElement(_clickOnAddToCart);

    }

    public void clickOnShoppingCart() {

        clickOnElement(_clickOnShoppingCart);

    }
}
