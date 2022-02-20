package com.appium.ApiDemos_debug.pages.home.nested.text;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.text.strings.TextStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Text extends Base<Text> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = TextStrings.KEY_EVENT_TEXT)
    private AndroidElement keyEventText;

    @AndroidFindBy(accessibility = TextStrings.LINKIFY)
    private AndroidElement linkify;

    @AndroidFindBy(accessibility = TextStrings.LOG_TEXT_BOX)
    private AndroidElement logTextBox;

    @AndroidFindBy(accessibility = TextStrings.MARQUEE)
    private AndroidElement marquee;

    @AndroidFindBy(accessibility = TextStrings.UNICODE)
    private AndroidElement unicode;

    public Text(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getTextElement());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert keyEventText.getText().equals(TextStrings.KEY_EVENT_TEXT);
            assert linkify.getText().equals(TextStrings.LINKIFY);
            assert logTextBox.getText().equals(TextStrings.LOG_TEXT_BOX);
            assert marquee.getText().equals(TextStrings.MARQUEE);
            assert unicode.getText().equals(TextStrings.UNICODE);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getKeyEventText() {
        return keyEventText;
    }

    public AndroidElement getLinkify() {
        return linkify;
    }

    public AndroidElement getLogTextBox() {
        return logTextBox;
    }

    public AndroidElement getMarquee() {
        return marquee;
    }

    public AndroidElement getUnicode() {
        return unicode;
    }
}
