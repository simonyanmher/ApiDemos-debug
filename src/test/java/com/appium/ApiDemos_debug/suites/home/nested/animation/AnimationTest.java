package com.appium.ApiDemos_debug.suites.home.nested.animation;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.animation.Animation;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.animation.strings.AnimationStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnimationTest extends BaseTest {
    private Animation animation;
    private final String name = Animation.class.getSimpleName();

    @BeforeClass
    public void initializeAnimation() {
        initializingLog(name);
        Home home = new Home(driver);
        animation = new Animation(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getAnimationTest() {
        assertEquals(animation.getBouncingBalls().getText(), AnimationStrings.BOUNCING_BALLS);
        assertEquals(animation.getCloning().getText(), AnimationStrings.CLONING);
        assertEquals(animation.getCustomEvaluator().getText(), AnimationStrings.CUSTOM_EVALUATOR);
        assertEquals(animation.getDefaultLayoutAnimations().getText(), AnimationStrings.DEFAULT_LAYOUT_ANIMATIONS);
        assertEquals(animation.getEvents().getText(), AnimationStrings.EVENTS);
        assertEquals(animation.getHideShowAnimations().getText(), AnimationStrings.HIDE_SHOW_ANIMATIONS);
        assertEquals(animation.getLayoutAnimations().getText(), AnimationStrings.LAYOUT_ANIMATIONS);
        assertEquals(animation.getLoading().getText(), AnimationStrings.LOADING);
        assertEquals(animation.getMultipleProperties().getText(), AnimationStrings.MULTIPLE_PROPERTIES);
        assertEquals(animation.getReversing().getText(), AnimationStrings.REVERSING);
        assertEquals(animation.getSeeking().getText(), AnimationStrings.SEEKING);
        assertEquals(animation.getViewFlip().getText(), AnimationStrings.VIEW_FLIP);
    }
}
