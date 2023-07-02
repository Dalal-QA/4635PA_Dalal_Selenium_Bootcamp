package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


        @FindBy(xpath = "//a[@aria-label='Blog']")
        public WebElement blogDropdown;

        @FindBy(xpath = "//a[normalize-space()='Market Data']")
        public WebElement marketDataButton;



        public HomePage() {
            PageFactory.initElements(driver, this);
        }

        public void hoverOverBlogDropDown(){
            hoverOverElement(blogDropdown);
        }

        public void clickOnMarketDataButton(){

            safeClickOnElement(marketDataButton);
        }



        public MarketDataPage doVerifyBlogDropDown(){
            hoverOverBlogDropDown();
            clickOnMarketDataButton();
           return new MarketDataPage();
        }
    }

