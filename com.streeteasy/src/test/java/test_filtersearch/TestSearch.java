package test_filtersearch;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;
import searchpage.SearchPage;

public class TestSearch extends BasePage {

    @Test(priority = 1,groups={"BAT"})
    public void testDoFilter(){
        HomePage homePage=new HomePage();
        SearchPage searchPage=homePage.clickOnLocation();
        searchPage.doFilterSearch();

    }
}
