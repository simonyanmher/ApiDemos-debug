package com.appium.ApiDemos_debug.pages.home.nested.os;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.os.strings.OsStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Os extends Base<Os> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = OsStrings.MORSE_CODE)
    private AndroidElement morseCode;

    @AndroidFindBy(accessibility = OsStrings.ROTATION_VECTOR)
    private AndroidElement rotationVector;

    @AndroidFindBy(accessibility = OsStrings.SENSORS)
    private AndroidElement sensors;

    @AndroidFindBy(accessibility = OsStrings.SMS_MESSAGING)
    private AndroidElement smsMessaging;

    public Os(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getOs());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert morseCode.getText().equals(OsStrings.MORSE_CODE);
            assert rotationVector.getText().equals(OsStrings.ROTATION_VECTOR);
            assert sensors.getText().equals(OsStrings.SENSORS);
            assert smsMessaging.getText().equals(OsStrings.SMS_MESSAGING);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getMorseCode() {
        return morseCode;
    }

    public AndroidElement getRotationVector() {
        return rotationVector;
    }

    public AndroidElement getSensors() {
        return sensors;
    }

    public AndroidElement getSmsMessaging() {
        return smsMessaging;
    }
}
