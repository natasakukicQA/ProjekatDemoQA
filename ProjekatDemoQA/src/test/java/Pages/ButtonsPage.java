package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    private String doubleClickMeButton = "doubleClickBtn";
    private String buttonsId = "item-4";
    private String doubleClickMessageId = "doubleClickMessage";
    private String rightClickButtonId = "rightClickBtn";
    private String rightClickMessageId = "rightClickMessage";

    private String clickMeButtonXpath = "//*[contains(text(),'Click Me')]";

    private String clickMeButtonMessageId = "dynamicClickMessage";




    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDoubleClickMeButton() {
        return driver.findElement(By.id(doubleClickMeButton));
    }

    public WebElement getButtonMenu()
    {
        return driver.findElements(By.id(buttonsId)).get(0);
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(By.id(doubleClickMessageId));
    }

    public WebElement getRightClickButton() {
        return driver.findElement(By.id(rightClickButtonId));
    }

    public WebElement getRightClickMessage() {
        return driver.findElement(By.id(rightClickMessageId));
    }

    public WebElement getClickMeButton() {
        return driver.findElements(By.xpath(clickMeButtonXpath)).get(2);
    }

    public WebElement getClickMeButtonMessage() {
        return driver.findElement(By.id(clickMeButtonMessageId));
    }
}
