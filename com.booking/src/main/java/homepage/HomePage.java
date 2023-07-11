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

    @FindBy(xpath="//span[.='Flights']")
    public WebElement flightsButton;

    @FindBy(xpath="//button[3]/div[@class='css-ztjjo9']//span[@class='Text-module__root--variant-body_2___-3fYM Text-module__root--color-disabled___tERfD']")
    public WebElement whereToInputField;
    @FindBy(xpath="//input[@class='css-1ejj2j9']")
    public WebElement airportInputField;
    @FindBy(xpath = "//ul[@class='css-1eonra']//span[@class='css-3cj1dx']/span[contains(.,'CFU Corfu International Airport')]")
    public WebElement selectedAirport;
    @FindBy(css="[placeholder='Depart – Return']")
    public WebElement departReturnField;
    @FindBy(xpath = "//div[@class='Calendar-module__content___XsvtK']//tr[2]//span[@class='Calendar-module__date___FlMKj']/span[1]/span[.='11']")
    public WebElement firstDate;
    @FindBy(xpath="//div[@class='Calendar-module__content___XsvtK']//tr[2]//span[@class='Calendar-module__date___FlMKj']/span[1]/span[.='12']")
    public WebElement secondDate;

    @FindBy(xpath = "//span[.='Search']")
    public WebElement searchButton;

    @FindBy(xpath="//div[.='Showing 380 results']")
    public WebElement searchResults;

    public RegistrationPage clickOnRegisterButton(){
        safeClickOnElement(registerButton);
        return new RegistrationPage();
    }

    public WebElement assertLogin(){
        safeClickOnElement(yourAccountButton);
        safeClickOnElement(signOutButton);
        return signOutButton;
    }

    public void clickOnFlightButton(){
        safeClickOnElement(flightsButton);
    }
    public void clickOnWhereToGoButton(){
        safeClickOnElement(whereToInputField);
    }
    public void enterDestinationName(String countryName){
        sendKeysToElement(airportInputField,countryName);
    }
    public void clickOnSelectedAirport(){
        safeClickOnElement(selectedAirport);
    }

    public void clickOnDepartReturnButton(){
        safeClickOnElement(departReturnField);
    }

    public void clickOnFirstDate(){
        safeClickOnElement(firstDate);
    }
    public void clickOnSecondDate(){
        safeClickOnElement(secondDate);
    }

    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public void doSearchFlights(String countryName){
        clickOnFlightButton();
        clickOnWhereToGoButton();
        enterDestinationName(countryName);
        clickOnSelectedAirport();
        clickOnDepartReturnButton();
        clickOnFirstDate();
        clickOnSecondDate();
        clickOnSearchButton();
    }
}
