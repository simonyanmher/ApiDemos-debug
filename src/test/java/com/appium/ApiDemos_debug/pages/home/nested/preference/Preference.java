package com.appium.ApiDemos_debug.pages.home.nested.preference;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.preference.strings.PreferenceStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Preference extends Base<Preference> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = PreferenceStrings.PREFERENCES_FOR_XML)
    private AndroidElement preferencesFromXml;

    @AndroidFindBy(accessibility = PreferenceStrings.LAUNCHING_PREFERENCES)
    private AndroidElement launchingPreferences;

    @AndroidFindBy(accessibility = PreferenceStrings.PREFERENCE_DEPENDENCIES)
    private AndroidElement preferenceDependencies;

    @AndroidFindBy(accessibility = PreferenceStrings.DEFAULT_VALUES)
    private AndroidElement defaultValues;

    @AndroidFindBy(accessibility = PreferenceStrings.PREFERENCES_FROM_CODE)
    private AndroidElement preferencesFromCode;

    @AndroidFindBy(accessibility = PreferenceStrings.ADVANCED_PREFERENCES)
    private AndroidElement advancedPreferences;

    @AndroidFindBy(accessibility = PreferenceStrings.FRAGMENT)
    private AndroidElement fragment;

    @AndroidFindBy(accessibility = PreferenceStrings.HEADERS)
    private AndroidElement headers;

    @AndroidFindBy(accessibility = PreferenceStrings.SWITCH)
    private AndroidElement switchElement;

    public Preference(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getPreference());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert preferencesFromXml.getText().equals(PreferenceStrings.PREFERENCES_FOR_XML);
            assert launchingPreferences.getText().equals(PreferenceStrings.LAUNCHING_PREFERENCES);
            assert preferenceDependencies.getText().equals(PreferenceStrings.PREFERENCE_DEPENDENCIES);
            assert defaultValues.getText().equals(PreferenceStrings.DEFAULT_VALUES);
            assert preferencesFromCode.getText().equals(PreferenceStrings.PREFERENCES_FROM_CODE);
            assert advancedPreferences.getText().equals(PreferenceStrings.ADVANCED_PREFERENCES);
            assert fragment.getText().equals(PreferenceStrings.FRAGMENT);
            assert headers.getText().equals(PreferenceStrings.HEADERS);
            assert switchElement.getText().equals(PreferenceStrings.SWITCH);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getPreferencesFromXml() {
        return preferencesFromXml;
    }

    public AndroidElement getLaunchingPreferences() {
        return launchingPreferences;
    }

    public AndroidElement getPreferenceDependencies() {
        return preferenceDependencies;
    }

    public AndroidElement getDefaultValues() {
        return defaultValues;
    }

    public AndroidElement getPreferencesFromCode() {
        return preferencesFromCode;
    }

    public AndroidElement getAdvancedPreferences() {
        return advancedPreferences;
    }

    public AndroidElement getFragment() {
        return fragment;
    }

    public AndroidElement getHeaders() {
        return headers;
    }

    public AndroidElement getSwitch() {
        return switchElement;
    }
}
