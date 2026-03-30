package com.capgemini.apitesting.week3.parallel;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class ParallelCrudTest {

    @Test
    public void testCreateEmployee() {
        RestAssured
            .given()
            .baseUri("https://dummy.restapiexample.com/api/v1")
            .body("{\"name\":\"John\",\"salary\":\"5000\",\"age\":\"30\"}")
            .contentType("application/json")
        .when()
            .post("/create")
        .then()
            .statusCode(200);
        System.out.println("CreateEmployee executed by Thread: " + Thread.currentThread().getName());
    }

    @Test
    public void testGetEmployees() {
        RestAssured
            .given()
            .baseUri("https://dummy.restapiexample.com/api/v1")
        .when()
            .get("/employees")
        .then()
            .statusCode(200);
        System.out.println("GetEmployees executed by Thread: " + Thread.currentThread().getName());
    }
}