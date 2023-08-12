package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    private WebDriver driver;
    private final By text1Label = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    private final By changeLeftBotton =AppiumBy.accessibilityId("Change Left");

    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
    }
    public CustomTitlePage TypeAppium(String text){
        driver.findElement(text1Label).click();
        driver.findElement(text1Label).clear();
        driver.findElement(text1Label).sendKeys(text);
        driver.findElement(changeLeftBotton).click();
        return this;
    }

}
