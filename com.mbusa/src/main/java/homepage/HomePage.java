package homepage;

import base.BasePage;

import loginpage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shoppingpage.ShopPartsPage;
import vehiclepage.VehiclePage;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(@aria-label,'OK')]")
    public WebElement okButton;

    @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
    public WebElement myAccountButton;

    @FindBy(id = "text-zoom-tracker")
    public WebElement iframe;

    @FindBy(xpath = "//button[@class='nav-profilelogin nav-profilebutton button button_primary button--wide ']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
    public WebElement usernameHeader;
    @FindBy(xpath="//div[@class='full-height-hero__image-container full-height-hero__image-container--width']//a[.='Explore']")
    public WebElement exploreButton;

    @FindBy(xpath = "//span[.='Shopping']")
    public WebElement shoppingLink;

    public void clickOnMyAccountButton(){

        safeClickOnElement(myAccountButton);
    }
    public void switchToIframe(){

        driver.switchTo().frame(iframe);
    }
    public void clickOnLoginButton(){
        safeClickOnElement(loginButton);

    }
    public void clickOnOkButton()
    {
        safeClickOnElement(okButton);
    }
    public LoginPage doLogin(){
        getVisibleElement(myAccountButton);
        clickOnByTabKey();
        clickOnMyAccountButton();
        //  switchToIframe();
        clickOnLoginButton();

        return new LoginPage();
    }

    public VehiclePage clickOnExploreButton(){
        safeClickOnElement(exploreButton);
        return new VehiclePage();
    }
    public ShopPartsPage clickOnShoppingLink(){
        safeClickOnElement(shoppingLink);
        return new ShopPartsPage();
    }
}