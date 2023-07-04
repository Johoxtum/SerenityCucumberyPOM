package com.co.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Establecer la ruta al archivo ejecutable del ChromeDriver
            String chromeDriverPath = "E:\\Automatizaciones\\SerenitySeleniumCucumber\\src\\test\\resources\\driver\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);

            // Crear una nueva instancia del ChromeDriver
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
