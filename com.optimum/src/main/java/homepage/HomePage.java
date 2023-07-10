package homepage;

import addtocart.AddToCard;
import base.BasePage;
import contactuspage.ContactUsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='block-fixedbottomformblockgetofferscloned']//div[@class='form-item form-item-add1 required']/input[@class='form-text required']")
    public WebElement addressInputField;

    @FindBy(xpath="//div[@id='block-fixedbottomformblockgetofferscloned']//input[@name='zip']")
    public WebElement zipCodeInputField;

    @FindBy(xpath="//div[@id='block-fixedbottomformblockgetofferscloned']//input[@name='op']")
    public WebElement checkAvailabilityButton;

    @FindBy(xpath="//div[@class='widget-count']")
    public WebElement resultText;
    @FindBy(xpath="//a[.='Contact us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//a[contains(.,'Shop plans')]")
    public WebElement shopNowButton;

    public void enterStreetAddress(String address){
        sendKeysToElement(addressInputField,address);
    }

    public void enterZipCode(String zipCode){
        sendKeysToElement(zipCodeInputField,zipCode);
    }
    public void clickOnCheckAvailabilityButton(){
        safeClickOnElement(checkAvailabilityButton);
    }

    public void doCheckAvailabilityOfService(String streetAddress, String zipCode){
        enterStreetAddress(streetAddress);
        enterZipCode(zipCode);
        clickOnCheckAvailabilityButton();
    }

    public ContactUsPage clickOnContactUs(){
        safeClickOnElement(contactUsButton);
        return new ContactUsPage();
    }
    public AddToCard clickOnShopButton(){
        safeClickOnElement(shopNowButton);
        return new AddToCard();
    }
}


