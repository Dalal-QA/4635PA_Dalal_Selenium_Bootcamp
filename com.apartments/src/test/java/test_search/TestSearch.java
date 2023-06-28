package test_search;

import authenticationpage.SignInPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.ResultSearchPage;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestSearch extends BasePage {
/*Test case: Search
*1. Navigate to the Apartments.com homepage
*2. Log in to Apartments.com with a valid user account
*3.Enter a specific location, such as a city or ZIP code, in the search bar.
*4.Set search filters, such as price range, number of bedrooms, and amenities
*5.Verify that the search results are displayed correctly based on the specified criteria

 */

    @Test(priority= 1, groups= {"BAT"},dataProvider = "searchdataprovider")

    public void testDoSearch(String searchTerm){
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        SearchPage searchPage= new SearchPage();
        ResultSearchPage resultSearchPage= new ResultSearchPage();

        homePage.clickOnSignInLink();
        String email="abc1@gmail.com";
        String password="AydenLiam1213";

        signInPage.doSignIn(email,password);

        searchPage.searchTerm(searchTerm);
        resultSearchPage.doSearch();


        Assert.assertTrue(isElementVisible(resultSearchPage.searchResult));

    }
    @DataProvider(name="searchdataprovider")
    public Object[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSearch");
        return data;

    }
}
