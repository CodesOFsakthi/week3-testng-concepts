package com.capgemini.apitesting.week3.parallel;

import org.testng.annotations.Test;

public class ThreadCountExampleTest {

    @Test(invocationCount = 5, threadPoolSize = 3)
    public void testMultipleInvocations() {
        System.out.println("Test executed by Thread: " + Thread.currentThread().getName());
    }
}