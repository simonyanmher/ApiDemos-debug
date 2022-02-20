package com.appium.ApiDemos_debug.suites.home.nested.content;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.content.Content;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.content.strings.ContentStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContentTest extends BaseTest {
    private Content content;
    private final String name = Content.class.getSimpleName();

    @BeforeClass
    public void initializeContent() {
        initializingLog(name);
        Home home = new Home(driver);
        content = new Content(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getContentTest() {
        assertEquals(content.getAssets().getText(), ContentStrings.ASSETS);
        assertEquals(content.getClipboard().getText(), ContentStrings.CLIPBOARD);
        assertEquals(content.getPackages().getText(), ContentStrings.PACKAGES);
        assertEquals(content.getProvider().getText(), ContentStrings.PROVIDER);
        assertEquals(content.getResources().getText(), ContentStrings.RESOURCES);
        assertEquals(content.getStorage().getText(), ContentStrings.STORAGE);
    }
}
