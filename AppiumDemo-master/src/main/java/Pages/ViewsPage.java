package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    private WebDriver driver;
    private final By radioGroupLabel = AppiumBy.accessibilityId("Radio Group");

    public ViewsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ViewsPage scrollToElement(String label ){
        MobileActions actions = new MobileActions(driver);
        actions.scrollDownToSpecificText(label);
        return this;
    }

    public ViewsPage clickOnRadioGroup(){
        driver.findElement(radioGroupLabel).click();
        return this;
    }
}
