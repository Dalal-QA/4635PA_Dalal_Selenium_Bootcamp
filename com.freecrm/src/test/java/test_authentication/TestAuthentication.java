package test_authentication;

import base.BasePage;
import freecrm.pom.authentication.DashboardUserPage;
import freecrm.pom.authentication.LoginIn;
import freecrm.pom.homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    @Test
    public void TestLogin(){
        HomePage homePage= new HomePage();
        LoginIn login = new LoginIn();
        homePage.clickOnLoginButton();
        ExcelData excelData= new ExcelData(BasePage.DATA_PATH);
        DashboardUserPage dashboardUserPage=new DashboardUserPage();
        String[][] credentials=excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password= credentials[0][1];
        login.doLogin(email,password);

//        String email="sadouni.dalal@gmail.com";
//        String password="AydenLiam1213";
//        login.doLogin(email,password);
        Assert.assertTrue(isElementVisible(dashboardUserPage.userName));

    }

}
