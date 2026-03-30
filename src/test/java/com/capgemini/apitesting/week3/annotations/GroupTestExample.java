package com.capgemini.apitesting.week3.annotations;

import org.testng.annotations.Test;

public class GroupTestExample {

    @Test(groups = {"smoke"})
    public void testLogin() {
        System.out.println("Smoke test: Login");
    }

    @Test(groups = {"regression"})
    public void testCreateUser() {
        System.out.println("Regression test: Create User");
    }

    @Test(groups = {"regression"})
    public void testDeleteUser() {
        System.out.println("Regression test: Delete User");
    }
}