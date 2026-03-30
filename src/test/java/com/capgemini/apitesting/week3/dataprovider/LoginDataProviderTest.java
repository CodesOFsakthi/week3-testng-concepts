package com.capgemini.apitesting.week3.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProviderTest {

    @DataProvider(name = "loginCredentials")
    public Object[][] loginCredentials() {
        return new Object[][] {
            {"admin", "admin123"},
            {"user", "user123"},
            {"guest", "guest123"}
        };
    }

    @Test(dataProvider = "loginCredentials")
    public void testLogin(String username, String password) {
        System.out.println("Testing login with Username: " + username + ", Password: " + password);
    }
}