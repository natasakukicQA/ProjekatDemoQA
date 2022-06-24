package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public String noButton = "custom-control-label.disabled";

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNoButton() {
        return driver.findElement(By.className(noButton));
    }
}
