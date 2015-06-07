package com.epam.klymenko.pages;

import com.epam.klymenko.core.BaseTest;
import com.epam.klymenko.navigation.GoTo;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

/**
 * Created by Lili on 06.06.2015.
 */
public class WeightControlFunctionTest extends BaseTest {

    @Test
    public void testCorrectSortByPrice() throws NoSuchElementException {

        GoTo.SectionBredMakers(driver);
        breadMakersPage.weightControlFilter();
        Assert.assertTrue(breadMakersPage.eachHasWeightControlFunction(), "Filter 'Weight control' does not work properly");
    }
}
