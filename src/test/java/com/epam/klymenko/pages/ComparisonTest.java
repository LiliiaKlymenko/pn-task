package com.epam.klymenko.pages;

import com.epam.klymenko.core.BaseTest;
import com.epam.klymenko.navigation.GoTo;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

/**
 * Created by Lili on 06.06.2015.
 */
public class ComparisonTest extends BaseTest {

    @Test
    public void testThatAllCharactersIsUsedInComparison() throws NoSuchElementException {


        GoTo.FirstItemFromMicrowaves(driver);
        firstMicrowavePage.setCapacity().setCoating().setType().setVolume();
        GoTo.SecondItemFromMicrowaves(driver);
        secondMicrowavePage.setCapacity().setCoating().setType().setVolume();

        GoTo.SectionMicrowaves(driver);
        microwavesPage.addItemsToComparison().startComparison();

        //  characters of first microwaves is displayed on comparison page
        Assert.assertTrue(firstMicrowavePage.getCapacity()==comparisonPage.getCapacityOfFirstItem(),
               "Capacity not identical: " + firstMicrowavePage.getCapacity() + " / " + comparisonPage.getCapacityOfFirstItem());
        Assert.assertTrue(firstMicrowavePage.getCoating()==comparisonPage.getCoatingOfFirstItem(),
                "Coating not identical: " + firstMicrowavePage.getCoating() + " / " + comparisonPage.getCoatingOfFirstItem());
        Assert.assertTrue(firstMicrowavePage.getVolume()==comparisonPage.getVolumeOfFirstItem(),
                "Volume not identical: " + firstMicrowavePage.getVolume() + " / " + comparisonPage.getVolumeOfFirstItem());
        Assert.assertTrue(firstMicrowavePage.getType()==comparisonPage.getTypeOfFirstItem(),
                "Type not identical: " + firstMicrowavePage.getType() + " / " + comparisonPage.getTypeOfFirstItem());

        //  characters of second microwaves is displayed on comparison page
        Assert.assertTrue(secondMicrowavePage.getCapacity() ==comparisonPage.getCapacityOfSecondItem(),
                "Capacity not identical: " + secondMicrowavePage.getCapacity() + " / " + comparisonPage.getCapacityOfSecondItem());
        Assert.assertTrue(secondMicrowavePage.getCoating()==comparisonPage.getCoatingOfSecondItem(),
                "Capacity not identical: " + secondMicrowavePage.getCoating() + " / " + comparisonPage.getCoatingOfSecondItem());
        Assert.assertTrue(secondMicrowavePage.getVolume() ==comparisonPage.getVolumeOfSecondItem(),
                "Capacity not identical: " + secondMicrowavePage.getVolume() + " / " + comparisonPage.getVolumeOfSecondItem());
        Assert.assertTrue(secondMicrowavePage.getType()==comparisonPage.getTypeOfSecondItem(),
                "Capacity not identical: " + secondMicrowavePage.getType() + " / " + comparisonPage.getTypeOfSecondItem());

        //  same characters is displayed in default color, different characters is displayed in extra color
        Assert.assertTrue(comparisonPage.capacityColorIsCorrect(), "Capacity is displayed with wrong Color");
        Assert.assertTrue(comparisonPage.coatingColorIsCorrect(), "Coating is displayed with wrong Color");
        Assert.assertTrue(comparisonPage.volumeColorIsCorrect(), "Volume is displayed with wrong Color");
        Assert.assertTrue(comparisonPage.typeColorIsCorrect(), "Type is displayed with wrong Color");
    }

}
