package test_filterthesearchflight;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import resultspage.SearchPage;

public class TestFilterSearchFlight extends BasePage {

    @Test(priority= 4,groups={"BAT"})
    public void testFilterSearchForFlight(){
        HomePage homePage= new HomePage();
        SearchPage searchPage= new SearchPage();
        String countryName="Greece";
         homePage.doSearchFlights(countryName);
         searchPage.clickOnStopNumber();

        Assert.assertTrue(isElementVisible(searchPage.resetAllButton));
    }
}
