package com.capgemini.apitesting.week3.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookDataProviderTest {

    @DataProvider(name = "books")
    public Object[][] books() {
        return new Object[][] {
            {"Java Basics", "James Gosling"},
            {"Effective Java", "Joshua Bloch"},
            {"Clean Code", "Robert C. Martin"}
        };
    }

    @Test(dataProvider = "books")
    public void testBooks(String title, String author) {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}