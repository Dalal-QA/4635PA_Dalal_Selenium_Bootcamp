package test_availabilityofservice;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAvailabilityOfService extends BasePage {

    @Test(priority = 1,groups={"BAT"}, dataProvider = "checkAvailabilityDataProvider")
    public void testAvailabilityOfService(String addressStreet,String zipCode ){
        HomePage homePage=new HomePage();

        homePage.doCheckAvailabilityOfService(addressStreet,zipCode);
        Assert.assertTrue(isElementVisible(homePage.resultText));
    }
    @DataProvider(name = "checkAvailabilityDataProvider")
    public String[][] availabilityDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doCheckAvailability");
        return data;
    }

}
