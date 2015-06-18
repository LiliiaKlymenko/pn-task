package com.epam.klymenko.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lili on 05.06.2015.
 */
public class RefrigeratorPage extends BasePage {

    String PRICE_LIST = "//div[@class='price']/strong";
    String NAME_LIST = "//div[@class='name']/a";
    String SORT_BY = "?sort=";
    private static WebDriver _driver;

    public static RefrigeratorPage getRefrigeratorPage(WebDriver driver) {
        RefrigeratorPage refrigeratorPage = new RefrigeratorPage();
        InitPage(driver, refrigeratorPage);
        _driver = driver;
        return refrigeratorPage;
    }

    public void sortRefrigeratorBy(String method) {
        _driver.get(_driver.getCurrentUrl() + SORT_BY + method);
    }


    public List<String> getListOfPrices() {
        List<String> priceList = new ArrayList<String>();
        List<WebElement> allLinks = _driver.findElements(By.xpath(PRICE_LIST));
        for (WebElement i : allLinks) {
            priceList.add(i.getText());
        }
        return priceList;
    }


    public List<String> getListOfNames() {
        List<String> nameList = new ArrayList<String>();
        List<WebElement> allLinks = _driver.findElements(By.xpath(NAME_LIST));
        for (WebElement i : allLinks) {
            nameList.add(i.getText());
        }
        return nameList;
    }

    public boolean ItemsIsSorted(List<String> list) {
        List<String> sortedList = new ArrayList<String>(list);
        Collections.sort(sortedList);
        if (sortedList.equals(list)) {
            return true;
        }
        else
        return false;
    }


}
