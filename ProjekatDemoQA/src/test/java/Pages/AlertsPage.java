package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AlertsPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    private String clikbutton1 = "alertButton";
    private String clickButton2 = "timerAlertButton";
    private String clickButton3 = "confirmButton";
    private String clickButton4 = "promtButton";

    private String confirmResultId = "confirmResult";

    private String promptResultId = "promptResult";

    public AlertsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getClikbutton1() {
        return driver.findElement(By.id(clikbutton1));
    }

    public WebElement getClickButton2() {
        return driver.findElement(By.id(clickButton2));
    }

    public WebElement getClickButton3() {
        return driver.findElement(By.id(clickButton3));
    }

    public WebElement getClickButton4() {
        return driver.findElement(By.id(clickButton4));
    }

    public WebElement getAlertSection() {
        return driver.findElements(By.id("item-1")).get(1);
    }

    public WebElement getConfirmResult() {
        return driver.findElement(By.id(confirmResultId));
    }

    public WebElement getPromptResult () {
        return driver.findElement(By.id(promptResultId));
    }
}
