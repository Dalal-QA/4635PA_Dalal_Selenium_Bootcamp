package test_addtocard;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchpage.ResultSearchPage;
import searchpage.SearchPage;

public class TestAddToCart extends BasePage {


    @Test(priority = 1, groups = {"BAT"})

    public void testSort(String searchTerm) {
        HomePage homePage = new HomePage();
        SearchPage searchPage = homePage.clickOnSearchButton();
        ResultSearchPage resultSearchPage = searchPage.doSearch(searchTerm);
        resultSearchPage.doSorting();
        Assert.assertTrue(isElementVisible(resultSearchPage.resultNumber));
    }
}
