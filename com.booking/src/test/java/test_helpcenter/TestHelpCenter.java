package test_helpcenter;

import attractionspage.AttractionPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpCenter extends BasePage {
    @Test(priority = 1, groups={"BAT"})
    public void testHelpCenter(){

        HomePage homePage=new HomePage();
        AttractionPage attractionPage=new AttractionPage();
        homePage.clickOnAttractionButton();
        attractionPage.helpCenter();
        switchToTab();
        Assert.assertTrue(isElementVisible(attractionPage.textResult));
    }
}
