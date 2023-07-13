package homepage;

import base.BasePage;
import flightsearchpage.FlightSearchPage;
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
    @FindBy(xpath = "//span[.='Flights']")
    public WebElement flightsButton;

    @FindBy(xpath="//button[@aria-label='Leaving from']")
    public WebElement leavingFromInputBox;

    @FindBy(xpath="//ul[@class='uitk-action-list no-bullet']/li[1]//button[@class='uitk-button uitk-button-medium uitk-button-fullWidth has-subtext location-field-leg1-origin-result-item-button result-item-button']")
    public WebElement airportOption;
    @FindBy(xpath = "//button[@aria-label='Going to']")
    public WebElement goingToInputBox;

    @FindBy(xpath = "//button[@aria-label='Athens (ATH - Eleftherios Venizelos) Greece']")
    public WebElement arrivalAirport;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

public void clickOnSignInLink(){
    safeClickOnElement(signInLink);
}
public void clickOnSignIButton1(){
    safeClickOnElement(signInButton1);
}

public void clickOnFlightButton(){
    safeClickOnElement(flightsButton);
}
public void clickOnLeavingFromInputBox(){
    safeClickOnElement(leavingFromInputBox);
}
public void enterDeparturePlace(String cityDeparture){
    sendKeysToElement(leavingFromInputBox,cityDeparture);
}
public void clickOnAirportOption(){
    safeClickOnElement(airportOption);
}

    public void clickOnGoingToInput(){
        safeClickOnElement(goingToInputBox);
    }

    public void enterDestination(String cityArrival){
        sendKeysToElement(goingToInputBox,cityArrival);
    }
    public void clickOnArrivalAirport(){
        safeClickOnElement(arrivalAirport);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public FlightSearchPage doSearch(String cityDepart, String cityArrive){
        clickOnFlightButton();
        //clickOnLeavingFromInputBox();
        enterDeparturePlace(cityDepart);
        clickOnAirportOption();
        clickOnGoingToInput();
        enterDestination(cityArrive);
        clickOnArrivalAirport();
        clickOnSearchButton();
        return new FlightSearchPage();
    }
}
