package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage
{
    public void clickOnElement(By by ) { driver.findElement(by).click();}


    public static String getTextFromElement (By by) {
        return  driver.findElement(by).getText();
    }

    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void selectTextFromDropDown(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static String createTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }
    public static void assertTextMessage(String message, String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(message, expected, actual);
    }
    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }


    }



