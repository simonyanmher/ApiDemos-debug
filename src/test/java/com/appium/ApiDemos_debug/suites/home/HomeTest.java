package com.appium.ApiDemos_debug.suites.home;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.strings.HomeStrings;
import com.appium.ApiDemos_debug.utils.ConstantStrings;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    private Home home;
    private final String name = Home.class.getSimpleName();

    @BeforeClass
    public void initializeHome() {
        initializingLog(name);
        home = new Home(driver).get();
        initializedLog(name);
    }

    @Test
    public void getHomeTest() {
        Assert.assertEquals(home.getTitle(), ConstantStrings.EXPECTED);

        assertEquals(home.getAccess().getText(), HomeStrings.ACCESS);
        assertEquals(home.getAccessibility().getText(), HomeStrings.ACCESSIBILITY);
        assertEquals(home.getAnimation().getText(), HomeStrings.ANIMATION);
        assertEquals(home.getApp().getText(), HomeStrings.APP);
        assertEquals(home.getContent().getText(), HomeStrings.CONTENT);
        assertEquals(home.getGraphics().getText(), HomeStrings.GRAPHICS);
        assertEquals(home.getMedia().getText(), HomeStrings.MEDIA);
        assertEquals(home.getNfc().getText(), HomeStrings.NFC);
        assertEquals(home.getOs().getText(), HomeStrings.OS);
        assertEquals(home.getPreference().getText(), HomeStrings.PREFERENCE);
        assertEquals(home.getTextElement().getText(), HomeStrings.TEXT);
        assertEquals(home.getViews().getText(), HomeStrings.VIEWS);
    }
}
