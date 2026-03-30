package com.capgemini.apitesting.week3.parallel;

import org.testng.annotations.Test;

public class ParallelExecutionTest {

    @Test
    public void testOne() {
        System.out.println("ParallelExecutionTest - Test One executed by Thread: " + Thread.currentThread().getName());
    }

    @Test
    public void testTwo() {
        System.out.println("ParallelExecutionTest - Test Two executed by Thread: " + Thread.currentThread().getName());
    }
}