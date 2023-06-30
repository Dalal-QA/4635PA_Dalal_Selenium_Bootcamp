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

/*Test case: Add a new contact in FreeCRM.com
*1.Launch the FreeCRM.com application and navigate to the login page
*2.Enter valid login credentials (username and password) and click on the "Login" button
*3.Click on the "Contacts" or "People" link to open the contacts page
*4.Fill in the required fields such as name, email, phone number, or any other necessary contact information.
*5.Save the contact by clicking on the "Save" or "Create" button
* 6.Verify that the contact is successfully created and added to the contact list

 */


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

