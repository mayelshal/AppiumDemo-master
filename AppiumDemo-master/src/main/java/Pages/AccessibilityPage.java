package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityPage {
    private WebDriver driver;
   private final By accessNodeQueryLabel =AppiumBy.accessibilityId("Accessibility Node Querying");


    public AccessibilityPage(WebDriver driver) {
        this.driver = driver;
    }
    public AccessibilityPage clickOnAccessibilityNodeQuery(){
        driver.findElement(accessNodeQueryLabel).click();
        return this;
    }
}
