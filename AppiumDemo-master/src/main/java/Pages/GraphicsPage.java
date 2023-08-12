package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphicsPage {
    private WebDriver driver;
    private final By ScaleToFitLabel =AppiumBy.accessibilityId("ScaleToFit");

    private final By verticesLabel =AppiumBy.accessibilityId("Vertices");

    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
    }
    public GraphicsPage scrollToElement(String label ){
        MobileActions actions = new MobileActions(driver);
        actions.scrollDownToSpecificText(label);
        return this;
    }
    public GraphicsPage clickOnScaleToFit(){
        driver.findElement(ScaleToFitLabel).click();
        return this;
    }
    public GraphicsPage clickOnVertices(){
        driver.findElement(verticesLabel).click();
        return this;
    }


}
