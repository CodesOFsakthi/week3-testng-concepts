package com.capgemini.apitesting.week3.suite;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class AutomationExerciseSuiteTest {

    @Test
    public void testGetProducts() {
        RestAssured
            .given()
            .baseUri("https://automationexercise.com/api")
        .when()
            .get("/productsList")
        .then()
            .statusCode(200);
    }

    @Test
    public void testCreateUser() {
        RestAssured
            .given()
            .baseUri("https://automationexercise.com/api")
            .formParam("name", "Sakthi")
            .formParam("email", "sakthi@test.com")
        .when()
            .post("/createAccount")
        .then()
            .statusCode(200);
    }
}