package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage {
    @FindBy (xpath = ".//button[@class='head-btn login-btn']")
    private WebElement buttonLogin;
    @FindBy (xpath = ".//button[@class='head-btn register-btn']")
    private WebElement buttonRegisterTop;
    @FindBy (xpath = ".//button[@class='header-btn']")
    private WebElement buttonRegisterHeader;


    public MainPage(WebDriver webDriver) {
        super(webDriver, "/");
    }


    public void openPage(){
        try{
            webDriver.get("https://try.subj.ua");
            logger.info("Main Page was opened");
        }catch (Exception e){
            logger.error("Can not open MainPage");
            Assert.fail("Can not open MainPage");
        }
    }

    public void clickOnLoginButtonTop(){
        actionsWithOurElements.clickOnElement(buttonLogin);
            }

    public void clickOnRegisterButtonTop(){
        actionsWithOurElements.clickOnElement(buttonRegisterTop);
    }

    public void clickOnRegisterButtonHeader(){
        actionsWithOurElements.clickOnElement(buttonRegisterHeader);
    }


}
