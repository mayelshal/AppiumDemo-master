package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityNodeQueryPage {
    private WebDriver driver;
    private final By checkBoxButton =AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Task Conquer World\"]//parent::android.widget.LinearLayout/android.widget.CheckBox");

    public AccessibilityNodeQueryPage(WebDriver driver) {
        this.driver = driver;
    }

    public AccessibilityNodeQueryPage clickOncheckBox(){
        driver.findElement(checkBoxButton).click();
        return this;
    }
}
