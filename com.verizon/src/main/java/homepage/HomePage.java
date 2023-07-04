package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchpage.SearchPage;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@id='gnav20-search-icon']")
    public WebElement searchButton;

    public SearchPage clickOnSearchButton(){
        safeClickOnElement(searchButton);
        return new SearchPage();
    }


}

