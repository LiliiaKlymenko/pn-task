package com.epam.klymenko.navigation;

import com.epam.klymenko.core.BaseTest;
import org.testng.annotations.Test;

public class GoToTest extends BaseTest {



    @Test
    public void testSecondItemFromMicrowaves() throws Exception {
        GoTo.SectionRefrigerators(driver);
        GoTo.SecondItemFromMicrowaves(driver);
    }
}