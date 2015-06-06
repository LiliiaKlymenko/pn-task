package com.epam.klymenko.waiter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Liliia_Klymenko on 04-Jun-15.
 */


public class Waiter {

    public static void waitForTitlePresent(String title, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs(title));
    }

    public static void waitForVisibilityOfElementLocated(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickable(By element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForElementToBeClickable(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void waitForPresenceOfElementLocated(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForPageLoaded(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
