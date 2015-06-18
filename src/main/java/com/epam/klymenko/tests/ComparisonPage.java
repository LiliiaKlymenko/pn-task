package com.epam.klymenko.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Lili on 06.06.2015.
 */
public class ComparisonPage extends BasePage{

    private static WebDriver _driver;
    static ComparisonPage comparisonPage;

    @FindBy(xpath = "//tr[7]/td[2]")
    private WebElement typeOfFirstItem;

    @FindBy(xpath = "//tr[7]/td[2]")
    private WebElement typeOfSecondItem;

    @FindBy(xpath = "//tr[8]/td[2]")
    private WebElement volumeOfFirstItem;

    @FindBy(xpath = "//tr[8]/td[3]")
    private WebElement volumeOfSecondItem;

    @FindBy(xpath = "//tr[9]/td[2]")
    private WebElement coatingOfFirstItem;

    @FindBy(xpath = "//tr[9]/td[3]")
    private WebElement coatingOfSecondItem;

    @FindBy(xpath = "//tr[10]/td[2]")
    private WebElement capacityOfFirstItem;

    @FindBy(xpath = "//tr[10]/td[3]")
    private WebElement capacityOfSecondItem;

    String DEFAULT_COLOR = "#fff4f4";
    String EXTRA_COLOR = "#ffffea";

    public static ComparisonPage getComparisonPage(WebDriver driver) {
        comparisonPage = new ComparisonPage();
        InitPage(driver, comparisonPage);
        _driver = driver;
        return comparisonPage;
    }


    public String  getColor_typeOfFirstItem(){
        return typeOfFirstItem.getCssValue("background-color");
    }

    public String  getColor_typeOfSecondItem(){
        return typeOfSecondItem.getCssValue("background-color");
    }

    public String getColor_volumeOfFirstItem(){
        return volumeOfFirstItem.getCssValue("background-color");
    }

    public String getColor_volumeOfSecondItem(){
        return volumeOfSecondItem.getCssValue("background-color");
    }

    public String getColor_capacityOfFirstItem(){
        return capacityOfFirstItem.getCssValue("background-color");
    }

    public String getColor_capacityOfSecondItem(){
        return capacityOfSecondItem.getCssValue("background-color");
    }

    public String getColor_coatingOfFirstItem(){
        return coatingOfFirstItem.getCssValue("background-color");
    }

    public String getColor_coatingOfSecondItem(){
        return coatingOfSecondItem.getCssValue("background-color");
    }

    public String getCapacityOfFirstItem(){
        return capacityOfFirstItem.getText();
    }

    public String getCapacityOfSecondItem(){
        return capacityOfSecondItem.getText();
    }

    public String getCoatingOfFirstItem(){
        return coatingOfFirstItem.getText();
    }

    public String getCoatingOfSecondItem(){
        return coatingOfSecondItem.getText();
    }

    public String  getTypeOfFirstItem(){
        return typeOfFirstItem.getText();
    }

    public String  getTypeOfSecondItem(){
        return typeOfSecondItem.getText();
    }

    public String getVolumeOfFirstItem(){
        return volumeOfFirstItem.getText();
    }

    public String getVolumeOfSecondItem(){
        return volumeOfSecondItem.getText();
    }

public boolean capacityColorIsCorrect(){

    if(getCapacityOfFirstItem().equals(getCapacityOfSecondItem()) && getColor_capacityOfFirstItem().equals(DEFAULT_COLOR)
            && getColor_capacityOfSecondItem().equals(DEFAULT_COLOR)) {
        return true;
    }

    if(!(getCapacityOfFirstItem().equals(getCapacityOfSecondItem())) && getColor_capacityOfFirstItem().equals(EXTRA_COLOR)
            && getColor_capacityOfSecondItem().equals(EXTRA_COLOR)) {
        return true;
    }

    else return false;
}


    public boolean volumeColorIsCorrect(){

        if(getVolumeOfFirstItem().equals(getCapacityOfSecondItem()) && getColor_volumeOfFirstItem().equals(DEFAULT_COLOR)
                && getColor_capacityOfSecondItem().equals(DEFAULT_COLOR)) {
            return true;
        }

        if(!(getVolumeOfFirstItem().equals(getCapacityOfSecondItem())) && getColor_volumeOfFirstItem().equals(EXTRA_COLOR)
                && getColor_volumeOfSecondItem().equals(EXTRA_COLOR)) {
            return true;
        }

        else return false;

    }

    public boolean coatingColorIsCorrect(){

        if(getCoatingOfFirstItem().equals(getCoatingOfSecondItem()) && getColor_coatingOfFirstItem().equals(DEFAULT_COLOR)
                && getColor_coatingOfSecondItem().equals(DEFAULT_COLOR)) {
            return true;
        }

        if(!(getCoatingOfFirstItem().equals(getCoatingOfSecondItem())) && getColor_coatingOfFirstItem().equals(EXTRA_COLOR)
                && getColor_coatingOfSecondItem().equals(EXTRA_COLOR)) {
            return true;
        }

        else return false;

    }

    public boolean typeColorIsCorrect(){

        if(getTypeOfFirstItem().equals(getTypeOfSecondItem()) && getColor_typeOfFirstItem().equals(DEFAULT_COLOR)
                && getColor_typeOfSecondItem().equals(DEFAULT_COLOR)) {
            return true;
        }

        if(!(getTypeOfFirstItem().equals(getTypeOfSecondItem())) && getColor_typeOfFirstItem().equals(EXTRA_COLOR)
                && getColor_typeOfSecondItem().equals(EXTRA_COLOR)) {
            return true;
        }

        else return false;

    }

}
