package com.epam.klymenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lili on 06.06.2015.
 */
public class SecondMicrowavePage extends BasePage {

    @FindBy(xpath = "//div/div/div[2]/span[2]")
    private WebElement typeWebElement;

    @FindBy(xpath = "//div/div/div[3]/span[2]")
    private WebElement volumeWebElement;

    @FindBy(xpath = "//div/div/div[4]/span[2]")
    private WebElement coatingWebElement;

    @FindBy(xpath = "//div/div/div[5]/span[2]")
    private WebElement capacityWebElement;


    private String type;
    private String volume;
    private String coating;
    private String capacity;

    private static WebDriver _driver;
    static SecondMicrowavePage  secondMicrowavePage;

    public static SecondMicrowavePage getSecondMicrowavePage(WebDriver driver) {
        secondMicrowavePage = new SecondMicrowavePage();
        InitPage(driver, secondMicrowavePage);
        _driver = driver;
        return secondMicrowavePage;
    }


    public SecondMicrowavePage setCapacity() {
        capacity = capacityWebElement.getText();
        return  secondMicrowavePage;
    }

    public SecondMicrowavePage setCoating() {
        coating =  coatingWebElement.getText();
        return  secondMicrowavePage;
    }

    public SecondMicrowavePage setVolume() {
        volume =  volumeWebElement.getText();
        return  secondMicrowavePage;
    }

    public SecondMicrowavePage setType() {
        type =  typeWebElement.getText();
        return  secondMicrowavePage;
    }

    public String getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }

    public String getCoating() {
        return coating;
    }

    public String getCapacity() {
        return capacity;
    }

}