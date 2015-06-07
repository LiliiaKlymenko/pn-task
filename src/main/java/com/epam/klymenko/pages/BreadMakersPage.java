package com.epam.klymenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lili on 06.06.2015.
 */
public class BreadMakersPage extends BasePage {


    String NAME_LIST = "//div[@class='name']/a";
    String WEIGHT_CONTROL_FEATURE = "Регулировка веса";
    String WEIGHT_CONTROL = "(.//*[@class='description'])";
    final int ELEMENTS_COUNT = 20;
    private static WebDriver _driver;


    @FindBy(xpath = "//div[10]/div[2]/a[2]")
    private WebElement weightControl;

    @FindBy(xpath = "//a[19]")
    private WebElement showAllManufacturers;

    private String firstManufacturers = ".//div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]";
    private String lastManufacturers = ".//div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]/div[3]";

    public static BreadMakersPage getBreadMakersPage(WebDriver driver) {
        BreadMakersPage breadMakersPage = new BreadMakersPage();
        InitPage(driver, breadMakersPage);
        _driver = driver;
        return breadMakersPage;
    }

    public boolean hasWeightControlFunction(WebElement element) {
        if (element.getText().contains(WEIGHT_CONTROL_FEATURE)) return true;
        return false;
    }

    public void weightControlFilter() {
        weightControl.click();
    }


    public boolean eachHasWeightControlFunction() {
        for (int i = 1; i < ELEMENTS_COUNT + 1; i++) {
            WebElement element = _driver.findElement(By.xpath(WEIGHT_CONTROL + "[" + i + "]"));
            if (!hasWeightControlFunction(element))
                return false;
        }
        return true;
    }

    public void showAllManufacturers(){
        showAllManufacturers.click();
    }

    public List<String> getAllManufacturers() {
        showAllManufacturers.click();
        List<WebElement> _manufacturers = new ArrayList<WebElement>();
        _manufacturers = _driver.findElements(By.xpath(firstManufacturers));
        _manufacturers.addAll(_driver.findElements(By.xpath(lastManufacturers)));
        List<String> manufacturers = new ArrayList<String>();
        for (WebElement i : _manufacturers) {
            manufacturers.add(i.getText());
        }
        return manufacturers;
    }

    public List<String> getListOfItemsNames() {
        List<String> nameList = new ArrayList<String>();
        List<WebElement> allLinks = _driver.findElements(By.xpath(NAME_LIST));
        for (WebElement i : allLinks) {
            nameList.add(i.getText());
        }
        return nameList;
    }

    public boolean hasTheManufacturer(String name, List<String> manufacturersList) {
        for (String i : manufacturersList) {
            if (name.contains(i)) return true;
        }
        return false;
    }

    public boolean allManufacturersIsPresent(List<String> nameList, List<String> manufacturersList) {
        for (String i : nameList){
            if(!hasTheManufacturer(i, manufacturersList)) return false;
        }
        return  true;
    }
}
