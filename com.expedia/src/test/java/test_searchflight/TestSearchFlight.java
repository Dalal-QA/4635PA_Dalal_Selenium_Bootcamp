package test_searchflight;

import authentication.LoginPage;
import base.BasePage;
import flightsearchpage.FlightSearchPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSearchFlight extends BasePage {



    @Test(priority= 1, groups= {"BAT"},dataProvider = "searchFlightDataProvider")

    public void testSearchFlightData(String goingToCity,String fromDate,String toDate){

        FlightSearchPage flightSearchPage=new FlightSearchPage();
        flightSearchPage.searchFlight(goingToCity,fromDate,toDate);
        Assert.assertTrue(checkElementPresent(flightSearchPage.searchHotelData));
        Assert.assertTrue(checkElementPresent(flightSearchPage.showMoreResults));

    }
    @DataProvider(name="searchFlightDataProvider")
    public String[][] searchFlightsDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("expedia_search");
        return data;

    }

}
