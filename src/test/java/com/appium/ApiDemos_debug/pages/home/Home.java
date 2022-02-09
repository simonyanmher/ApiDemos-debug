package com.appium.ApiDemos_debug.pages.home;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.strings.HomeStrings;
import com.appium.ApiDemos_debug.utils.ConstantStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Home extends Base<Home> {
    private final AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(xpath = ConstantStrings.LOCATOR)
    private AndroidElement title;

    @AndroidFindBy(accessibility = HomeStrings.ACCESSIBILITY)
    private AndroidElement accessibility;

    @AndroidFindBy(accessibility = HomeStrings.ANIMATION)
    private AndroidElement animation;

    @AndroidFindBy(accessibility = HomeStrings.APP)
    private AndroidElement app;

    @AndroidFindBy(accessibility = HomeStrings.CONTENT)
    private AndroidElement content;

    @AndroidFindBy(accessibility = HomeStrings.GRAPHICS)
    private AndroidElement graphics;

    @AndroidFindBy(accessibility = HomeStrings.MEDIA)
    private AndroidElement media;

    @AndroidFindBy(accessibility = HomeStrings.NFC)
    private AndroidElement nfc;

    @AndroidFindBy(accessibility = HomeStrings.OS)
    private AndroidElement os;

    @AndroidFindBy(accessibility = HomeStrings.PREFERENCE)
    private AndroidElement preference;

    @AndroidFindBy(accessibility = HomeStrings.TEXT)
    private AndroidElement text;

    @AndroidFindBy(accessibility = HomeStrings.VIEWS)
    private AndroidElement views;

    public Home(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            Assert.assertEquals(getTitle(), ConstantStrings.EXPECTED);

            assert accessibility.getText().equals(HomeStrings.ACCESSIBILITY);
            assert animation.getText().equals(HomeStrings.ANIMATION);
            assert app.getText().equals(HomeStrings.APP);
            assert content.getText().equals(HomeStrings.CONTENT);
            assert graphics.getText().equals(HomeStrings.GRAPHICS);
            assert media.getText().equals(HomeStrings.MEDIA);
            assert nfc.getText().equals(HomeStrings.NFC);
            assert os.getText().equals(HomeStrings.OS);
            assert preference.getText().equals(HomeStrings.PREFERENCE);
            assert text.getText().equals(HomeStrings.TEXT);
            assert views.getText().equals(HomeStrings.VIEWS);
        } catch (Error e) {
            fail(e);
        }
    }

    public String getTitle() {
        return title.getText();
    }

    public AndroidElement getAccessibility() {
        return accessibility;
    }

    public AndroidElement getAnimation() {
        return animation;
    }

    public AndroidElement getApp() {
        return app;
    }

    public AndroidElement getContent() {
        return content;
    }

    public AndroidElement getGraphics() {
        return graphics;
    }

    public AndroidElement getMedia() {
        return media;
    }

    public AndroidElement getNfc() {
        return nfc;
    }

    public AndroidElement getOs() {
        return os;
    }

    public AndroidElement getPreference() {
        return preference;
    }

    public AndroidElement getText() {
        return text;
    }

    public AndroidElement getViews() {
        return views;
    }
}
