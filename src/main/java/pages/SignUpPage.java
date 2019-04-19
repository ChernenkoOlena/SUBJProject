package pages;

import org.openqa.selenium.WebDriver;

public class SignUpPage extends ParentPage {
    public SignUpPage(WebDriver webDriver) {
        super(webDriver, "/signup");
    }
}
