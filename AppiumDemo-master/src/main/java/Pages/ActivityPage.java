package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    private WebDriver driver;
    private final By customTitleLable =AppiumBy.accessibilityId("Custom Title");

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }
    public ActivityPage clickOnCustomTitle(){
        driver.findElement(customTitleLable).click();
        return this;
    }
}
