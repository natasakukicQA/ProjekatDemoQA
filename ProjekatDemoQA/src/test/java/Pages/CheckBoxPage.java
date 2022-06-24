package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBoxPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    private String toggleButtonXpath = "//*[@title='Toggle']";

    private String checkboxesListClass = "rct-checkbox";

    private String resultsClass = "text-success";
    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getToggleButton()
    {
       return driver.findElement(By.xpath(toggleButtonXpath));
    }

    public List<WebElement> getCheckboxes(){
        return driver.findElements(By.className(checkboxesListClass));
    }

    public List<WebElement> getResult(){
        return driver.findElements(By.className(resultsClass));
    }

}
