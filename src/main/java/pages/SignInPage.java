package pages;

import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignInPage extends ParentPage {
    public SignInPage(WebDriver webDriver) {
        super(webDriver, "/signin");
    }

    
    public void openPage(){
        try{
            webDriver.get("https://try.subj.ua");
            logger.info("Signin Page was opened");
        }catch (Exception e){
            logger.error("Can not open SigninPage");
            Assert.fail("Can not open SigninPage");
        }
    }
}
