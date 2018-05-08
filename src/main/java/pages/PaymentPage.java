package pages;

import org.openqa.selenium.WebDriver;

public class PaymentPage extends ParentPage {
    public PaymentPage(WebDriver webDriver) {
        super(webDriver, "/checkout/payment");
    }
}
