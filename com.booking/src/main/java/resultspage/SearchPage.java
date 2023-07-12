package resultspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//h1[@class='fcab3ed991 d5f78961c3']")
    public WebElement resultText;

}
