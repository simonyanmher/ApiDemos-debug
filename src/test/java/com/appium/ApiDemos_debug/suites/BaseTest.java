package com.appium.ApiDemos_debug.suites;

import com.appium.ApiDemos_debug.Main;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseTest extends Main {
    @BeforeTest
    public void setupDriver() throws IOException {
        logger.info("Driver Setting Up.");
        driver = driver();
        logger.info("Driver Set Upped!");
    }

    @AfterTest
    public void downDriver() {
        logger.info("Driver Closing.");
        driver.closeApp();
        logger.info("Driver Closed!");
    }

    public void initializingLog(String name) {
        logger.info(name + " Initializing.");
    }

    public void initializedLog(String name) {
        logger.info(name + " Initialized!");
    }

    public void disposingLog(String name) {
        logger.info(name + " Disposing.");
    }

    public void disposedLog(String name) {
        logger.info(name + " Disposed!");
    }

    protected void assertEquals(String actual, String expected) {
        logger.info("Actual And Expected Asserting.");
        Assert.assertEquals(actual, expected);
        logger.info("Actual: \"" + actual + "\" And Expected: \"" + expected + "\" Asserted!");
    }
}
