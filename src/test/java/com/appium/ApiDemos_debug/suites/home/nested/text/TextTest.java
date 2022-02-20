package com.appium.ApiDemos_debug.suites.home.nested.text;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.text.Text;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.text.strings.TextStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextTest extends BaseTest {
    private Text text;
    private final String name = Text.class.getSimpleName();

    @BeforeClass
    public void initializeText() {
        initializingLog(name);
        Home home = new Home(driver);
        text = new Text(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getTextTest() {
        assertEquals(text.getKeyEventText().getText(), TextStrings.KEY_EVENT_TEXT);
        assertEquals(text.getLinkify().getText(), TextStrings.LINKIFY);
        assertEquals(text.getLogTextBox().getText(), TextStrings.LOG_TEXT_BOX);
        assertEquals(text.getMarquee().getText(), TextStrings.MARQUEE);
        assertEquals(text.getUnicode().getText(), TextStrings.UNICODE);
    }
}
