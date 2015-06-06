package com.epam.klymenko.pages;

import com.epam.klymenko.core.BaseTest;
import com.epam.klymenko.navigation.GoTo;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class RefrigeratorsCorrectSortTest extends BaseTest {



    @Test
    public void testCorrectSortByPrice() throws NoSuchElementException {

        GoTo.SectionRefrigerators(driver);
        refrigeratorPage.sortRefrigeratorBy(PRICE);
        Assert.assertTrue(refrigeratorPage.ItemsIsSorted(refrigeratorPage.getListOfPrices()), "Price list is not sorted " +
                refrigeratorPage.getListOfPrices());
    }

    @Test
    public void testCorrectSortByName() throws NoSuchElementException {
        GoTo.SectionRefrigerators(driver);
        refrigeratorPage.sortRefrigeratorBy(NAME);
        Assert.assertTrue(refrigeratorPage.ItemsIsSorted(refrigeratorPage.getListOfNames()), "Price list is not sorted " +
                refrigeratorPage.getListOfNames());
    }
}