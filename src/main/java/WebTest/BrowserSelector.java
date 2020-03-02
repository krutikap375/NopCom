package WebTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils{

    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    public void setUpBrowser()
    {
        if (browser.equalsIgnoreCase( "chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase( "firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();}
        else {
            System.out.println("Browser Name is not valid or empty :" + browser);
        }

        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);

    }

    public void closeBrowser()
    {
        driver.close();
    }
}
