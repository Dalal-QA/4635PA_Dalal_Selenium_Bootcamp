package bankofamericapage;

import atmpage.AtmLocationPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmericaPage extends BasePage {


    public BankOfAmericaPage(){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[@class='logo-container']//img[@alt='Bank of America Logo']")
    public WebElement BankOfAmericaLogo;
    @FindBy(xpath = "//*[@id=\"finCenterLocator\"]")
    public WebElement findAtmLink;

    public AtmLocationPage clickOnFindAtmLink(){
        safeClickOnElement(findAtmLink);
        return new AtmLocationPage();
    }

}

