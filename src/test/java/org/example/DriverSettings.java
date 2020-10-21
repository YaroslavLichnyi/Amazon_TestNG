package org.example;

import org.testng.annotations.BeforeTest;

public class DriverSettings {
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
    }
}
