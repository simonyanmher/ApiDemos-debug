package com.appium.ApiDemos_debug.suites.home.nested.accessibility;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.accessibility.Accessibility;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.accessibility.strings.AccessibilityStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccessibilityTest extends BaseTest {
    private Accessibility accessibility;
    private final String name = Accessibility.class.getSimpleName();

    @BeforeClass
    public void initializeAccessibility() {
        initializingLog(name);
        Home home = new Home(driver);
        accessibility = new Accessibility(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getAccessibilityTest() {
        assertEquals(accessibility.getAccessibilityNodeProvider().getText(), AccessibilityStrings.ACCESSIBILITY_NODE_PROVIDER);
        assertEquals(accessibility.getAccessibilityNodeQuerying().getText(), AccessibilityStrings.ACCESSIBILITY_NODE_QUERYING);
        assertEquals(accessibility.getAccessibilityService().getText(), AccessibilityStrings.ACCESSIBILITY_SERVICE);
        assertEquals(accessibility.getCustomView().getText(), AccessibilityStrings.CUSTOM_VIEW);
    }
}
