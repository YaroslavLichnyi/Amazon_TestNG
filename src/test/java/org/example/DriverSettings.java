package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSettings {
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
    }
}
