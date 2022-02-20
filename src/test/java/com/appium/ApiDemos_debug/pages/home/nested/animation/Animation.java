package com.appium.ApiDemos_debug.pages.home.nested.animation;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.animation.strings.AnimationStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Animation extends Base<Animation> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    public Animation(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = AnimationStrings.BOUNCING_BALLS)
    private AndroidElement bouncingBalls;

    @AndroidFindBy(accessibility = AnimationStrings.CLONING)
    private AndroidElement cloning;

    @AndroidFindBy(accessibility = AnimationStrings.CUSTOM_EVALUATOR)
    private AndroidElement customEvaluator;

    @AndroidFindBy(accessibility = AnimationStrings.DEFAULT_LAYOUT_ANIMATIONS)
    private AndroidElement defaultLayoutAnimations;

    @AndroidFindBy(accessibility = AnimationStrings.EVENTS)
    private AndroidElement events;

    @AndroidFindBy(accessibility = AnimationStrings.HIDE_SHOW_ANIMATIONS)
    private AndroidElement hideShowAnimations;

    @AndroidFindBy(accessibility = AnimationStrings.LAYOUT_ANIMATIONS)
    private AndroidElement layoutAnimations;

    @AndroidFindBy(accessibility = AnimationStrings.LOADING)
    private AndroidElement loading;

    @AndroidFindBy(accessibility = AnimationStrings.MULTIPLE_PROPERTIES)
    private AndroidElement multipleProperties;

    @AndroidFindBy(accessibility = AnimationStrings.REVERSING)
    private AndroidElement reversing;

    @AndroidFindBy(accessibility = AnimationStrings.SEEKING)
    private AndroidElement seeking;

    @AndroidFindBy(accessibility = AnimationStrings.VIEW_FLIP)
    private AndroidElement viewFlip;

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getAnimation());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert bouncingBalls.getText().equals(AnimationStrings.BOUNCING_BALLS);
            assert cloning.getText().equals(AnimationStrings.CLONING);
            assert customEvaluator.getText().equals(AnimationStrings.CUSTOM_EVALUATOR);
            assert defaultLayoutAnimations.getText().equals(AnimationStrings.DEFAULT_LAYOUT_ANIMATIONS);
            assert events.getText().equals(AnimationStrings.EVENTS);
            assert hideShowAnimations.getText().equals(AnimationStrings.HIDE_SHOW_ANIMATIONS);
            assert layoutAnimations.getText().equals(AnimationStrings.LAYOUT_ANIMATIONS);
            assert loading.getText().equals(AnimationStrings.LOADING);
            assert multipleProperties.getText().equals(AnimationStrings.MULTIPLE_PROPERTIES);
            assert reversing.getText().equals(AnimationStrings.REVERSING);
            assert seeking.getText().equals(AnimationStrings.SEEKING);
            assert viewFlip.getText().equals(AnimationStrings.VIEW_FLIP);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getBouncingBalls() {
        return bouncingBalls;
    }

    public AndroidElement getCloning() {
        return cloning;
    }

    public AndroidElement getCustomEvaluator() {
        return customEvaluator;
    }

    public AndroidElement getDefaultLayoutAnimations() {
        return defaultLayoutAnimations;
    }

    public AndroidElement getEvents() {
        return events;
    }

    public AndroidElement getHideShowAnimations() {
        return hideShowAnimations;
    }

    public AndroidElement getLayoutAnimations() {
        return layoutAnimations;
    }

    public AndroidElement getLoading() {
        return loading;
    }

    public AndroidElement getMultipleProperties() {
        return multipleProperties;
    }

    public AndroidElement getReversing() {
        return reversing;
    }

    public AndroidElement getSeeking() {
        return seeking;
    }

    public AndroidElement getViewFlip() {
        return viewFlip;
    }
}
