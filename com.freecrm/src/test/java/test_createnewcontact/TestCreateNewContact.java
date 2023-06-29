package test_createnewcontact;

import base.BasePage;
import freecrm.pom.create_new_contact.ContactsAddedPage;
import freecrm.pom.create_new_contact.CreateNewContactPage;
import freecrm.pom.authentication.DashboardUserPage;
import freecrm.pom.authentication.LogInPage;
import freecrm.pom.homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestCreateNewContact extends BasePage {




    @Test(priority= 2, groups= {"BAT"},dataProvider = "createcontactdataprovider")


    public void testDoAddNewContact(String firstName, String lastName,String companyName,String email,
                                    String description, String streetAddress,  String city, String state,String phoneNumber){


        HomePage homePage =new HomePage();

        LogInPage logInPage= homePage.clickOnLoginButton();
        String email1 = "sadouni.dalal@gmail.com";
        String password="AydenLiam1213";
        DashboardUserPage dashboardUserPage= logInPage.doLogin(email1,password);
        CreateNewContactPage createNewContactPage= dashboardUserPage.doClickAddButton();

        ContactsAddedPage contactsAddedPage= createNewContactPage.doAddContact(firstName,lastName,companyName,email,description,streetAddress,city,state,phoneNumber);

        Assert.assertTrue(isElementVisible(contactsAddedPage.redIcon));

    }
    @DataProvider(name="createcontactdataprovider")
    public Object [][] addContactDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doAddContact");
        return data;

    }
}

