package test_createnewcontact;

import base.BasePage;
import create_new_contact.CreateNewContactPage;
import freecrm.pom.authentication.DashboardUserPage;
import freecrm.pom.authentication.LogInPage;
import freecrm.pom.homepage.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestCreateNewContact extends BasePage {




    @Test(priority= 2, groups= {"BAT"},dataProvider = "createContactDataProvider")


    public void testDoAddNewContact(String firstName, String lastName,String companyName,String email,
                                    String description, String streetAddress,  String city, String state,String phoneNumber){

        LogInPage logInPage = new LogInPage();
        HomePage homePage =new HomePage();
        DashboardUserPage dashboardUserPage = new DashboardUserPage();
        CreateNewContactPage createNewContactPage= new CreateNewContactPage();

        homePage.clickOnLoginButton();
        String email1 = "sadouni.dalal@gmail.com";
        String password="AydenLiam1213";
        logInPage.doLogin(email1,password);
        dashboardUserPage.doClickAddButton();

        createNewContactPage.doAddContact(firstName,lastName,companyName,email,description,streetAddress,city,state,phoneNumber);

        //Assert.assertTrue(isElementVisible(dashboardPage.nameHeader));

    }
    @DataProvider(name="addnewcontact")
    public Object [][] addContactDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doAddContact");
        return data;

    }
}

