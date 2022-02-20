package com.appium.ApiDemos_debug.suites.home.nested.nfc;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.nfc.Nfc;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.nfc.strings.NfcStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NfcTest extends BaseTest {
    private Nfc nfc;
    private final String name = Nfc.class.getSimpleName();

    @BeforeClass
    public void initializeNfc() {
        initializingLog(name);
        Home home = new Home(driver);
        nfc = new Nfc(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getNfcTest() {
        assertEquals(nfc.getForegroundDispatch().getText(), NfcStrings.FOREGROUND_DISPATCH);
        assertEquals(nfc.getForegroundNdefPush().getText(), NfcStrings.FOREGROUND_NDEF_PUSH);
        assertEquals(nfc.getTechFilter().getText(), NfcStrings.TECH_FILTER);
    }
}
