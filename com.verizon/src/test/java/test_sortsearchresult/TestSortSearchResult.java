package test_sortsearchresult;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.ResultSearchPage;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestSortSearchResult extends BasePage {

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "sortDataProvider")

    public void testSort(String searchTerm) throws InterruptedException {
        HomePage homePage = new HomePage();
        SearchPage searchPage= homePage.clickOnSearchButton();
        ResultSearchPage resultSearchPage=searchPage.doSearch(searchTerm);
        resultSearchPage.doSorting();
        Assert.assertTrue(isElementVisible(resultSearchPage.resultNumber));


    }

    @DataProvider(name = "sortDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;

    }
}

