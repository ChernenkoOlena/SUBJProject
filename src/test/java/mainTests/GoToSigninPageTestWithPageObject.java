package mainTests;

import org.junit.Test;
import parentTest.ParentTest;

public class GoToSigninPageTestWithPageObject extends ParentTest {

    @Test
    public void goToSigninPage1(){
        mainPage.openPage();
        mainPage.clickOnLoginButtonTop();
        signInPage.checkCurrentUrl();
    }

    @Test
    public void goToSiginPage2(){
        mainPage.openPage();
        mainPage.clickOnRegisterButtonTop();
        signInPage.checkCurrentUrl();
    }

    @Test
    public void goToSigninPage3(){
        mainPage.openPage();
        mainPage.clickOnRegisterButtonHeader();
        signInPage.checkCurrentUrl();
    }

}
