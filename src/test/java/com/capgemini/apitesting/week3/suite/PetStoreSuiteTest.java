package com.capgemini.apitesting.week3.suite;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PetStoreSuiteTest {

    @Test
    public void testAddPet() {
        RestAssured
            .given()
            .baseUri("https://petstore.swagger.io/v2")
            .body("{\"id\":1,\"name\":\"doggie\"}")
            .contentType("application/json")
        .when()
            .post("/pet")
        .then()
            .statusCode(200);
    }

    @Test
    public void testGetPet() {
        RestAssured
            .given()
            .baseUri("https://petstore.swagger.io/v2")
        .when()
            .get("/pet/1")
        .then()
            .statusCode(200);
    }
}