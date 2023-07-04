package searchpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchPage extends BasePage {

    public SearchPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='search_box_gnav_input']")
    public WebElement inputSearchBox;
    @FindBy(xpath = "//div[@class='tile_container components__TileWrap-giTVpv cijoCv']//div[3]//div[.='Apple iPhone 14 Prepaid']")
    public WebElement productLink;

    @FindBy(xpath = "//button[@id='ATC-Btn']")
    public WebElement continueButton;

    @FindBy(xpath = "//iframe[@src='about:blank']")
    public WebElement iframe;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCodeInputField;

    @FindBy(xpath = "//button[@class='defaultPrimaryCTA ']")
    public WebElement confirmLocationButton;
    public void enterSearchTerm(String searchTerm){
        sendKeysToElement(inputSearchBox, searchTerm);
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
    public ResultSearchPage doSearch(String searchTerm){
        enterSearchTerm(searchTerm);
        pressEnterKey();
        return new ResultSearchPage();
    }

    public void clickOnProductLink(){
        safeClickOnElement(productLink);
        switchToFrameByElement(iframe);
    }

    public void enterZipCode(String zipCode){
        sendKeysToElement(zipCodeInputField,zipCode);
    }
    public void clickOnConfirmLocation(){
        safeClickOnElement(confirmLocationButton);
    }
}
