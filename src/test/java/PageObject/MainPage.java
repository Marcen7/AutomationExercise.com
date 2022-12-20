package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    @FindBy(css = "i[class$='fa-envelope']")
    public WebElement contactUsPage;

    //tu musi być konstruktor

    public MainPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
   }

    //czas na metody

    public void clickOnContactUsPage(){
        contactUsPage.click();
        System.out.println("Przycisk kontakt us został kliknięty");

    }
}


