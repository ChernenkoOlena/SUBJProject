package SigninTests;

import org.junit.Test;
import parentTest.ParentTest;

public class SignInTestWithPageObject extends ParentTest {
    final String phoneNumber = "0673006161";


    @Test
    public void validSignin() {
        mainPage.openPage();
        mainPage.clickOnLoginButtonTop();
        signInPage.checkCurrentUrl();
        signInPage.enterPhoneNumber(phoneNumber);
        signInPage.clickOnBtnNext();

    }


}
