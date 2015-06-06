package com.epam.klymenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Liliia_Klymenko on 04-Jun-15.
 */

public abstract class BasePage {

        private static WebDriver _driver;

        public static <T extends BasePage> void InitPage( WebDriver driver, T pageClass)
        {
            _driver=driver;
            PageFactory.initElements(driver, pageClass);
        }
}
