package com.appium.ApiDemos_debug.pages.home.nested.content;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.content.strings.ContentStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Content extends Base<Content> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = ContentStrings.ASSETS)
    private AndroidElement assets;

    @AndroidFindBy(accessibility = ContentStrings.CLIPBOARD)
    private AndroidElement clipboard;

    @AndroidFindBy(accessibility = ContentStrings.PACKAGES)
    private AndroidElement packages;

    @AndroidFindBy(accessibility = ContentStrings.PROVIDER)
    private AndroidElement provider;

    @AndroidFindBy(accessibility = ContentStrings.RESOURCES)
    private AndroidElement resources;

    @AndroidFindBy(accessibility = ContentStrings.STORAGE)
    private AndroidElement storage;

    public Content(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getContent());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert assets.getText().equals(ContentStrings.ASSETS);
            assert clipboard.getText().equals(ContentStrings.CLIPBOARD);
            assert packages.getText().equals(ContentStrings.PACKAGES);
            assert provider.getText().equals(ContentStrings.PROVIDER);
            assert resources.getText().equals(ContentStrings.RESOURCES);
            assert storage.getText().equals(ContentStrings.STORAGE);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getAssets() {
        return assets;
    }

    public AndroidElement getClipboard() {
        return clipboard;
    }

    public AndroidElement getPackages() {
        return packages;
    }

    public AndroidElement getProvider() {
        return provider;
    }

    public AndroidElement getResources() {
        return resources;
    }

    public AndroidElement getStorage() {
        return storage;
    }
}
