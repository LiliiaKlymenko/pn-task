package com.epam.klymenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lili on 06.06.2015.
 */
public class WasherMachinesPage extends  BasePage {

    private static WebDriver _driver;
    static WasherMachinesPage washerMachinesPage;
    private String FILTER_MINIMAL = "?fp1=";
    private String FILTER_MAXIMAL = "?fp2=";
    String PRICE_LIST = "//div[@class='price']/strong";

    public static WasherMachinesPage getWasherMachinesPage(WebDriver driver) {
        washerMachinesPage = new WasherMachinesPage();
        InitPage(driver, washerMachinesPage);
        _driver = driver;
        return washerMachinesPage;
    }

    public WasherMachinesPage filterByMaximalPrice(int price){
        _driver.get(_driver.getCurrentUrl() + FILTER_MINIMAL + price);
        return washerMachinesPage;
    }

    public WasherMachinesPage filterByMinimalPrice(int price){
        _driver.get(_driver.getCurrentUrl() + FILTER_MAXIMAL + price);
        return washerMachinesPage;
    }

    public List<String> getListOfPrices() {
        List<String> priceList = new ArrayList<String>();
        List<WebElement> allLinks = _driver.findElements(By.xpath(PRICE_LIST));
        for (WebElement i : allLinks) {
            priceList.add(i.getText());
        }
        return priceList;
    }

    public boolean PricesAreBiggerThan(int price, List<String> listOfPrices) {
        for (String _price : listOfPrices) {
            int intPrice = Integer.parseInt((_price.substring(0, _price.length() - 4)).replaceAll("\\s+",""));
            if (intPrice < price) return false;
        }
        return true;
    }

    public boolean PricesAreLessThan(int price, List<String> listOfPrices) {
        for (String _price : listOfPrices) {
            int intPrice = Integer.parseInt((_price.substring(0, _price.length() - 4)).replaceAll("\\s+",""));
            if (intPrice > price) return false;
        }
        return true;
    }


}
