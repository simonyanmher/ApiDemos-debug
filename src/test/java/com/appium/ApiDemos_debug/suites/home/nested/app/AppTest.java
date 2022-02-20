package com.appium.ApiDemos_debug.suites.home.nested.app;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.app.App;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.app.strings.AppStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {
    private App app;
    private final String name = App.class.getSimpleName();

    @BeforeClass
    public void initializeApp() {
        initializingLog(name);
        Home home = new Home(driver);
        app = new App(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getAppTest() {
        assertEquals(app.getActionBar().getText(), AppStrings.ACTION_BAR);
        assertEquals(app.getActivity().getText(), AppStrings.ACTIVITY);
        assertEquals(app.getAlarm().getText(), AppStrings.ALARM);
        assertEquals(app.getAlertDialogs().getText(), AppStrings.ALERT_DIALOGS);
        assertEquals(app.getDeviceAdmin().getText(), AppStrings.DEVICE_ADMIN);
        assertEquals(app.getFragment().getText(), AppStrings.FRAGMENT);
        assertEquals(app.getLauncherShortcuts().getText(), AppStrings.LAUNCHER_SHORTCUTS);
        assertEquals(app.getLoader().getText(), AppStrings.LOADER);
        assertEquals(app.getMenu().getText(), AppStrings.MENU);
        assertEquals(app.getNotification().getText(), AppStrings.NOTIFICATION);
        assertEquals(app.getSearch().getText(), AppStrings.SEARCH);
        assertEquals(app.getService().getText(), AppStrings.SERVICE);

        scrollDown(AppStrings.VOICE_RECOGNITION);

        assertEquals(app.getTextToSpeech().getText(), AppStrings.TEXT_TO_SPEECH);
        assertEquals(app.getVoiceRecognition().getText(), AppStrings.VOICE_RECOGNITION);
    }
}
