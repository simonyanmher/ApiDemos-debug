package com.appium.ApiDemos_debug.pages.home.nested.media;

import com.appium.ApiDemos_debug.pages.Base;
import com.appium.ApiDemos_debug.pages.home.Home;
import com.appium.ApiDemos_debug.pages.home.nested.media.strings.MediaStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Media extends Base<Media> {
    private final AndroidDriver<AndroidElement> driver;
    private final Base<Home> parent;

    @AndroidFindBy(accessibility = MediaStrings.AUDIO_FX)
    private AndroidElement audioFx;

    @AndroidFindBy(accessibility = MediaStrings.MEDIA_PLAYER)
    private AndroidElement mediaPlayer;

    @AndroidFindBy(accessibility = MediaStrings.VIDEO_VIEW)
    private AndroidElement videoView;

    public Media(AndroidDriver<AndroidElement> driver, Base<Home> parent) {
        this.driver = driver;
        this.parent = parent;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    protected void load() {
        driver.resetApp();
        Home home = parent.get();
        click(home.getMedia());
    }

    @Override
    protected void isLoaded() throws Error {
        try {
            assert audioFx.getText().equals(MediaStrings.AUDIO_FX);
            assert mediaPlayer.getText().equals(MediaStrings.MEDIA_PLAYER);
            assert videoView.getText().equals(MediaStrings.VIDEO_VIEW);
        } catch (Exception e) {
            exception(e);
            loadComponent();
        }
    }

    public AndroidElement getAudioFx() {
        return audioFx;
    }

    public AndroidElement getMediaPlayer() {
        return mediaPlayer;
    }

    public AndroidElement getVideoView() {
        return videoView;
    }
}
