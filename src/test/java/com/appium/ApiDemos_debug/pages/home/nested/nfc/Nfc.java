package com.appium.ApiDemos_debug.pages.home.nested.nfc;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.nfc.strings.NfcStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Nfc extends Base<Nfc> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = NfcStrings.FOREGROUND_DISPATCH)
    private AndroidElement foregroundDispatch;

    @AndroidFindBy(accessibility = NfcStrings.FOREGROUND_NDEF_PUSH)
    private AndroidElement foregroundNdefPush;

    @AndroidFindBy(accessibility = NfcStrings.TECH_FILTER)
    private AndroidElement techFilter;

    public Nfc(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getNfc());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert foregroundDispatch.getText().equals(NfcStrings.FOREGROUND_DISPATCH);
            assert foregroundNdefPush.getText().equals(NfcStrings.FOREGROUND_NDEF_PUSH);
            assert techFilter.getText().equals(NfcStrings.TECH_FILTER);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getForegroundDispatch() {
        return foregroundDispatch;
    }

    public AndroidElement getForegroundNdefPush() {
        return foregroundNdefPush;
    }

    public AndroidElement getTechFilter() {
        return techFilter;
    }
}
