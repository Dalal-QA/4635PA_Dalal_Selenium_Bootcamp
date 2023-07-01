package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchresultpage.SearchResultPage;
import sharearticleonsocialmedia.ResultPage;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='global-search-trigger']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@id='global-search-input']")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']//span[@class='link-text']")
    public WebElement soccerButton;

    @FindBy(xpath = "//article[@id='sideLogin-left-rail']//button[@class='button-alt med'][normalize-space()='Log In']")
    public WebElement logInLink;

    @FindBy(name= "oneid-iframe")
    public WebElement iFrameLogin;
    @FindBy(xpath="//input[@id='InputIdentityFlowValue']")
    public WebElement emailInput;
    @FindBy(xpath="//button[@id='BtnSubmit']")
    public WebElement continueButton ;
    @FindBy(xpath = "//input[@id='InputPassword']")
    public WebElement passwordInputField;
    @FindBy(xpath ="//button[@id='BtnSubmit']")
    public WebElement logInButton;


    public void clickOnSearchIcon(){
        safeClickOnElement(searchIcon);
    }
    public void enterSearchTerm(String searchTerm){
       sendKeysToElement(searchInput,searchTerm);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public SearchResultPage doSearch(String searchTerm){
        clickOnSearchIcon();
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new SearchResultPage();

    }

    public ResultPage clickOnSoccerButton(){
        safeClickOnElement(soccerButton);
        return new ResultPage();
    }
    public void clickOnLogIn(){
        safeClickOnElement(logInLink);
    }

    public void inputEmail(String email){
        driver.switchTo().frame("oneid-iframe");
        sendKeysToElement(emailInput,email);
    }

    public void clickOnContinueButton(){
        safeClickOnElement(continueButton);
    }
    public void inputPassword(String password){
        sendKeysToElement(passwordInputField,password);
    }
    public void clickOnLogInButton(){
        safeClickOnElement(logInButton);
    }

    public void doLogin(String email, String password){
        clickOnLogIn();

        inputEmail(email);
        clickOnContinueButton();
        inputPassword(password);
        clickOnLogInButton();
    }
}