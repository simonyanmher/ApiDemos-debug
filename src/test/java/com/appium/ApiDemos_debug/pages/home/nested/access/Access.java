package com.appium.ApiDemos_debug.pages.home.nested.access;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.access.strings.AccessStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Access extends Base<Access> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = AccessStrings.ACCESSIBILITY_NODE_PROVIDER)
    private AndroidElement accessibilityNodeProvider;

    @AndroidFindBy(accessibility = AccessStrings.ACCESSIBILITY_NODE_QUERYING)
    private AndroidElement accessibilityNodeQuerying;

    @AndroidFindBy(accessibility = AccessStrings.ACCESSIBILITY_SERVICE)
    private AndroidElement accessibilityService;

    @AndroidFindBy(accessibility = AccessStrings.CUSTOM_VIEW)
    private AndroidElement customView;

    public Access(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getAccess());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert accessibilityNodeProvider.getText().equals(AccessStrings.ACCESSIBILITY_NODE_PROVIDER);
            assert accessibilityNodeQuerying.getText().equals(AccessStrings.ACCESSIBILITY_NODE_QUERYING);
            assert accessibilityService.getText().equals(AccessStrings.ACCESSIBILITY_SERVICE);
            assert customView.getText().equals(AccessStrings.CUSTOM_VIEW);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getAccessibilityNodeProvider() {
        return accessibilityNodeProvider;
    }

    public AndroidElement getAccessibilityNodeQuerying() {
        return accessibilityNodeQuerying;
    }

    public AndroidElement getAccessibilityService() {
        return accessibilityService;
    }

    public AndroidElement getCustomView() {
        return customView;
    }
}
