package com.sahibinden.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {

        public static WebDriver driver;

        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-blink-features=AutomationControlled");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://www.sahibinden.com/");



        }

        @After
        public void tearDown(){
            if(driver != null) {
                driver.close();
                driver.quit();
            }
        }
    }

