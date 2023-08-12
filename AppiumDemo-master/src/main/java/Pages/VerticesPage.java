package Pages;


import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticesPage {
    private WebDriver driver;
    private final By photo = AppiumBy.xpath("//android.view.View");

    public VerticesPage(WebDriver driver) {
        this.driver = driver;
    }
    public VerticesPage swipeOnPhoto(){
        MobileActions actions = new MobileActions(driver);
        actions.swipeRightOnElement(photo,driver);
        actions.swipeLeftOnElement(photo);
        return this;
    }
}
