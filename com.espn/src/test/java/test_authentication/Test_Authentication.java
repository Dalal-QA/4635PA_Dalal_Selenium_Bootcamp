package test_authentication;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class Test_Authentication extends BasePage {

    @Test(priority= 1, groups= {"BAT"},dataProvider = "signindataprovider")
    public void testUserSignIn(String email,String password){

        HomePage homePage = new HomePage();
        homePage.doLogin(email,password);


    }

    @DataProvider(name="signindataprovider")
    public Object[][] testSignInUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }
}
