package com.appium.ApiDemos_debug.pages.home.nested.accessibility;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.accessibility.strings.AccessibilityStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Accessibility extends Base<Accessibility> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = AccessibilityStrings.ACCESSIBILITY_NODE_PROVIDER)
    private AndroidElement accessibilityNodeProvider;

    @AndroidFindBy(accessibility = AccessibilityStrings.ACCESSIBILITY_NODE_QUERYING)
    private AndroidElement accessibilityNodeQuerying;

    @AndroidFindBy(accessibility = AccessibilityStrings.ACCESSIBILITY_SERVICE)
    private AndroidElement accessibilityService;

    @AndroidFindBy(accessibility = AccessibilityStrings.CUSTOM_VIEW)
    private AndroidElement customView;

    public Accessibility(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getAccessibility());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert accessibilityNodeProvider.getText().equals(AccessibilityStrings.ACCESSIBILITY_NODE_PROVIDER);
            assert accessibilityNodeQuerying.getText().equals(AccessibilityStrings.ACCESSIBILITY_NODE_QUERYING);
            assert accessibilityService.getText().equals(AccessibilityStrings.ACCESSIBILITY_SERVICE);
            assert customView.getText().equals(AccessibilityStrings.CUSTOM_VIEW);
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
