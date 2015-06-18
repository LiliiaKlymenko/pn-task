package com.epam.klymenko.core;

import com.epam.klymenko.tests.*;
import com.epam.klymenko.utils.WebDriverFactory;
import com.epam.klymenko.waiter.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Liliia_Klymenko on 04-Jun-15.
 */
public class BaseTest {

    protected String PRICE = "price";
    protected String NAME = "name";

    protected static DomesticEquipmentPage domesticEquipmentPage;
    protected static RefrigeratorPage refrigeratorPage;
    protected static FirstMicrowavePage firstMicrowavePage;
    protected static SecondMicrowavePage secondMicrowavePage;
    protected static MicrowavesPage microwavesPage;
    protected static ComparisonPage comparisonPage;
    protected static WasherMachinesPage washerMachinesPage;
    protected static BreadMakersPage breadMakersPage;
    protected WebDriver driver = new WebDriverFactory().getDriver(DesiredCapabilities.firefox());

        @BeforeSuite
        protected void setupBeforeSuite() {
            Waiter.waitForPageLoaded(driver);
            domesticEquipmentPage = DomesticEquipmentPage.getDomesticEquipmentPage(driver);
            refrigeratorPage = RefrigeratorPage.getRefrigeratorPage(driver);
            firstMicrowavePage = FirstMicrowavePage.getFisrtMicrowavePage(driver);
            secondMicrowavePage = SecondMicrowavePage.getSecondMicrowavePage(driver);
            microwavesPage = MicrowavesPage.getMicrowavesPage(driver);
            comparisonPage = ComparisonPage.getComparisonPage(driver);
            washerMachinesPage = WasherMachinesPage.getWasherMachinesPage(driver);
            breadMakersPage = BreadMakersPage.getBreadMakersPage(driver);
        }

        @AfterSuite
        protected void tearDown() {
            if (driver != null)
                driver.quit();
        }


}
