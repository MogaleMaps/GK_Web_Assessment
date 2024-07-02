package test.gk.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.gk.common.BaseClass;


public class ShoppingCartPage extends BaseClass {

    public ShoppingCartPage(RemoteWebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = ".sc-124al1g-0.jCsgpZ")
    public WebElement addToCartButton;

    @FindBy(how = How.CSS, using = ".sc-1h98xa9-11.gnXVNU")
    public WebElement checkoutButton;

    public void clickAddToCart(){
        addToCartButton.click();
    }

    public void clickCheckOut(){
        checkoutButton.click();
    }

    public boolean isAlertDisplayed(){
        try {
            getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
