package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//button[.='Sign in']")
    public WebElement signInLink;

    @FindBy(xpath ="//a[.='Sign in']")
    public WebElement signInButton1;

    @FindBy(xpath="//input[@id='loginFormEmailInput']")
    public WebElement inputEmailField;

    @FindBy(xpath="//input[@id='loginFormEmailInput']")
    public WebElement continueButton;

    @FindBy(xpath="//button[@id='passwordButton']")
    public WebElement enterPasswordInsteadButton;

    @FindBy(xpath="//input[@id='enterPasswordFormPasswordInput']")
    public WebElement passwordInputField;


}
