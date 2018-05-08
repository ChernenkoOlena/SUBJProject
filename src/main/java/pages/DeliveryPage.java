package pages;

import org.openqa.selenium.WebDriver;

public class DeliveryPage extends ParentPage {
    public DeliveryPage(WebDriver webDriver) {
        super(webDriver, "/checkout/delivery");
    }
}
