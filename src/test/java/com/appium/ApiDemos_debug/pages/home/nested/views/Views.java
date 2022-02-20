package com.appium.ApiDemos_debug.pages.home.nested.views;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.views.strings.ViewsStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Views extends Base<Views> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = ViewsStrings.ANIMATION)
    private AndroidElement animation;

    @AndroidFindBy(accessibility = ViewsStrings.AUTO_COMPLETE)
    private AndroidElement autoComplete;

    @AndroidFindBy(accessibility = ViewsStrings.BUTTONS)
    private AndroidElement buttons;

    @AndroidFindBy(accessibility = ViewsStrings.CHRONOMETER)
    private AndroidElement chronometer;

    @AndroidFindBy(accessibility = ViewsStrings.CONTROLS)
    private AndroidElement controls;

    @AndroidFindBy(accessibility = ViewsStrings.CUSTOM)
    private AndroidElement custom;

    @AndroidFindBy(accessibility = ViewsStrings.DATE_WIDGETS)
    private AndroidElement dateWidgets;

    @AndroidFindBy(accessibility = ViewsStrings.DRAG_AND_DROP)
    private AndroidElement dragAndDrop;

    @AndroidFindBy(accessibility = ViewsStrings.EXPANDABLE_LISTS)
    private AndroidElement expandableLists;

    @AndroidFindBy(accessibility = ViewsStrings.FOCUS)
    private AndroidElement focus;

    @AndroidFindBy(accessibility = ViewsStrings.GALLERY)
    private AndroidElement gallery;

    @AndroidFindBy(accessibility = ViewsStrings.GAME_CONTROLLER_INPUT)
    private AndroidElement gameControllerInput;

    @AndroidFindBy(accessibility = ViewsStrings.GRID)
    private AndroidElement grid;

    @AndroidFindBy(accessibility = ViewsStrings.HOVER_EVENTS)
    private AndroidElement hoverEvents;

    @AndroidFindBy(accessibility = ViewsStrings.IMAGE_BUTTON)
    private AndroidElement imageButton;

    @AndroidFindBy(accessibility = ViewsStrings.IMAGE_SWITCHER)
    private AndroidElement imageSwitcher;

    @AndroidFindBy(accessibility = ViewsStrings.IMAGE_VIEW)
    private AndroidElement imageView;

    @AndroidFindBy(accessibility = ViewsStrings.LAYOUT_ANIMATION)
    private AndroidElement layoutAnimation;

    @AndroidFindBy(accessibility = ViewsStrings.LAYOUTS)
    private AndroidElement layouts;

    @AndroidFindBy(accessibility = ViewsStrings.LISTS)
    private AndroidElement lists;

    @AndroidFindBy(accessibility = ViewsStrings.PICKER)
    private AndroidElement picker;

    @AndroidFindBy(accessibility = ViewsStrings.POPUP_MENU)
    private AndroidElement popupMenu;

    @AndroidFindBy(accessibility = ViewsStrings.PROGRESS_BAR)
    private AndroidElement progressBar;

    @AndroidFindBy(accessibility = ViewsStrings.RADIO_GROUP)
    private AndroidElement radioGroup;

    @AndroidFindBy(accessibility = ViewsStrings.RATING_BAR)
    private AndroidElement ratingBar;

    @AndroidFindBy(accessibility = ViewsStrings.ROTATING_BUTTON)
    private AndroidElement rotatingButton;

    @AndroidFindBy(accessibility = ViewsStrings.SCROLL_BARS)
    private AndroidElement scrollBars;

    @AndroidFindBy(accessibility = ViewsStrings.SEARCH_VIEW)
    private AndroidElement searchView;

    @AndroidFindBy(accessibility = ViewsStrings.SECURE_VIEW)
    private AndroidElement secureView;

    @AndroidFindBy(accessibility = ViewsStrings.SEEK_BAR)
    private AndroidElement seekBar;

    @AndroidFindBy(accessibility = ViewsStrings.SPINNER)
    private AndroidElement spinner;

    @AndroidFindBy(accessibility = ViewsStrings.SPLITTING_TOUCHES_ACROSS_VIEWS)
    private AndroidElement splittingTouchesAcrossViews;

    @AndroidFindBy(accessibility = ViewsStrings.SWITCHES)
    private AndroidElement switches;

    @AndroidFindBy(accessibility = ViewsStrings.SYSTEM_UI_VISIBILITY)
    private AndroidElement systemUiVisibility;

    @AndroidFindBy(accessibility = ViewsStrings.TABS)
    private AndroidElement tabs;

    @AndroidFindBy(accessibility = ViewsStrings.TEXT_CLOCK)
    private AndroidElement textClock;

    @AndroidFindBy(accessibility = ViewsStrings.TEXT_FIELDS)
    private AndroidElement textFields;

    @AndroidFindBy(accessibility = ViewsStrings.TEXT_SWITCHER)
    private AndroidElement textSwitcher;

    @AndroidFindBy(accessibility = ViewsStrings.VISIBILITY)
    private AndroidElement visibility;

    @AndroidFindBy(accessibility = ViewsStrings.WEB_VIEW)
    private AndroidElement webView;

    @AndroidFindBy(accessibility = ViewsStrings.WEB_VIEW_TWO)
    private AndroidElement webViewTwo;

    @AndroidFindBy(accessibility = ViewsStrings.WEB_VIEW_THREE)
    private AndroidElement webViewThree;

    public Views(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getViews());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert animation.getText().equals(ViewsStrings.ANIMATION);
            assert autoComplete.getText().equals(ViewsStrings.AUTO_COMPLETE);
            assert buttons.getText().equals(ViewsStrings.BUTTONS);
            assert chronometer.getText().equals(ViewsStrings.CHRONOMETER);
            assert controls.getText().equals(ViewsStrings.CONTROLS);
            assert custom.getText().equals(ViewsStrings.CUSTOM);
            assert dateWidgets.getText().equals(ViewsStrings.DATE_WIDGETS);
            assert dragAndDrop.getText().equals(ViewsStrings.DRAG_AND_DROP);
            assert expandableLists.getText().equals(ViewsStrings.EXPANDABLE_LISTS);
            assert focus.getText().equals(ViewsStrings.FOCUS);
            assert gallery.getText().equals(ViewsStrings.GALLERY);
            assert gameControllerInput.getText().equals(ViewsStrings.GAME_CONTROLLER_INPUT);
            assert grid.getText().equals(ViewsStrings.GRID);
            assert hoverEvents.getText().equals(ViewsStrings.HOVER_EVENTS);
            assert imageButton.getText().equals(ViewsStrings.IMAGE_BUTTON);
            assert imageSwitcher.getText().equals(ViewsStrings.IMAGE_SWITCHER);
            assert imageView.getText().equals(ViewsStrings.IMAGE_VIEW);
            assert layoutAnimation.getText().equals(ViewsStrings.LAYOUT_ANIMATION);
            assert layouts.getText().equals(ViewsStrings.LAYOUTS);
            assert lists.getText().equals(ViewsStrings.LISTS);
            assert picker.getText().equals(ViewsStrings.PICKER);
            assert popupMenu.getText().equals(ViewsStrings.POPUP_MENU);
            assert progressBar.getText().equals(ViewsStrings.PROGRESS_BAR);
            assert radioGroup.getText().equals(ViewsStrings.RADIO_GROUP);
            assert ratingBar.getText().equals(ViewsStrings.RATING_BAR);
            assert rotatingButton.getText().equals(ViewsStrings.ROTATING_BUTTON);
            assert scrollBars.getText().equals(ViewsStrings.SCROLL_BARS);
            assert searchView.getText().equals(ViewsStrings.SEARCH_VIEW);
            assert secureView.getText().equals(ViewsStrings.SECURE_VIEW);
            assert seekBar.getText().equals(ViewsStrings.SEEK_BAR);
            assert spinner.getText().equals(ViewsStrings.SPINNER);
            assert splittingTouchesAcrossViews.getText().equals(ViewsStrings.SPLITTING_TOUCHES_ACROSS_VIEWS);
            assert switches.getText().equals(ViewsStrings.SWITCHES);
            assert systemUiVisibility.getText().equals(ViewsStrings.SYSTEM_UI_VISIBILITY);
            assert tabs.getText().equals(ViewsStrings.TABS);
            assert textClock.getText().equals(ViewsStrings.TEXT_CLOCK);
            assert textFields.getText().equals(ViewsStrings.TEXT_FIELDS);
            assert textSwitcher.getText().equals(ViewsStrings.TEXT_SWITCHER);
            assert visibility.getText().equals(ViewsStrings.VISIBILITY);
            assert webView.getText().equals(ViewsStrings.WEB_VIEW);
            assert webViewTwo.getText().equals(ViewsStrings.WEB_VIEW_TWO);
            assert webViewThree.getText().equals(ViewsStrings.WEB_VIEW_THREE);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getAnimation() {
        return animation;
    }

    public AndroidElement getAutoComplete() {
        return autoComplete;
    }

    public AndroidElement getButtons() {
        return buttons;
    }

    public AndroidElement getChronometer() {
        return chronometer;
    }

    public AndroidElement getControls() {
        return controls;
    }

    public AndroidElement getCustom() {
        return custom;
    }

    public AndroidElement getDateWidgets() {
        return dateWidgets;
    }

    public AndroidElement getDragAndDrop() {
        return dragAndDrop;
    }

    public AndroidElement getExpandableLists() {
        return expandableLists;
    }

    public AndroidElement getFocus() {
        return focus;
    }

    public AndroidElement getGallery() {
        return gallery;
    }

    public AndroidElement getGameControllerInput() {
        return gameControllerInput;
    }

    public AndroidElement getGrid() {
        return grid;
    }

    public AndroidElement getHoverEvents() {
        return hoverEvents;
    }

    public AndroidElement getImageButton() {
        return imageButton;
    }

    public AndroidElement getImageSwitcher() {
        return imageSwitcher;
    }

    public AndroidElement getImageView() {
        return imageView;
    }

    public AndroidElement getLayoutAnimation() {
        return layoutAnimation;
    }

    public AndroidElement getLayouts() {
        return layouts;
    }

    public AndroidElement getLists() {
        return lists;
    }

    public AndroidElement getPicker() {
        return picker;
    }

    public AndroidElement getPopupMenu() {
        return popupMenu;
    }

    public AndroidElement getProgressBar() {
        return progressBar;
    }

    public AndroidElement getRadioGroup() {
        return radioGroup;
    }

    public AndroidElement getRatingBar() {
        return ratingBar;
    }

    public AndroidElement getRotatingButton() {
        return rotatingButton;
    }

    public AndroidElement getScrollBars() {
        return scrollBars;
    }

    public AndroidElement getSearchView() {
        return searchView;
    }

    public AndroidElement getSecureView() {
        return secureView;
    }

    public AndroidElement getSeekBar() {
        return seekBar;
    }

    public AndroidElement getSpinner() {
        return spinner;
    }

    public AndroidElement getSplittingTouchesAcrossViews() {
        return splittingTouchesAcrossViews;
    }

    public AndroidElement getSwitches() {
        return switches;
    }

    public AndroidElement getSystemUiVisibility() {
        return systemUiVisibility;
    }

    public AndroidElement getTabs() {
        return tabs;
    }

    public AndroidElement getTextClock() {
        return textClock;
    }

    public AndroidElement getTextFields() {
        return textFields;
    }

    public AndroidElement getTextSwitcher() {
        return textSwitcher;
    }

    public AndroidElement getVisibility() {
        return visibility;
    }

    public AndroidElement getWebView() {
        return webView;
    }

    public AndroidElement getWebViewTwo() {
        return webViewTwo;
    }

    public AndroidElement getWebViewThree() {
        return webViewThree;
    }
}
