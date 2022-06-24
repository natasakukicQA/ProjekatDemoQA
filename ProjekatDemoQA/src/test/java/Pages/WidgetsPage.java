package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    private String selectValueDropdown = "withOptGroup";

    public WidgetsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSelectValueDropdown() {
        return driver.findElement(By.id(selectValueDropdown));
    }
}
