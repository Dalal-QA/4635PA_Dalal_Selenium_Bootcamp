package test_switchlanguage;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitchLanguage extends BasePage {
    @Test(priority = 1,groups={"BAT"})
    public void testSwitchLanguage(){
        HomePage homePage= new HomePage();
        homePage.doSwitchLanguage();
        Assert.assertTrue(isElementVisible(homePage.seConnecterBouton));
    }
}
