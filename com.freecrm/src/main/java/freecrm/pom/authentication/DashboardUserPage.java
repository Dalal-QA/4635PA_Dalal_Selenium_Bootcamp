package freecrm.pom.authentication;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DashboardUserPage extends BasePage {

@FindBy(xpath="//span[@class='user-display']")
    public WebElement userName;

    public DashboardUserPage(){
        PageFactory.initElements(driver,this);
    }


}
