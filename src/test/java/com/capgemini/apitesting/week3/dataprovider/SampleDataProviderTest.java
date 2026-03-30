package com.capgemini.apitesting.week3.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProviderTest {

    @DataProvider(name = "numbers")
    public Object[][] numbers() {
        return new Object[][] {
            {1}, {2}, {3}, {4}, {5}
        };
    }

    @Test(dataProvider = "numbers")
    public void testNumbers(int num) {
        System.out.println("Number: " + num);
    }
}