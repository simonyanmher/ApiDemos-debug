package com.appium.ApiDemos_debug.pages;

import com.appium.ApiDemos_debug.Main;
import io.appium.java_client.android.AndroidElement;

public abstract class Base<T extends Base<T>> extends Main {
    private final String name = self().getClass().getSimpleName();

    public Base() {
    }

    @SuppressWarnings("unchecked")
    private T self() {
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T get() {
        try {
            this.isLoadedComponent();
            return (T) this;
        } catch (Error e) {
            this.loadComponent();
            this.isLoadedComponent();
            return (T) this;
        }
    }

    protected abstract void load();

    protected abstract void isLoaded() throws Error;

    protected void fail(Error e) {
        logger.info(name + " Is Not Loaded!");
        throw new Error(e);
    }

    protected void exception(Exception e) {
        logger.info(name + " Is Not Loaded! " + e.getMessage());
    }

    protected void loadComponent() {
        logger.info("Restarting.");
        this.load();
        logger.info("Restarted!");
    }

    private void isLoadedComponent() throws Error {
        logger.info(name + " Is Loading.");
        this.isLoaded();
        logger.info(name + " Is Loaded!");
    }

    protected void click(AndroidElement element) {
        logger.info(name + " Clicking.");
        element.click();
        logger.info(name + " Clicked!");
    }
}
