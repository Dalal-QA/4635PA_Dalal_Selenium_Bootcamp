package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"userAccount\"]/div/a[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='loginFormUser_email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@id='loginForm_password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//div[@id='signup']/a[.='Sign In']")
    public WebElement sigInButton;
    @FindBy(xpath = "//span[@class='myAccount topBarText']")
    public WebElement userName;


    public void clickOnLoginLink(){
        safeClickOnElement(loginLink);

    }
    public void enterEmailAddress(String emailAddress){
        safeClickOnElement(emailInputField);

        sendKeysToElement(emailInputField, emailAddress);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordInputField,password);
    }
    public void clickSignIn(){
       safeClickOnElement(sigInButton);
    }

    public void doSignIn(String emailAddress, String password){
        clickOnLoginLink();
        enterEmailAddress(emailAddress);
        enterPassword(password);
        clickSignIn();
    }

    }

