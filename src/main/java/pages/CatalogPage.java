package pages;

import org.openqa.selenium.WebDriver;

public class CatalogPage extends ParentPage {
    public CatalogPage(WebDriver webDriver) {
        super(webDriver, "/catalog");
    }
}
