
import Pages.*;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.JsonFileManager;
import java.net.MalformedURLException;


public class TestMobilActions {
    WebDriver driver;
    JsonFileManager LeftTextfieldTestData;
    JsonFileManager AccessbilityNodeProvider;
    JsonFileManager ScaleToFit;

    @BeforeClass
    public void beforeClass(){
        LeftTextfieldTestData = new JsonFileManager("src\\test\\TestData\\LeftTextfieldTestData.json");
        AccessbilityNodeProvider = new JsonFileManager("src\\test\\TestData\\AcessibilityNodeProvider.json");
        ScaleToFit = new JsonFileManager("src\\test\\TestData\\Graphics\\ScaletofitTestData.json");
    }
    @BeforeMethod
    public void setupDevice() throws MalformedURLException{
        driver = new Setup(driver).setupDevice();
    }

    @Test
    public void testClickAction() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
        new HomePage(driver).clickOnaccessability();
        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), AccessbilityNodeProvider.getTestData("text"));
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not

        //driver.findElement(AppiumBy.accessibilityId("App")).click();
        new HomePage(driver).clickOnAPP();
        //driver.findElement(AppiumBy.accessibilityId("Activity")).click();
        new AppPage(driver).clickOnActivity();
        //driver.findElement(AppiumBy.accessibilityId("Custom Title")).click();
        new ActivityPage(driver).clickOnCustomTitle();
       // driver.findElement(AppiumBy.id("io.appium.android.apis:id/left_text_edit")).clear();
        new CustomTitlePage(driver).TypeAppium(LeftTextfieldTestData.getTestData("text"));
        //driver.findElement(AppiumBy.id("io.appium.android.apis:id/left_text_edit")).sendKeys("Appium");
        //driver.findElement(AppiumBy.accessibilityId("Change Left")).click();
        Assert.assertEquals(driver.findElement(AppiumBy.id("io.appium.android.apis:id/left_text")).getText(), LeftTextfieldTestData.getTestData("text"));
    }

    @Test(dependsOnMethods = "testTyping")
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked

        //driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
        new HomePage(driver).clickOnaccessability();
        //driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
        new AccessibilityPage(driver).clickOnAccessibilityNodeQuery();
        //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Task Conquer World\"]//parent::android.widget.LinearLayout/android.widget.CheckBox")).click();
        new AccessibilityNodeQueryPage(driver).clickOncheckBox();
        Assert.assertTrue(Boolean.parseBoolean(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Task Conquer World\"]//parent::android.widget.LinearLayout/android.widget.CheckBox")).getAttribute("checked")));
    }


    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not

        //driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
        new HomePage(driver).clickOnGraphics();
        //MobileActions actions = new MobileActions(driver);
        //actions.scrollDownToSpecificText("ScaleToFit");
        new GraphicsPage(driver).scrollToElement("ScaleToFit");
        //driver.findElement(AppiumBy.accessibilityId("ScaleToFit")).click();
        new GraphicsPage(driver).clickOnScaleToFit();
        Assert.assertEquals(driver.findElement(AppiumBy.className("android.widget.TextView")).getText(),ScaleToFit.getTestData("text") );

    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        //driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
        new HomePage(driver).clickOnGraphics();
        //MobileActions actions = new MobileActions(driver);
        //actions.scrollDownToSpecificText("Vertices");
        new GraphicsPage(driver).scrollToElement("Vertices");
        //driver.findElement(AppiumBy.accessibilityId("Vertices")).click();
        new GraphicsPage(driver).clickOnVertices();
        new VerticesPage(driver).swipeOnPhoto();
        //actions.swipeLeftOnElement(AppiumBy.xpath("//android.view.View"));
        //actions.swipeRightOnElement(AppiumBy.xpath("//android.view.View"),driver);
    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not

        //driver.findElement(AppiumBy.accessibilityId("Views")).click();
        new HomePage(driver).clickOnViews();
        //MobileActions actions = new MobileActions(driver);
        //actions.scrollDownToSpecificText("Radio Group");
        new ViewsPage(driver).scrollToElement("Radio Group");
        //driver.findElement(AppiumBy.accessibilityId("Radio Group")).click();
        new ViewsPage(driver).clickOnRadioGroup();
        //driver.findElement(AppiumBy.accessibilityId("Breakfast")).click();
        new RadioGroupPage(driver).clickOnRadioButton();
        Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("Breakfast")).getAttribute("checked"),("true"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
