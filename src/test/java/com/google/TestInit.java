package com.google;

import com.epam.jdi.light.driver.WebDriverUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static org.apache.logging.log4j.core.config.Configurator.initialize;

public interface TestInit {
    @BeforeSuite
    default void setUp() {
        initialize("JDI", "src/test/resources/log4j2.xml");
    }

    @AfterSuite
    default void tearDown() {
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
