package freecrm.pom.taskspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends BasePage {
    public TasksPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@name='title']")
    public WebElement titleInputField;

}
