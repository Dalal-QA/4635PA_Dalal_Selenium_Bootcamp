package sharearticleonsocialmedia;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShareAnArticleOnSocialMediaPage extends BasePage {

    @FindBy(xpath = "//h2[@class='contentItem__title contentItem__title--hero contentItem__title--story']")
    public WebElement soccerArticle;




    public void clickOnSoccerArticle(){
        safeClickOnElement(soccerArticle);
    }
}
