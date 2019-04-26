package SigninTests;

import org.junit.Test;
import pages.SignInPage;
import parentTest.ParentTest;

public class SignInTestWithPageObject extends ParentTest {

    @Test
    public void validLogin(){
        signInPage.openPage();


    }
}
