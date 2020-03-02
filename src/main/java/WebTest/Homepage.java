package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends Utils {

  private By _registerLink = By.xpath("//a[contains(., 'Register')]");
  private By _clickOnBooks = By.linkText("Books");

  public void clickOnRegisterButton() {

    clickOnElement(_registerLink);
  }

  public void verifyUserShouldBeOnHomePage()
  {
    assertURL("nopcommerce");
  }

  public void clickOnBooksCategory() {
    clickOnElement(_clickOnBooks);
  }
}
  //public void verifyPrintPriceOfProduct() {

  //  List<WebElement> productList = (List<WebElement>) driver.findElement(By.xpath("//span[@class='price actual-price']"));

    //System.out.println(productList.size());

   // for (WebElement we : productList) {
    //  System.out.println(we.getText());

 // }







