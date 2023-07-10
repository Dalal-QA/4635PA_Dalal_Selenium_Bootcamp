package test_contactus;

import base.BasePage;
import contactuspage.ContactUsPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUs extends BasePage {

    @Test(priority = 1,groups={"BAT"})
    public void testContactUs(){
        HomePage homePage=new HomePage();
        ContactUsPage contactUsPage=homePage.clickOnContactUs();
        contactUsPage.clickOnChatNowButton();
        Assert.assertTrue(isElementVisible(contactUsPage.chatWithUsText));
    }
}
