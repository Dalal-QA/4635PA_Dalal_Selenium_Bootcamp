package test_shppingcart;

import authentication.DashboardPage;
import authentication.LoginPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchpage.ModelSelectedPage;
import shoppingpage.ShoppingPage;

public class TestShoppingCart extends BasePage {

    @Test(priority = 1, groups = {"BAT"})

    public void testShoppingCart() throws InterruptedException {

        HomePage homePage= new HomePage();
        LoginPage loginPage=homePage.clickOnLoginLink();
        String email="sadouni.dalal@gmail.com";
        String password="AydenLiam1213@";
        DashboardPage dashboardPage=loginPage.doSign(email, password);

        ShoppingPage shoppingPage = dashboardPage.switchToNewTab();
        shoppingPage.doShop();
        String zipCode="19145";
        shoppingPage.enterDealerLocation(zipCode);
        Thread.sleep(5000);
        shoppingPage.clickOnLockUpButton();




    }
}
