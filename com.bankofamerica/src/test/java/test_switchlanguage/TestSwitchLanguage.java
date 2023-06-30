package test_switchlanguage;

import bankofamericapage.BankOfAmericaPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSwitchLanguage extends BasePage {

    /**Test Case :
     *1.Open the Bank of America website.
     *2.Select a different language from the available options.
     *3.Verify that the website content and interface are updated to the selected language.
     *4.Navigate to different pages on the website and ensure that the language remains consistent
     *5.Perform basic actions, such as clicking links or buttons, to confirm that the language translations are accurate and understandable.
     *
     */


    @Test(priority =1,groups={"BAT"})
    public void switchLanguages(){
        BankOfAmericaPage bankOfAmericaPage= new BankOfAmericaPage();
        bankOfAmericaPage.doSwitchLanguages();
        Assert.assertTrue(isElementVisible(bankOfAmericaPage.languageButton));
    }
}
