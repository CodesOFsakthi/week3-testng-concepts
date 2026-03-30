package com.capgemini.apitesting.week3.annotations;

import org.testng.annotations.Test;

public class PriorityTestExample {

    @Test(priority = 1)
    public void testOpenApp() {
        System.out.println("Step 1: Open Application");
    }

    @Test(priority = 2)
    public void testLogin() {
        System.out.println("Step 2: Login");
    }

    @Test(priority = 3)
    public void testPerformAction() {
        System.out.println("Step 3: Perform Action");
    }

    @Test(priority = 4)
    public void testLogout() {
        System.out.println("Step 4: Logout");
    }
}