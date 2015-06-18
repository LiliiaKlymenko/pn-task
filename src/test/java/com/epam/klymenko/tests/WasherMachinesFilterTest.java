package com.epam.klymenko.tests;

import com.epam.klymenko.core.BaseTest;
import com.epam.klymenko.navigation.GoTo;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

/**
 * Created by Lili on 06.06.2015.
 */
public class WasherMachinesFilterTest extends BaseTest {

    final int MINIMAL_PRICE = 3000;
    final int MAXIMAL_PRICE = 8000;

    @Test
    public void testCorrectFilterByLess()  {
        GoTo.SectionWasherMachines(driver);
       washerMachinesPage.filterByMinimalPrice(MINIMAL_PRICE);
        Assert.assertTrue(washerMachinesPage.PricesAreLessThan(MINIMAL_PRICE, washerMachinesPage.getListOfPrices()),
                "Filter works not correct\n" + washerMachinesPage.getListOfPrices());
    }

    @Test
    public void testCorrectFilterByBigger() throws NoSuchElementException {
        GoTo.SectionWasherMachines(driver);
        washerMachinesPage.filterByMaximalPrice(MAXIMAL_PRICE);
        Assert.assertTrue(washerMachinesPage.PricesAreBiggerThan(MAXIMAL_PRICE, washerMachinesPage.getListOfPrices()),
                "Filter works not correct\n" + washerMachinesPage.getListOfPrices());
    }

}
