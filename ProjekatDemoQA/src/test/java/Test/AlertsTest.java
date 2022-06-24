package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }
    @Test
    public void alertClick() throws InterruptedException{
        homepagePage.getCardList().get(2).click();
        alertsPage.getAlertSection().click();
        alertsPage.getClikbutton1().click();
        driver.switchTo().alert().accept();

        alertsPage.getClickButton2().click();
        Thread.sleep(7000);
        driver.switchTo().alert().accept();

        alertsPage.getClickButton3().click();
        driver.switchTo().alert().accept();

        clickabilityWait(alertsPage.getClickButton4());

        alertsPage.getClickButton4().click();
        Thread.sleep(500);
        driver.switchTo().alert().sendKeys("Natasa");
        driver.switchTo().alert().accept();

        Assert.assertEquals(alertsPage.getConfirmResult().getText(), "You selected Ok");
        Assert.assertEquals(alertsPage.getPromptResult().getText(), "You entered Natasa");

    }
}
