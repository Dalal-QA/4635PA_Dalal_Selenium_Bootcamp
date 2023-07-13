package test_subscribe;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSubscribe extends BasePage {

    @Test(priority = 1, groups={"BAT"}, dataProvider = "subscribeDataProvider")
    public void testDoSubscribeEmail(String email) {
        HomePage homePage = new HomePage();
        homePage.doSubscribe(email);
    }


    @DataProvider(name = "subscribeDataProvider")
    public String[][] subscribeDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSubscribe");
        return data;
    }
}
