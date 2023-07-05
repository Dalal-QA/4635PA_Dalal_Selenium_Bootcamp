package storeslocationpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class StoresLocationPage extends BasePage {

    public StoresLocationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='u-flex u-flexColumn--md u-flexColumn--xs']/a[@href='javascript:void(0)']")
    public WebElement useMyLocationLink;
    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchInputField;
    @FindBy(xpath = "//div[@id='resultListId']")
    public WebElement matchingSearchOption;



    @FindBy(xpath = "//*[@id=\"slSearch-TitleId\"]")
    public WebElement searchResultTitle;

   public void clickOnUseMyLocation(){
       safeClickOnElement(useMyLocationLink);
   }

    public void pressEnterKey(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void  enterZipCode(String zipCode) {
        sendKeysToElement(searchInputField, zipCode);
        searchInputField.click();
        pressEnterKey();
    }


    public void clickOnMatchingOption(){
        safeClickOnElement(matchingSearchOption);

    }
    public void doFindStores(String zipCode){
       clickOnUseMyLocation();
        enterZipCode(zipCode);
        //clickOnMatchingOption();
    }
}
