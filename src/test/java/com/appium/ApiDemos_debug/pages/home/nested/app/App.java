package com.appium.ApiDemos_debug.pages.home.nested.app;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.app.strings.AppStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class App extends Base<App> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = AppStrings.ACTION_BAR)
    private AndroidElement actionBar;

    @AndroidFindBy(accessibility = AppStrings.ACTIVITY)
    private AndroidElement activity;

    @AndroidFindBy(accessibility = AppStrings.ALARM)
    private AndroidElement alarm;

    @AndroidFindBy(accessibility = AppStrings.ALERT_DIALOGS)
    private AndroidElement alertDialogs;

    @AndroidFindBy(accessibility = AppStrings.DEVICE_ADMIN)
    private AndroidElement deviceAdmin;

    @AndroidFindBy(accessibility = AppStrings.FRAGMENT)
    private AndroidElement fragment;

    @AndroidFindBy(accessibility = AppStrings.LAUNCHER_SHORTCUTS)
    private AndroidElement launcherShortcuts;

    @AndroidFindBy(accessibility = AppStrings.LOADER)
    private AndroidElement loader;

    @AndroidFindBy(accessibility = AppStrings.MENU)
    private AndroidElement menu;

    @AndroidFindBy(accessibility = AppStrings.NOTIFICATION)
    private AndroidElement notification;

    @AndroidFindBy(accessibility = AppStrings.SEARCH)
    private AndroidElement search;

    @AndroidFindBy(accessibility = AppStrings.SERVICE)
    private AndroidElement service;

    @AndroidFindBy(accessibility = AppStrings.TEXT_TO_SPEECH)
    private AndroidElement textToSpeech;

    @AndroidFindBy(accessibility = AppStrings.VOICE_RECOGNITION)
    private AndroidElement voiceRecognition;

    public App(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getApp());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert actionBar.getText().equals(AppStrings.ACTION_BAR);
            assert activity.getText().equals(AppStrings.ACTIVITY);
            assert alarm.getText().equals(AppStrings.ALARM);
            assert alertDialogs.getText().equals(AppStrings.ALERT_DIALOGS);
            assert deviceAdmin.getText().equals(AppStrings.DEVICE_ADMIN);
            assert fragment.getText().equals(AppStrings.FRAGMENT);
            assert launcherShortcuts.getText().equals(AppStrings.LAUNCHER_SHORTCUTS);
            assert loader.getText().equals(AppStrings.LOADER);
            assert menu.getText().equals(AppStrings.MENU);
            assert notification.getText().equals(AppStrings.NOTIFICATION);
            assert search.getText().equals(AppStrings.SEARCH);
            assert service.getText().equals(AppStrings.SERVICE);
            assert textToSpeech.getText().equals(AppStrings.TEXT_TO_SPEECH);
            assert voiceRecognition.getText().equals(AppStrings.VOICE_RECOGNITION);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getActionBar() {
        return actionBar;
    }

    public AndroidElement getActivity() {
        return activity;
    }

    public AndroidElement getAlarm() {
        return alarm;
    }

    public AndroidElement getAlertDialogs() {
        return alertDialogs;
    }

    public AndroidElement getDeviceAdmin() {
        return deviceAdmin;
    }

    public AndroidElement getFragment() {
        return fragment;
    }

    public AndroidElement getLauncherShortcuts() {
        return launcherShortcuts;
    }

    public AndroidElement getLoader() {
        return loader;
    }

    public AndroidElement getMenu() {
        return menu;
    }

    public AndroidElement getNotification() {
        return notification;
    }

    public AndroidElement getSearch() {
        return search;
    }

    public AndroidElement getService() {
        return service;
    }

    public AndroidElement getTextToSpeech() {
        return textToSpeech;
    }

    public AndroidElement getVoiceRecognition() {
        return voiceRecognition;
    }
}
