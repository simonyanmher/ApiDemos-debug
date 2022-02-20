package com.appium.ApiDemos_debug.suites.home.nested.media;

import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.media.Media;
import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.suites.home.nested.media.strings.MediaStrings;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MediaTest extends BaseTest {
    private Media media;
    private final String name = Media.class.getSimpleName();

    @BeforeClass
    public void initializeMedia() {
        initializingLog(name);
        Home home = new Home(driver);
        media = new Media(driver, home).get();
        initializedLog(name);
    }

    @Test
    public void getMediaTest() {
        assertEquals(media.getAudioFx().getText(), MediaStrings.AUDIO_FX);
        assertEquals(media.getMediaPlayer().getText(), MediaStrings.MEDIA_PLAYER);
        assertEquals(media.getVideoView().getText(), MediaStrings.VIDEO_VIEW);
    }
}
