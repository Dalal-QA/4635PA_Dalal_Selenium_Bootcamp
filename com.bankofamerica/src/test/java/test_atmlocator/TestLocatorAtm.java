package test_atmlocator;

import atmpage.AtmLocationPage;
import bankofamericapage.BankOfAmericaPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

import java.util.Set;

public class TestLocatorAtm extends BasePage {

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "searchAtmLocationDataProvider")

    public void testSearchAtmLocator(String zipCode) {
        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        AtmLocationPage atmLocationPage = new AtmLocationPage();
        homePage.clickOnBoaButton();
        // Get the handle of the current window
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            // Check if it is the current window or the main window
            if (!window.equals(currentWindowHandle)) {
                // Switch the focus to the new window
                driver.switchTo().window(window);
                break;
            }
            bankOfAmericaPage.clickOnFindAtmLink();
            atmLocationPage.doSearchAtmLocation(zipCode);
            Assert.assertTrue(isElementVisible(atmLocationPage.locationFound));

        }
    }
        @DataProvider(name = "searchAtmLocationDataProvider")
        public String[][] searchAtmDataProvider()
        {

            String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
            ExcelData ex = new ExcelData(path);
            String data[][] = ex.readStringArrays("doSearchAtmLocation");
            return data;

        }
    }

