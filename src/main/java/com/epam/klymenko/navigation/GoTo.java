package com.epam.klymenko.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Liliia_Klymenko on 05-Jun-15.
 */
public class GoTo {

    private static String BASE_URL = "http://pn.com.ua/";
    private static String CATEGORY_DOMESTIC_EQUIPMENT = "//h1[3]/a";
    private static String SECTION_REFRIGERATORS = "//a[@href='http://pn.com.ua/ct/2163/']";
    private static String SECTION_MICROWAVES = "//a[@href='http://pn.com.ua/ct/2137/']";
    private static String SECTION_BRED_MAKERS = "//div[2]/div/div[11]/a";
    private static String SECTION_WASHER_MACHINES = "//div[2]/div/div[3]/a";
    private static String FIRST_MICROWAVE = "//div[3]/div[3]/div/a";
    private static String SECOND_MICROWAVE = "//div[3]/div[4]/div/a";




    public static void SectionRefrigerators(WebDriver driver){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(CATEGORY_DOMESTIC_EQUIPMENT)).click();
        driver.findElement(By.xpath(SECTION_REFRIGERATORS)).click();
    }

    public static void SectionMicrowaves(WebDriver driver){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(CATEGORY_DOMESTIC_EQUIPMENT)).click();
        driver.findElement(By.xpath(SECTION_MICROWAVES)).click();
    }

    public static void SectionBredMakers(WebDriver driver){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(CATEGORY_DOMESTIC_EQUIPMENT)).click();
        driver.findElement(By.xpath(SECTION_BRED_MAKERS)).click();
    }

    public static void SectionWasherMachines(WebDriver driver){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(CATEGORY_DOMESTIC_EQUIPMENT)).click();
        driver.findElement(By.xpath(SECTION_WASHER_MACHINES)).click();
    }

    public static void FirstItemFromMicrowaves(WebDriver driver){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(CATEGORY_DOMESTIC_EQUIPMENT)).click();
        driver.findElement(By.xpath(SECTION_MICROWAVES)).click();
        driver.findElement(By.xpath(FIRST_MICROWAVE)).click();

    }

    public static void SecondItemFromMicrowaves(WebDriver driver){
        driver.get(BASE_URL);
        driver.findElement(By.xpath(CATEGORY_DOMESTIC_EQUIPMENT)).click();
        driver.findElement(By.xpath(SECTION_MICROWAVES)).click();
        driver.findElement(By.xpath(SECOND_MICROWAVE)).click();

    }


}
