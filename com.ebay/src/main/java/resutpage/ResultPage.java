package resutpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']")
    public WebElement resultsNumber;
}
