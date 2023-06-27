package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchresultpage.SearchResultPage;
import sharearticleonsocialmedia.ResultPage;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='global-search-trigger']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@id='global-search-input']")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement soccerButton;


    public void clickOnSearchIcon(){
        safeClickOnElement(searchIcon);
    }
    public void enterSearchTerm(String searchTerm){
       sendKeysToElement(searchInput,searchTerm);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public SearchResultPage doSearch(String searchTerm){
        clickOnSearchIcon();
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new SearchResultPage();

    }

    public ResultPage clickOnSoccerButton(){
        safeClickOnElement(soccerButton);
        return new ResultPage();
    }
}