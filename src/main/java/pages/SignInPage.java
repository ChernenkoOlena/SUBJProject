package pages;

import org.openqa.selenium.WebDriver;

public class SignInPage extends ParentPage {
    public SignInPage(WebDriver webDriver) {
        super(webDriver, "/signin");
    }
}
