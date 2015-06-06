package com.epam.klymenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lili on 06.06.2015.
 */
public class FirstMicrowavePage extends BasePage {

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
    static FirstMicrowavePage firstMicrowavePage;

    public static FirstMicrowavePage getFisrtMicrowavePage(WebDriver driver) {
        firstMicrowavePage = new FirstMicrowavePage();
        InitPage(driver, firstMicrowavePage);
        _driver = driver;
        return firstMicrowavePage;
    }

    public FirstMicrowavePage setCapacity() {
        capacity = capacityWebElement.getText();
        return firstMicrowavePage;
    }

    public FirstMicrowavePage setCoating() {
        coating =  coatingWebElement.getText();
        return firstMicrowavePage;
    }

    public FirstMicrowavePage setVolume() {
        volume =  volumeWebElement.getText();
        return firstMicrowavePage;
    }

    public FirstMicrowavePage setType() {
        type =  typeWebElement.getText();
        return firstMicrowavePage;
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
