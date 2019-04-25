package mainTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import parentTest.ParentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class GoToLoginPageTest {
    WebDriver webDriver;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
    }

    @Test
    public void validToSignInPageTest1() {

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://try.subj.ua/");
        webDriver.findElement(By.xpath(".//button[@class='head-btn login-btn']")).click();

        Assert.assertTrue("Element is not present",
                webDriver.findElement(By.xpath(".//input[@name='phoneNumber']")).isDisplayed());
    }

    @Test
    public void validToSignInPageTest2() {

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://try.subj.ua/");
        webDriver.findElement(By.xpath(".//button[@class='head-btn register-btn']")).click();

        Assert.assertTrue("Element is not present",
                webDriver.findElement(By.xpath(".//input[@name='phoneNumber']")).isDisplayed());
    }

    @Test
    public void validToSignInPageTest3() {

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://try.subj.ua/");
        webDriver.findElement(By.xpath(".//button[@class='header-btn']")).click();

        Assert.assertTrue("Element is not present",
                webDriver.findElement(By.xpath(".//input[@name='phoneNumber']")).isDisplayed());
    }

//    @Test
//    public void validToSignInPageTest4() {
//
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        webDriver.get("https://try.subj.ua/");
//        webDriver.findElement(By.xpath(".//section[@class='wehelp']//*[@class='style__clickable___2hW-3']")).click();
//
//        Assert.assertTrue("Element is not present",
//                webDriver.findElement(By.xpath(".//input[@name='phoneNumber']")).isDisplayed());
//    }
//
//    @Test
//    public void validToSignInPageTest5() {
//
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        webDriver.get("https://try.subj.ua/");
//        webDriver.findElement(By.xpath(".//section[@class='zruchno']//*[@class='style__clickable___2hW-3']")).click();
//
//        Assert.assertTrue("Element is not present",
//                webDriver.findElement(By.xpath(".//input[@name='phoneNumber']")).isDisplayed());
//    }
//
//    @Test
//    public void validToSignInPageTest6() {
//
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        webDriver.get("https://try.subj.ua/");
//        webDriver.findElement(By.xpath(".//*[@class='specialist-text']//*[@class='style__clickable___2hW-3']")).click();
//
//        Assert.assertTrue("Element is not present",
//                webDriver.findElement(By.xpath(".//input[@name='phoneNumber']")).isDisplayed());
//    }
//
//    @Test
//    public void invalidToSignInPageTest6() {
//
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        webDriver.get("https://try.subj.ua/");
//        webDriver.findElement(By.xpath(".//*[@class='cd-top']//*[@class='style__clickable___2hW-3']")).click();
//
//        Assert.assertTrue("Element is not present",
//                isElementPresent()
//        );
//    }


    private boolean isElementPresent() {
        try {
            return webDriver.findElement(By.xpath(".//input[@name='phoneNumber']")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

}
