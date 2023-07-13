package test_filterattraction;

import attractionspage.AttractionPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterAttraction extends BasePage {

    @Test(priority=5,groups={"BAT"})
    public void testDoFilterAttraction(){
        HomePage homePage=new HomePage();
        AttractionPage attractionPage=homePage.clickOnAttractionButton();
        attractionPage.doFilterAttraction();
        Assert.assertTrue(isElementVisible(attractionPage.testResult));
    }
}
