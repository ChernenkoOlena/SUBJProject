package parentTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    protected MainPage mainPage;
    protected SignInPage signInPage;
    protected ShowcasePage showcasePage;
    protected SignUpPage signUpPage;
    protected SettingsPage settingsPage;
    protected SearchPage searchPage;
    protected ProfilePage profilePage;
    protected PrescriptionPage prescriptionPage;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        mainPage = new MainPage(webDriver);
        signInPage = new SignInPage(webDriver);
        showcasePage = new ShowcasePage(webDriver);
        signUpPage = new SignUpPage(webDriver);
        settingsPage = new SettingsPage(webDriver);
        searchPage = new SearchPage(webDriver);
        profilePage = new ProfilePage(webDriver);
        prescriptionPage = new PrescriptionPage(webDriver);
    }


    @After
    public void tearDown() {
        webDriver.quit();
    }


    protected void checkAC(String message, boolean actual, boolean expected) {
        if(!(actual == expected)){
            logger.error("AC failed: " + message);
        }
        Assert.assertEquals(message, expected, actual);
    }
}
