package com.appium.ApiDemos_debug.suites.home.nested.views;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.views.Views;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.views.strings.ViewsStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewsTest extends BaseTest {
    private Views views;
    private final String name = Views.class.getSimpleName();

    @BeforeClass
    public void initializeViews() {
        initializingLog(name);
        Home home = new Home(driver);
        views = new Views(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getViewsTest() {
        assertEquals(views.getAnimation().getText(), ViewsStrings.ANIMATION);
        assertEquals(views.getAutoComplete().getText(), ViewsStrings.AUTO_COMPLETE);
        assertEquals(views.getButtons().getText(), ViewsStrings.BUTTONS);
        assertEquals(views.getChronometer().getText(), ViewsStrings.CHRONOMETER);
        assertEquals(views.getControls().getText(), ViewsStrings.CONTROLS);
        assertEquals(views.getCustom().getText(), ViewsStrings.CUSTOM);
        assertEquals(views.getDateWidgets().getText(), ViewsStrings.DATE_WIDGETS);
        assertEquals(views.getDragAndDrop().getText(), ViewsStrings.DRAG_AND_DROP);
        assertEquals(views.getExpandableLists().getText(), ViewsStrings.EXPANDABLE_LISTS);
        assertEquals(views.getFocus().getText(), ViewsStrings.FOCUS);
        assertEquals(views.getGallery().getText(), ViewsStrings.GALLERY);
        assertEquals(views.getGameControllerInput().getText(), ViewsStrings.GAME_CONTROLLER_INPUT);

        scrollDown(ViewsStrings.RADIO_GROUP);

        assertEquals(views.getGrid().getText(), ViewsStrings.GRID);
        assertEquals(views.getHoverEvents().getText(), ViewsStrings.HOVER_EVENTS);
        assertEquals(views.getImageButton().getText(), ViewsStrings.IMAGE_BUTTON);
        assertEquals(views.getImageSwitcher().getText(), ViewsStrings.IMAGE_SWITCHER);
        assertEquals(views.getImageView().getText(), ViewsStrings.IMAGE_VIEW);
        assertEquals(views.getLayoutAnimation().getText(), ViewsStrings.LAYOUT_ANIMATION);
        assertEquals(views.getLayouts().getText(), ViewsStrings.LAYOUTS);
        assertEquals(views.getLists().getText(), ViewsStrings.LISTS);
        assertEquals(views.getPicker().getText(), ViewsStrings.PICKER);
        assertEquals(views.getPopupMenu().getText(), ViewsStrings.POPUP_MENU);
        assertEquals(views.getProgressBar().getText(), ViewsStrings.PROGRESS_BAR);
        assertEquals(views.getRadioGroup().getText(), ViewsStrings.RADIO_GROUP);

        scrollDown(ViewsStrings.TEXT_CLOCK);

        assertEquals(views.getRatingBar().getText(), ViewsStrings.RATING_BAR);
        assertEquals(views.getRotatingButton().getText(), ViewsStrings.ROTATING_BUTTON);
        assertEquals(views.getScrollBars().getText(), ViewsStrings.SCROLL_BARS);
        assertEquals(views.getSearchView().getText(), ViewsStrings.SEARCH_VIEW);
        assertEquals(views.getSecureView().getText(), ViewsStrings.SECURE_VIEW);
        assertEquals(views.getSeekBar().getText(), ViewsStrings.SEEK_BAR);
        assertEquals(views.getSpinner().getText(), ViewsStrings.SPINNER);
        assertEquals(views.getSplittingTouchesAcrossViews().getText(), ViewsStrings.SPLITTING_TOUCHES_ACROSS_VIEWS);
        assertEquals(views.getSwitches().getText(), ViewsStrings.SWITCHES);
        assertEquals(views.getSystemUiVisibility().getText(), ViewsStrings.SYSTEM_UI_VISIBILITY);
        assertEquals(views.getTabs().getText(), ViewsStrings.TABS);
        assertEquals(views.getTextClock().getText(), ViewsStrings.TEXT_CLOCK);

        scrollDown(ViewsStrings.WEB_VIEW_THREE);

        assertEquals(views.getTextFields().getText(), ViewsStrings.TEXT_FIELDS);
        assertEquals(views.getTextSwitcher().getText(), ViewsStrings.TEXT_SWITCHER);
        assertEquals(views.getVisibility().getText(), ViewsStrings.VISIBILITY);
        assertEquals(views.getWebView().getText(), ViewsStrings.WEB_VIEW);
        assertEquals(views.getWebViewTwo().getText(), ViewsStrings.WEB_VIEW_TWO);
        assertEquals(views.getWebViewThree().getText(), ViewsStrings.WEB_VIEW_THREE);
    }
}
