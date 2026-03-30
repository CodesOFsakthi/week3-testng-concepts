package com.capgemini.apitesting.week3.parallel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProviderTest {

    @DataProvider(name = "urls", parallel = true)
    public Object[][] urls() {
        return new Object[][] {
            {"https://reqres.in/api/users?page=2"},
            {"https://jsonplaceholder.typicode.com/posts"},
            {"https://petstore.swagger.io/v2/pet/findByStatus?status=available"}
        };
    }

    @Test(dataProvider = "urls")
    public void testUrls(String url) {
        System.out.println("Testing URL: " + url + " by Thread: " + Thread.currentThread().getName());
    }
}