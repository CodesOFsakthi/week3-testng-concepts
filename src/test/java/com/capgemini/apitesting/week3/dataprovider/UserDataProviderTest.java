package com.capgemini.apitesting.week3.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserDataProviderTest {

    @DataProvider(name = "users")
    public Object[][] users() {
        return new Object[][] {
            {"Sakthi", "India"},
            {"Maria", "Romania"},
            {"David", "USA"}
        };
    }

    @Test(dataProvider = "users")
    public void testUsers(String name, String country) {
        System.out.println("User: " + name + ", Country: " + country);
    }
}