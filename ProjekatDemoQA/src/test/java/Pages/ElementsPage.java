package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public String menuListClass ="header-wrapper";
    public String fullName = "userName";
    public String email ="userEmail";
    public String currentAddress= "currentAddress";
    public String permanentAddress= "permanentAddress";
    public String submitButton= "submit";
    public String textBox = "btn btn-light active";
    public String fullNameID = "name";
    public String emailID = "email";
    public String currentAddressID = "currentAddress";
    public String permanentAddressID = "permanentAddress";

    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id(fullName));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id(email));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id(currentAddress));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id(permanentAddress));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id(submitButton));

    }
    public WebElement expectedName(){
        return driver.findElement(By.id(fullNameID));
    }
    public WebElement expectedEmail(){
        return driver.findElement(By.id(emailID));
    }
    public WebElement expectedCurrentAddress(){
        return driver.findElements(By.id(currentAddressID)).get(1);
    }
    public WebElement expectedPermanentAddress(){
        return driver.findElements(By.id(permanentAddressID)).get(1);
    }

    public WebElement getTextBox() {
        return driver.findElements(By.id("item-0")).get(0);
    }

    public WebElement getCheckBox()
    {
        return driver.findElements(By.id("item-1")).get(0);
    }

    public List<WebElement> getCardList() {
        return driver.findElements(By.className(menuListClass));
    }


}
