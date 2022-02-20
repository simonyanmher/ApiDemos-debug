package com.appium.ApiDemos_debug.suites.home.nested.os;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.os.Os;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.os.strings.OsStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OsTest extends BaseTest {
    private Os os;
    private final String name = Os.class.getSimpleName();

    @BeforeClass
    public void initializeOs() {
        initializingLog(name);
        Home home = new Home(driver);
        os = new Os(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getOsTest() {
        assertEquals(os.getMorseCode().getText(), OsStrings.MORSE_CODE);
        assertEquals(os.getRotationVector().getText(), OsStrings.ROTATION_VECTOR);
        assertEquals(os.getSensors().getText(), OsStrings.SENSORS);
        assertEquals(os.getSmsMessaging().getText(), OsStrings.SMS_MESSAGING);
    }
}
