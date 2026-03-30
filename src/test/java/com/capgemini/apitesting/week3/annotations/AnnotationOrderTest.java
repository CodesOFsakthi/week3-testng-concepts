package com.capgemini.apitesting.week3.annotations;

import org.testng.annotations.*;

public class AnnotationOrderTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass executed");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod executed");
    }

    @Test
    public void testOne() {
        System.out.println("Test One executed");
    }

    @Test
    public void testTwo() {
        System.out.println("Test Two executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod executed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass executed");
    }
}