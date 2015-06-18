package com.epam.klymenko.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lili on 06.06.2015.
 */
public class MicrowavesPage extends BasePage{

    @FindBy(xpath = "//div[3]/div[4]/span[1]")
    private WebElement addToCompareFirstItem;

    @FindBy(xpath = "//div[4]/div[4]/span[1]")
    private WebElement addToCompareSecondItem;

    @FindBy(xpath = "//div[3]/div[4]/span[3]/a")
    private WebElement buttonCompare;

    @FindBy(xpath = "//div[3]/div[3]/div/a")
    private WebElement firtsItem;


    @FindBy(xpath = "//div[3]/div[4]/div/a")
    private WebElement secocndItem;

    private static WebDriver _driver;
    static MicrowavesPage  microwavesPage;

    public static MicrowavesPage getMicrowavesPage(WebDriver driver) {
        microwavesPage = new MicrowavesPage();
        InitPage(driver, microwavesPage);
        _driver = driver;
        return microwavesPage;
    }

    public MicrowavesPage addItemsToComparison(){
        addToCompareFirstItem.click();
        addToCompareSecondItem.click();
        return microwavesPage;
     }

    public MicrowavesPage startComparison(){
        buttonCompare.click();
        return microwavesPage;
    }

}
