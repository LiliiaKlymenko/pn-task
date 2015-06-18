package com.epam.klymenko.tests;

import org.openqa.selenium.WebDriver;

/**
 * Created by Lili on 05.06.2015.
 */
public class HomePage extends BasePage {

    private static WebDriver _driver;

    public static HomePage getHomePage(WebDriver driver) {
        HomePage homePage = new HomePage();
        InitPage(driver, homePage);
        _driver = driver;
        return homePage;
    }


}
