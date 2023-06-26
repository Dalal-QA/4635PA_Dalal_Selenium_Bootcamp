package test_authentication;

import base.BasePage;
import freecrm.pom.authentication.DashboardUserPage;
import freecrm.pom.authentication.LogInPage;
import freecrm.pom.homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {



    @Test(priority = 1, groups={"smoke"})
    public void TestLogin(){
        HomePage homePage= new HomePage();

        LogInPage logInPage= homePage.clickOnLoginButton();
        ExcelData excelData= new ExcelData(BasePage.DATA_PATH);

        String[][] credentials=excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password= credentials[0][1];
        DashboardUserPage dashboardUserPage= logInPage.doLogin(email,password);


        Assert.assertTrue(isElementVisible(dashboardUserPage.userName));

    }
    @Test(priority = 2, groups={"smoke"})
    public void testLogOut(){
        HomePage homePage= new HomePage();
       DashboardUserPage dashboardUserPage=new DashboardUserPage();


        LogInPage logInPage= homePage.clickOnLoginButton();
        String email="sadouni.dalal@gmail.com";
        String password="AydenLiam1213";

         logInPage.doLogin(email,password);
         dashboardUserPage.doLogOut();

        Assert.assertTrue(isElementVisible(logInPage.LoginButton));
    }



}
