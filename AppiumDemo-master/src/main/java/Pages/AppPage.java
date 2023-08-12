package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class AppPage {
    private WebDriver driver;
    private final By ActivityLabel=AppiumBy.accessibilityId("Activity");

    public AppPage(WebDriver driver) {

        this.driver = driver;
    }

    public AppPage clickOnActivity(){
        driver.findElement(ActivityLabel).click();
        return this;
    }
}
