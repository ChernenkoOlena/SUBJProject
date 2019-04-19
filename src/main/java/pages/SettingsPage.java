package pages;

import org.openqa.selenium.WebDriver;

public class SettingsPage extends ParentPage {
    public SettingsPage(WebDriver webDriver) {
        super(webDriver, "/settings");
    }
}
