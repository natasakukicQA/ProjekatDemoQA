package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomepagePage homepagePage;
    public ElementsPage elementsPage;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;

    public CheckBoxPage checkBoxPage;
    public WidgetsPage widgetsPage;
    public  AlertsPage alertsPage;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homepagePage = new HomepagePage(driver, wdwait);
        elementsPage = new ElementsPage(driver,wdwait);
        radioButtonPage = new RadioButtonPage(driver,wdwait);
        buttonsPage = new ButtonsPage(driver,wdwait);
        checkBoxPage = new CheckBoxPage(driver,wdwait);
        widgetsPage = new  WidgetsPage (driver,wdwait);
        alertsPage = new AlertsPage(driver,wdwait);

    }

    public void visibilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickabilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void highlightElement(WebElement element)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.border='2px solid red'", element);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}

