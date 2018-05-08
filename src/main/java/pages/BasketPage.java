package pages;

import org.openqa.selenium.WebDriver;

public class BasketPage extends ParentPage {
    public BasketPage(WebDriver webDriver) {
        super(webDriver, "/checkout/cart");
    }
}
