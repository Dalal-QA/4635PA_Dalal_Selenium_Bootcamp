package test_search;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchresultpage.SearchResultPage;

import java.io.IOException;

public class TestSearch extends BasePage {

    @Test(priority = 1, groups = {"smoke"})
//
//    public void testDoSearch(){
//        HomePage homePage= new HomePage();
//        SearchResultPage searchResultPage=new SearchResultPage();
//        String searchTerm= "String";
//        homePage.doSearch(searchTerm);
//        Assert.assertTrue(isElementVisible(searchResultPage.searchResult));
//
//    }

    public void testDoSearch() {
        HomePage homePage = new HomePage();

        String[] searchTerms = excel.readStringArray("doSearch");
        String searchTerm = searchTerms[0];
        SearchResultPage searchResultPage = homePage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.searchResult));

    }




}
