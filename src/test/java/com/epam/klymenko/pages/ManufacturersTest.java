package com.epam.klymenko.pages;

import com.epam.klymenko.core.BaseTest;
import com.epam.klymenko.navigation.GoTo;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

/**
 * Created by Lili on 07.06.2015.
 */
public class ManufacturersTest extends BaseTest {

    @Test
    public void allManufacturersIsPresent() throws NoSuchElementException {
        GoTo.SectionBredMakers(driver);
        breadMakersPage.showAllManufacturers();
        Assert.assertTrue(breadMakersPage.allManufacturersIsPresent(breadMakersPage.getListOfItemsNames(),
                breadMakersPage.getAllManufacturers()), "Filter 'Manufacturers' does not work properly");
    }
}