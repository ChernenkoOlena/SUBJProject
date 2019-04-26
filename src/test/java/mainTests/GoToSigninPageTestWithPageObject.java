package mainTests;

import org.junit.Test;
import pages.MainPage;
import pages.SignInPage;
import parentTest.ParentTest;

public class GoToSigninPageTestWithPageObject extends ParentTest {

    @Test
    public void goToSigninPage1(){
        mainPage.openPage();
        mainPage.clickOnLoginBtn();
    }

    @Test
    public void goToSiginPage2(){
        mainPage.openPage();
        mainPage.clickOnRegisterBtnTop();
    }
}
