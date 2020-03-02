package WebTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();


    @BeforeTest
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
    }

   @AfterTest
   public void closeBrowser()
   {
    browserSelector.closeBrowser();
    }


}
