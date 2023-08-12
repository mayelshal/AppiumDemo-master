package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroupPage {
    private WebDriver driver;
    private final By radionButton =AppiumBy.accessibilityId("Breakfast");

    public RadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;

    }
    public RadioGroupPage clickOnRadioButton(){
        driver.findElement(radionButton).click();
        return this;
    }
}
