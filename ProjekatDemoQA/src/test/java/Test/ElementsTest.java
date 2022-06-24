package Test;

import Base.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void textBoxFormHappyFlow(){
        homepagePage.getCardList().get(0).click();
        //elementsPage.getCardList().get(0).click();
        elementsPage.getTextBox().click();
        elementsPage.getFullName().sendKeys("Petar");
        elementsPage.getEmail().sendKeys("petarp@gmail.com");
        elementsPage.getCurrentAddress().sendKeys("Kralja Petra");
        elementsPage.getPermanentAddress().sendKeys("Kralja Petra");
        scrollIntoView(elementsPage.getSubmitButton());
        elementsPage.getSubmitButton().click();

        highlightElement(elementsPage.expectedName());

        Assert.assertEquals(elementsPage.expectedName().getText(), "Name:Petar");
        Assert.assertEquals(elementsPage.expectedEmail().getText(), "Email:petarp@gmail.com");
        Assert.assertEquals(elementsPage.expectedCurrentAddress().getText(), "Current Address :Kralja Petra");
        Assert.assertEquals(elementsPage.expectedPermanentAddress().getText(), "Permananet Address :Kralja Petra");

    }

    @Test
    public void clickCheckBox(){
        homepagePage.getCardList().get(0).click();
        elementsPage.getCheckBox().click();

        checkBoxPage.getToggleButton().click();

        checkBoxPage.getCheckboxes().get(1).click();

        Assert.assertEquals(checkBoxPage.getResult().get(0).getText(),"desktop");
        Assert.assertEquals(checkBoxPage.getResult().get(1).getText(),"notes");
        Assert.assertEquals(checkBoxPage.getResult().get(2).getText(),"commands");

        checkBoxPage.getCheckboxes().get(1).click();

        checkBoxPage.getCheckboxes().get(2).click();

        Assert.assertEquals(checkBoxPage.getResult().get(9).getText(),"general");

        checkBoxPage.getCheckboxes().get(2).click();

        checkBoxPage.getCheckboxes().get(3).click();

        Assert.assertEquals(checkBoxPage.getResult().get(2).getText(),"excelFile");
    }
    @Test
    public void buttonsTest() throws InterruptedException{

        Actions act = new Actions(driver);
        homepagePage.getCardList().get(0).click();

        scrollIntoView(buttonsPage.getButtonMenu());
        buttonsPage.getButtonMenu().click();

        act.doubleClick(buttonsPage.getDoubleClickMeButton()).perform();

        Thread.sleep(1000);
        visibilityWait(buttonsPage.getDoubleClickMessage());
        clickabilityWait(buttonsPage.getDoubleClickMessage());

        Assert.assertEquals(buttonsPage.getDoubleClickMessage().getText(), "You have done a double click");

        act.contextClick(buttonsPage.getRightClickButton()).perform();

        Assert.assertEquals(buttonsPage.getRightClickMessage().getText(), "You have done a right click");

        buttonsPage.getClickMeButton().click();

        Assert.assertEquals(buttonsPage.getClickMeButtonMessage().getText(), "You have done a dynamic click");
    }


}
