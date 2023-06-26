package freecrm.pom.authentication;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardUserPage extends BasePage {

    @FindBy(xpath = "//span[@class='user-display']")
    public WebElement userName;

    @FindBy(xpath = "//div[@class='ui basic button floating item dropdown']/i[@class='settings icon']")
    public WebElement settingIcon;

    @FindBy(xpath = "//span[.='Log Out']")
    public WebElement logOutButton;

    public DashboardUserPage() {
        PageFactory.initElements(driver, this);
    }


    public void clickOnSettingButton(){
        safeClickOnElement(settingIcon);
    }

    public void clickOnLogOutButton(){
        safeClickOnElement(logOutButton);
    }
    public LogInPage doLogOut(){
        clickOnSettingButton();
        clickOnLogOutButton();
        return new LogInPage();
    }
}