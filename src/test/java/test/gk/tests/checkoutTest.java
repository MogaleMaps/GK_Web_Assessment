package test.gk.tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.gk.common.BaseClass;
import test.gk.pages.ShoppingCartPage;


@Test
public class checkoutTest extends BaseClass {

    @BeforeMethod
    public void setup(){
        super.setup();
    }

    @Description("As a user, I would like to see a pop-up alert displayed when I click the checkout button")
    public void popUpDisplayedOnCheckout(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.clickAddToCart();
        shoppingCartPage.clickCheckOut();
        Assert.assertTrue(shoppingCartPage.isAlertDisplayed());
    }
}
