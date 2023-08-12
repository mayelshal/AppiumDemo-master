package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private final By AccessibilityLabel= AppiumBy.accessibilityId("Access'ibility");
    private final By appButton= AppiumBy.accessibilityId("App");
    private final By graphicsButton =AppiumBy.accessibilityId("Graphics");
     private final By ViewsLabel =AppiumBy.accessibilityId("Views");

   public HomePage (WebDriver driver){
       this.driver=driver;
   }
   public HomePage clickOnaccessability(){
       driver.findElement(AccessibilityLabel).click();
       return this;

   }
    public HomePage clickOnAPP(){
        driver.findElement(appButton).click();
        return this;

    }
    public HomePage clickOnGraphics(){
        driver.findElement(graphicsButton).click();
        return this;

    }
    public HomePage clickOnViews(){
        driver.findElement(ViewsLabel).click();
        return this;

    }










}
