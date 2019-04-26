package pages;

import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends ParentPage {
    @FindBy (xpath = ".//input[@name='phoneNumber']")
    private WebElement inputPhoneNumber;
    @FindBy (xpath = ".//*[text()='Дальше'] ")
    private WebElement buttonNext;
    @FindBy (xpath = ".//button[@class='style__buttonText___2xT3I style__baseButton___3h1Rb style__button___2UHRJ style__shamrock___7S_CW']")
    private WebElement buttonSignin;


    public SignInPage(WebDriver webDriver) {
        super(webDriver, "/signin");
    }


    public void openPage(){
        try{
            webDriver.get("https://try.subj.ua");
            logger.info("Signin Page was opened");
        }catch (Exception e){
            logger.error("Can not open SigninPage");
            Assert.fail("Can not open SigninPage");
        }
    }

    public void enterPhoneNumber(String phoneNumber){
        actionsWithOurElements.enterTextIntoElement(inputPhoneNumber, phoneNumber);
    }

    public void clickOnBtnNext(){
        actionsWithOurElements.clickOnElement(buttonNext);
    }

    public void clickOnBtnSignin(){
        actionsWithOurElements.clickOnElement(buttonSignin);
    }


}
