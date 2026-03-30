package com.capgemini.apitesting.week3.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeDataProviderTest {

    @DataProvider(name = "employeeData")
    public Object[][] employeeData() {
        return new Object[][] {
            {"John", 101},
            {"Alice", 102},
            {"Bob", 103}
        };
    }

    @Test(dataProvider = "employeeData")
    public void testEmployeeRecords(String name, int id) {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}