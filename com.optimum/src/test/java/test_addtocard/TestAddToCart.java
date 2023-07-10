package test_addtocard;

import addtocart.AddToCard;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddToCart extends BasePage {

    @Test(priority = 1,groups={"BAT"})
    public void testAddToCart(){

        HomePage homePage=new HomePage();
        AddToCard addToCard= homePage.clickOnShopButton();
        String zipCode="10001";
        addToCard.doAddToCart(zipCode);
        Assert.assertTrue(isElementVisible(addToCard.cartText));

    }
}
