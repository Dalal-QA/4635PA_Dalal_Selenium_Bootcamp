package shoppingpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends BasePage {
    public ShoppingPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"FmaSlider\"]/div[1]/section/div/div/section/div/a")
    public WebElement shopNowButton;

    @FindBy(xpath = "//div[@id='year-listId']/a[.='2022']")
    public WebElement yearButton;
    @FindBy(xpath = "//a[.='X3']")
    public WebElement serieButton;
    @FindBy(xpath = "//a[.='X3 M40i']")
    public WebElement modelButton;
    @FindBy(xpath = "//p[.='BMW 50 Years M Valve Stem Caps']")
    public WebElement accessoryLink;

    @FindBy(xpath = "//button[@id='btnAddToCart']/span[@class='primary-text']")
    public WebElement addToCart;
    @FindBy(xpath = "//*[@id=\"lblsearchQuery\"]")
    public WebElement dealerNameInputField;

    @FindBy(xpath = "//span[.='Lookup']")
    public WebElement lookupButton ;

   public void enterDealerLocation(String zipCode){
       clearSendKeysToElement(dealerNameInputField,zipCode);
   }

   public void clickOnLockUpButton(){
       safeClickOnElement(lookupButton);
   }

    public void doShop(){
        safeClickOnElement(shopNowButton);

        safeClickOnElement(yearButton);
        safeClickOnElement(serieButton);
        safeClickOnElement(modelButton);
        safeClickOnElement(accessoryLink);
        safeClickOnElement(addToCart);


    }


}
