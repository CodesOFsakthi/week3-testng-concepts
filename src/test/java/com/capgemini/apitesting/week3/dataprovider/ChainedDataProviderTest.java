package com.capgemini.apitesting.week3.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ChainedDataProviderTest {

    @DataProvider(name = "apiEndpoints")
    public Object[][] apiEndpoints() {
        return new Object[][] {
            {"https://reqres.in/api/users"},
            {"https://petstore.swagger.io/v2/pet"},
            {"https://jsonplaceholder.typicode.com/posts"}
        };
    }

    @Test(dataProvider = "apiEndpoints")
    public void testApiEndpoints(String endpoint) {
        System.out.println("Testing API endpoint: " + endpoint);
    }
}