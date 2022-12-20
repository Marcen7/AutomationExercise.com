package Test;

import PageObject.MainPage;
import org.testng.annotations.Test;

public class TestAutomationEx extends BaseTest {


    @Test
    public void fillForm(){
        driver.get("https://automationexercise.com/");
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnContactUsPage();

    }




}
