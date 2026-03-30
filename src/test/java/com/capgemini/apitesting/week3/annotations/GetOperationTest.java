package com.capgemini.apitesting.week3.annotations;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetOperationTest {

    @Test
    public void testGetUsers() {
        RestAssured
            .given()
            .baseUri("https://reqres.in/api")
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200);
    }
}