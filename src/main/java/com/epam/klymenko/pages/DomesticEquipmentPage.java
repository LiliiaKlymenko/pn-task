package com.epam.klymenko.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Lili on 05.06.2015.
 */
public class DomesticEquipmentPage extends BasePage {

    private static WebDriver _driver;

    public static DomesticEquipmentPage getDomesticEquipmentPage(WebDriver driver) {

        DomesticEquipmentPage domesticEquipmentPage = new DomesticEquipmentPage();
        InitPage(driver, domesticEquipmentPage);
        _driver = driver;
        return domesticEquipmentPage;
    }

}
