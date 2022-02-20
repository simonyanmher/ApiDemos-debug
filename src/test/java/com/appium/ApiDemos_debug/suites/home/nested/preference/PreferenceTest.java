package com.appium.ApiDemos_debug.suites.home.nested.preference;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.preference.Preference;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.preference.strings.PreferenceStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PreferenceTest extends BaseTest {
    private Preference preference;
    private final String name = Preference.class.getSimpleName();

    @BeforeClass
    public void initializePreference() {
        initializingLog(name);
        Home home = new Home(driver);
        preference = new Preference(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getPreferenceTest() {
        assertEquals(preference.getPreferencesFromXml().getText(), PreferenceStrings.PREFERENCES_FOR_XML);
        assertEquals(preference.getLaunchingPreferences().getText(), PreferenceStrings.LAUNCHING_PREFERENCES);
        assertEquals(preference.getPreferenceDependencies().getText(), PreferenceStrings.PREFERENCE_DEPENDENCIES);
        assertEquals(preference.getDefaultValues().getText(), PreferenceStrings.DEFAULT_VALUES);
        assertEquals(preference.getPreferencesFromCode().getText(), PreferenceStrings.PREFERENCES_FROM_CODE);
        assertEquals(preference.getAdvancedPreferences().getText(), PreferenceStrings.ADVANCED_PREFERENCES);
        assertEquals(preference.getFragment().getText(), PreferenceStrings.FRAGMENT);
        assertEquals(preference.getHeaders().getText(), PreferenceStrings.HEADERS);
        assertEquals(preference.getSwitch().getText(), PreferenceStrings.SWITCH);
    }
}
