package test.gk.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public static RemoteWebDriver driver;

    public static RemoteWebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        goToUrl();
    }

    public void goToUrl(){
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver(){
        driver.quit();
    }
}
