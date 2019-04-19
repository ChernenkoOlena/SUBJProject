package pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends ParentPage {
    public SearchPage(WebDriver webDriver) {
        super(webDriver, "/search");
    }
}
