package test_authetication;

import authenticationpage.SignInPage;
import base.BasePage;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

import javax.swing.*;
import java.io.File;

public class testSignIn extends BasePage {

    /* Test Case :Sign In to Apartments.com
    * 1.Navigate to URl "www.apartments.com"
    * 2.Click on the "Sign In" button/link.
    * 3.Enter a valid email address in the email input field
    * 4.Enter a valid password in the password input field.
    * 5.Click on the "Sign In" button
    * 6.Verify that the user is successfully logged in and redirected to the home page.
    *  */


    @Test(priority = 1, groups = "smoke")

    public void testDoSignIn() {

        HomePage homePage = new HomePage();

        homePage.clickOnSignInLink();
        ExcelData excelData = new ExcelData(BasePage.DATA_PATH);
        SignInPage signInPage = new SignInPage();
        String[][] credentials = excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password = credentials[0][1];
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));
        signInPage.doSignIn(email, password);


        Assert.assertTrue(checkElementPresent(homePage.userName));
    }




    @Test(priority = 1, groups = "smoke", dataProvider ="testDoSignIn")

    public void testDoSignIn(String email, String password) {

        HomePage homePage = new HomePage();
        homePage.clickOnSignInLink();

        //ExcelData excelData = new ExcelData(BasePage.DATA_PATH);
        SignInPage signInPage = new SignInPage();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));
        signInPage.doSignIn(email, password);


        Assert.assertTrue(checkElementPresent(homePage.userName));
    }

        @DataProvider(name = "testDoSignIn")
        public Object[][] getDoSigInDataProvider(){
        String path= System.getProperty("user.dir")+ File.separator+ "resources" + File.separator + "test_data.xlsx";;

        ExcelData excelData = new ExcelData(path);
        return excelData.readStringArrays("doSignIn");

        }
    }





