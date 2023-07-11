package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import registrationpage.RegistrationPage;

public class HomePage extends BasePage {

    public HomePage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='a1b3f50dcd be36d14cea b2fe1a41c3 db7f07f643 c7b46bab72']/a[2]/span[@class='e57ffa4eb5']")
    public WebElement registerButton;

    @FindBy(xpath="//div[.='Your account']")
    public WebElement yourAccountButton;

    @FindBy(xpath="//span[.='Sign out']")
    public WebElement signOutButton;


    public RegistrationPage clickOnRegisterButton(){
        safeClickOnElement(registerButton);
        return new RegistrationPage();
    }

    public WebElement assertLogin(){
        safeClickOnElement(yourAccountButton);
        safeClickOnElement(signOutButton);
        return signOutButton;
    }

}
