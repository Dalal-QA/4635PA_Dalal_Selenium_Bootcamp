package test_searchflights;

import base.BasePage;
import flightsearchpage.FlightSearchPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFlight extends BasePage {

    @Test(priority = 3,groups={"BAT"})

    public void testDoSearchFlight(){
        HomePage homePage=new HomePage();
        String cityA="Philadelphia";
        String cityB="Greece";
        FlightSearchPage flightSearchPage= homePage.doSearch(cityA,cityB);
        Assert.assertTrue(isElementVisible(flightSearchPage.resultText));
    }
}
