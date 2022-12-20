package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

    public ContactUsPage(WebDriver driver){
    PageFactory.initElements(driver, this);
    }

    @FindBy(css ="input[name=name]")
    public WebElement getName;

    @FindBy(css="input[name=email]")
    public WebElement getEmail;

    @FindBy(css ="input[name=subject]")
    public WebElement getSubject;

    @FindBy(css ="textarea[name=message]")
    public WebElement getText;

    @FindBy(css ="input[type=file]")
    public WebElement getFile;

    @FindBy(css ="input[name=submit]")
    public WebElement submitButton;

    public void setGetName(){
        getName.sendKeys("Marcin");
        System.out.println("Wpiasane imie");
    }
    public void setGetEmail(){
        getEmail.sendKeys("aldsk@wp.pl");
        System.out.println("Mail wpisany");
    }
    public void setGetText(){
        getText.clear();
        getText.sendKeys("asd aaqe fads fa");
        System.out.println("Text wpisany");
    }
    public void setGetText(){
        getText.clear();
        getText.sendKeys("asd aaqe fads fa");
        System.out.println("Text wpisany");
    }






}
