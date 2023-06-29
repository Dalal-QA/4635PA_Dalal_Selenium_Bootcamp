package freecrm.pom.taskspage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends BasePage {
    public TasksPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@name='title']")
    public WebElement titleInputField;

    @FindBy(xpath="//div[@class='ui fluid selection dropdown']/i[@class='dropdown icon']")
    public WebElement assignedToDropDown;
    @FindBy(xpath="//div[@class='visible menu transition']/div[@class='active selected item']")
    public WebElement selectedItem;

    @FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div/input")
    public WebElement dueDateBox;
    @FindBy(xpath="//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")
    public WebElement nextMonthIcon;
    @FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--023 react-datepicker__day--selected react-datepicker__day--weekend']")
    public WebElement dueDate;


   public void enterTitle(String title){
       sendKeysToElement(titleInputField,title);

   }

 public void clickOnAssignToDropDown(){
       safeClickOnElement(assignedToDropDown);
 }
    public void selectFromTheDropDown() {

        selectFromDropdownByVisibleText(selectedItem,"Sadouni Dalal");
    }

    public void clickAndSelectOnDueDateBox(){
       safeClickOnElement(dueDateBox);
       String year = "2023";
       String month="July";
       String date="23";
       while (true)
       {
           String monthYear = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
           String arr[]= monthYear.split(" ");
           String mon = arr[0];
           String yr=arr[1];
           if(mon.equalsIgnoreCase(month) && yr.equals(year))
               break;
           else
               driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next react-datepicker__navigation--next--with-time']")).click();
    }

}
}
