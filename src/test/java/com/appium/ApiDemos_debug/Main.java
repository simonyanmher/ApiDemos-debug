package com.appium.ApiDemos_debug;

import com.appium.ApiDemos_debug.suites.BaseTest;
import com.appium.ApiDemos_debug.utils.ConstantStrings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Main {
    protected static AndroidDriver<AndroidElement> driver;

    protected static Logger logger = LogManager.getLogger(BaseTest.class.getName());
    protected static Properties props;

    protected static AndroidDriver<AndroidElement> driver() throws IOException {
        props = new Properties();

        props.load(Thread
                .currentThread()
                .getContextClassLoader()
                .getResourceAsStream(ConstantStrings.PROPERTIES));

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(
                MobileCapabilityType.APP,
                System.getProperty(ConstantStrings.DIR) + props.getProperty(ConstantStrings.APP)
        );

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, props.getProperty(ConstantStrings.PLATFORM_NAME));
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, props.getProperty(ConstantStrings.PLATFORM_VERSION));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, props.getProperty(ConstantStrings.DEVICE_NAME));
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty(ConstantStrings.AUTOMATION_NAME));

        return new AndroidDriver<>(
                new URL(props.getProperty(ConstantStrings.URL)),
                caps
        );
    }
}
