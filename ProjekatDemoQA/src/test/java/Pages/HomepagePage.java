package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HomepagePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public String cardsXpath = "//*[@class='category-cards']/div";

    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getCardList() {
        return driver.findElements(By.xpath(cardsXpath));
    }


}
