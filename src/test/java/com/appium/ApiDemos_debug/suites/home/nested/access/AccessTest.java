package com.appium.ApiDemos_debug.suites.home.nested.access;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.access.Access;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.access.strings.AccessStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccessTest extends BaseTest {
    private Access access;
    private final String name = Access.class.getSimpleName();

    @BeforeClass
    public void initializeAccess() {
        initializingLog(name);
        Home home = new Home(driver);
        access = new Access(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getAccessTest() {
        assertEquals(access.getAccessibilityNodeProvider().getText(), AccessStrings.ACCESSIBILITY_NODE_PROVIDER);
        assertEquals(access.getAccessibilityNodeQuerying().getText(), AccessStrings.ACCESSIBILITY_NODE_QUERYING);
        assertEquals(access.getAccessibilityService().getText(), AccessStrings.ACCESSIBILITY_SERVICE);
        assertEquals(access.getCustomView().getText(), AccessStrings.CUSTOM_VIEW);
    }
}
