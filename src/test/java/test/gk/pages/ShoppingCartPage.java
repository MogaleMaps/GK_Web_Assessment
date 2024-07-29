package test.gk.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.gk.common.Base;

import java.time.Duration;


public class ShoppingCartPage extends Base {

    WebDriverWait wait;

    public ShoppingCartPage(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(how = How.CSS, using = ".sc-124al1g-0.jCsgpZ")
    public WebElement addToCartButton;

    @FindBy(how = How.CSS, using = ".sc-1h98xa9-11.gnXVNU")
    public WebElement checkoutButton;

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickCheckOut() {
        checkoutButton.click();
    }

    public Alert isAlertDisplayed() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }
}