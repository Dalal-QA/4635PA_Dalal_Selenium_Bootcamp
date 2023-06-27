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

    @FindBy(xpath ="//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/section/div/div/div[2]/div[2]/div/div/div/div[3]/a")
    public WebElement signInButton1;

public void clickOnSignInLink(){
    safeClickOnElement(signInLink);
}
public void clickOnSignIButton1(){
    safeClickOnElement(signInButton1);
}





}
